package com.http.mska.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** Se define la clase como entidad y se asigna la tabla post_usuario */
@Entity
@Table(name = "post_usuario")
public class PostUsuario {

	/** Se genera el identificador como autoincremental */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** Se mapean los atributos de clase con las columnas de la base de datos */
	@Column(name = "retwit", columnDefinition = "int default 0", nullable = true)
	private int retwit;

	@Column(name = "likes", columnDefinition = "int default 0", nullable = true)
	private int likes;

	@Column(name = "fecha_post", columnDefinition = "timestamp", nullable = false)
	private Date fechaPost;

	@Column(name = "link", columnDefinition = "nvarchar(255)", nullable = true)
	private String link;

	@Column(name = "uri_foto", columnDefinition ="nvarchar(255)", nullable = true)
	private String uriFoto;
	
	/** Relación uno a muchos con la tabla Usuario */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_usuario")
	private Usuario usuario;
	
	/** Constructor por defecto */
	public PostUsuario() {}

	/**
	 * @param id
	 * @param retwit
	 * @param likes
	 * @param fechaPost
	 * @param link
	 * @param uriFoto
	 * @param usuario
	 */
	public PostUsuario(Long id, int retwit, int likes, Date fechaPost, String link, String uriFoto, Usuario usuario) {
		this.id = id;
		this.retwit = retwit;
		this.likes = likes;
		this.fechaPost = fechaPost;
		this.link = link;
		this.uriFoto = uriFoto;
		this.usuario = usuario;
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
	 * @return the retwit
	 */
	public int getRetwit() {
		return retwit;
	}

	/**
	 * @param retwit the retwit to set
	 */
	public void setRetwit(int retwit) {
		this.retwit = retwit;
	}

	/**
	 * @return the likes
	 */
	public int getLikes() {
		return likes;
	}

	/**
	 * @param likes the likes to set
	 */
	public void setLikes(int likes) {
		this.likes = likes;
	}

	/**
	 * @return the fechaPost
	 */
	public Date getFechaPost() {
		return fechaPost;
	}

	/**
	 * @param fechaPost the fechaPost to set
	 */
	public void setFechaPost(Date fechaPost) {
		this.fechaPost = fechaPost;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @return the uriFoto
	 */
	public String getUriFoto() {
		return uriFoto;
	}

	/**
	 * @param uriFoto the uriFoto to set
	 */
	public void setUriFoto(String uriFoto) {
		this.uriFoto = uriFoto;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
