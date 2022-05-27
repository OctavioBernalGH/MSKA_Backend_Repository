package com.http.mska.services;

import java.util.List;

import com.http.mska.dto.Skill;


public interface ISkillService {

	//List, search, create, update, delete
		public List<Skill> listarSkill();
		public Skill buscarSkillXID(Long id);
		public Skill crearSkill(Skill skill);
		public Skill modificarSkill(Skill skill);
		public void eliminarSkill(Long id);
}