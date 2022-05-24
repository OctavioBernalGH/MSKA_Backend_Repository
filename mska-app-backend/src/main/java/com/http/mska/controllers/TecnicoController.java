package com.http.mska.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.http.mska.dto.Tecnico;
import com.http.mska.services.TecnicoServiceImpl;

@RestController
@RequestMapping("/api") //Raiz de la app
public class TecnicoController {
	@Autowired
	TecnicoServiceImpl tecnicoServiceImpl;

	// Listar todos los tecnicos
	@GetMapping("/tecnico")
	public List<Tecnico> listarPiezas(){
		return tecnicoServiceImpl.listarTecnico();
	}

	// Buscar las piezas por id
	@GetMapping("/tecnico/{id}")
	public Tecnico buscarPiezaCodigo(@PathVariable(name= "id")Long id) {
		return tecnicoServiceImpl.buscarTecnico(id);		
	}

	// Eliminar una piezas
	@GetMapping("/tecnico/{id}")
	public void eliminarPiezas(@PathVariable(name="id")Long id) {
		tecnicoServiceImpl.eliminarTecnico(id);
	}

	// Crear piezas
	@PostMapping("/tecnico")
	public Tecnico crearPeliculas(@RequestBody Tecnico tecnico) {
		return tecnicoServiceImpl.crearTecnico(tecnico);
	}
	
	// Modificar sala
		@PutMapping("/tecnico/{id}")
		public Tecnico modificarPiezas (@PathVariable(name="id")Long id, @RequestBody Tecnico tecnico) {
			Tecnico tecnico_a_modificar = new Tecnico();
			Tecnico modificado = new Tecnico();

			// Busco el id de la sala que quiero cambiar
			tecnico_a_modificar = tecnicoServiceImpl.buscarTecnico(id);

			tecnico_a_modificar.setId(tecnico.getId());
			tecnico_a_modificar.setExperiencia(tecnico.getExperiencia());
			tecnico_a_modificar.setNivel(tecnico.getNivel());
			tecnico_a_modificar.setGithub(tecnico.getGithub());
			tecnico_a_modificar.setPinterest(tecnico.getPinterest());
			tecnico_a_modificar.setTrabajo_en_curso(tecnico.getTrabajo_en_curso());
			tecnico_a_modificar.setTrabajos_finalizados(tecnico.getTrabajos_finalizados());
			tecnico_a_modificar.setTipo_tecnico(tecnico.getTipo_tecnico());

			// Modificado es = a los cambios aplicados
			modificado = tecnicoServiceImpl.modificarTecnico(tecnico_a_modificar);

			return modificado;
		}
}