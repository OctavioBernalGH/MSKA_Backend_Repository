package com.http.mska.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.http.mska.dto.Posee;

@Repository
public interface IPoseeDAO extends JpaRepository<Posee, Long>{

	/** Se heredan los métodos CRUD de JPA */
}
