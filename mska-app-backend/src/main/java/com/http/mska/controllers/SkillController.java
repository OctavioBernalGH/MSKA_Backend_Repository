package com.http.mska.controllers;

import java.util.List;

import javax.persistence.Column;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.http.mska.dto.Skill;
import com.http.mska.services.SkillServiceImp;



@RestController
@RequestMapping("/api")
public class SkillController {
	
	@Autowired
	SkillServiceImp skillServiceImp;
	
	@GetMapping("/skill")
	public List<Skill> listarSkill(){
		return skillServiceImp.listarSkill();
	}

	@GetMapping("/skill/{id}")
	public Skill buscarSkillXID(@PathVariable (name = "id") Long id) {
		return skillServiceImp.buscarSkillXID(id);
	}
	@PostMapping("/skill")
	public Skill crearSkill(@PathVariable (name = "id") Long id, @RequestBody Skill skill) {
		return skillServiceImp.crearSkill(skill);
	}
	@PutMapping("/skill/{}id")
	public Skill modificarSkill(@PathVariable (name = "id") Long id, @RequestBody Skill skill) {
		Skill old_objetc 	= new Skill();
		Skill new_object 	= new Skill();
		
		old_objetc.setId(skill.getId());
		old_objetc.setTipo(skill.getTipo());
		old_objetc.setValidado(skill.isValidado());
		old_objetc.setCantidad_exp(skill.getCantidad_exp());
		
		return new_object = skillServiceImp.modificarSkill(new_object);
	}
	@DeleteMapping("/skill/{id}")
	public void eliminarSkill(@PathVariable(name = "id")Long id) {
		skillServiceImp.eliminarSkill(id);
	}

}
