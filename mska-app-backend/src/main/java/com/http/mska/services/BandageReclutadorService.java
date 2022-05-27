package com.http.mska.services;

import java.util.List;

import com.http.mska.dto.BandageReclutador;

public interface BandageReclutadorService {
	
	//Listar los bandage de reclutador
	public List<BandageReclutador> listarBandageReclutador();
	
	//Crear bandage de reclutador
    public BandageReclutador crearBandageReclutador(BandageReclutador bandageReclutador);

    //Modificar bandage de reclutador
    public BandageReclutador modificarBandageReclutador(BandageReclutador bandageReclutador);

    //Eliminar bandage de reclutador
    public void eliminarBandageReclutador(Long id);
    
    //Buscar bandage de reclutador
    public BandageReclutador buscarBandageReclutador(Long id);

}