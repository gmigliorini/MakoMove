package com.makomove.domain;

import java.sql.Date;
import java.time.Duration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EXERCISE")
public class Exercise {

	@Id
	@GeneratedValue
	private Long id;
	
	private ExerciseType exerciseType;
	
	private Integer sets;
	private Integer repititions;
	private Integer weight;
	private Duration duration;
	private Double distance;
	//TODO: private Enum indoor outdoor
	private Date timestamp;
	
	public Exercise() {}
	
	public Exercise(Integer sets, Integer repititions, Integer weight, Duration duration, Double distance, Date timestamp) {
		this.sets = sets;
		this.repititions = repititions;
		this.weight = weight;
		this.duration = duration;
		this.timestamp = timestamp;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ExerciseType getExerciseType() {
		return exerciseType;
	}
	public void setExerciseType(ExerciseType exerciseType) {
		this.exerciseType = exerciseType;
	}
	public Integer getSets() {
		return sets;
	}
	public void setSets(Integer sets) {
		this.sets = sets;
	}
	public Integer getRepititions() {
		return repititions;
	}
	public void setRepititions(Integer repititions) {
		this.repititions = repititions;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
}
