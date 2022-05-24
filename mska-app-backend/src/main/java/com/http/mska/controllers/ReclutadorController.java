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

import com.http.mska.dto.Reclutador;
import com.http.mska.services.ReclutadorServiceImp;

@RestController
@RequestMapping("/api")
public class ReclutadorController {
	
	@Autowired
	ReclutadorServiceImp reclutadorServiceImpl;

	@GetMapping("/reclutadores")
	public List<Reclutador> listarReclutador(){
		return reclutadorServiceImpl.listarReclutadores();
	}
	
	@PostMapping("/reclutadores")
	public Reclutador guardarReclutador(@RequestBody Reclutador reclutador) {
		return reclutadorServiceImpl.guardarReclutador(reclutador);
	}
	
	@GetMapping("/reclutador/{id}")
	public Reclutador reclutadorXID(@PathVariable(name="id") Long id) {
		Reclutador reclutador_xid = new Reclutador();
		reclutador_xid = reclutadorServiceImpl.reclutadorXID(id);
		
		return reclutador_xid;
	}
	@PutMapping("/reclutador/{id}")
	public Reclutador actualizarArticulo(@PathVariable(name = "id") Long id, @RequestBody Reclutador reclutador) {
		Reclutador reclutador_selec = new Reclutador();
		Reclutador reclutador_actu 	= new Reclutador();
		
		reclutador_selec = reclutadorServiceImpl.reclutadorXID(id);
		
		reclutador_selec.setExperiencia(reclutador.getExperiencia());
		reclutador_selec.setNivel(reclutador.getNivel());
		reclutador_selec.setTipoReclutador(reclutador.getTipoReclutador());
		reclutador_selec.setWeb(reclutador.getWeb());
		reclutador_selec.setUsuario(reclutador.getUsuario());
		
		return reclutador_selec;
		
	}
	@DeleteMapping("/reclutadores/{id}")
	public void eliminarReclutador(@PathVariable (name ="id") Long id) {
		reclutadorServiceImpl.eliminarReclutador(id);
	}
}
