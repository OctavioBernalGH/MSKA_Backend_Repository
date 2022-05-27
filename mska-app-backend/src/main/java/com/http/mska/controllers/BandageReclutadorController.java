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

import com.http.mska.dto.BandageReclutador;
import com.http.mska.services.BandageReclutadorServiceImpl;

/**
 * Clase @BandageReclutadorController. Mappea las funcionalidades con las rutas de la api.
 * 
 * @author Octavio Bernal.
 * @author Ixabel Justo.
 * @author David Dalmau.
 * @author Josep Oriol López.
 *
 */

@RestController
@RequestMapping("/api")

public class BandageReclutadorController {
	

	/** Se crea una instancia del tipo @BandageReclutadorServiceImpl */
	@Autowired
	BandageReclutadorServiceImpl bandageReclutadorServiceImpl ;

	/** Método para listar bandage de reclutador */
	@GetMapping("/bandageReclutador")
	public List<BandageReclutador> listarBandageReclutador() {
		return bandageReclutadorServiceImpl.listarBandageReclutador();
	}
	
	/** Método para listar bandageReclutador por id */
	@GetMapping("/bandageReclutador/id/{id}")
	public List<BandageReclutador> listarBandageReclutador(@PathVariable(name = "id") String id) {
		return null;
	}

	/** Método para crear un nuevo bandage de reclutador */

	@PostMapping("/bandageReclutador")
	public BandageReclutador crearBandageReclutador(@RequestBody BandageReclutador bandageReclutador) {
		return bandageReclutadorServiceImpl.crearBandageReclutador(bandageReclutador);
	}
	
	/** Método para buscar un bandage de reclutador por id */
	@GetMapping("/bandageReclutador/{id}")
	public BandageReclutador buscarBandageReclutadorId(@PathVariable(name = "id") Long id) {
		return bandageReclutadorServiceImpl.buscarBandageReclutador(id);
	}
	
	/** Método para actualizar un bandageReclutador */
	@PutMapping("/bandageReclutador/{id}")
	public BandageReclutador actualizarBandageReclutador(@PathVariable(name = "id") Long id,
			@RequestBody BandageReclutador bandageReclutador) {
		
	/** Se definen instancias del tipo bandage de reclutador */
	BandageReclutador bandage_reclutador_a_actualizar = new BandageReclutador();
	BandageReclutador actualizado = new BandageReclutador();
		
	/** Se filtra el bandage de reclutador a actualizar por código */
	bandage_reclutador_a_actualizar = bandageReclutadorServiceImpl.buscarBandageReclutador(id);
		
	/** Se actualizan los valores */
	bandage_reclutador_a_actualizar.setId(bandageReclutador.getId());
	bandage_reclutador_a_actualizar.setNombre(bandageReclutador.getNombre());
	bandage_reclutador_a_actualizar.setDesencadenante(bandageReclutador.getDesencadenante());
	bandage_reclutador_a_actualizar.setTipo(bandageReclutador.getTipo());
	bandage_reclutador_a_actualizar.setDescripcion(bandageReclutador.getDescripcion());
	bandage_reclutador_a_actualizar.setCantidadExp(bandageReclutador.getCantidadExp());

	actualizado = bandageReclutadorServiceImpl.modificarBandageReclutador(bandage_reclutador_a_actualizar);

		return actualizado;
	}
	
	/** Método para eliminar un bandage de reclutador */
	@DeleteMapping("/bandageReclutador/{id}")
	public void eliminarBandageReclutador(@PathVariable(name = "id") Long id) {
		bandageReclutadorServiceImpl.eliminarBandageReclutador(id);
		System.out.println("Bandage de reclutador eliminado con exito.");
	}
}