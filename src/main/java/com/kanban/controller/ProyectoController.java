package com.kanban.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.kanban.model.Proyecto;
import com.kanban.service.IProyectoService;

@RestController
@RequestMapping("/proyectos")
public class ProyectoController {
	
	@Autowired
	private IProyectoService service;
	
	@GetMapping
	public ResponseEntity<List<Proyecto>> listar(){
		List<Proyecto> obj= service.listar();
		return new ResponseEntity<List<Proyecto>>(obj, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> registrar(@RequestBody Proyecto proyecto){
		Proyecto obj = service.registrar(proyecto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdProyecto()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping
	public ResponseEntity<Proyecto> actualizar(@RequestBody Proyecto proyecto){
		Proyecto obj = service.actualizar(proyecto);
		return new ResponseEntity<Proyecto>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception{
		Proyecto obj = service.ListarPorId(id);
		if (obj == null) {
			throw new Exception("No se encontro ID");
		}
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Proyecto> listarPorId(@PathVariable("id") Integer codigo) throws Exception{
		Proyecto obj = service.ListarPorId(codigo);
		if (obj == null) {
			throw new Exception("No se encontro ID");
		}
		return new ResponseEntity<Proyecto>(obj,HttpStatus.OK);
	}
	
}
