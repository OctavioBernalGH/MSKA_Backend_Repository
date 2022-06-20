package com.http.mska.controllers;

import java.util.List;

import javax.persistence.Column;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.http.mska.dto.BandageTecnico;
import com.http.mska.services.BandageTecnicoServiceImpl;

/**
 * Clase @BandageTecnicoController. Mappea las funcionalidades con las rutas
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
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class BandageTecnicoController {

	/** Se crea una instancia del tipo @BandageTecnicoServiceImpl */
	@Autowired
	BandageTecnicoServiceImpl bandageTecnicoServiceImpl;

	/** Método para listar bandage de Tecnico */
	@GetMapping("/bandageTecnico")
	public List<BandageTecnico> listarBandageTecnico() {
		return bandageTecnicoServiceImpl.listarBandageTecnico();
	}

	/** Método para crear un nuevo bandage de Tecnico */
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
		bandage_Tecnico_a_actualizar.setTipo(bandageTecnico.getTipo());
		bandage_Tecnico_a_actualizar.setDescripcion(bandageTecnico.getDescripcion());
		bandage_Tecnico_a_actualizar.setCantidadExp(bandageTecnico.getCantidadExp());
		bandage_Tecnico_a_actualizar.setObtieneT(bandageTecnico.getObtieneT());
		
		actualizado = bandageTecnicoServiceImpl.modificarBandageTecnico(bandage_Tecnico_a_actualizar);

		return actualizado;
	}

	/** Método para eliminar un bandage de Tecnico */

	@DeleteMapping("/bandageTecnico/{id}")
	public void eliminarBandageTecnico(@PathVariable(name = "id") Long id) {
		bandageTecnicoServiceImpl.eliminarBandageTecnico(id);
		System.out.println("Bandage de técnico eliminado con exito.");
	}
}