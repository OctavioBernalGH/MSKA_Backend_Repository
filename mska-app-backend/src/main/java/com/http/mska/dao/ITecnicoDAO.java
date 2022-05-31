package com.http.mska.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.http.mska.dto.Tecnico;

public interface ITecnicoDAO extends JpaRepository<Tecnico, Long>{

}
