package com.http.mska.services;

import java.util.List;

import com.http.mska.dto.Tecnico;



public interface TecnicoService {
	public List<Tecnico> listarTecnico();

	public Tecnico crearTecnico(Tecnico tecnico);

	public Tecnico modificarTecnico(Tecnico tecnico);

	public void eliminarTecnico(Long id);

	public Tecnico buscarTecnico(Long id);
}
