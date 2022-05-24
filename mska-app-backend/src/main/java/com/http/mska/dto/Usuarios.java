package com.http.mska.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "nombre_usuario")
	private String nombreUsuario;
	
	@Column(name = "contraseña")
	private String contraseña;
	
	@Column(name = "poblacion")
	private String poblacion;
	
	@Column(name = "pais")
	private String pais;
}
