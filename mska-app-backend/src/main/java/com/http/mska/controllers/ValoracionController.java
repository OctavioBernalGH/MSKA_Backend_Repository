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

import com.http.mska.dto.Valoracion;
import com.http.mska.services.ValoracionServiceImp;

@RestController
@RequestMapping("/api")
public class ValoracionController {
	
	@Autowired
	ValoracionServiceImp valoracionServiceImp;
	
	//TODO: Sentences
	@GetMapping("/valoracion")
	public List<Valoracion> listarValoraciones(){
		return valoracionServiceImp.listarValoraciones();
	}

	@GetMapping("/valoracion/{id}")
	public Valoracion buscarValoracionXID(@PathVariable (name = "id") Long id) {
		return valoracionServiceImp.buscarValoracionXID(id);
	}
	@PostMapping("/valoracion")
	public Valoracion crearValoracion(@PathVariable (name = "id") Long id, @RequestBody Valoracion valoracion) {
		return valoracionServiceImp.crearValoracion(valoracion);
	}
	@PutMapping("/valoracion/{}id")
	public Valoracion modificarValoracion(@PathVariable (name = "id") Long id, @RequestBody Valoracion valoracion) {
		Valoracion valoracion_sel 	= new Valoracion();
		Valoracion valoracion_actu 	= new Valoracion();
		
		valoracion_sel.setEstrellas(valoracion.getEstrellas());
		valoracion_sel.setComentario(valoracion.getComentario());
		valoracion_sel.setReclutador(valoracion.getReclutador());
		valoracion_sel.setTecnico(valoracion.getTecnico());
		
		return valoracion_actu = valoracionServiceImp.modificarValoracion(valoracion_actu);
	}
	@DeleteMapping("/valoracion/{id}")
	public void eliminarValoracion(@PathVariable(name = "id")Long id) {
		valoracionServiceImp.eliminarValoracion(id);
	}
}
