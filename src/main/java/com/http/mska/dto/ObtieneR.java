package com.http.mska.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** TABLA INTERMEDIA ENTRE RECLUTADOR Y LAS BADGES DE RECLUTADOR */
@Entity
@Table(name = "obtiene_r")
public class ObtieneR {

	/** Identificador autoincremental */
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	/** Relación con la tabla reclutador mediante la foreign key */
	@ManyToOne
	@JoinColumn(name = "fk_id_reclutador")
	private Reclutador reclutador;
	
	/** Relación con la tabla bandage reclutador mediante la foreign key */
	@ManyToOne
	@JoinColumn(name = "fk_id_bandage_reclutador")
	private BandageReclutador bandageReclutador;
	
	/** Constructor por defecto */
	public ObtieneR() {}

	/**
	 * @param id
	 * @param reclutador
	 * @param bandageReclutador
	 */
	public ObtieneR(Long id, Reclutador reclutador, BandageReclutador bandageReclutador) {
		this.id = id;
		this.reclutador = reclutador;
		this.bandageReclutador = bandageReclutador;
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
	 * @return the reclutador
	 */
	public Reclutador getReclutador() {
		return reclutador;
	}

	/**
	 * @param reclutador the reclutador to set
	 */
	public void setReclutador(Reclutador reclutador) {
		this.reclutador = reclutador;
	}

	/**
	 * @return the bandageReclutador
	 */
	public BandageReclutador getBandageReclutador() {
		return bandageReclutador;
	}

	/**
	 * @param bandageReclutador the bandageReclutador to set
	 */
	public void setBandageReclutador(BandageReclutador bandageReclutador) {
		this.bandageReclutador = bandageReclutador;
	}
	
	
	
}
