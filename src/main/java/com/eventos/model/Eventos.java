package com.eventos.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="eventos")
public class Eventos {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_evento")
	private Integer idEvento;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="fecha_incio")
	@DateTimeFormat(pattern="yyy-MM-dd")
	private Date fechaInicio;

	@Column(name="fecha_fin")
	@DateTimeFormat(pattern="yyy-MM-dd")
	private Date fechaFin;

	
	
}
