package com.http.mska.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.http.mska.dao.TrabajoDAO;
import com.http.mska.dto.Trabajo;

@Service
public class TrabajoServiceImpl implements TrabajoService{
	@Autowired
	TrabajoDAO trabajoDao;
	
	
	@Override
	public List<Trabajo> listarTrabajo() {
		return trabajoDao.findAll();
	}

	@Override
	public Trabajo crearTrabajo(Trabajo trabajo) {
		return trabajoDao.save(trabajo);
	}

	@Override
	public Trabajo modificarTrabajo(Trabajo trabajo){
		return trabajoDao.save(trabajo);
	}

	@Override
	public void eliminarTrabajo(Long id) {
		trabajoDao.deleteById(id);
		
	}

	@Override
	public Trabajo buscarTrabajo(Long id) {
		return trabajoDao.findById(id).get();
	}
}
