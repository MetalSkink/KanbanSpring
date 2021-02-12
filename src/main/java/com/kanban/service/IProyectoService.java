package com.kanban.service;

import java.util.List;

import com.kanban.model.Proyecto;

public interface IProyectoService {
	List<Proyecto> listar();
	Proyecto registrar(Proyecto proyecto);
	Proyecto actualizar(Proyecto proyecto);
	void eliminar(Integer codigo);
	Proyecto ListarPorId(Integer codigo);
}
