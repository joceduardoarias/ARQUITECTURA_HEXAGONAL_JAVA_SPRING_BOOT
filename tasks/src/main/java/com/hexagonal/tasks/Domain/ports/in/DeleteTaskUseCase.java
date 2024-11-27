package com.hexagonal.tasks.Domain.ports.in;

public interface DeleteTaskUseCase {
    boolean deleteTaskById(Long id);
}
