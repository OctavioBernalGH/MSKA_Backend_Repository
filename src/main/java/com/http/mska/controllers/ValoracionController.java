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

import com.http.mska.dto.Valoracion;
import com.http.mska.services.ValoracionServiceImp;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ValoracionController {
	
	@Autowired
	ValoracionServiceImp valoracionServiceImp;

	@GetMapping("/valoracion")
	public List<Valoracion> listarValoraciones(){
		return valoracionServiceImp.listarValoraciones();
	}

	@GetMapping("/valoracion/{id}")
	public Valoracion buscarValoracionXID(@PathVariable (name = "id") Long id) {
		return valoracionServiceImp.buscarValoracionXID(id);
	}
	@PostMapping("/valoracion")
	public Valoracion crearValoracion(@RequestBody Valoracion valoracion) {
		return valoracionServiceImp.crearValoracion(valoracion);
	}
	@PutMapping("/valoracion/{id}")
	public Valoracion modificarValoracion(@PathVariable (name = "id") Long id, @RequestBody Valoracion valoracion) {
		/** Se crean dos instancias de Valoracion */
		Valoracion valoracion_sel 	= new Valoracion();
		Valoracion valoracion_actu 	= new Valoracion();
		
		/** Se busca el identificador de la valoración a modificar */
		valoracion_sel = valoracionServiceImp.buscarValoracionXID(id);
		
		/** Se modifican todos los campos */
		valoracion_sel.setEstrellas(valoracion.getEstrellas());
		valoracion_sel.setComentario(valoracion.getComentario());
		valoracion_sel.setReclutador(valoracion.getReclutador());
		valoracion_sel.setTecnico(valoracion.getTecnico());
		valoracion_sel.setUsuario(valoracion.getUsuario());
		
		/** Se vuelcan los nuevos datos */
		valoracion_actu = valoracionServiceImp.modificarValoracion(valoracion_sel);
		
		/** Se devuelve la valoración actualizada */
		return valoracion_actu;
	}
	@DeleteMapping("/valoracion/{id}")
	public void eliminarValoracion(@PathVariable(name = "id")Long id) {
		valoracionServiceImp.eliminarValoracion(id);
	}
}
