package com.http.mska.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.http.mska.dao.TecnicoDAO;
import com.http.mska.dto.Tecnico;

@Service
public class TecnicoServiceImpl implements TecnicoService{
	@Autowired
	TecnicoDAO tecnicoDao;

	@Override
	public List<Tecnico> listarTecnico() {
		return tecnicoDao.findAll();
	}

	@Override
	public Tecnico crearTecnico(Tecnico tecnico) {
		return tecnicoDao.save(tecnico);
	}

	@Override
	public Tecnico modificarTecnico(Tecnico tecnico) {
		return tecnicoDao.save(tecnico);
	}

	@Override
	public void eliminarTecnico(Long id) {
		tecnicoDao.deleteById(id);
		
	}

	@Override
	public Tecnico buscarTecnico(Long id) {
		return tecnicoDao.findById(id).get();
	}
}