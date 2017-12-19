package com.crud.tasks.service;

import com.crud.tasks.controller.TaskNotFoundException;
import com.crud.tasks.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DbService {
    @Autowired
    TaskRepository taskRepository;

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Task getTask(Long id) throws TaskNotFoundException{
        return taskRepository.findById(id).orElseThrow(TaskNotFoundException::new);
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }

    public Task saveTask(Task task){
        return taskRepository.save(task);
    }
}
