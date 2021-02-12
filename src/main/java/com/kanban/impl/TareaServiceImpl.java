package com.kanban.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanban.model.Tarea;
import com.kanban.repository.ITareaRepository;
import com.kanban.service.ITareaService;

@Service
public class TareaServiceImpl implements ITareaService{

	@Autowired
	ITareaRepository repo;
	
	@Override
	public List<Tarea> listar() {
		return repo.findAll();
	}

	@Override
	public Tarea registrar(Tarea tarea) {
		return repo.save(tarea);
	}

	@Override
	public Tarea actualizar(Tarea tarea) {
		return repo.save(tarea);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);
	}

	@Override
	public Tarea ListarPorId(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}
	
}
