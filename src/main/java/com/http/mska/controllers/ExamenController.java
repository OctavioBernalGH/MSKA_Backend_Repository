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

import com.http.mska.dto.Examen;
import com.http.mska.services.ExamenServiceImpl;

@RestController
@RequestMapping("/api")
public class ExamenController {
	@Autowired
	ExamenServiceImpl examenServiceImpl;
	
	@GetMapping("/examen")
	public List<Examen> listarExamen(){
		return examenServiceImpl.listarExamen();
		
	}
	
	@GetMapping("/examen/{id}")
	public Examen buscarExamenXId(@PathVariable(name="id") Long id) {
		return examenServiceImpl.buscarExamenXIdentificador(id);
		
	}
	
	@PostMapping("/examen")
	public Examen crearExamen(@RequestBody Examen examen) {
		return examenServiceImpl.crearExamen(examen);
		
	}
	
	@PutMapping("/examen/{id}")
	public Examen modificarExamen(@PathVariable(name="id") Long id, @RequestBody Examen examen) {
		Examen a_modificar = new Examen();
		Examen modificado = new Examen();
		
		a_modificar = examenServiceImpl.buscarExamenXIdentificador(id);
		a_modificar.setNombre(examen.getNombre());
		a_modificar.setDescripcion(examen.getDescripcion());
		a_modificar.setCantidadExp(examen.getCantidadExp());
		a_modificar.setTipo(examen.getTipo());
		a_modificar.setSkill(examen.getSkill());
		
		modificado = examenServiceImpl.modificarExamen(a_modificar);
		
		return modificado;
		
	}
	
	@DeleteMapping("/examen/{id}")
	public String eliminarExamen(@PathVariable(name="id") Long id) {
		examenServiceImpl.eliminarExamen(id);
		return "Se ha eliminado " + id + " con exito.";
	}
	
	
	
}
