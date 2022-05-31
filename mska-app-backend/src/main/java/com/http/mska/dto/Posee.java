package com.http.mska.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** Se define la clase como entidad y se mapea con la tabla intermedia posee */
@Entity
@Table(name = "posee")
public class Posee {

	/** Se genera el identificador como autoincremental */
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	/** Relaciones con las tablas skill y trabajo */
	@ManyToOne
	@JoinColumn(name = "fk_id_skill")
	private Skill skill;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_trabajo")
	private Trabajo trabajo;
	
	/** Constructor por defecto */
	public Posee() {}

	/**
	 * @param id
	 * @param skill
	 * @param trabajo
	 */
	public Posee(Long id, Skill skill, Trabajo trabajo) {
		this.id = id;
		this.skill = skill;
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
	 * @return the skill
	 */
	public Skill getSkill() {
		return skill;
	}

	/**
	 * @param skill the skill to set
	 */
	public void setSkill(Skill skill) {
		this.skill = skill;
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
