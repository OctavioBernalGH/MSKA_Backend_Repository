package com.http.mska.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.http.mska.dto.ObtieneT;

@Repository
public interface IObtieneTDAO extends JpaRepository<ObtieneT, Long>{

	/** Se heredan los métodos propios de CRUD de JPA */
}
