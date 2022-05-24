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

import com.http.mska.dto.BandagesReclutador;
import com.http.mska.services.BandagesReclutadorServiceImpl;

/**
 * Clase @BandagesReclutadorController. Mappea las funcionalidades con las rutas de la api.
 * 
 * @author Octavio Bernal.
 * @author Ixabel Justo.
 * @author David Dalmau.
 * @author Josep Oriol López.
 *
 */

@RestController
@RequestMapping("/api")

public class BandagesReclutadorController {
	
	/** Se crea una instancia del tipo @BandagesReclutadorServiceImpl */
	@Autowired
	BandagesReclutadorServiceImpl bandagesReclutadorServiceImpl ;

	/** Método para listar bandages de reclutador */
	@GetMapping("/bandagesReclutador")
	public List<BandagesReclutador> listarBandagesReclutador() {
		return bandagesReclutadorServiceImpl.listarBandagesReclutador();
	}
	
	/** Método para listar bandagesReclutador por id */
	@GetMapping("/bandagesReclutador/id/{id}")
	public List<BandagesReclutador> listarBandagesReclutador(@PathVariable(name = "id") String id) {
		return null;
	}

	/** Método para crear un nuevo bandage de reclutador */
	@PostMapping("/bandagesReclutador")
	public BandagesReclutador crearBandagesReclutador(@RequestBody BandagesReclutador bandagesReclutador) {
		return bandagesReclutadorServiceImpl.crearBandageReclutador(bandagesReclutador);
	}
	
	/** Método para buscar un bandage de reclutador por id */
	@GetMapping("/bandagesReclutador/{id}")
	public BandagesReclutador buscarBandagesReclutadorId(@PathVariable(name = "id") Long id) {
		return bandagesReclutadorServiceImpl.buscarBandageReclutador(id);
	}
	
	/** Método para actualizar un bandagesReclutador */
	@PutMapping("/bandagesReclutador/{id}")
	public BandagesReclutador actualizarBandagesReclutador(@PathVariable(name = "id") Long id,
			@RequestBody BandagesReclutador bandagesReclutador) {
		
	/** Se definen instancias del tipo bandages de reclutador */
	BandagesReclutador bandages_reclutador_a_actualizar = new BandagesReclutador();
	BandagesReclutador actualizado = new BandagesReclutador();
		
	/** Se filtra el bandages de reclutador a actualizar por código */
	bandages_reclutador_a_actualizar = bandagesReclutadorServiceImpl.buscarBandageReclutador(id);
		
	/** Se actualizan los valores */
	bandages_reclutador_a_actualizar.setId(bandagesReclutador.getId());
	bandages_reclutador_a_actualizar.setNombre(bandagesReclutador.getNombre());

	actualizado = bandagesReclutadorServiceImpl.modificarBandageReclutador(bandages_reclutador_a_actualizar);

		return actualizado;
	}
	
	/** Método para eliminar un bandage de reclutador */
	@DeleteMapping("/bandagesReclutador/{id}")
	public void eliminarBandagesReclutador(@PathVariable(name = "codigo") Long codigo) {
		bandagesReclutadorServiceImpl.eliminarBandageReclutador(codigo);
		System.out.println("Bandage de reclutador eliminado con exito.");
	}
}