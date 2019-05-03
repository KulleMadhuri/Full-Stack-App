package com.opencyon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opencyon.utility.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
