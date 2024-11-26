package com.hexagonal.tasks.Application.services;

import com.hexagonal.tasks.Domain.models.AdditionalTaskInfo;
import com.hexagonal.tasks.Domain.models.Task;
import com.hexagonal.tasks.Domain.ports.in.*;

import java.util.List;
import java.util.Optional;

public class TaskService implements CreateTaskUseCase, DeleteTaskUseCase, GetAdditionalTaskInfo, RetrieveTaskUseCase, UpdateTaskUseCase {

    private final CreateTaskUseCase createTaskUseCase;
    private final DeleteTaskUseCase deleteTaskUseCase;
    private final GetAdditionalTaskInfo getAdditionalTaskInfo;
    private final RetrieveTaskUseCase retrieveTaskUseCase;
    private final UpdateTaskUseCase updateTaskUseCase;

    public TaskService(CreateTaskUseCase createTaskUseCase, DeleteTaskUseCase deleteTaskUseCase, GetAdditionalTaskInfo getAdditionalTaskInfo, RetrieveTaskUseCase retrieveTaskUseCase, UpdateTaskUseCase updateTaskUseCase) {
        this.createTaskUseCase = createTaskUseCase;
        this.deleteTaskUseCase = deleteTaskUseCase;
        this.getAdditionalTaskInfo = getAdditionalTaskInfo;
        this.retrieveTaskUseCase = retrieveTaskUseCase;
        this.updateTaskUseCase = updateTaskUseCase;
    }

    @Override
    public Task createTask(Task task) {
        return createTaskUseCase.createTask(task);
    }

    @Override
    public boolean deleteTaskById(Long id) {
       return deleteTaskUseCase.deleteTaskById(id);
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return getAdditionalTaskInfo.getAdditionalTaskInfo(id);
    }

    @Override
    public Optional<Task> retrieveTaskById(Long id) {
        return retrieveTaskUseCase.retrieveTaskById(id);
    }

    @Override
    public List<Task> retrieveAllTasks() {
        return retrieveTaskUseCase.retrieveAllTasks();
    }

    @Override
    public Optional<Task> updateTask(Long id, Task task) {
        return updateTaskUseCase.updateTask(id, task);
    }
}
