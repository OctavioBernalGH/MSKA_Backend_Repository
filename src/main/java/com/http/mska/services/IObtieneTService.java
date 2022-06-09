package com.http.mska.services;

import java.util.List;
import com.http.mska.dto.ObtieneT;

/** Plantilla de métodos a implementar en la capa service */
public interface IObtieneTService {
	
	/** Listar obtieneT */
	public List<ObtieneT> listarObtieneT();
	
	/** Buscar obtieneT por identificador */
	public ObtieneT buscarObtieneTXIdentificador(Long id);
	
	/** Crear un nuevo ObtieneT */
	public ObtieneT crearObtieneT(ObtieneT obtieneT);
	
	/** Modificar un obtieneT existente */
	public ObtieneT modificarObtieneT(ObtieneT obtieneT);
	
	/** Eliminar obtieneT existente por identificador */
	public void EliminarObtieneT(Long id);

}
