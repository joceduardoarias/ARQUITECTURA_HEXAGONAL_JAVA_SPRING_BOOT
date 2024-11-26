package com.hexagonal.tasks.Domain.ports.in;

import com.hexagonal.tasks.Domain.models.Task;

public interface CreateTaskUseCase {
    void createTask(Task task);
}
