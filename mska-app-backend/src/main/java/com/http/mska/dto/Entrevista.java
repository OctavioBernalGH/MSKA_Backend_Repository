package com.http.mska.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entrevista")
public class Entrevista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "fecha_entrevista")
	private Date fecha_entrevista;
	@Column(name ="duracion")
	private int duracion;
	@Column(name ="estado_entrevista")
	private boolean estado_entrevista;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getFecha_entrevista() {
		return fecha_entrevista;
	}
	public void setFecha_entrevista(Date fecha_entrevista) {
		this.fecha_entrevista = fecha_entrevista;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public boolean isEstado_entrevista() {
		return estado_entrevista;
	}
	public void setEstado_entrevista(boolean estado_entrevista) {
		this.estado_entrevista = estado_entrevista;
	}
	
	//TODO RElacionfk_id_usuario
	
	
	
}	




	

