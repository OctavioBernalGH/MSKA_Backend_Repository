package com.http.mska.services;

import java.util.List;

import com.http.mska.dto.BandagesTecnico;

public interface BandagesTecnicoService {
		
		//Listar los bandages de técnico
		public List<BandagesTecnico> listarBandagesTecnico();
		
		//Crear bandage de técnico
	    public BandagesTecnico crearBandageTecnico(BandagesTecnico bandagesTecnico);

	    //Modificar bandage de técnico
	    public BandagesTecnico modificarBandageTecnico(BandagesTecnico bandagesTecnico);

	    //Eliminar bandage de técnico
	    public void eliminarBandageTecnico(Long id);
	    
	    //Buscar bandage de técnico
	    public BandagesTecnico buscarBandagesTecnico(Long id);

	}