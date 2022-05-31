package com.http.mska.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.http.mska.dao.IExamenDAO;
import com.http.mska.dto.Examen;

@Service
public class ExamenServiceImpl implements IExamenService{
	@Autowired
	IExamenDAO iExamenDAO;

	@Override
	public List<Examen> listarExamen() {
		return iExamenDAO.findAll();
	}

	@Override
	public Examen buscarExamenXIdentificador(Long id) {
		return iExamenDAO.findById(id).get();
	}

	@Override
	public Examen crearExamen(Examen examen) {
		return iExamenDAO.save(examen);
	}

	@Override
	public Examen modificarExamen(Examen examen) {
		return iExamenDAO.save(examen);
	}

	@Override
	public void eliminarExamen(Long id) {
		iExamenDAO.deleteById(id);
	}

	
	
}
