package com.http.mska.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.http.mska.dao.IComentarioTrabajoDAO;
import com.http.mska.dto.ComentarioTrabajo;

/** Se define la clase como capa service */
@Service
public class ComentarioTrabajoServiceImpl implements IComentarioTrabajoService{

	/** Se inyectan dependencias heredadas de JPA en el DAO */
	@Autowired
	IComentarioTrabajoDAO iComentarioTrabajoDAO;

	/** Se listan los comentarios de trabajo */
	@Override
	public List<ComentarioTrabajo> listarComentarioTrabajo() {
		return iComentarioTrabajoDAO.findAll();
	}

	/** Se busca un comentario mediante el identificador */
	@Override
	public ComentarioTrabajo buscarComentarioTrabajoXIdentificador(Long id) {
		return iComentarioTrabajoDAO.findById(id).get();
	}

	/** Se crean comentarios nuevos */
	@Override
	public ComentarioTrabajo crearComentarioTrabajo(ComentarioTrabajo comentarioTrabajo) {
		return iComentarioTrabajoDAO.save(comentarioTrabajo);
	}

	/** Se modifican comentarios existentes */
	@Override
	public ComentarioTrabajo modificaComentarioTrabajo(ComentarioTrabajo comentarioTrabajo) {
		return iComentarioTrabajoDAO.save(comentarioTrabajo);
	}

	/** Se elimina un comentario mediante el identificador */
	@Override
	public void eliminarComentarioTrabajo(Long id) {
		iComentarioTrabajoDAO.deleteById(id);
	}
}
