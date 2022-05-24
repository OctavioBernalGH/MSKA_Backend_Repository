package com.http.mska.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

}
