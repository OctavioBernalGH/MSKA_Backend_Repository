package com.http.mska.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.http.mska.dto.PostUsuario;

@Repository
public interface IPostUsuarioDAO extends JpaRepository<PostUsuario, Long>{

	/** Se heredan los métodos CRUD de Jpa */
}
