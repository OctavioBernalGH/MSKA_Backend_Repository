package com.http.mska.dao;

/**
 * @author MSKA
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.http.mska.dto.Mensaje;

/**
 * Se heredan los métodos CRUD de la clase JpaRepository para su posterior
 * inyección en la capa service
 */
@Repository
public interface IMensajeDAO extends JpaRepository<Mensaje, Long> {

	/** Métodos personalizados */
}
