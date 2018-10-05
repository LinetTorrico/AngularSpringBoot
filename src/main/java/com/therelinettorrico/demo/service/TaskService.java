package com.therelinettorrico.demo.service;

import com.therelinettorrico.demo.domain.Task;

public interface TaskService {


    Iterable<Task> list();
    Task save(Task task);
}
