package com.http.mska.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.http.mska.dao.BandageReclutadorDAO;
import com.http.mska.dto.BandagesReclutador;

@Service 

public class BandagesReclutadorServiceImpl implements BandagesReclutadorService{
	
	@Autowired
	BandageReclutadorDAO bandagesReclutadorDAO;

	@Override
	public List<BandagesReclutador> listarBandagesReclutador() {
		return bandagesReclutadorDAO.findAll();
	}

	@Override
	public BandagesReclutador crearBandageReclutador(BandagesReclutador bandagesReclutador) {
		return bandagesReclutadorDAO.save(bandagesReclutador);
	}

	@Override
	public BandagesReclutador modificarBandageReclutador(BandagesReclutador bandagesReclutador) {
		return bandagesReclutadorDAO.save(bandagesReclutador);
	}

	@Override
	public void eliminarBandageReclutador(Long id) {		
	}

	@Override
	public BandagesReclutador buscarBandageReclutador(Long id) {
		return bandagesReclutadorDAO.findById(id).get();
	}

}