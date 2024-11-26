package com.hexagonal.tasks.Application.userCases;

import com.hexagonal.tasks.Domain.models.Task;
import com.hexagonal.tasks.Domain.ports.in.RetrieveTaskUseCase;
import com.hexagonal.tasks.Domain.ports.out.TaskRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveTaskUseCaseImpl implements RetrieveTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public RetrieveTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> retrieveTaskById(Long id) {
        return taskRepositoryPort.findById(id);
    }

    @Override
    public List<Task> retrieveAllTasks() {
        return taskRepositoryPort.findAll();
    }
}
