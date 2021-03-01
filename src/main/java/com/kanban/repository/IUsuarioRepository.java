package com.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanban.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

}
