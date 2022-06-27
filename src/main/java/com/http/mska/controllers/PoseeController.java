package com.http.mska.controllers;

import java.util.List;
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
import com.http.mska.dto.Posee;
import com.http.mska.services.PoseeServiceImpl;

/**
 * Se define controlador del tipo Rest y se define /api como inicio de la ruta
 * del aplicativo
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class PoseeController {
	
	/** Se inyectan las dependencias generadas en la capa service */
	@Autowired
	PoseeServiceImpl poseeServiceImpl;
	
	/** Se listan los posee */
	@GetMapping("/posee")
	public List<Posee> listarPosee(){
		return poseeServiceImpl.listarPosee();
	}
	
	/** Se busca un posee por identificador */
	@GetMapping("/posee/{id}")
	public Posee buscarPoseeXIdentificador(@PathVariable (name = "id") Long id) {
		return poseeServiceImpl.buscarPoseeXIdentificador(id);
	}
	
	/** Se crea un nuevo posee */
	@PostMapping("/posee")
	public Posee crearPosee(@RequestBody Posee posee) {
		return poseeServiceImpl.crearPosee(posee);
	}
	
	/** Se modifica un posee existente */
	@PutMapping("/posee/{id}")
	public Posee modificarPosee(@PathVariable (name = "id") Long id, @RequestBody Posee posee) {
		/** Instancias de la clase posee */
		Posee a_modificar = new Posee();
		Posee modificado = new Posee();
		
		/** Se busca el posee a editar mediante el identificador */
		a_modificar = poseeServiceImpl.buscarPoseeXIdentificador(id);
		
		/** Se modifican los campos */
		a_modificar.setSkill(posee.getSkill());
		a_modificar.setTrabajo(posee.getTrabajo());
		
		/** Se vuelcan los nuevos datos al otro objeto */
		modificado = poseeServiceImpl.modificarPosee(a_modificar);
		
		/** Se devuelve el nuevo objeto */
		return modificado;
	}
	
	/** Se elimina un posee mediante el identificador */
	@DeleteMapping("/posee/{id}")
	public String eliminarPosee(@PathVariable (name = "id") Long id) {
		poseeServiceImpl.eliminarPosee(id);
		return "Se ha eliminado el objeto " + id + " satisfactoriamente. ";
	}

}
