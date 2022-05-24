package com.http.mska.dto;

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
@Table(name="tecnico")
public class Tecnico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor y lo incrementa
	private Long id;
	@Column(name="experiencia")
	private int experiencia;
	@Column(name="nivel")
	private int nivel;
	@Column(name="github")
	private String github;
	@Column(name="pinterest")
	private String pinterest;
	@Column(name="trabajo_en_curso")
	private int trabajo_en_curso;
	@Column(name="trabajos_finalizados")
	private int trabajos_finalizados;
	@Column(name="tipo_tecnico")
	private String tipo_tecnico;

	// Un tecnico tiene un id de usuario
	@OneToOne
	@JoinColumn(name="fk_id_usuario")
	private List<Usuario> usuario;
}
