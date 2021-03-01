package com.kanban.service;

import java.util.List;


import com.kanban.model.Usuario;

public interface IUsuarioService {
	List<Usuario> listar();
	Usuario registrar(Usuario usuario);
	Usuario actualizar(Usuario usuario);
	void eliminar(Integer codigo);
	Usuario ListarPorId(Integer codigo);
}
