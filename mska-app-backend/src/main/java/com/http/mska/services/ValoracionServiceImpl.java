package com.http.mska.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.http.mska.dao.IValoracionDAO;
import com.http.mska.dto.Valoracion;

@Service
public class ValoracionServiceImpl implements IValoracionService{
	
	@Autowired
	IValoracionDAO iValoracionDAO;

	@Override
	public List<Valoracion> listarValoraciones() {
	
		return iValoracionDAO.findAll();
	}

	@Override
	public Valoracion buscarValoracionXID(Long id) {
	
		return iValoracionDAO.findById(id).get();
	}

	@Override
	public Valoracion crearValoracion(Valoracion valoracion) {
	
		return iValoracionDAO.save(valoracion);
	}

	@Override
	public Valoracion modificarValoracion(Valoracion valoracion) {
		
		return iValoracionDAO.save(valoracion);
	}

	@Override
	public void eliminarValoracion(Long id) {
		iValoracionDAO.deleteById(id);
		
	}

}
