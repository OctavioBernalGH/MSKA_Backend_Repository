package com.http.mska.dto;

/**
 * @author MSKA
 */

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** Se define una entidad y se asocia a una tabla */
@Entity
@Table(name = "mensajes")
public class Mensaje {

	/** Generar ID de forma auto incremental */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** Asociar columnas en la BBDD a atributos Java. */
	@Column(name = "mensaje")
	private String mensaje;

	@Column(name = "fecha_mensaje")
	private Date fecha_mensaje;
	
	@ManyToOne
	@JoinColumn(name = "usuario")
	private Usuario usuario;
	
	/** Constructores */
	public Mensaje() {
		// Constructor por defecto.
	}

	/**
	 * @param id
	 * @param mensaje
	 * @param fecha_mensaje
	 * @param usuario
	 */
	public Mensaje(Long id, String mensaje, Date fecha_mensaje, Usuario usuario) {
		// Constructor completo
		super();
		this.id = id;
		this.mensaje = mensaje;
		this.fecha_mensaje = fecha_mensaje;
		this.usuario = usuario;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * @return the fecha_mensaje
	 */
	public Date getFecha_mensaje() {
		return fecha_mensaje;
	}

	/**
	 * @param fecha_mensaje the fecha_mensaje to set
	 */
	public void setFecha_mensaje(Date fecha_mensaje) {
		this.fecha_mensaje = fecha_mensaje;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}
