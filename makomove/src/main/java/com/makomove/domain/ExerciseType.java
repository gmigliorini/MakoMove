package com.makomove.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EXERCISE_TYPE")
public class ExerciseType {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	public ExerciseType() {}
	
	public ExerciseType(String name) {
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
