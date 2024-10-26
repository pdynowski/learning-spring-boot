package com.pdynowski.taskmanager.repositories;

import com.pdynowski.taskmanager.entities.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {}
