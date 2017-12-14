package com.crud.tasks.service;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface TaskRepository extends CrudRepository<Task, Long> {
    @Override
    List<Task> findAll();

    @Override
    Optional<Task> findById(Long id);

    @Override
    void deleteById(Long id);

    @Override
    Task save(Task task);
}
