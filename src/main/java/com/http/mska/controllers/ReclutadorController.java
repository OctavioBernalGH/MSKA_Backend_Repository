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

import com.http.mska.dto.Reclutador;
import com.http.mska.services.ReclutadorServiceImp;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ReclutadorController {
	
	@Autowired
	ReclutadorServiceImp reclutadorServiceImp;

	@GetMapping("/reclutador")
	public List<Reclutador> listarReclutador(){
		return reclutadorServiceImp.listarReclutadores();
	}
	
	@PostMapping("/reclutador")
	public Reclutador guardarReclutador(@RequestBody Reclutador reclutador) {
		return reclutadorServiceImp.guardarReclutador(reclutador);
	}
	
	@GetMapping("/reclutador/{id}")
	public Reclutador reclutadorXID(@PathVariable(name="id") Long id) {
		return reclutadorServiceImp.reclutadorXID(id);
	}
	
	@PutMapping("/reclutador/{id}")
	public Reclutador actualizarArticulo(@PathVariable(name = "id") Long id, @RequestBody Reclutador reclutador) {
		Reclutador reclutador_selec = new Reclutador();
		Reclutador reclutador_actu 	= new Reclutador();
		
		reclutador_selec = reclutadorServiceImp.reclutadorXID(id);
		
		reclutador_selec.setExperiencia(reclutador.getExperiencia());
		reclutador_selec.setNivel(reclutador.getNivel());
		reclutador_selec.setTipoReclutador(reclutador.getTipoReclutador());
		reclutador_selec.setWeb(reclutador.getWeb());
		reclutador_selec.setUsuario(reclutador.getUsuario());
		reclutador_selec.setObtieneR(reclutador.getObtieneR());
		
		reclutador_actu = reclutadorServiceImp.actualizarReclutador(reclutador_selec);
		
		return reclutador_actu;
		
	}
	@DeleteMapping("/reclutador/{id}")
	public void eliminarReclutador(@PathVariable (name ="id") Long id) {
		reclutadorServiceImp.eliminarReclutador(id);
	}
}
