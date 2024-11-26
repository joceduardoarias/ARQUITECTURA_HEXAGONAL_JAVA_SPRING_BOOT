package com.hexagonal.tasks.Application.userCases;

import com.hexagonal.tasks.Domain.models.Task;
import com.hexagonal.tasks.Domain.ports.in.CreateTaskUseCase;
import com.hexagonal.tasks.Domain.ports.out.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;

    public CreateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}
