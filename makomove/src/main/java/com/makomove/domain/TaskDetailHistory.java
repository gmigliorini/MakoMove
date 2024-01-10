package com.makomove.domain;

import java.sql.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

@Entity
@Table(name = "TASK_DETAIL_HISTORY")
public class TaskDetailHistory {
	
	@Id
	@GeneratedValue
	private Long id;
	private TaskDetail taskDetail;
	@Column(name = "change_date")
	private Date changeDate;
	@Column(name = "change_desc")
	private String changeDesc;
	
	public TaskDetailHistory() {}
	
	public TaskDetailHistory(TaskDetail taskDetail, Date changeDate, String changeDesc) {
		this.taskDetail = taskDetail;
		this.changeDate = changeDate;
		this.changeDesc = changeDesc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TaskDetail getTaskDetail() {
		return taskDetail;
	}

	public void setTaskDetail(TaskDetail taskDetail) {
		this.taskDetail = taskDetail;
	}

	public Date getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}

	public String getChangeDesc() {
		return changeDesc;
	}

	public void setChangeDesc(String changeDesc) {
		this.changeDesc = changeDesc;
	}
	
}
