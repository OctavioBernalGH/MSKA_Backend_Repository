package com.http.mska.dto;

import java.util.List;

import javax.persistence.CascadeType;
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


/** Se define la clase como entidad y se vincula a la tabla tecnico */
@Entity
@Table(name = "tecnico")
public class Tecnico {
	
	/** Se genera el identificador como auto incremental */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor y lo incrementa
	private Long id;
	
	/** Se mapean los atributos de clase con columnas de la tabla */
	@Column(name = "experiencia", columnDefinition = "int default 0")
	private int experiencia;
	
	@Column(name = "nivel", columnDefinition = "int default 1")
	private int nivel;
	
	@Column(name = "github", unique=true, columnDefinition = "nvarchar(255) ", nullable = true)
	private String github;
	
	@Column(name = "pinterest", unique=true,  columnDefinition = "nvarchar(255)", nullable = true)
	private String pinterest;
	
	@Column(name = "trabajo_en_curso", columnDefinition = "int default 0")
	private int trabajo_en_curso;
	
	@Column(name = "trabajos_finalizados", columnDefinition = "int default 0")
	private int trabajos_finalizados;
	
	@Column(name = "tipo_tecnico", columnDefinition = "nvarchar(255)", nullable = true)
	private String tipo_tecnico;

	/** Relaciones de uno a mucho con la tabla usuario y obtieneT */
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id", unique = false, nullable = true)
	private List<Usuario> usuario;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private List<ObtieneT> obtieneT;
	
	/** Constructor por defecto */
	public Tecnico() {}
			
	/**
	 * @param id
	 * @param experiencia
	 * @param nivel
	 * @param github
	 * @param pinterest
	 * @param trabajo_en_curso
	 * @param trabajos_finalizados
	 * @param tipo_tecnico
	 * @param usuario
	 * @param obtieneT
	 */
	public Tecnico(Long id, int experiencia, int nivel, String github, String pinterest, int trabajo_en_curso,
			int trabajos_finalizados, String tipo_tecnico, List<Usuario> usuario, List<ObtieneT> obtieneT) {
		this.id = id;
		this.experiencia = experiencia;
		this.nivel = nivel;
		this.github = github;
		this.pinterest = pinterest;
		this.trabajo_en_curso = trabajo_en_curso;
		this.trabajos_finalizados = trabajos_finalizados;
		this.tipo_tecnico = tipo_tecnico;
		this.usuario = usuario;
		this.obtieneT = obtieneT;
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
	 * @return the github
	 */
	public String getGithub() {
		return github;
	}

	/**
	 * @param github the github to set
	 */
	public void setGithub(String github) {
		this.github = github;
	}

	/**
	 * @return the pinterest
	 */
	public String getPinterest() {
		return pinterest;
	}

	/**
	 * @param pinterest the pinterest to set
	 */
	public void setPinterest(String pinterest) {
		this.pinterest = pinterest;
	}

	/**
	 * @return the trabajo_en_curso
	 */
	public int getTrabajo_en_curso() {
		return trabajo_en_curso;
	}

	/**
	 * @param trabajo_en_curso the trabajo_en_curso to set
	 */
	public void setTrabajo_en_curso(int trabajo_en_curso) {
		this.trabajo_en_curso = trabajo_en_curso;
	}

	/**
	 * @return the trabajos_finalizados
	 */
	public int getTrabajos_finalizados() {
		return trabajos_finalizados;
	}

	/**
	 * @param trabajos_finalizados the trabajos_finalizados to set
	 */
	public void setTrabajos_finalizados(int trabajos_finalizados) {
		this.trabajos_finalizados = trabajos_finalizados;
	}

	/**
	 * @return the tipo_tecnico
	 */
	public String getTipo_tecnico() {
		return tipo_tecnico;
	}

	/**
	 * @param tipo_tecnico the tipo_tecnico to set
	 */
	public void setTipo_tecnico(String tipo_tecnico) {
		this.tipo_tecnico = tipo_tecnico;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	/**
	 * @param obtieneT the obtieneT to set
	 */
	public void setObtieneT(List<ObtieneT> obtieneT) {
		this.obtieneT = obtieneT;
	}

	/** Se eliminar la recursividad */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Usuario")
	public List<Usuario> getUsuario() {
		return usuario;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ObtieneT")
	public List<ObtieneT> getObtieneT() {
		return obtieneT;
	}

}