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

import com.http.mska.dto.ObtieneR;
import com.http.mska.services.ObtieneRServiceImpl;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class ObtieneRController {

	/** Se inyectan las dependencias de la capa service y DAO */
	@Autowired
	ObtieneRServiceImpl obtieneRServiceImpl;
	
	/** Listar obtieneR */
	@GetMapping("/obtiener")
	public List<ObtieneR> listarObtieneR(){
		return obtieneRServiceImpl.listarObtieneR();
	}
	
	/** Buscar obtieneR por identificador */
	@GetMapping("/obtiener/{id}")
	public ObtieneR buscarObtieneRXidentificador(@PathVariable (name = "id") Long id) {
		return obtieneRServiceImpl.buscarObtieneRXIdentificador(id);
	}
	
	/** Crear un nuevo obtieneR */
	@PostMapping("/obtiener")
	public ObtieneR crearObtieneR(@RequestBody ObtieneR obtieneR) {
		return obtieneRServiceImpl.crearObtieneR(obtieneR);
	}
	
	/** Modificar obtiener */
	@PutMapping("/obtiener/{id}")
	public ObtieneR modificarObtieneR(@PathVariable (name="id") Long id, @RequestBody ObtieneR obtieneR) {
		/** Instancias de objeto obtieneR */
		ObtieneR a_modificar = new ObtieneR();
		ObtieneR modificado = new ObtieneR();
		
		/** Se selecciona el objeto a modificar por identificador */
		a_modificar = obtieneRServiceImpl.buscarObtieneRXIdentificador(id);
		
		/** Se modifican los valores */
		a_modificar.setBandageReclutador(obtieneR.getBandageReclutador());
		a_modificar.setReclutador(obtieneR.getReclutador());
		
		/** Se vuelcan los datos en el nuevo objeto */
		modificado = obtieneRServiceImpl.modificarObtieneR(a_modificar);
		
		/** Se devuelve el nuevo objeto */
		return modificado;
	}
	
	/** Eliminar obtieneR por identificador */
	@DeleteMapping("/obtiener/{id}")
	public String eliminarObtieneR(@PathVariable (name = "id") Long id) {
		obtieneRServiceImpl.eliminarObtieneR(id);
		return "Se ha eliminado el objeto con id " + id + " satisfactoriamente.";
	}
}
