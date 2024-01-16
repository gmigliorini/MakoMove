package com.makomove.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makomove.domain.TaskDetail;

public interface TaskDetailRepository extends JpaRepository<TaskDetail, Long> {

}
