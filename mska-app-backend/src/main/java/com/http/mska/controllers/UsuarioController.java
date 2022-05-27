package com.http.mska.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.http.mska.dto.Usuario;
import com.http.mska.services.UsuarioServiceImp;

/**
 * Se define el controlador como tipo RestController. Se define la ruta inicial
 * del aplicativo mediante la anotación @RequestMapping.
 */
@RestController
@RequestMapping("/api")

public class UsuarioController {

	/**
	 * Se ineyctan las dependencias de la clase UsuarioServiceImp mediante la
	 * anotación @Autowired.
	 */
	@Autowired
	UsuarioServiceImp usuarioServiceImp;
	
	/** Direcciones de la api con métodos HTTP definidos */
	
	@GetMapping("/usuario")
	public List<Usuario> listarUsuarios(){
		return usuarioServiceImp.listarUsuarios();
		// Se listan todos los usuarios.
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario buscarUsuarioXIdentificador(@PathVariable (name = "id") Long id) {
		return usuarioServiceImp.buscarUsuarioXIdentificador(id);
		// Se busca un usuario filtrando por identificador.
	}
	
	@PostMapping("/usuario")
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return usuarioServiceImp.crearUsuario(usuario);
		// Se crea un nuevo usuario.
	}
	
	@PutMapping("/usuario/{id}")
	public Usuario modificarUsuario(@PathVariable (name = "id") Long id, @RequestBody Usuario usuario) {
		// Se crean dos instancias de la clase Usuario.
		Usuario usuario_a_modificar = new Usuario();
		Usuario modificado = new Usuario();
		
		// Se recupera el usuario a modificar mediante su identificador.
		usuario_a_modificar = usuarioServiceImp.buscarUsuarioXIdentificador(id);
		
		// Se modifican los atributos del usuario.
		usuario_a_modificar.setNombre(usuario.getNombre());
		usuario_a_modificar.setApellidos(usuario.getApellidos());
		usuario_a_modificar.setEmail(usuario.getEmail());
		usuario_a_modificar.setNombreUsuario(usuario.getNombreUsuario());
		usuario_a_modificar.setContraseña(usuario.getContraseña());
		usuario_a_modificar.setPoblacion(usuario.getPoblacion());
		usuario_a_modificar.setPais(usuario.getPais());
		usuario_a_modificar.setCodigoPostal(usuario.getCodigoPostal());
		usuario_a_modificar.setFechaRegistro(usuario.getFechaRegistro());
		usuario_a_modificar.setFechaNacimiento(usuario.getFechaNacimiento());
		usuario_a_modificar.setMovil(usuario.getMovil());
		usuario_a_modificar.setInstagram(usuario.getInstagram());
		usuario_a_modificar.setLinkedin(usuario.getLinkedin());
		usuario_a_modificar.setNumEntrevista(usuario.getNumEntrevista());
		usuario_a_modificar.setNumMensajes(usuario.getNumMensajes());
		usuario_a_modificar.setNumTrabajos(usuario.getNumTrabajos());
		usuario_a_modificar.setNumValoraciones(usuario.getNumValoraciones());
		usuario_a_modificar.setUriFoto(usuario.getUriFoto());
		usuario_a_modificar.setReclutador(usuario.getReclutador());
		usuario_a_modificar.setTecnico(usuario.getTecnico());
		usuario_a_modificar.setMensaje(usuario.getMensaje());
		usuario_a_modificar.setEntrevista(usuario.getEntrevista());
		
		// Se vuelcan los nuevos datos a la segunda instancia.
		modificado = usuarioServiceImp.modificarUsuario(usuario_a_modificar);
		
		// Se devuelven los nuevos datos actualizados.
		return modificado;
		
	}
	
	@DeleteMapping("/usuario/{id}")
	public void eliminarUsuario(@PathVariable(name="id") Long id) {
		usuarioServiceImp.eliminarUsuario(id);
		// Se elimina un usuario mediante el identificador.
	}
}
