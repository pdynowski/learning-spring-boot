package com.pdynowski.taskmanager.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String taskName;
	private Integer creatorId;
	private String description;
	private String status;
	private Integer projectId;

	private Task() {
	}

	public Task(String taskName, Integer creatorId, String description, String status, Integer projectId) {
		this.taskName = taskName;
		this.creatorId = creatorId;
		this.description = description;
		this.status = status;
		this.projectId = projectId;
	}

	public Integer getId() {
		return this.id;
	}

	public String getTaskName() {
		return this.taskName;
	}

	public Integer getCreatorId() {
		return this.creatorId;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public Integer getProjectId() {
		return this.projectId;
	}
}
