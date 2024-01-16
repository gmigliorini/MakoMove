package com.makomove.domain;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Status {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "status_type")
	private String statusType;
	
	public Status() {}
	
	public Status(String statusType) {
		this.statusType = statusType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatusType() {
		return statusType;
	}

	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}
	
}
