package org.example.taskmanagementapi.infrastructure;

import org.example.taskmanagementapi.domain.model.Task;
import org.example.taskmanagementapi.domain.model.TaskRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class InMemoryTaskRepository implements TaskRepository {

    private final Map<UUID, Task> taskStore = new HashMap<>();

    @Override
    public Task save(Task task) {
        taskStore.put(task.getId(), task);
        return task;
    }

    @Override
    public Optional<Task> findById(UUID TaskId) {
        return Optional.ofNullable(taskStore.get(TaskId));
    }

    @Override
    public List<Task> findAll() {
        return new ArrayList<>(taskStore.values());
    }

    @Override
    public void deleteById(UUID TaskId) {
        taskStore.remove(TaskId);
    }
}
