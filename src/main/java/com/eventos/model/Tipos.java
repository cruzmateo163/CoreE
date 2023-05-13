package com.eventos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tipos")
public class Tipos {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_tipo")
	private Integer idTipo;
	@Column(name="nombre")
	private String nombre;
	@Column(name="descripcion")
	private String descripcion;
	
	
	public Tipos() {
		
	}


	public Tipos(String nombre, String descripcion) {
		
		this.nombre = nombre;
		this.descripcion = descripcion;
	}


	public Tipos(Integer idTipo, String nombre, String descripcion) {
		
		this.idTipo = idTipo;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}


	public Integer getIdTipo() {
		return idTipo;
	}


	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "Tipos [idTipo=" + idTipo + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	
	
	
	
	
}
