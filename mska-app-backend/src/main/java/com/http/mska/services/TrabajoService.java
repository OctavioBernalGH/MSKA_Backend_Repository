package com.http.mska.services;

import java.util.List;

import com.http.mska.dto.Trabajo;

public interface TrabajoService {
	public List<Trabajo> listarTrabajo();

	public Trabajo crearTrabajo(Trabajo trabajo);

	public Trabajo modificarTrabajo(Trabajo trabajo);

	public void eliminarTrabajo(Long id);

	public Trabajo buscarTrabajo(Long id);
}
