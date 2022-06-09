package com.http.mska.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuariosecurity")
public class UsuarioSecurity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="username" , unique = true, nullable = false)
	private String username;
	
	@Column(name="password", nullable = false)
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Rol role;

	
	public UsuarioSecurity() {}
	
	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param role
	 */
	public UsuarioSecurity(Long id, String username, String password, Rol role) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the role
	 */
	public Rol getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Rol role) {
		this.role = role;
	}

	
}