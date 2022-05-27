package com.http.mska.services;

import java.util.List;

<<<<<<< HEAD
import com.http.mska.dto.BandagesReclutador;

public interface IBandageReclutadorService {
	
	//Listar los bandages de reclutador
	public List<BandagesReclutador> listarBandagesReclutador();
	
	//Crear bandage de reclutador
    public BandagesReclutador crearBandageReclutador(BandagesReclutador bandagesReclutador);

    //Modificar bandage de reclutador
    public BandagesReclutador modificarBandageReclutador(BandagesReclutador bandagesReclutador);
=======
import com.http.mska.dto.BandageReclutador;

public interface IBandageReclutadorService {
	
	//Listar los bandage de reclutador
	public List<BandageReclutador> listarBandageReclutador();
	
	//Crear bandage de reclutador
    public BandageReclutador crearBandageReclutador(BandageReclutador bandageReclutador);

    //Modificar bandage de reclutador
    public BandageReclutador modificarBandageReclutador(BandageReclutador bandageReclutador);
>>>>>>> 520e4fcc104418849e4d79e38a728a6902fe25a7

    //Eliminar bandage de reclutador
    public void eliminarBandageReclutador(Long id);
    
    //Buscar bandage de reclutador
<<<<<<< HEAD
    public BandagesReclutador buscarBandageReclutador(Long id);
=======
    public BandageReclutador buscarBandageReclutador(Long id);
>>>>>>> 520e4fcc104418849e4d79e38a728a6902fe25a7

}