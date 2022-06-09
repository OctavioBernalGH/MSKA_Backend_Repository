package com.http.mska.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "examen")
public class Examen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name= "descripcion")
	private String descripcion;
	
	@Column(name= "cantidad_exp")
	private int cantidadExp;
	
	@ManyToOne
	@JoinColumn(name= "fk_id_skill")
	private Skill skill;
	
	public Examen() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param tipo
	 * @param descripcion
	 * @param cantidadExp
	 * @param skill
	 */
	public Examen(Long id, String nombre, String tipo, String descripcion, int cantidadExp, Skill skill) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.cantidadExp = cantidadExp;
		this.skill = skill;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the cantidadExp
	 */
	public int getCantidadExp() {
		return cantidadExp;
	}

	/**
	 * @param cantidadExp the cantidadExp to set
	 */
	public void setCantidadExp(int cantidadExp) {
		this.cantidadExp = cantidadExp;
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

	@Override
	public String toString() {
		return "Examen [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", descripcion=" + descripcion
				+ ", cantidadExp=" + cantidadExp + ", skill=" + skill + "]";
	}
}
