package com.http.mska.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Se define la clase Usuarios como entidad y se mapea con la tabla usuarios de
 * la base de datos
 */
@Entity
@Table(name = "usuario")
public class Usuario {

	/** Se genera el ID de forma auto incremental en la base de datos */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** Mapeos de columnas en base de datos con atributos en Spring */
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellidos")
	private String apellidos;

	@Column(name = "email")
	private String email;

	@Column(name = "nombre_usuario")
	private String nombreUsuario;

	@Column(name = "contraseña")
	private String contraseña;

	@Column(name = "poblacion")
	private String poblacion;

	@Column(name = "pais")
	private String pais;

	@Column(name = "cp")
	private String codigoPostal;

	@Column(name = "fecha_registro")
	private Date fechaRegistro;

	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;

	@Column(name = "movil")
	private int movil;

	@Column(name = "instagram")
	private String instagram;

	@Column(name = "linkedin")
	private String linkedin;

	@Column(name = "num_entrevista")
	private int numEntrevista;

	@Column(name = "num_mensajes")
	private int numMensajes;

	@Column(name = "num_trabajos")
	private int numTrabajos;
	
	@Column(name = "num_valoraciones")
	private int numValoraciones;

	@Column(name = "uri_foto")
	private String uriFoto;

	/** Relaciones OneToMany */
	@ManyToOne
	@JoinColumn(name="fk_id_tecnico")
	private Tecnico tecnico;

	@ManyToOne
	@JoinColumn(name="fk_id_reclutador")
	private Reclutador reclutador;
	
	//Getters y setters

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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getMovil() {
		return movil;
	}

	public void setMovil(int movil) {
		this.movil = movil;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public int getNumEntrevista() {
		return numEntrevista;
	}

	public void setNumEntrevista(int numEntrevista) {
		this.numEntrevista = numEntrevista;
	}

	public int getNumMensajes() {
		return numMensajes;
	}

	public void setNumMensajes(int numMensajes) {
		this.numMensajes = numMensajes;
	}

	public int getNumTrabajos() {
		return numTrabajos;
	}

	public void setNumTrabajos(int numTrabajos) {
		this.numTrabajos = numTrabajos;
	}

	public int getNumValoraciones() {
		return numValoraciones;
	}

	public void setNumValoraciones(int numValoraciones) {
		this.numValoraciones = numValoraciones;
	}

	public String getUriFoto() {
		return uriFoto;
	}

	public void setUriFoto(String uriFoto) {
		this.uriFoto = uriFoto;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public Reclutador getReclutador() {
		return reclutador;
	}

	public void setReclutador(Reclutador reclutador) {
		this.reclutador = reclutador;
	}

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param email
	 * @param nombreUsuario
	 * @param contraseña
	 * @param poblacion
	 * @param pais
	 * @param codigoPostal
	 * @param fechaRegistro
	 * @param fechaNacimiento
	 * @param movil
	 * @param instagram
	 * @param linkedin
	 * @param numEntrevista
	 * @param numMensajes
	 * @param numTrabajos
	 * @param numValoraciones
	 * @param uriFoto
	 * @param tecnico
	 * @param reclutador
	 */
	
	//Constructor
	
	public Usuario(Long id, String nombre, String apellidos, String email, String nombreUsuario, String contraseña,
			String poblacion, String pais, String codigoPostal, Date fechaRegistro, Date fechaNacimiento, int movil,
			String instagram, String linkedin, int numEntrevista, int numMensajes, int numTrabajos, int numValoraciones,
			String uriFoto, Tecnico tecnico, Reclutador reclutador) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
		this.poblacion = poblacion;
		this.pais = pais;
		this.codigoPostal = codigoPostal;
		this.fechaRegistro = fechaRegistro;
		this.fechaNacimiento = fechaNacimiento;
		this.movil = movil;
		this.instagram = instagram;
		this.linkedin = linkedin;
		this.numEntrevista = numEntrevista;
		this.numMensajes = numMensajes;
		this.numTrabajos = numTrabajos;
		this.numValoraciones = numValoraciones;
		this.uriFoto = uriFoto;
		this.tecnico = tecnico;
		this.reclutador = reclutador;
	}

	public Usuario() {
		super();
	}
	
}
