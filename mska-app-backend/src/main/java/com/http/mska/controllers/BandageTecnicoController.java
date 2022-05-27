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

<<<<<<< HEAD
import com.http.mska.dto.BandagesTecnico;
import com.http.mska.services.BandagesTecnicoServiceImpl;

/**
 * Clase @BandagesTecnicoController. Mappea las funcionalidades con las rutas
=======
import com.http.mska.dto.BandageTecnico;
import com.http.mska.services.BandageTecnicoServiceImpl;

/**
 * Clase @BandageTecnicoController. Mappea las funcionalidades con las rutas
>>>>>>> 520e4fcc104418849e4d79e38a728a6902fe25a7
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

public class BandageTecnicoController {

<<<<<<< HEAD
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
=======
	/** Se crea una instancia del tipo @BandageTecnicoServiceImpl */
	@Autowired
	BandageTecnicoServiceImpl bandageTecnicoServiceImpl;

	/** Método para listar bandage de Tecnico */
	@GetMapping("/bandageTecnico")
	public List<BandageTecnico> listarBandageTecnico() {
		return bandageTecnicoServiceImpl.listarBandageTecnico();
	}

	/** Método para listar bandageTecnico por id */
	@GetMapping("/bandageTecnico/id/{id}")
	public List<BandageTecnico> listarBandageTecnico(@PathVariable(name = "id") String id) {
>>>>>>> 520e4fcc104418849e4d79e38a728a6902fe25a7
		return null;
	}

	/** Método para crear un nuevo bandage de Tecnico */
<<<<<<< HEAD
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
=======
	@PostMapping("/bandageTecnico")
	public BandageTecnico crearBandageTecnico(@RequestBody BandageTecnico bandageTecnico) {
		return bandageTecnicoServiceImpl.crearBandageTecnico(bandageTecnico);
	}

	/** Método para buscar un bandage de Tecnico por id */
	@GetMapping("/bandageTecnico/{id}")
	public BandageTecnico buscarBandageTecnicoId(@PathVariable(name = "id") Long id) {
		return bandageTecnicoServiceImpl.buscarBandageTecnico(id);
	}

	/** Método para actualizar un bandageTecnico */
	@PutMapping("/bandageTecnico/{id}")
	public BandageTecnico actualizarBandageTecnico(@PathVariable(name = "id") Long id,
			@RequestBody BandageTecnico bandageTecnico) {

		/** Se definen instancias del tipo bandage de Tecnico */
		BandageTecnico bandage_Tecnico_a_actualizar = new BandageTecnico();
		BandageTecnico actualizado = new BandageTecnico();

		/** Se filtra el bandage de Tecnico a actualizar por código */
		bandage_Tecnico_a_actualizar = bandageTecnicoServiceImpl.buscarBandageTecnico(id);

		/** Se actualizan los valores */
		bandage_Tecnico_a_actualizar.setId(bandageTecnico.getId());
		bandage_Tecnico_a_actualizar.setNombre(bandageTecnico.getNombre());
		bandage_Tecnico_a_actualizar.setDesencadenante(bandageTecnico.getDesencadenante());
		bandage_Tecnico_a_actualizar.setTipo(bandageTecnico.getTipo());
		bandage_Tecnico_a_actualizar.setDescripcion(bandageTecnico.getDescripcion());
		bandage_Tecnico_a_actualizar.setCantidadExp(bandageTecnico.getCantidadExp());
	
		actualizado = bandageTecnicoServiceImpl.modificarBandageTecnico(bandage_Tecnico_a_actualizar);
>>>>>>> 520e4fcc104418849e4d79e38a728a6902fe25a7

		return actualizado;
	}

	/** Método para eliminar un bandage de Tecnico */
<<<<<<< HEAD
	@DeleteMapping("/bandagesTecnico/{id}")
	public void eliminarBandagesTecnico(@PathVariable(name = "codigo") Long id) {
		bandagesTecnicoServiceImpl.eliminarBandageTecnico(id);
=======
	@DeleteMapping("/bandageTecnico/{id}")
	public void eliminarBandageTecnico(@PathVariable(name = "codigo") Long id) {
		bandageTecnicoServiceImpl.eliminarBandageTecnico(id);
>>>>>>> 520e4fcc104418849e4d79e38a728a6902fe25a7
		System.out.println("Bandage de técnico eliminado con exito.");
	}
}