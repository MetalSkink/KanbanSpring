package com.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanban.model.Tarea;

public interface ITareaRepository extends JpaRepository<Tarea, Integer>{

}
