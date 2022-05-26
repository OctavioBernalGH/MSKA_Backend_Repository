package com.http.mska.services;

import java.util.List;

import com.http.mska.dto.Entrevista;

public interface IEntrevistaService {
	
	// Listar las entrevistas
	public List<Entrevista> listarEntrevista();

	// Buscar una entrevista por ID
	public Entrevista buscarEntrevistaXID(Long id);

	
	//Crear una nueva entrevista
	public Entrevista crearEntrevista(Entrevista entrevista);

	
	//Modificar una entrevista
	public Entrevista modificarEntrevista(Entrevista entrevista);

	//Eliminar una entrevista
	public void eliminarEntrevista(Long id);
}