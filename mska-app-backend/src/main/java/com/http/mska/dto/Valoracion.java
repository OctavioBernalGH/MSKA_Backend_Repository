package com.http.mska.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "valoracion")
public class Valoracion {
//VALORACIONES = PK ID, FK_ID_USUARIO,  debe ser fk EMPRESA
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "estrellas")
	private int estrellas =0;
	@Column(name = "comentario")
	private Long comentario;
	
	@OneToOne
	@JoinColumn(name="fk_id_usuario")
	private Tecnico tecnico;
	
	@OneToOne
	@JoinColumn(name="fk_id_usuario")
	private Reclutador reclutador;

	public Valoracion(int estrellas, Long comentario, Tecnico tecnico, Reclutador reclutador) {
		super();
		this.estrellas = estrellas;
		this.comentario = comentario;
		this.tecnico = tecnico;
		this.reclutador = reclutador;
	}

	public Valoracion() {
		super();
	}

	public int getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}

	public Long getComentario() {
		return comentario;
	}

	public void setComentario(Long comentario) {
		this.comentario = comentario;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public Reclutador getReclutador() {
		return reclutador;
	}

	public void setReclutador(Reclutador reclutador) {
		this.reclutador = reclutador;
	}
	
}
