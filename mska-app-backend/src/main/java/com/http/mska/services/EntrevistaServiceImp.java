package com.http.mska.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.http.mska.dao.IEntrevistaDAO;
import com.http.mska.dto.Entrevista;

//TODO ReplaceALL Entrevista
//TODO ReplaceALL entrevista
//TODO cambiar nombres de metodos

@Service
public class EntrevistaServiceImp implements IEntrevistaService {

	@Autowired
	IEntrevistaDAO iEntrevistaDAO;

	//Listar entrevistas
	@Override
	public List<Entrevista> listarEntrevista() {
		return iEntrevistaDAO.findAll();
	}

	//Buscar una entrevista por ID
	@Override
	public Entrevista buscarEntrevistaXID(Long id) {
		return iEntrevistaDAO.findById(id).get();
	}

	//Crear una nueva entrevista
	@Override
	public Entrevista crearEntrevista(Entrevista entrevista) {
		return iEntrevistaDAO.save(entrevista);
	}

	//Modificar una entrevista
	@Override
	public Entrevista modificarEntrevista(Entrevista entrevista) {
		return iEntrevistaDAO.save(entrevista);
	}

	//Eliminar una entrevista
	@Override
	public void eliminarEntrevista(Long id) {
	}
}