package com.kanban.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanban.model.Usuario;
import com.kanban.repository.IUsuarioRepository;
import com.kanban.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	IUsuarioRepository repo;
	
	@Override
	public List<Usuario> listar() {
		return repo.findAll();
	}

	@Override
	public Usuario registrar(Usuario usuario) {
		return repo.save(usuario);
	}

	@Override
	public Usuario actualizar(Usuario usuario) {
		return repo.save(usuario);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);
		
	}

	@Override
	public Usuario ListarPorId(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}

}
