package com.hexagonal.tasks.Application.userCases;

import com.hexagonal.tasks.Domain.models.Task;
import com.hexagonal.tasks.Domain.ports.in.UpdateTaskUseCase;
import com.hexagonal.tasks.Domain.ports.out.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImple implements UpdateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImple(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task task) {
        return taskRepositoryPort.update(task);
    }
}
