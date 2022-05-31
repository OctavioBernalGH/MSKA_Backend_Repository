package com.http.mska.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/** Se define la clase como entidad y se vincula a la tabla skill en la BBDD */
@Entity
@Table(name = "skill")
public class Skill {
	
	/** Se genera el identificador de forma auto incremental */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/** Se mapean los atributos de clase con las columnas en la BBDD */
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "validado")
	private boolean validado;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "cantidad_exp")
	private int cantidad_exp;
	
	/** Relación de uno a muchos con la tabla posee */
	@OneToMany
	@JoinColumn(name = "id")
	private List<Posee> posee;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Examen> examen;
	
	/** Constructor por defecto */
	public Skill() {
		super();
	}

	/**
	 * @param id
	 * @param tipo
	 * @param validado
	 * @param cantidad_exp
	 * @param posee
	 */
	public Skill(Long id, String tipo, boolean validado, String descripcion, int cantidad_exp, List<Posee> posee, List<Examen> examen) {
		this.id = id;
		this.tipo = tipo;
		this.validado = validado;
		this.descripcion = descripcion;
		this.cantidad_exp = cantidad_exp;
		this.posee = posee;
		this.examen = examen;
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
	 * @return the validado
	 */
	public boolean isValidado() {
		return validado;
	}

	/**
	 * @param validado the validado to set
	 */
	public void setValidado(boolean validado) {
		this.validado = validado;
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
	 * @return the cantidad_exp
	 */
	public int getCantidad_exp() {
		return cantidad_exp;
	}

	/**
	 * @param cantidad_exp the cantidad_exp to set
	 */
	public void setCantidad_exp(int cantidad_exp) {
		this.cantidad_exp = cantidad_exp;
	}

	/**
	 * @param posee the posee to set
	 */
	public void setPosee(List<Posee> posee) {
		this.posee = posee;
	}
		
	/**
	 * @param examen the examen to set
	 */
	public void setExamen(List<Examen> examen) {
		this.examen = examen;
	}

	/** Se elimina la recursividad */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Posee")
	public List<Posee> getPosee() {
		return posee;
	}

	/** Se elimina la recursividad */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Examen")
	public List<Examen> getExamen() {
		return examen;
	}
}