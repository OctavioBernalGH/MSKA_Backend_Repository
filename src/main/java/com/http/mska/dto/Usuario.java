package com.http.mska.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

	/** RELACIONES CON OTRAS TABLAS */
	@ManyToOne
	@JoinColumn(name="fk_id_tecnico")
	private Tecnico tecnico;

	@ManyToOne
	@JoinColumn(name="fk_id_reclutador")
	private Reclutador reclutador;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Mensaje> mensaje;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Entrevista> entrevista;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Trabajo> trabajo;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<ComentarioTrabajo> comentarioTrabajo;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<PostUsuario> postUsuario;

	// Constructores
	public Usuario() {
		super();
	}

	/**
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
	 * @param mensaje
	 * @param trabajo
	 */
	public Usuario(Long id, String nombre, String apellidos, String email, String nombreUsuario, String contraseña,
			String poblacion, String pais, String codigoPostal, Date fechaRegistro, Date fechaNacimiento, int movil,
			String instagram, String linkedin, int numEntrevista, int numMensajes, int numTrabajos, int numValoraciones,
			String uriFoto, Tecnico tecnico, Reclutador reclutador, List<Mensaje> mensaje, List<Entrevista> entrevista, 
			List<Trabajo> trabajo, List<ComentarioTrabajo> comentarioTrabajo, List<PostUsuario> postUsuario) {
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
		this.mensaje = mensaje;
		this.entrevista = entrevista;
		this.trabajo = trabajo;
		this.comentarioTrabajo = comentarioTrabajo;
		this.postUsuario = postUsuario;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}

	/**
	 * @param contraseña the contraseña to set
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	/**
	 * @return the poblacion
	 */
	public String getPoblacion() {
		return poblacion;
	}

	/**
	 * @param poblacion the poblacion to set
	 */
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the codigoPostal
	 */
	public String getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * @param codigoPostal the codigoPostal to set
	 */
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	/**
	 * @return the fechaRegistro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * @param fechaRegistro the fechaRegistro to set
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the movil
	 */
	public int getMovil() {
		return movil;
	}

	/**
	 * @param movil the movil to set
	 */
	public void setMovil(int movil) {
		this.movil = movil;
	}

	/**
	 * @return the instagram
	 */
	public String getInstagram() {
		return instagram;
	}

	/**
	 * @param instagram the instagram to set
	 */
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	/**
	 * @return the linkedin
	 */
	public String getLinkedin() {
		return linkedin;
	}

	/**
	 * @param linkedin the linkedin to set
	 */
	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	/**
	 * @return the numEntrevista
	 */
	public int getNumEntrevista() {
		return numEntrevista;
	}

	/**
	 * @param numEntrevista the numEntrevista to set
	 */
	public void setNumEntrevista(int numEntrevista) {
		this.numEntrevista = numEntrevista;
	}

	/**
	 * @return the numMensajes
	 */
	public int getNumMensajes() {
		return numMensajes;
	}

	/**
	 * @param numMensajes the numMensajes to set
	 */
	public void setNumMensajes(int numMensajes) {
		this.numMensajes = numMensajes;
	}

	/**
	 * @return the numTrabajos
	 */
	public int getNumTrabajos() {
		return numTrabajos;
	}

	/**
	 * @param numTrabajos the numTrabajos to set
	 */
	public void setNumTrabajos(int numTrabajos) {
		this.numTrabajos = numTrabajos;
	}

	/**
	 * @return the numValoraciones
	 */
	public int getNumValoraciones() {
		return numValoraciones;
	}

	/**
	 * @param numValoraciones the numValoraciones to set
	 */
	public void setNumValoraciones(int numValoraciones) {
		this.numValoraciones = numValoraciones;
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
	 * @return the tecnico
	 */
	public Tecnico getTecnico() {
		return tecnico;
	}

	/**
	 * @param tecnico the tecnico to set
	 */
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	/**
	 * @return the reclutador
	 */
	public Reclutador getReclutador() {
		return reclutador;
	}

	/**
	 * @param reclutador the reclutador to set
	 */
	public void setReclutador(Reclutador reclutador) {
		this.reclutador = reclutador;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(List<Mensaje> mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * @param entrevista the entrevista to set
	 */
	public void setEntrevista(List<Entrevista> entrevista) {
		this.entrevista = entrevista;
	}		
	
	/**
	 * @param comentarioTrabajo the comentarioTrabajo to set
	 */
	public void setComentarioTrabajo(List<ComentarioTrabajo> comentarioTrabajo) {
		this.comentarioTrabajo = comentarioTrabajo;
	}

	/**
	 * @param trabajo the trabajo to set
	 */
	public void setTrabajo(List<Trabajo> trabajo) {
		this.trabajo = trabajo;
	}
	
	/**
	 * @param postUsuario the postUsuario to set
	 */
	public void setPostUsuario(List<PostUsuario> postUsuario) {
		this.postUsuario = postUsuario;
	}

	/** JSONIGNORE para eliminar la recursividad ! */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Mensaje")
	public List<Mensaje> getMensaje() {
		return mensaje;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Entrevista")
	public List<Entrevista> getEntrevista() {
		return entrevista;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Trabajo")
	public List<Trabajo> getTrabajo() {
		return trabajo;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ComentarioTrabajo")
	public List<ComentarioTrabajo> getComentarioTrabajo() {
		return comentarioTrabajo;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "PostUsuario")
	public List<PostUsuario> getPostUsuario() {
		return postUsuario;
	}
}
