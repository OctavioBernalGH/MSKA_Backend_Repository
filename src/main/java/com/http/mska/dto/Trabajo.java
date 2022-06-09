package com.http.mska.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/** Se define una entidad y se asigna una tabla */
@Entity
@Table(name = "trabajo")
public class Trabajo {
	
	/** Se genera el identificador mediante auto incremental */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/** Se mapean los atributos de clase con las columnas de la tabla */
	@Column(name = "descripcion", columnDefinition = "nvarchar(255)", nullable = false)
	private String descripcion;
	
	@Column(name = "fecha_ini", columnDefinition = "date", nullable = false)
	private Date fecha_ini;
	
	@Column(name = "fecha_fin", columnDefinition = "date", nullable = true)
	private Date fecha_fin;
	
	@Column(name = "estrellas", columnDefinition = "int", nullable = false)
	private int estrellas =0;
	
	@Column(name = "presupuesto", columnDefinition = "float", nullable = true)
	private float presupuesto;
	
	/** Se generan las relaciones con las diferentes tablas */
	@ManyToOne
	@JoinColumn(name="fk_id_asignador")
	private Usuario usuarioAsignador;
	
	@ManyToOne
	@JoinColumn(name="fk_id_asignado")
	private Usuario usuarioAsignado;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private List<ComentarioTrabajo> comentarioTrabajo;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private List<Posee> posee;

	/** Constructor por defecto */
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
	 * @param comentarioTrabajo
	 */
	public Trabajo(Long id, String descripcion, Date fecha_ini, Date fecha_fin, int estrellas, float presupuesto,
			Usuario usuarioAsignador, Usuario usuarioAsignado, List<ComentarioTrabajo> comentarioTrabajo, List<Posee> posee) {
		this.id = id;
		this.descripcion = descripcion;
		this.fecha_ini = fecha_ini;
		this.fecha_fin = fecha_fin;
		this.estrellas = estrellas;
		this.presupuesto = presupuesto;
		this.usuarioAsignador = usuarioAsignador;
		this.usuarioAsignado = usuarioAsignado;
		this.comentarioTrabajo = comentarioTrabajo;
		this.posee = posee;
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

	/**
	 * @param comentarioTrabajo the comentarioTrabajo to set
	 */
	public void setComentarioTrabajo(List<ComentarioTrabajo> comentarioTrabajo) {
		this.comentarioTrabajo = comentarioTrabajo;
	}
		
	/**
	 * @param posee the posee to set
	 */
	public void setPosee(List<Posee> posee) {
		this.posee = posee;
	}

	/** Se elimina la recursividad */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ComentarioTrabajo")
	public List<ComentarioTrabajo> getComentarioTrabajo() {
		return comentarioTrabajo;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Posee")
	public List<Posee> getPosee() {
		return posee;
	}
	
}