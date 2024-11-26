package com.hexagonal.tasks.Domain.models;

import java.time.LocalDate;

public class Task {
	private int id;
	private String title;
	private String description;
	private LocalDate Creationdate;
	private boolean isCompleted;
	
	public Task(int id, String title, String description, LocalDate creationdate, boolean isCompleted) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		Creationdate = creationdate;
		this.isCompleted = isCompleted;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getCreationdate() {
		return Creationdate;
	}

	public void setCreationdate(LocalDate creationdate) {
		Creationdate = creationdate;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	

}
