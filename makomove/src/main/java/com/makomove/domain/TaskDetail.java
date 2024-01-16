package com.makomove.domain;

import java.sql.Date;
import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TASK_DETAIL")
public class TaskDetail {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "task_type_id")
	private TaskType taskType;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "status_id")
	private Status status;
	
	@Column(name = "time_spent")
	private String timeSpent;  //storing as minutes and converting in UI --> DB
	
	@Column(name = "expected_time")
	private String expectedTime;
	
	@Column(name = "assigned_date")
	private Date assignedDate;
	
	private boolean completed;
	
	@OneToMany(mappedBy = "taskDetail")
	private ArrayList<TaskDetailHistory> taskDetailHistoryList;
	
	public TaskDetail() {}
	
	public TaskDetail(User user, TaskType taskType, Status status, String timeSpent, String expectedTime,
			Date assignedDate, boolean completed, ArrayList<TaskDetailHistory> taskDetailHistory) {
		this.user = user;
		this.taskType = taskType;
		this.status = status;
		this.timeSpent = timeSpent;
		this.expectedTime = expectedTime;
		this.assignedDate = assignedDate;
		this.completed = completed;
		this.taskDetailHistoryList = taskDetailHistory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public TaskType getTaskType() {
		return taskType;
	}

	public void setTaskType(TaskType taskType) {
		this.taskType = taskType;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getTimeSpent() {
		return timeSpent;
	}

	public void setTimeSpent(String timeSpent) {
		this.timeSpent = timeSpent;
	}

	public String getExpectedTime() {
		return expectedTime;
	}

	public void setExpectedTime(String expectedTime) {
		this.expectedTime = expectedTime;
	}

	public Date getAssignedDate() {
		return assignedDate;
	}

	public void setAssignedDate(Date assignedDate) {
		this.assignedDate = assignedDate;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public ArrayList<TaskDetailHistory> getTaskDetailHistory() {
		return taskDetailHistoryList;
	}

	public void setTaskDetailHistory(ArrayList<TaskDetailHistory> taskDetailHistory) {
		this.taskDetailHistoryList = taskDetailHistory;
	}

}
