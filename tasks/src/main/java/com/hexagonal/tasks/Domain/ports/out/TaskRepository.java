package com.hexagonal.tasks.Domain.ports.out;

import com.hexagonal.tasks.Domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    Task save(Task task);
    Optional<Task> findById(Long id);
    List<Task> findAll();
    Boolean deleteById(Long id);
    Optional<Task> update(Task task);
}
