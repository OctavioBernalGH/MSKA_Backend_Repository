package com.http.mska.services;

import java.util.List;

import com.http.mska.dto.Reclutador;

public interface IReclutadorService {
	
	//For list Reclutadores
	public List<Reclutador> listarReclutadores();
	//For create Reclutador
	public Reclutador guardarReclutador(Reclutador reclutador);
	//For search for id
	public Reclutador reclutadorXID(Long id);
	//Update reclutador
	public Reclutador actualizarReclutador(Reclutador reclutador);
	//Erase
	public void eliminarReclutador(Long id);

}
