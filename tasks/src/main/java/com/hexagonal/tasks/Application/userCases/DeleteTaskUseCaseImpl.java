package com.hexagonal.tasks.Application.userCases;

import com.hexagonal.tasks.Domain.ports.in.DeleteTaskUseCase;
import com.hexagonal.tasks.Domain.ports.out.TaskRepositoryPort;

public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {
     private final TaskRepositoryPort taskRepositoryPort;

     public DeleteTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
         this.taskRepositoryPort = taskRepositoryPort;
     }

    @Override
    public boolean deleteTaskById(Long id) {
        return taskRepositoryPort.deleteById(id);
    }
}
