package com.hexagonal.tasks.Domain.ports.in;

import com.hexagonal.tasks.Domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id, Task task);
}
