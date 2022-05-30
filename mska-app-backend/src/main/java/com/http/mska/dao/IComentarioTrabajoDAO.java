package com.http.mska.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.http.mska.dto.ComentarioTrabajo;

@Repository
public interface IComentarioTrabajoDAO extends JpaRepository<ComentarioTrabajo, Long>{
	
	/** Hereda los métodos CRUD de JPA para su posterior inyección */
}
