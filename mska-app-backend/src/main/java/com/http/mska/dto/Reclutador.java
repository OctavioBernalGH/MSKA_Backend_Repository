package com.http.mska.dto;

/**
 * @Autors * Ixabel_Justo * Octavio Bernal * David Dalmau * Oriol Lopez *
 * @version 0.0.1
 * @Date 2022/05/23
 */

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reclutador")
public class Reclutador {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "experiencia")
	private int experiencia = 0;
	@Column(name = "nivel")
	private int nivel = 1;
	@Column(name = "web")
	private String web="";
	@Column(name = "tipo_reclutador")
	private String tipoReclutador="";
	
//Relations
	@OneToOne
	@JoinColumn(name="fk_id_usuario")
	private Usuario usuario;

	
	/**
	 * 
	 * @param experiencia
	 * @param nivel
	 * @param web
	 * @param tipoReclutador
	 * @param usuario
	 */
	public Reclutador(int experiencia, int nivel, String web, String tipoReclutador, Usuario usuario) {
		
		this.experiencia = experiencia;
		this.nivel = nivel;
		this.web = web;
		this.tipoReclutador = tipoReclutador;
		this.usuario = usuario;
	}
	
	
	/**
	 * Empty constructor
	 */
	public Reclutador() {
		
	}

	//Getters&Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getTipoReclutador() {
		return tipoReclutador;
	}

	public void setTipoReclutador(String tipoReclutador) {
		this.tipoReclutador = tipoReclutador;
	}

	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	@Override
	public String toString() {
		return "Reclutador [id=" + id + ", experiencia=" + experiencia + ", nivel=" + nivel + ", web=" + web
				+ ", tipoReclutador=" + tipoReclutador + ", usuario=" + usuario + "]";
	}
		
}
