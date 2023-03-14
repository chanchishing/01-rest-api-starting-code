package com.in28minutes.rest.webservices.restfulwebservices.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration
public class BasicAuthenticationSecurityConfiguration {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {

        //authorization is required for any request, except OPTIONS (pre-flight)request
        //use basic authentication
        //stateless session
        //disable CSRF
        return
                httpSecurity
                        .authorizeHttpRequests(auth -> auth
                                                        .requestMatchers(HttpMethod.OPTIONS,"/**").permitAll()
                                                        .anyRequest().authenticated()
                                              )
                        .httpBasic(Customizer.withDefaults())
                        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                        .csrf().disable()
                        .build();
    }
}
