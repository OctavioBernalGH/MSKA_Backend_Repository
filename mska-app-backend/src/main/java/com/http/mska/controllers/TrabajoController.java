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

@RestController
@RequestMapping("/api") //Raiz de la app
public class TrabajoController {
	@Autowired
	TrabajoServiceImpl trabajoServiceImpl;

	// Listar todos los trabajos
	@GetMapping("/trabajo")
	public List<Trabajo> listarTrabajo(){
		return trabajoServiceImpl.listarTrabajo();
	}

	// Buscar los trabajos por id
	@GetMapping("/trabajo/{id}")
	public Trabajo buscarTrabajo(@PathVariable(name= "id")Long id) {
		return trabajoServiceImpl.buscarTrabajo(id);		
	}

	// Eliminar una trabajo
	@DeleteMapping("/trabajo/{id}")
	public void eliminarTrabajo(@PathVariable(name="id")Long id) {
		trabajoServiceImpl.eliminarTrabajo(id);
	}

	// Crear trabajo
	@PostMapping("/trabajo")
	public Trabajo crearTrabajo(@RequestBody Trabajo trabajo) {
		return trabajoServiceImpl.crearTrabajo(trabajo);
	}

	// Modificar trabajo
	@PutMapping("/trabajo/{id}")
	public Trabajo modificarTrabajo (@PathVariable(name="id")Long id, @RequestBody Trabajo trabajo) {
		Trabajo trabajo_a_modificar = new Trabajo();
		Trabajo modificado = new Trabajo();

		// Busco el id del trabajo que quiero cambiar
		trabajo_a_modificar = trabajoServiceImpl.buscarTrabajo(id);

		trabajo_a_modificar.setId(trabajo.getId());
		trabajo_a_modificar.setId(trabajo.getId());
		trabajo_a_modificar.setDescripcion(trabajo.getDescripcion());
		trabajo_a_modificar.setFecha_ini(trabajo.getFecha_ini());
		trabajo_a_modificar.setFecha_fin(trabajo.getFecha_fin());
		trabajo_a_modificar.setEstrellas(trabajo.getEstrellas());
		trabajo_a_modificar.setPresupuesto(trabajo.getPresupuesto());
		trabajo_a_modificar.setUsuario(trabajo.getUsuario());
		
		// Modificado es = a los cambios aplicados
		modificado = trabajoServiceImpl.modificarTrabajo(trabajo_a_modificar);

		return modificado;
	}
}

