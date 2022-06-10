package com.http.mska.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "valoracion")
public class Valoracion {
//VALORACIONES = PK ID, FK_ID_USUARIO,  debe ser fk EMPRESA
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "estrellas", columnDefinition = "int", nullable = false)
	private int estrellas = 0;

	@Column(name = "comentario", columnDefinition = "nvarchar(255)", nullable = false)
	private String comentario;

	@Column(name = "reclutador", columnDefinition = "nvarchar(100)", nullable = false)
	private String reclutador;

	@Column(name = "tecnico", columnDefinition = "nvarchar(100)", nullable = false)
	private String tecnico;

	/** Relacion N a 1 con usuarios */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_usuario")
	private Usuario usuario;

	/** Constructor por defecto */
	public Valoracion() {
	}

	/**
	 * Constructor completo.
	 * 
	 * @param id
	 * @param estrellas
	 * @param comentario
	 * @param reclutador
	 * @param tecnico
	 * @param usuario
	 */
	public Valoracion(Long id, int estrellas, String comentario, String reclutador, String tecnico, Usuario usuario) {
		super();
		this.id = id;
		this.estrellas = estrellas;
		this.comentario = comentario;
		this.reclutador = reclutador;
		this.tecnico = tecnico;
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
	 * @return the estrellas
	 */
	public int getEstrellas() {
		return estrellas;
	}

	/**
	 * @param estrellas the estrellas to set
	 */
	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
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
	 * @return the reclutador
	 */
	public String getReclutador() {
		return reclutador;
	}

	/**
	 * @param reclutador the reclutador to set
	 */
	public void setReclutador(String reclutador) {
		this.reclutador = reclutador;
	}

	/**
	 * @return the tecnico
	 */
	public String getTecnico() {
		return tecnico;
	}

	/**
	 * @param tecnico the tecnico to set
	 */
	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
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
