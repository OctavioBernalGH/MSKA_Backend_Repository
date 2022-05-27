package com.http.mska.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.http.mska.dao.IBandageTecnicoDAO;
import com.http.mska.dto.BandagesTecnico;

@Service 

public class BandagesTecnicoServiceImpl implements IBandageTecnicoService{
	@Autowired
	IBandageTecnicoDAO bandagesTecnicoDAO;

	@Override
	public List<BandagesTecnico> listarBandagesTecnico() {
		return bandagesTecnicoDAO.findAll();
	}

	@Override
	public BandagesTecnico crearBandageTecnico(BandagesTecnico bandagesTecnico) {
		return bandagesTecnicoDAO.save(bandagesTecnico);
	}

	@Override
	public BandagesTecnico modificarBandageTecnico(BandagesTecnico bandagesTecnico) {
		return bandagesTecnicoDAO.save(bandagesTecnico);
	}

	@Override
	public void eliminarBandageTecnico(Long id) {		
	}

	@Override
	public BandagesTecnico buscarBandagesTecnico(Long id) {
		return bandagesTecnicoDAO.findById(id).get();
	}


}