package org.example.taskmanagementapi.application;


import org.example.taskmanagementapi.domain.model.Task;
import org.example.taskmanagementapi.domain.model.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TaskService {

    private final TaskRepository taskrepo;

    public TaskService(TaskRepository taskrepo) {
        this.taskrepo = taskrepo;
    }

    public Task createTask(Task task) {
        task.setId(UUID.randomUUID());
        return taskrepo.save(task);
    }

    public Optional<Task> getTask(UUID TaskId) {
        return taskrepo.findById(TaskId);
    }

    public List<Task> getAllTasks() {
        return taskrepo.findAll();
    }

    public Optional<Task> updateTask(UUID TaskId, Task task) {
        return taskrepo.findById(TaskId).map(existing -> {
            existing.setTitle(task.getTitle());
            existing.setDescription(task.getDescription());
            existing.setCompleted(task.isCompleted());
            return taskrepo.save(existing);
        });
    }

    public void deleteTask(UUID TaskId) {
        taskrepo.deleteById(TaskId);
    }
}
