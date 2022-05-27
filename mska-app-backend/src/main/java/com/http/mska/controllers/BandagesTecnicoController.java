package com.http.mska.controllers;

import java.util.List;

import javax.persistence.Column;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.http.mska.dto.BandagesTecnico;
import com.http.mska.services.BandagesTecnicoServiceImpl;

/**
 * Clase @BandagesTecnicoController. Mappea las funcionalidades con las rutas
 * de la api.
 * 
 * @author Octavio Bernal.
 * @author Ixabel Justo.
 * @author David Dalmau.
 * @author Josep Oriol López.
 *
 */

@RestController
@RequestMapping("/api")

public class BandagesTecnicoController {

	/** Se crea una instancia del tipo @BandagesTecnicoServiceImpl */
	@Autowired
	BandagesTecnicoServiceImpl bandagesTecnicoServiceImpl;

	/** Método para listar bandages de Tecnico */
	@GetMapping("/bandagesTecnico")
	public List<BandagesTecnico> listarBandagesTecnico() {
		return bandagesTecnicoServiceImpl.listarBandagesTecnico();
	}

	/** Método para listar bandagesTecnico por id */
	@GetMapping("/bandagesTecnico/id/{id}")
	public List<BandagesTecnico> listarBandagesTecnico(@PathVariable(name = "id") String id) {
		return null;
	}

	/** Método para crear un nuevo bandage de Tecnico */
	@PostMapping("/bandagesTecnico")
	public BandagesTecnico crearBandagesTecnico(@RequestBody BandagesTecnico bandagesTecnico) {
		return bandagesTecnicoServiceImpl.crearBandageTecnico(bandagesTecnico);
	}

	/** Método para buscar un bandage de Tecnico por id */
	@GetMapping("/bandagesTecnico/{id}")
	public BandagesTecnico buscarBandagesTecnicoId(@PathVariable(name = "id") Long id) {
		return bandagesTecnicoServiceImpl.buscarBandagesTecnico(id);
	}

	/** Método para actualizar un bandagesTecnico */
	@PutMapping("/bandagesTecnico/{id}")
	public BandagesTecnico actualizarBandagesTecnico(@PathVariable(name = "id") Long id,
			@RequestBody BandagesTecnico bandagesTecnico) {

		/** Se definen instancias del tipo bandages de Tecnico */
		BandagesTecnico bandages_Tecnico_a_actualizar = new BandagesTecnico();
		BandagesTecnico actualizado = new BandagesTecnico();

		/** Se filtra el bandages de Tecnico a actualizar por código */
		bandages_Tecnico_a_actualizar = bandagesTecnicoServiceImpl.buscarBandagesTecnico(id);

		/** Se actualizan los valores */
		bandages_Tecnico_a_actualizar.setId(bandagesTecnico.getId());
		bandages_Tecnico_a_actualizar.setNombre(bandagesTecnico.getNombre());
		bandages_Tecnico_a_actualizar.setDesencadenante(bandagesTecnico.getDesencadenante());
		bandages_Tecnico_a_actualizar.setTipo(bandagesTecnico.getTipo());
		bandages_Tecnico_a_actualizar.setDescripcion(bandagesTecnico.getDescripcion());
		bandages_Tecnico_a_actualizar.setCantidadExp(bandagesTecnico.getCantidadExp());
	
		actualizado = bandagesTecnicoServiceImpl.modificarBandageTecnico(bandages_Tecnico_a_actualizar);

		return actualizado;
	}

	/** Método para eliminar un bandage de Tecnico */
	@DeleteMapping("/bandagesTecnico/{id}")
	public void eliminarBandagesTecnico(@PathVariable(name = "codigo") Long id) {
		bandagesTecnicoServiceImpl.eliminarBandageTecnico(id);
		System.out.println("Bandage de técnico eliminado con exito.");
	}
}