package com.http.mska.dto;

import java.util.List;

import javax.persistence.CascadeType;

/**
 * @Autors * Ixabel_Justo * Octavio Bernal * David Dalmau * Oriol Lopez *
 * @version 0.0.1
 * @Date 2022/05/23
 */

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
@Table(name = "reclutador")
public class Reclutador {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "experiencia", columnDefinition = "int default 0")
	private int experiencia = 0;
	
	@Column(name = "nivel", columnDefinition = "int default 1")
	private int nivel = 1;
	
	@Column(name = "web", columnDefinition = "nvarchar(255)")
	private String web="";
	
	@Column(name = "tipo_reclutador", columnDefinition = "nvarchar(255)")
	private String tipoReclutador="";

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id", unique = false, nullable = true)
	private List<Usuario> usuario;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private List<ObtieneR> obtieneR;


	/** Constructor por defecto */
	public Reclutador() {}
	
	
	/**
	 * @param id
	 * @param experiencia
	 * @param nivel
	 * @param web
	 * @param tipoReclutador
	 * @param usuario
	 * @param obtieneR
	 */
	public Reclutador(Long id, int experiencia, int nivel, String web, String tipoReclutador, List<Usuario> usuario,
			List<ObtieneR> obtieneR) {
		this.id = id;
		this.experiencia = experiencia;
		this.nivel = nivel;
		this.web = web;
		this.tipoReclutador = tipoReclutador;
		this.usuario = usuario;
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
	 * @return the experiencia
	 */
	public int getExperiencia() {
		return experiencia;
	}


	/**
	 * @param experiencia the experiencia to set
	 */
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}


	/**
	 * @return the nivel
	 */
	public int getNivel() {
		return nivel;
	}


	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	/**
	 * @return the web
	 */
	public String getWeb() {
		return web;
	}


	/**
	 * @param web the web to set
	 */
	public void setWeb(String web) {
		this.web = web;
	}


	/**
	 * @return the tipoReclutador
	 */
	public String getTipoReclutador() {
		return tipoReclutador;
	}


	/**
	 * @param tipoReclutador the tipoReclutador to set
	 */
	public void setTipoReclutador(String tipoReclutador) {
		this.tipoReclutador = tipoReclutador;
	}


	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}


	/**
	 * @param obtieneR the obtieneR to set
	 */
	public void setObtieneR(List<ObtieneR> obtieneR) {
		this.obtieneR = obtieneR;
	}


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Usuario")
	public List<Usuario> getUsuario() {
		return usuario;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ObtieneR")
	public List<ObtieneR> getObtieneR() {
		return obtieneR;
	}


}
