package com.http.mska.services;

import java.util.List;

import com.http.mska.dto.Examen;

public interface IExamenService {
	public List<Examen> listarExamen();

	public Examen buscarExamenXIdentificador(Long id);

	public Examen crearExamen(Examen examen);

	public Examen modificarExamen(Examen examen);

	public void eliminarExamen(Long id);

}
