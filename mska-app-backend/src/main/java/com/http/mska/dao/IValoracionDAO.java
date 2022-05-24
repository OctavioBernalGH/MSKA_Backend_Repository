package com.http.mska.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.http.mska.dto.Valoracion;

@Repository
public interface IValoracionDAO extends JpaRepository<Valoracion, Long>{

}
