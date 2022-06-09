package com.http.mska.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.http.mska.dto.UsuarioSecurity;

@Repository
public interface IUsuarioSecurityDAO extends JpaRepository<UsuarioSecurity, Long>{
	UsuarioSecurity buscarXNombre (String usename);
}
