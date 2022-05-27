package com.http.mska.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.http.mska.dto.ComentarioValoracion;

@Repository
public interface IComentarioValoracionDAO extends JpaRepository<ComentarioValoracion, Long>{

}