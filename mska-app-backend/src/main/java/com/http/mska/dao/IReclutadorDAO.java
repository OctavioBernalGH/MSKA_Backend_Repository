package com.http.mska.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.http.mska.dto.Reclutador;

@Repository
public interface IReclutadorDAO extends JpaRepository<Reclutador, Long>{

}
