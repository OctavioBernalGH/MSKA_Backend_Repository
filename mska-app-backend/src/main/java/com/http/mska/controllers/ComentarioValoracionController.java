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

import com.http.mska.dto.ComentarioValoracion;
import com.http.mska.dto.Entrevista;
import com.http.mska.services.ComentarioValoracionServiceImp;

@RestController
@RequestMapping("/api")
public class ComentarioValoracionController {

	@Autowired
	ComentarioValoracionServiceImp comentarioValoracionServiceImp;

	@GetMapping("/comentarioValoracion")
	public List<ComentarioValoracion> listarComentarioValoracion() {
		return comentarioValoracionServiceImp.listarComentarioValoracion();
	}

	@GetMapping("/comentarioValoracion/{id}")
	public ComentarioValoracion buscarComentarioValoracionXID(@PathVariable(name = "id") Long id) {
		return comentarioValoracionServiceImp.buscarComentarioValoracionXID(id);
	}

	@PostMapping("/comentarioValoracion")
	public ComentarioValoracion crearComentarioValoracion(@PathVariable(name = "id") Long id,
			@RequestBody ComentarioValoracion comentarioValoracion) {
		return comentarioValoracionServiceImp.crearComentarioValoracion(comentarioValoracion);
	}

	@PutMapping("/comentarioValoracion/{}id")
	public ComentarioValoracion modificarComentarioValoracion(@PathVariable(name = "id") Long id,
			@RequestBody ComentarioValoracion comentarioValoracion) {

		/** Se definen instancias del tipo ComentarioValoracion */
		ComentarioValoracion comentario_a_actualizar = new ComentarioValoracion();
		ComentarioValoracion comentario_modificado = new ComentarioValoracion();

		/** Se filtra el comentario a actualizar por ID */
		comentario_a_actualizar = comentarioValoracionServiceImp.buscarComentarioValoracionXID(id);

		/** Se actualizan los valores */
		comentario_a_actualizar.setComentario(comentarioValoracion.getComentario());
		comentario_a_actualizar.setFechaComentario(comentarioValoracion.getFechaComentario());
		comentario_a_actualizar.setId(comentarioValoracion.getId());

		comentario_modificado = comentarioValoracionServiceImp.modificarComentarioValoracion(comentario_a_actualizar);

		return comentario_modificado;
	}

	/** Método para eliminar una entrevista */
	@DeleteMapping("/comentarioValoracion/{id}")
	public void eliminarComentarioValoracion(@PathVariable(name = "id") Long id) {
		comentarioValoracionServiceImp.eliminarComentarioValoracion(id);
	}

}