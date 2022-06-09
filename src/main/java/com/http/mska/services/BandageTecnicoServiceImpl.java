package com.http.mska.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.http.mska.dao.IBandageTecnicoDAO;
import com.http.mska.dto.BandageTecnico;

@Service 

public class BandageTecnicoServiceImpl implements IBandageTecnicoService{
	@Autowired
	IBandageTecnicoDAO bandageTecnicoDAO;

	@Override
	public List<BandageTecnico> listarBandageTecnico() {
		return bandageTecnicoDAO.findAll();
	}

	@Override
	public BandageTecnico crearBandageTecnico(BandageTecnico bandageTecnico) {
		return bandageTecnicoDAO.save(bandageTecnico);
	}

	@Override
	public BandageTecnico modificarBandageTecnico(BandageTecnico bandageTecnico) {
		return bandageTecnicoDAO.save(bandageTecnico);
	}

	@Override
	public void eliminarBandageTecnico(Long id) {		
	}

	@Override
	public BandageTecnico buscarBandageTecnico(Long id) {
		return bandageTecnicoDAO.findById(id).get();
	}


}