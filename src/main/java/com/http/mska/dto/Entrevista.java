package com.http.mska.dto;

import java.util.Date;

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
@Table(name = "entrevista")
public class Entrevista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "fecha_entrevista", columnDefinition = "datetime", nullable = false)
	private Date fecha_entrevista;
	
	@Column(name ="duracion", columnDefinition = "int", nullable = false)
	private int duracion;
	
	@Column(name ="estado_entrevista_bol", columnDefinition = "bit", nullable = false)
	private boolean estado_entrevista;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_id_entrevistador")
	private Usuario entrevistador;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_id_entrevistado")
	private Usuario entrevistado;

	/**
	 * 
	 */
	public Entrevista() {
	}

	/**
	 * @param id
	 * @param fecha_entrevista
	 * @param duracion
	 * @param estado_entrevista
	 * @param usuario
	 */
	public Entrevista(Long id, Date fecha_entrevista, int duracion, boolean estado_entrevista, Usuario entrevistador, Usuario entrevistado) {
		this.id = id;
		this.fecha_entrevista = fecha_entrevista;
		this.duracion = duracion;
		this.estado_entrevista = estado_entrevista;
		this.entrevistador = entrevistador;
		this.entrevistado = entrevistado;
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
	 * @return the fecha_entrevista
	 */
	public Date getFecha_entrevista() {
		return fecha_entrevista;
	}

	/**
	 * @param fecha_entrevista the fecha_entrevista to set
	 */
	public void setFecha_entrevista(Date fecha_entrevista) {
		this.fecha_entrevista = fecha_entrevista;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * @return the estado_entrevista
	 */
	public boolean isEstado_entrevista() {
		return estado_entrevista;
	}

	/**
	 * @param estado_entrevista the estado_entrevista to set
	 */
	public void setEstado_entrevista(boolean estado_entrevista) {
		this.estado_entrevista = estado_entrevista;
	}

	/**
	 * @return the entrevistador
	 */
	public Usuario getEntrevistador() {
		return entrevistador;
	}

	/**
	 * @param entrevistador the entrevistador to set
	 */
	public void setEntrevistador(Usuario entrevistador) {
		this.entrevistador = entrevistador;
	}

	/**
	 * @return the entrevistado
	 */
	public Usuario getEntrevistado() {
		return entrevistado;
	}

	/**
	 * @param entrevistado the entrevistado to set
	 */
	public void setEntrevistado(Usuario entrevistado) {
		this.entrevistado = entrevistado;
	}

	

	
}	




	

