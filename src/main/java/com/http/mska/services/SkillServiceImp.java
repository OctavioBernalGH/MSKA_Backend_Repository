package com.http.mska.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.http.mska.dao.ISkillDAO;
import com.http.mska.dto.Skill;

/** Se define la clase de capa service */
@Service
public class SkillServiceImp implements ISkillService{

	/** Se inyectan dependencias del DAO heredadas de JPA */
	@Autowired
	ISkillDAO iSkillDAO;
	
	/** Se listan las skills */
	@Override
	public List<Skill> listarSkill() {
		return iSkillDAO.findAll();
	}

	/** Se busca un skill mediante el identificador */
	@Override
	public Skill buscarSkillXIdentificador(Long id) {
		return iSkillDAO.findById(id).get();
	}

	/** Se crea un nuevo skill */
	@Override
	public Skill crearSkill(Skill skill) {
		return iSkillDAO.save(skill);
	}

	/** Se modifica un skill existente */
	@Override
	public Skill modificarSkill(Skill skill) {
		return iSkillDAO.save(skill);
	}

	/** Se elimina un skill */
	@Override
	public void eliminarSkill(Long id) {
		iSkillDAO.deleteById(id);
		
	}
	

}
