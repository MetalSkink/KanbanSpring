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

import com.kanban.model.Tarea;
import com.kanban.service.ITareaService;

@RestController
@RequestMapping("/tareas")
public class TareaController {

	@Autowired
	private ITareaService service;
	
	@GetMapping
	public ResponseEntity<List<Tarea>> listar(){
		List<Tarea> obj= service.listar();
		return new ResponseEntity<List<Tarea>>(obj, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> registrar(@RequestBody Tarea tarea){
		Tarea obj = service.registrar(tarea);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdTarea()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping
	public ResponseEntity<Tarea> actualizar(@RequestBody Tarea tarea){
		Tarea obj = service.actualizar(tarea);
		return new ResponseEntity<Tarea>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception{
		Tarea obj = service.ListarPorId(id);
		if (obj == null) {
			throw new Exception("No se encontro ID");
		}
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Tarea> listarPorId(@PathVariable("id") Integer codigo) throws Exception{
		Tarea obj = service.ListarPorId(codigo);
		if (obj == null) {
			throw new Exception("No se encontro ID");
		}
		return new ResponseEntity<Tarea>(obj,HttpStatus.OK);
	}
}
