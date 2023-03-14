package com.in28minutes.rest.webservices.restfulwebservices.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Version;

import java.time.LocalDate;
@Entity
public class Todo {

	public Todo() {
		
	}
	
//	public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
//		super();
//		this.id = id;
//		this.username = username;
//		this.description = description;
//		this.targetDate = targetDate;
//		this.done = done;
//	}

	public Todo(int id, String username, String description, LocalDate targetDate, boolean done, int version) {
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
		this.version = version;
	}

	@Id
	@GeneratedValue
	private int id;

	private String username;
	
	private String description;
	private LocalDate targetDate;
	private boolean done;

	@Version
	private int version;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", targetDate="
				+ targetDate + ", done=" + done + "]";
	}

}