package com.kanban.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")

public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	
	@Column(name="nombre",length = 255,nullable = false)
	private String nombre;
	@Column(name="password",length = 100,nullable = false)
	private String password;
	@Column(name="nControl",length = 50,nullable = false)
	private String nControl;
	@Column(name="permisos",nullable = false)
	private Integer permisos;
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getnControl() {
		return nControl;
	}
	public void setnControl(String nControl) {
		this.nControl = nControl;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getPermisos() {
		return permisos;
	}
	public void setPermisos(Integer permisos) {
		this.permisos = permisos;
	}
	
}
