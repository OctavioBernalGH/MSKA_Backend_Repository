package com.http.mska.services;

import java.util.List;

import com.http.mska.dto.ComentarioValoracion;

public interface IComentarioValoracionService {

	// Listar los comentarios
	public List<ComentarioValoracion> listarComentarioValoracion();

	// Buscar un comentario por ID
	public ComentarioValoracion buscarComentarioValoracionXID(Long id);

	// Crear un comentario nuevo
	public ComentarioValoracion crearComentarioValoracion(ComentarioValoracion comentarioValoracion);

	// Modificar un comentario
	public ComentarioValoracion modificarComentarioValoracion(ComentarioValoracion comentarioValoracion);

	// Eliminar un comentario
	public void eliminarComentarioValoracion(Long id);
}