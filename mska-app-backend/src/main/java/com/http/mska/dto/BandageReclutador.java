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

@Entity
@Table(name = "bandage_reclutador")
public class BandageReclutador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "cantidadExp")
	private String cantidadExp;

	@OneToMany
	@JoinColumn(name = "id")
	private List<ObtieneR> obtieneR;
	
	/** Constructor por defecto */
	public BandageReclutador() {}
	
	/**
	 * @param id
	 * @param nombre
	 * @param tipo
	 * @param descripcion
	 * @param cantidadExp
	 * @param obtieneR
	 */
	public BandageReclutador(Long id, String nombre, String tipo, String descripcion, String cantidadExp,
			List<ObtieneR> obtieneR) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.cantidadExp = cantidadExp;
		this.obtieneR = obtieneR;
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
	public String getCantidadExp() {
		return cantidadExp;
	}

	/**
	 * @param cantidadExp the cantidadExp to set
	 */
	public void setCantidadExp(String cantidadExp) {
		this.cantidadExp = cantidadExp;
	}

	/**
	 * @param obtieneR the obtieneR to set
	 */
	public void setObtieneR(List<ObtieneR> obtieneR) {
		this.obtieneR = obtieneR;
	}

	/** Se elimina la recursividad */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ObtieneR")
	public List<ObtieneR> getObtieneR() {
		return obtieneR;
	}
	
}