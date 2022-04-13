package com.ada.unit3.task.controller;

import com.ada.unit3.task.data.Task;
import com.ada.unit3.task.dto.TaskDto;
import com.ada.unit3.task.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/task")
public class TaskController {

    private final ITaskService service;

    public TaskController(@Autowired ITaskService service){
        this.service=service;
    }

    @GetMapping
    public ResponseEntity<List<Task>> all(){
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> findById(@PathVariable String id){
        return null;
    }

    @PostMapping
    public ResponseEntity<Task> create(@RequestBody TaskDto task){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> update(@RequestBody TaskDto task,@PathVariable String id){
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable String id){
        return null;
    }
}
