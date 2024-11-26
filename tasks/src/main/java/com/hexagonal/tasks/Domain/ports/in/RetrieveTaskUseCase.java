package com.hexagonal.tasks.Domain.ports.in;

import com.hexagonal.tasks.Domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {
    Optional<Task> retrieveTaskById(Long id);
    List<Task> retrieveAllTasks();
}
