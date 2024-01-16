package com.makomove.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TASK_TYPE")
public class TaskType {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "task_name")
	private String taskName;
	
	@Column(name = "task_desc")
	private String taskDesc;

	public TaskType() {}

	public TaskType(String taskName, String taskDesc) {
		this.taskName = taskName;
		this.taskDesc = taskDesc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}
	
}
