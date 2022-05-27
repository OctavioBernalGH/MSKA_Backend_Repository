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

import com.http.mska.dto.Entrevista;
import com.http.mska.services.EntrevistaServiceImp;



@RestController
@RequestMapping("/api")
public class EntrevistaController {
	
	@Autowired
	EntrevistaServiceImp entrevistaServiceImp;
	
	@GetMapping("/entrevista")
	public List<Entrevista> listarEntrevista(){
		return entrevistaServiceImp.listarEntrevista();
	}

	@GetMapping("/entrevista/{id}")
	public Entrevista buscarEntrevistaXID(@PathVariable (name = "id") Long id) {
		return entrevistaServiceImp.buscarEntrevistaXID(id);
	}
	@PostMapping("/entrevista")
	public Entrevista crearEntrevista(@PathVariable (name = "id") Long id, @RequestBody Entrevista entrevista) {
		return entrevistaServiceImp.crearEntrevista(entrevista);
	}
	@PutMapping("/entrevista/{}id")
	public Entrevista modificarEntrevista(@PathVariable (name = "id") Long id, @RequestBody Entrevista entrevista) {
		
		/** Se definen instancias del tipo Entrevista */
		Entrevista entrevista_a_actualizar = new Entrevista();
		Entrevista entrevista_modificada = new Entrevista();
		
		/** Se filtra la entrevista a actualizar por ID */
		entrevista_a_actualizar = entrevistaServiceImp.buscarEntrevistaXID(id);
		
		/** Se actualizan los valores */
		entrevista_a_actualizar.setDuracion(entrevista.getDuracion());
		entrevista_a_actualizar.setEstado_entrevista(entrevista.isEstado_entrevista());
		entrevista_a_actualizar.setFecha_entrevista(entrevista.getFecha_entrevista());
		entrevista_a_actualizar.setId(entrevista.getId());
		
		entrevista_modificada = entrevistaServiceImp.modificarEntrevista(entrevista_a_actualizar);
				
		return entrevista_modificada;
	}
	
	/** Método para eliminar una entrevista */
	@DeleteMapping("/entrevista/{id}")
	public void eliminarEntrevista(@PathVariable(name = "id")Long id) {
		entrevistaServiceImp.eliminarEntrevista(id);
	}
}