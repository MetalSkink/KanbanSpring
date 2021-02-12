package com.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanban.model.Proyecto;

public interface IProyectoRepository extends JpaRepository<Proyecto, Integer>{

}
