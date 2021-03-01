package com.kanban.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tarea")
public class Tarea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTarea;
	@Column(name="nombreTarea",length = 150,nullable = false)
	private String nombreTarea;
	
	@Column(name="horaInicio")
	private Integer horaInicio;
	@Column(name="horaFin")
	private Integer horaFin;
	@Column(name="horasAcumuladas")
	private Integer horasAcumuladas;
	
	@Column(name="status",length = 100,nullable = false)
	private String status;
	
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;
	@Column(name="descripcion",length = 255,nullable = true)
	private String descripcion;
	
	public Integer getIdTarea() {
		return idTarea;
	}
	public void setIdTarea(Integer idTarea) {
		this.idTarea = idTarea;
	}
	public String getNombreTarea() {
		return nombreTarea;
	}
	public void setNombreTarea(String nombreTarea) {
		this.nombreTarea = nombreTarea;
	}
	public Integer getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Integer horaInicio) {
		this.horaInicio = horaInicio;
	}
	public Integer getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(Integer horaFin) {
		this.horaFin = horaFin;
	}
	public Integer getHorasAcumuladas() {
		return horasAcumuladas;
	}
	public void setHorasAcumuladas(Integer horasAcumuladas) {
		this.horasAcumuladas = horasAcumuladas;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
