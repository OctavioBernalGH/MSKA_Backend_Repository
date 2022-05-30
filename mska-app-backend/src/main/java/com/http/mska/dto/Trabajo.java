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

/** Se define una entidad y se asigna una tabla */
@Entity
@Table(name = "trabajo")
public class Trabajo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fecha_ini")
	private Date fecha_ini;
	
	@Column(name = "fecha_fin")
	private Date fecha_fin;
	
	@Column(name = "estrellas")
	private int estrellas =0;
	
	@Column(name = "presupuesto")
	private float presupuesto;
	
	@ManyToOne
	@JoinColumn(name="fk_id_asignador")
	private Usuario usuarioAsignador;
	
	@ManyToOne
	@JoinColumn(name="fk_id_asignado")
	private Usuario usuarioAsignado;


	public Trabajo() {}
	
	
	/**
	 * @param id
	 * @param descripcion
	 * @param fecha_ini
	 * @param fecha_fin
	 * @param estrellas
	 * @param presupuesto
	 * @param usuarioAsignador
	 * @param usuarioAsignado
	 */
	
	public Trabajo(Long id, String descripcion, Date fecha_ini, Date fecha_fin, int estrellas, float presupuesto,
			Usuario usuarioAsignador, Usuario usuarioAsignado) {
		this.id = id;
		this.descripcion = descripcion;
		this.fecha_ini = fecha_ini;
		this.fecha_fin = fecha_fin;
		this.estrellas = estrellas;
		this.presupuesto = presupuesto;
		this.usuarioAsignador = usuarioAsignador;
		this.usuarioAsignado = usuarioAsignado;
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
	 * @return the fecha_ini
	 */
	public Date getFecha_ini() {
		return fecha_ini;
	}

	/**
	 * @param fecha_ini the fecha_ini to set
	 */
	public void setFecha_ini(Date fecha_ini) {
		this.fecha_ini = fecha_ini;
	}

	/**
	 * @return the fecha_fin
	 */
	public Date getFecha_fin() {
		return fecha_fin;
	}

	/**
	 * @param fecha_fin the fecha_fin to set
	 */
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
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
	 * @return the presupuesto
	 */
	public float getPresupuesto() {
		return presupuesto;
	}

	/**
	 * @param presupuesto the presupuesto to set
	 */
	public void setPresupuesto(float presupuesto) {
		this.presupuesto = presupuesto;
	}

	/**
	 * @return the usuarioAsignador
	 */
	public Usuario getUsuarioAsignador() {
		return usuarioAsignador;
	}

	/**
	 * @param usuarioAsignador the usuarioAsignador to set
	 */
	public void setUsuarioAsignador(Usuario usuarioAsignador) {
		this.usuarioAsignador = usuarioAsignador;
	}

	/**
	 * @return the usuarioAsignado
	 */
	public Usuario getUsuarioAsignado() {
		return usuarioAsignado;
	}

	/**
	 * @param usuarioAsignado the usuarioAsignado to set
	 */
	public void setUsuarioAsignado(Usuario usuarioAsignado) {
		this.usuarioAsignado = usuarioAsignado;
	}

	
}