package com.http.mska.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.http.mska.dao.IObtieneTDAO;
import com.http.mska.dto.ObtieneT;

/** Se define la clase como capa service */
@Service
public class ObtieneTServiceImpl implements IObtieneTService{

	/** Se inyectan las dependencias de Jpa heredadas en el DAO */
	@Autowired
	IObtieneTDAO iObtieneTDAO;
	
	/** Listar obtieneT */
	@Override
	public List<ObtieneT> listarObtieneT() {
		return iObtieneTDAO.findAll();
	}

	/** Buscar obtieneT por identificador */
	@Override
	public ObtieneT buscarObtieneTXIdentificador(Long id) {
		return iObtieneTDAO.findById(id).get();
	}

	/** Crear un nuevo ObtieneT */
	@Override
	public ObtieneT crearObtieneT(ObtieneT obtieneT) {
		return iObtieneTDAO.save(obtieneT);
	}

	/** Modificar un ObtieneT existente */
	@Override
	public ObtieneT modificarObtieneT(ObtieneT obtieneT) {
		return iObtieneTDAO.save(obtieneT);
	}

	/** Eliminar un obtieneT por identificador */
	@Override
	public void EliminarObtieneT(Long id) {
		iObtieneTDAO.deleteById(id);
		
	}

}
