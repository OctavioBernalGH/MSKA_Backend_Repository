package com.http.mska.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BandagesReclutador")
	
public class BandagesReclutador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre")
	private String nombre;
	@Column(name = "desencadenante")
	private String desencadenante;
	@Column(name = "tipo")
	private String tipo;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "cantidadExp")
	private String cantidadExp;

	@OneToMany
	@JoinColumn(name = "id")
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDesencadenante() {
		return desencadenante;
	}
	
	public void setDesencadenante(String desencadenante) {
		this.desencadenante = desencadenante;
	}
	
	public String getTipo() {
		return desencadenante;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getDescripcion() {
		return tipo;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getCantidadExp() {
		return cantidadExp;
	}
	
	public void setCantidadExp(String cantidadExp) {
		this.cantidadExp = cantidadExp;
	}
	
	public BandagesReclutador() {
		super();
	}

	public BandagesReclutador(Long id, String nombre, String desencadenante, String tipo, String descripcion,
			String cantidadExp) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.desencadenante = desencadenante;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.cantidadExp = cantidadExp;
	}
	
}