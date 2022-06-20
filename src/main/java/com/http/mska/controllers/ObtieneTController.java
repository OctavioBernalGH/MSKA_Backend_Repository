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
import com.http.mska.dto.ObtieneT;
import com.http.mska.services.ObtieneTServiceImpl;

/** Se define controlador del tipo Rest y como ruta inicial de la api "/api" */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ObtieneTController {

	/** Se inyectan dependencias de la capa service y del DAO */
	@Autowired
	ObtieneTServiceImpl obtieneTServiceImpl;
	
	/** Lista obtieneT */
	@GetMapping("/obtienet")
	public List<ObtieneT> listarObtieneT(){
		return obtieneTServiceImpl.listarObtieneT();
	}
	
	/** Buscar obtienet por identificador */
	@GetMapping("/obtienet/{id}")
	public ObtieneT buscarObtieneTXIdentificador(@PathVariable (name = "id") Long id) {
		return obtieneTServiceImpl.buscarObtieneTXIdentificador(id);
	}
	
	/** Se crea un nuevo obtieneT */
	@PostMapping("/obtienet")
	public ObtieneT crearObtieneT(@RequestBody ObtieneT obtieneT) {
		return obtieneTServiceImpl.crearObtieneT(obtieneT);
	}
	
	/** Se modifica un obtieneT existente */
	@PutMapping("/obtienet/{id}")
	public ObtieneT modificarObtieneT(@PathVariable (name = "id") Long id, @RequestBody ObtieneT obtieneT) {
		/** Instancias de la clase ObtieneT */
		ObtieneT a_modificar = new ObtieneT();
		ObtieneT modificado = new ObtieneT();
		
		/** Se elige el objeto a modificar mediante el identificador */
		a_modificar = obtieneTServiceImpl.buscarObtieneTXIdentificador(id);
		
		/** Se modifican los nuevos datos */
		a_modificar.setBandageTecnico(obtieneT.getBandageTecnico());
		a_modificar.setTecnico(obtieneT.getTecnico());
		
		/** Se vuelcan las modificaciones */
		modificado = obtieneTServiceImpl.modificarObtieneT(a_modificar);
		
		/** Se devuelve el nuevo objeto */
		return modificado;
	}
	
	/** Se elimina un obtieneT por identificador */
	@DeleteMapping("/obtienet/{id}")
	public String eliminarObtieneT(@PathVariable (name = "id") Long id) {
		obtieneTServiceImpl.EliminarObtieneT(id);
		return "Se ha elimnado el objeto " + id + " satisfactoriamente.";
	}
}
