package com.therelinettorrico.demo.controller;

import com.therelinettorrico.demo.domain.Task;
import com.therelinettorrico.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    //@Autowired
    //BuildResponse buildResponse;

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }



    @GetMapping( value = {"", "/tasks"})
    public Iterable<Task> list() {
        return this.taskService.list();
    }

    @PostMapping(value= "/save")
    public Task saveTask(@RequestBody Task task) {
        return this.taskService.save(task);
    }
}
