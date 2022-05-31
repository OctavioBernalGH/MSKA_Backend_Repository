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
import com.http.mska.dto.PostUsuario;
import com.http.mska.services.PostUsuarioServiceImpl;

/**
 * Se define controlador del tipo Rest y se indica /api la ruta inicial del
 * enrutamiento
 */
@RestController
@RequestMapping("/api")
public class PostUsuarioController {

	/** Se inyectan las depedencias generadas en la capa service + DAO */
	@Autowired
	PostUsuarioServiceImpl postUsuarioServiceImpl;

	/** Listar post usuario */
	@GetMapping("/postusuario")
	public List<PostUsuario> listarPostUsuario() {
		return postUsuarioServiceImpl.listarPostUsuario();
	}

	/** Se busca un post de usuario mediante el identificador */
	@GetMapping("/postusuario/{id}")
	public PostUsuario buscarPostUsuarioXIdentificador(@PathVariable(name = "id") Long id) {
		return postUsuarioServiceImpl.buscarPostUsuarioXIdentificador(id);
	}

	/** Se crea un post de usuario */
	@PostMapping("/postusuario")
	public PostUsuario crearPostUsuario(@RequestBody PostUsuario postUsuario) {
		return postUsuarioServiceImpl.crearPostUsuario(postUsuario);
	}

	/** Modificar un post de usuario mediante el identificador */
	@PutMapping("/postusuario/{id}")
	public PostUsuario modificarPostUsuario(@PathVariable(name = "id") Long id, @RequestBody PostUsuario postUsuario) {
		/** Se crean instancias del tipo PostUsuario */
		PostUsuario a_modificar = new PostUsuario();
		PostUsuario modificado = new PostUsuario();

		/** Se obtiene el identificador del post a modificar */
		a_modificar = postUsuarioServiceImpl.buscarPostUsuarioXIdentificador(id);

		/** Se modifican los valores del nuevo post de usuario */
		a_modificar.setRetwit(postUsuario.getRetwit());
		a_modificar.setLikes(postUsuario.getLikes());
		a_modificar.setLink(postUsuario.getLink());
		a_modificar.setUriFoto(postUsuario.getUriFoto());
		a_modificar.setFechaPost(postUsuario.getFechaPost());
		a_modificar.setUsuario(postUsuario.getUsuario());

		/** Se vuelcan los nuevos datos */
		modificado = postUsuarioServiceImpl.modificarPostUsuario(a_modificar);

		/** Se devuelve el nuevo objeto post usuario */
		return modificado;
	}

	/** Eliminar un post de usuario mediante el identificador */
	@DeleteMapping("/postusuario/{id}")
	public String eliminarPostUsuario(@PathVariable(name = "id") Long id) {
		postUsuarioServiceImpl.eliminarPostUsuario(id);
		return "Se elimina el post " + id + " con éxito";
	}
}
