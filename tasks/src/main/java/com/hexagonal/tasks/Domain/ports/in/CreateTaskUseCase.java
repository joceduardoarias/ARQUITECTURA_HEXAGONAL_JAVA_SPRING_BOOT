package com.hexagonal.tasks.Domain.ports.in;

import com.hexagonal.tasks.Domain.models.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
