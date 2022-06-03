package com.http.mska.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.http.mska.dto.Examen;

@Repository
public interface IExamenDAO extends JpaRepository<Examen, Long>{

}
