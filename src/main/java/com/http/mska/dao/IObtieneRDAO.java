package com.http.mska.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.http.mska.dto.ObtieneR;

@Repository
public interface IObtieneRDAO extends JpaRepository<ObtieneR, Long>{

	/** Se hereda la clase JpaRepository con los métodos CRUD própios */
}
