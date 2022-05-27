package com.http.mska.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.http.mska.dao.IBandageReclutadorDAO;
import com.http.mska.dto.BandageReclutador;

@Service 

public class BandageReclutadorServiceImpl implements IBandageReclutadorService{
	
	@Autowired
	IBandageReclutadorDAO bandageReclutadorDAO;

	@Override
	public List<BandageReclutador> listarBandageReclutador() {
		return bandageReclutadorDAO.findAll();
	}

	@Override
	public BandageReclutador crearBandageReclutador(BandageReclutador bandageReclutador) {
		return bandageReclutadorDAO.save(bandageReclutador);
	}

	@Override
	public BandageReclutador modificarBandageReclutador(BandageReclutador bandageReclutador) {
		return bandageReclutadorDAO.save(bandageReclutador);
	}

	@Override
	public void eliminarBandageReclutador(Long id) {		
	}

	@Override
	public BandageReclutador buscarBandageReclutador(Long id) {
		return bandageReclutadorDAO.findById(id).get();
	}

}