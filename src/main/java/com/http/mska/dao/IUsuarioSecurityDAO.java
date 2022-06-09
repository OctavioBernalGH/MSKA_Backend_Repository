package com.http.mska.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.http.mska.dto.UsuarioSecurity;

public interface IUsuarioSecurityDAO extends JpaRepository<UsuarioSecurity, Long>{

	UsuarioSecurity findByUsername(String username);
}
