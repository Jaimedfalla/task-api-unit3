package com.ada.unit3.task.service;

import com.ada.unit3.task.data.Task;
import com.ada.unit3.task.dto.TaskDto;
import java.util.List;

public interface ITaskService {
    Task create(TaskDto task );

    Task findById( String id );

    List<Task> all();

    void deleteById( String id );

    Task update( Task task, String id );
}
