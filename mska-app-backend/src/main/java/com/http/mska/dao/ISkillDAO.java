package com.http.mska.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.http.mska.dto.Skill;

@Repository
public interface ISkillDAO extends JpaRepository<Skill, Long>{

	/** Se heredan los métodos CRUD de JPA */
}
