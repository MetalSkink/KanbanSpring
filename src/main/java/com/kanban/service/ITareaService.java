package com.kanban.service;

import java.util.List;

import com.kanban.model.Tarea;

public interface ITareaService {
	List<Tarea> listar();
	Tarea registrar(Tarea tarea);
	Tarea actualizar(Tarea tarea);
	void eliminar(Integer codigo);
	Tarea ListarPorId(Integer codigo);
}
