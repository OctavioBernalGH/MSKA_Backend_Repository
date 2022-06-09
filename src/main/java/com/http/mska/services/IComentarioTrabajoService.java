package com.http.mska.services;

import java.util.List;
import com.http.mska.dto.ComentarioTrabajo;

/** Plantilla de métodos a implementar en la capa service */
public interface IComentarioTrabajoService {

	/** Listar comentarios */
	public List<ComentarioTrabajo> listarComentarioTrabajo();
	
	/** Buscar comentario por identificador */
	public ComentarioTrabajo buscarComentarioTrabajoXIdentificador(Long id);
	
	/** Crear un nuevo comentario */
	public ComentarioTrabajo crearComentarioTrabajo(ComentarioTrabajo comentarioTrabajo);
	
	/** Modificar un comentario existente */
	public ComentarioTrabajo modificaComentarioTrabajo(ComentarioTrabajo comentarioTrabajo);
	
	/** Eliminar un comentario mediante identificador */
	public void eliminarComentarioTrabajo(Long id);
}
