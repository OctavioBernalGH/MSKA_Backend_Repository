package com.http.mska.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.http.mska.dto.Usuario;

@Repository
public interface IUsuarioDAO extends JpaRepository<Usuario, Long>{

	// Interface para la definición de métodos personalizados.
}
