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
import com.http.mska.dto.Trabajo;
import com.http.mska.services.TrabajoServiceImpl;

/**
 * Se define controlador del tipo Rest y se asigna /api como inicio del
 * aplicativo
 */
@RestController
@RequestMapping("/api")
public class TrabajoController {

	/** Se inyectan las dependencias generadas en la capa service */
	@Autowired
	TrabajoServiceImpl trabajoServiceImpl;

	/** Listar trabajos */
	@GetMapping("/trabajo")
	public List<Trabajo> listarTrabajo() {
		return trabajoServiceImpl.listarTrabajo();
	}

	/** Buscar trabajo por identificador */
	@GetMapping("/trabajo/{id}")
	public Trabajo buscarTrabajo(@PathVariable(name = "id") Long id) {
		return trabajoServiceImpl.buscarTrabajo(id);
	}

	/** Crear un nuevo trabajo */
	@PostMapping("/trabajo")
	public Trabajo crearTrabajo(@RequestBody Trabajo trabajo) {
		return trabajoServiceImpl.crearTrabajo(trabajo);
	}

	/** Modificar trabajo existente */
	@PutMapping("/trabajo/{id}")
	public Trabajo modificarTrabajo(@PathVariable(name = "id") Long id, @RequestBody Trabajo trabajo) {
		/** Instancias de la clase Trabajo */
		Trabajo trabajo_a_modificar = new Trabajo();
		Trabajo modificado = new Trabajo();

		/** Se busca el identificador del objeto a modificar */
		trabajo_a_modificar = trabajoServiceImpl.buscarTrabajo(id);

		/** Se definen sus nuevos datos */
		trabajo_a_modificar.setId(trabajo.getId());
		trabajo_a_modificar.setId(trabajo.getId());
		trabajo_a_modificar.setDescripcion(trabajo.getDescripcion());
		trabajo_a_modificar.setFecha_ini(trabajo.getFecha_ini());
		trabajo_a_modificar.setFecha_fin(trabajo.getFecha_fin());
		trabajo_a_modificar.setEstrellas(trabajo.getEstrellas());
		trabajo_a_modificar.setPresupuesto(trabajo.getPresupuesto());
		trabajo_a_modificar.setUsuarioAsignador(trabajo.getUsuarioAsignador());
		trabajo_a_modificar.setUsuarioAsignado(trabajo.getUsuarioAsignado());
		trabajo_a_modificar.setComentarioTrabajo(trabajo.getComentarioTrabajo());
		trabajo_a_modificar.setPosee(trabajo.getPosee());

		/** Se vuelcan los nuevos datos */
		modificado = trabajoServiceImpl.modificarTrabajo(trabajo_a_modificar);

		/** Se devuelve el objeto modificado */
		return modificado;
	}

	/** Eliminar trabajo existente por el identificador */
	@DeleteMapping("/trabajo/{id}")
	public void eliminarTrabajo(@PathVariable(name = "id") Long id) {
		trabajoServiceImpl.eliminarTrabajo(id);
	}
}
