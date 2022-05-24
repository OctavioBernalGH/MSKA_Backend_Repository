package com.http.mska.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.http.mska.dao.IReclutadorDAO;
import com.http.mska.dto.Reclutador;

public class ReclutadorServiceImp implements IReclutadorService{

	@Autowired
	IReclutadorDAO iReclutadorDAO;
	
	@Override
	public List<Reclutador> listarReclutadores() {
		return iReclutadorDAO.findAll();
	}

	@Override
	public Reclutador guardarReclutador(Reclutador reclutador) {
		return iReclutadorDAO.save(reclutador);
	}

	@Override
	public Reclutador reclutadorXID(Long id) {
		return iReclutadorDAO.findById(id).get();
	}

	@Override
	public Reclutador actualizarReclutador(Reclutador reclutador) {
		return iReclutadorDAO.save(reclutador);
	}

	@Override
	public void eliminarReclutador(Long id) {
		iReclutadorDAO.deleteById(id);
	}

}
