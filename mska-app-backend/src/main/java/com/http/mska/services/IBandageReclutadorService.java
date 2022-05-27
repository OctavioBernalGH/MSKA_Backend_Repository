package com.http.mska.services;

import java.util.List;

import com.http.mska.dto.BandagesReclutador;

public interface IBandageReclutadorService {
	
	//Listar los bandages de reclutador
	public List<BandagesReclutador> listarBandagesReclutador();
	
	//Crear bandage de reclutador
    public BandagesReclutador crearBandageReclutador(BandagesReclutador bandagesReclutador);

    //Modificar bandage de reclutador
    public BandagesReclutador modificarBandageReclutador(BandagesReclutador bandagesReclutador);

    //Eliminar bandage de reclutador
    public void eliminarBandageReclutador(Long id);
    
    //Buscar bandage de reclutador
    public BandagesReclutador buscarBandageReclutador(Long id);

}