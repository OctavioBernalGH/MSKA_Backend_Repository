package com.http.mska.dto;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Se define la clase como entidad, y se relaciona la clase con la tabla
 * comentario_trabajo
 */
@Entity
@Table(name = "comentario_trabajo")
public class ComentarioTrabajo {

	/** Se genera el identificador de forma auto incremental */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** Se mapean los atributos de clase con las columnas de tabla */
	@Column(name = "comentario", columnDefinition = "nvarchar(255)", nullable = false)
	private String comentario;

	@Column(name = "fecha_comentario", columnDefinition = "timestamp", nullable = false)
	private Date fechaComentario;
	
	/** Relaciones muchos a uno de la tabla usuario y trabajador */
	@ManyToOne
	@JoinColumn(name = "fk_id_usuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_trabajo")
	private Trabajo trabajo;
	
	/** Constructor por defecto */
	public ComentarioTrabajo() {}

	/**
	 * @param id
	 * @param comentario
	 * @param fechaComentario
	 * @param usuario
	 * @param trabajo
	 */
	public ComentarioTrabajo(Long id, String comentario, Date fechaComentario, Usuario usuario, Trabajo trabajo) {
		this.id = id;
		this.comentario = comentario;
		this.fechaComentario = fechaComentario;
		this.usuario = usuario;
		this.trabajo = trabajo;
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
	 * @return the comentario
	 */
	public String getComentario() {
		return comentario;
	}

	/**
	 * @param comentario the comentario to set
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	/**
	 * @return the fechaComentario
	 */
	public Date getFechaComentario() {
		return fechaComentario;
	}

	/**
	 * @param fechaComentario the fechaComentario to set
	 */
	public void setFechaComentario(Date fechaComentario) {
		this.fechaComentario = fechaComentario;
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

	/**
	 * @return the trabajo
	 */
	public Trabajo getTrabajo() {
		return trabajo;
	}

	/**
	 * @param trabajo the trabajo to set
	 */
	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}
	
	
}
