package com.http.mska.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** Se define la clase como entidad y se relaciona con la tabla obtieneT */
@Entity
@Table(name = "obtiene_t")
public class ObtieneT {

	/** Identificador auto incremental */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/** Clave foránea de técnico */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_tecnico")
	private Tecnico tecnico;
	
	/** Clave foránea de bandageTecnico */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_bandage_tecnico")
	private BandageTecnico bandageTecnico;
	
	/** Constructor por defecto */
	public ObtieneT() {}

	/**
	 * @param id
	 * @param tecnico
	 * @param bandageTecnico
	 */
	public ObtieneT(Long id, Tecnico tecnico, BandageTecnico bandageTecnico) {
		this.id = id;
		this.tecnico = tecnico;
		this.bandageTecnico = bandageTecnico;
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
	 * @return the tecnico
	 */
	public Tecnico getTecnico() {
		return tecnico;
	}

	/**
	 * @param tecnico the tecnico to set
	 */
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	/**
	 * @return the bandageTecnico
	 */
	public BandageTecnico getBandageTecnico() {
		return bandageTecnico;
	}

	/**
	 * @param bandageTecnico the bandageTecnico to set
	 */
	public void setBandageTecnico(BandageTecnico bandageTecnico) {
		this.bandageTecnico = bandageTecnico;
	}
	
		
}
