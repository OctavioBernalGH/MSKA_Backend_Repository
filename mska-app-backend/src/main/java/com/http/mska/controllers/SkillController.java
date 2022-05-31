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
import com.http.mska.dto.Skill;
import com.http.mska.services.SkillServiceImp;

/**
 * Se define controlador del tipo rest y se define la ruta inicial de la
 * aplicación el /api
 */
@RestController
@RequestMapping("/api")
public class SkillController {

	/** Se inyectan dependencias de la capa service */
	@Autowired
	SkillServiceImp skillServiceImp;

	/** Se listan las skills */
	@GetMapping("/skill")
	public List<Skill> listarSkill() {
		return skillServiceImp.listarSkill();
	}

	/** Buscar skill por el identificador */
	@GetMapping("/skill/{id}")
	public Skill buscarSkillXID(@PathVariable(name = "id") Long id) {
		return skillServiceImp.buscarSkillXIdentificador(id);
	}

	/** Se crea un nuevo skill */
	@PostMapping("/skill")
	public Skill crearSkill(@RequestBody Skill skill) {
		return skillServiceImp.crearSkill(skill);
	}

	/** Se modifica un skill existente */
	@PutMapping("/skill/{id}")
	public Skill modificarSkill(@PathVariable(name = "id") Long id, @RequestBody Skill skill) {
		/** Se instancian objetos de la clase Skill */
		Skill old_objetc = new Skill();
		Skill new_object = new Skill();

		/** Se busca el skill a modificar por el identificador */
		old_objetc = skillServiceImp.buscarSkillXIdentificador(id);
		
		/** Se modifica el objeto skill */
		old_objetc.setTipo(skill.getTipo());
		old_objetc.setValidado(skill.isValidado());
		old_objetc.setDescripcion(skill.getDescripcion());
		old_objetc.setCantidad_exp(skill.getCantidad_exp());
		old_objetc.setPosee(skill.getPosee());
		old_objetc.setExamen(skill.getExamen());
		
		/** Se vuelcan los nuevos datos al otro objeto */
		new_object = skillServiceImp.modificarSkill(old_objetc);
		
		/** Se devuelve el nuevo objeto */
		return new_object;
	}

	/** Se elimina un skill */
	@DeleteMapping("/skill/{id}")
	public String eliminarSkill(@PathVariable(name = "id") Long id) {
		skillServiceImp.eliminarSkill(id);
		return "Se elimina el skill " + id + " de forma exitosa.";
	}

}
