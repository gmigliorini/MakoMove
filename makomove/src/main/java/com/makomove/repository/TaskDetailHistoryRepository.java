package com.makomove.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makomove.domain.TaskDetailHistory;

public interface TaskDetailHistoryRepository  extends JpaRepository<TaskDetailHistory, Long> {

}
