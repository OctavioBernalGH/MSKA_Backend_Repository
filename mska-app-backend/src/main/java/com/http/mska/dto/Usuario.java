package com.http.mska.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Se define la clase Usuarios como entidad y se mapea con la tabla usuarios de
 * la base de datos
 */
@Entity
@Table(name = "usuarios")
public class Usuario {

	/** Se genera el ID de forma auto incremental en la base de datos */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** Mapeos de columnas en base de datos con atributos en Spring */
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

	@Column(name = "cp")
	private String codigoPostal;

	@Column(name = "fecha_registro")
	private Date fechaRegistro;

	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;

	@Column(name = "movil")
	private int movil;

	@Column(name = "instagram")
	private String instagram;

	@Column(name = "linkedin")
	private String linkedin;

	@Column(name = "num_entrevista")
	private int numEntrevista;

	@Column(name = "num_mensajes")
	private int numMensajes;

	@Column(name = "num_valoraciones")
	private int numValoraciones;

	@Column(name = "reclutador_bol")
	private boolean reclutadorBol;

	@Column(name = "tecnico_bol")
	private boolean tecnicoBol;

	@Column(name = "uri_foto")
	private String uriFoto;
}
