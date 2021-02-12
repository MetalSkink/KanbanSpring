package com.kanban.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanban.model.Proyecto;
import com.kanban.repository.IProyectoRepository;
import com.kanban.service.IProyectoService;

@Service
public class ProyectoServiceImpl implements IProyectoService{

	@Autowired
	IProyectoRepository repo;
	
	@Override
	public List<Proyecto> listar() {
		return repo.findAll();
	}

	@Override
	public Proyecto registrar(Proyecto proyecto) {
		return repo.save(proyecto);
	}

	@Override
	public Proyecto actualizar(Proyecto proyecto) {
		return repo.save(proyecto);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);
	}

	@Override
	public Proyecto ListarPorId(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}

}
