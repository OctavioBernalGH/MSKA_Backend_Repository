package com.http.mska.services;

import java.util.List;
import com.http.mska.dto.Skill;

/** Métodos que se implementarán el la clase de la capa service */
public interface ISkillService {

	/** Listar Skill */
	public List<Skill> listarSkill();

	/** Buscar Skill por identificador */
	public Skill buscarSkillXIdentificador(Long id);

	/** Crear nuevo Skill */
	public Skill crearSkill(Skill skill);

	/** Modificar skill existente */
	public Skill modificarSkill(Skill skill);

	/** Eliminar skill */
	public void eliminarSkill(Long id);
}