package com.http.mska.services;

import java.util.List;

import com.http.mska.dto.BandageTecnico;

public interface IBandageTecnicoService {
		
		//Listar los bandage de técnico
		public List<BandageTecnico> listarBandageTecnico();
		
		//Crear bandage de técnico
	    public BandageTecnico crearBandageTecnico(BandageTecnico bandageTecnico);

	    //Modificar bandage de técnico
	    public BandageTecnico modificarBandageTecnico(BandageTecnico bandageTecnico);

	    //Eliminar bandage de técnico
	    public void eliminarBandageTecnico(Long id);
	    
	    //Buscar bandage de técnico

	    public BandageTecnico buscarBandageTecnico(Long id);

	}