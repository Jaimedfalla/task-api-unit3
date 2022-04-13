package com.ada.unit3.task.service;

import com.ada.unit3.task.data.Task;
import com.ada.unit3.task.dto.TaskDto;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;

@Service
public class TaskService implements ITaskService{

    private HashMap<String,Task> tasks;

    @Override
    public Task create(TaskDto task) {
        return null;
    }

    @Override
    public Task findById(String id) {
        return null;
    }

    @Override
    public List<Task> all() {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public Task update(Task task, String id) {
        return null;
    }
}
