package com.http.mska.services;

import java.util.List;

import com.http.mska.dto.Valoracion;

public interface IValoracionService {

	//List, search, create, update, delete
	public List<Valoracion> listarValoraciones();
	public Valoracion buscarValoracionXID(Long id);
	public Valoracion crearValoracion(Valoracion valoracion);
	public Valoracion modificarValoracion(Valoracion valoracion);
	public void eliminarValoracion(Long id);
}
