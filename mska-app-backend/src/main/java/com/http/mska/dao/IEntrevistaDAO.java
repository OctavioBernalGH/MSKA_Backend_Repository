package com.http.mska.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.http.mska.dto.Entrevista;



@Repository
public interface IEntrevistaDAO extends JpaRepository<Entrevista, Long>{

}