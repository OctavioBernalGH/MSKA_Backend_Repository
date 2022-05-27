package com.http.mska.services;

import java.util.List;

<<<<<<< HEAD
import com.http.mska.dto.BandagesTecnico;

public interface IBandageTecnicoService {
		
		//Listar los bandages de técnico
		public List<BandagesTecnico> listarBandagesTecnico();
		
		//Crear bandage de técnico
	    public BandagesTecnico crearBandageTecnico(BandagesTecnico bandagesTecnico);

	    //Modificar bandage de técnico
	    public BandagesTecnico modificarBandageTecnico(BandagesTecnico bandagesTecnico);
=======
import com.http.mska.dto.BandageTecnico;

public interface IBandageTecnicoService {
		
		//Listar los bandage de técnico
		public List<BandageTecnico> listarBandageTecnico();
		
		//Crear bandage de técnico
	    public BandageTecnico crearBandageTecnico(BandageTecnico bandageTecnico);

	    //Modificar bandage de técnico
	    public BandageTecnico modificarBandageTecnico(BandageTecnico bandageTecnico);
>>>>>>> 520e4fcc104418849e4d79e38a728a6902fe25a7

	    //Eliminar bandage de técnico
	    public void eliminarBandageTecnico(Long id);
	    
	    //Buscar bandage de técnico
<<<<<<< HEAD
	    public BandagesTecnico buscarBandagesTecnico(Long id);
=======
	    public BandageTecnico buscarBandageTecnico(Long id);
>>>>>>> 520e4fcc104418849e4d79e38a728a6902fe25a7

	}