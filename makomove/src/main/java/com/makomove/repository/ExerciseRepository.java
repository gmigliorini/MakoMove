package com.makomove.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makomove.domain.Exercise;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

}
