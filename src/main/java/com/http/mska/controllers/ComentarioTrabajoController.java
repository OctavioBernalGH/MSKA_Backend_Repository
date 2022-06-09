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
import com.http.mska.dto.ComentarioTrabajo;
import com.http.mska.services.ComentarioTrabajoServiceImpl;

/**
 * Se define controlador del tipo rest, se asigna /api como ruta inicial del
 * aplicativo
 */
@RestController
@RequestMapping("/api")
public class ComentarioTrabajoController {

	@Autowired
	ComentarioTrabajoServiceImpl comentarioTrabajoServiceImpl;

	@GetMapping("/comentariotrabajo")
	public List<ComentarioTrabajo> listarComentarioTrabajo() {
		return comentarioTrabajoServiceImpl.listarComentarioTrabajo();
	}

	@GetMapping("/comentariotrabajo/{id}")
	public ComentarioTrabajo buscarComentarioTrabajoXIdentificador(@PathVariable(name = "id") Long id) {
		return comentarioTrabajoServiceImpl.buscarComentarioTrabajoXIdentificador(id);
	}

	@PostMapping("/comentariotrabajo")
	public ComentarioTrabajo crearComentarioTrabajo(@RequestBody ComentarioTrabajo comentarioTrabajo) {
		return comentarioTrabajoServiceImpl.crearComentarioTrabajo(comentarioTrabajo);
	}

	@PutMapping("/comentariotrabajo/{id}")
	public ComentarioTrabajo modificarComentarioTrabajo(@PathVariable(name = "id") Long id,
			@RequestBody ComentarioTrabajo comentarioTrabajo) {

		/** Instancias de clase ComentarioTrabajo */
		ComentarioTrabajo a_modificar = new ComentarioTrabajo();
		ComentarioTrabajo modificado = new ComentarioTrabajo();
		
		/** Se busca el comentario a modificar */
		a_modificar = comentarioTrabajoServiceImpl.buscarComentarioTrabajoXIdentificador(id);
		
		/** Se modifica el comentario trabajo */
		a_modificar.setComentario(comentarioTrabajo.getComentario());
		a_modificar.setFechaComentario(comentarioTrabajo.getFechaComentario());
		a_modificar.setTrabajo(comentarioTrabajo.getTrabajo());
		a_modificar.setUsuario(comentarioTrabajo.getUsuario());
		
		/** Se vuelcan los datos nuevos */
		modificado = comentarioTrabajoServiceImpl.modificaComentarioTrabajo(a_modificar);
		
		/** Se devuelve el nuevo comentario trabajo */
		return modificado;
	}

	@DeleteMapping("/comentariotrabajo/{id}")
	public String eliminarComentarioTrabajo(@PathVariable(name = "id") Long id) {
		comentarioTrabajoServiceImpl.eliminarComentarioTrabajo(id);
		return "Se ha eliminado el comentario " + id + " con éxito.";
	}
}
