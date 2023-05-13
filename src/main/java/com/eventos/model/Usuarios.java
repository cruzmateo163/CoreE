package com.eventos.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuarios {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private Integer idUsuario;
	
	@Column(name="cedula")
	private String cedula;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="email")
	private String email;
	
	@Column(name="fecha_nacimiento")
	@DateTimeFormat(pattern="yyy-MM-dd")
	private Date fechaNacimiento;
	
	@Column(name="contrasena")
	private String contrasena;
	
	@Column(name="genero")
	private String genero;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE})
	@JoinColumn(name="id_tipo")
	private Tipos tipo;

	public Usuarios() {
		
	}

	public Usuarios(String cedula, String nombre, String apellido, String email, Date fechaNacimiento,
			String contrasena, String genero, Tipos tipo) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.contrasena = contrasena;
		this.genero = genero;
		this.tipo = tipo;
	}

	public Usuarios(Integer idUsuario, String cedula, String nombre, String apellido, String email,
			Date fechaNacimiento, String contrasena, String genero, Tipos tipo) {
		super();
		this.idUsuario = idUsuario;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.contrasena = contrasena;
		this.genero = genero;
		this.tipo = tipo;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Tipos getTipo() {
		return tipo;
	}

	public void setTipo(Tipos tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Usuarios [idUsuario=" + idUsuario + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido="
				+ apellido + ", email=" + email + ", fechaNacimiento=" + fechaNacimiento + ", contrasena=" + contrasena
				+ ", genero=" + genero + ", tipo=" + tipo + "]";
	}




	
	
	
	
	
	
	
	
	
}
