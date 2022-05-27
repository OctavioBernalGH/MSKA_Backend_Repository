package com.http.mska.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "skill")
public class Skill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "tipo")
	private String tipo="";
	@Column(name = "validado")
	private boolean validado;
	@Column(name = "cantidad_exp")
	private int cantidad_exp;
	
	public Skill() {
		super();
	}

	public Skill(Long id, String tipo, boolean validado, int cantidad_exp) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.validado = validado;
		this.cantidad_exp = cantidad_exp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isValidado() {
		return validado;
	}

	public void setValidado(boolean validado) {
		this.validado = validado;
	}

	public int getCantidad_exp() {
		return cantidad_exp;
	}

	public void setCantidad_exp(int cantidad_exp) {
		this.cantidad_exp = cantidad_exp;
	}

}
