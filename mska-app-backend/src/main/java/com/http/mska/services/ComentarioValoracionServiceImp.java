package com.http.mska.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.http.mska.dao.IComentarioValoracionDAO;
import com.http.mska.dto.ComentarioValoracion;

@Service
public class ComentarioValoracionServiceImp implements IComentarioValoracionService{

	@Autowired
	IComentarioValoracionDAO iComentarioValoracionDAO;
	
	//Listar los comentarios
	@Override
	public List<ComentarioValoracion> listarComentarioValoracion() {
	return iComentarioValoracionDAO.findAll();
	}

	//Buscar comentarios por ID
	@Override
	public ComentarioValoracion buscarComentarioValoracionXID(Long id) {
		return iComentarioValoracionDAO.findById(id).get();
	}

	//Crear comentario nuevo
	@Override
	public ComentarioValoracion crearComentarioValoracion(ComentarioValoracion comentarioValoracion) {
		return iComentarioValoracionDAO.save(comentarioValoracion);
	}

	//Modificar un comentario
	@Override
	public ComentarioValoracion modificarComentarioValoracion(ComentarioValoracion comentarioValoracion) {
		return iComentarioValoracionDAO.save(comentarioValoracion);
	}

	//Eliminar un comentario
	@Override
	public void eliminarComentarioValoracion(Long id) {		
	}


}
