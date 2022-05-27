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
@Table(name = "tecnico")
public class Tecnico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor y lo incrementa
	private Long id;
	@Column(name = "experiencia")
	private int experiencia;
	@Column(name = "nivel")
	private int nivel;
	@Column(name = "github")
	private String github;
	@Column(name = "pinterest")
	private String pinterest;
	@Column(name = "trabajo_en_curso")
	private int trabajo_en_curso;
	@Column(name = "trabajos_finalizados")
	private int trabajos_finalizados;
	@Column(name = "tipo_tecnico")
	private String tipo_tecnico;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Usuario")
	public List<Usuario> getUsuario() {
		return usuario;
	}

	@OneToMany
	@JoinColumn(name = "id")
	private List<Usuario> usuario;

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

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public String getPinterest() {
		return pinterest;
	}

	public void setPinterest(String pinterest) {
		this.pinterest = pinterest;
	}

	public int getTrabajo_en_curso() {
		return trabajo_en_curso;
	}

	public void setTrabajo_en_curso(int trabajo_en_curso) {
		this.trabajo_en_curso = trabajo_en_curso;
	}

	public int getTrabajos_finalizados() {
		return trabajos_finalizados;
	}

	public void setTrabajos_finalizados(int trabajos_finalizados) {
		this.trabajos_finalizados = trabajos_finalizados;
	}

	public String getTipo_tecnico() {
		return tipo_tecnico;
	}

	public void setTipo_tecnico(String tipo_tecnico) {
		this.tipo_tecnico = tipo_tecnico;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	public Tecnico() {
		super();
	}

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
	 */
	public Tecnico(Long id, int experiencia, int nivel, String github, String pinterest, int trabajo_en_curso,
			int trabajos_finalizados, String tipo_tecnico, List<Usuario> usuario) {
		super();
		this.id = id;
		this.experiencia = experiencia;
		this.nivel = nivel;
		this.github = github;
		this.pinterest = pinterest;
		this.trabajo_en_curso = trabajo_en_curso;
		this.trabajos_finalizados = trabajos_finalizados;
		this.tipo_tecnico = tipo_tecnico;
		this.usuario = usuario;
	}

}