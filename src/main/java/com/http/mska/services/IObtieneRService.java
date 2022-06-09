package com.http.mska.services;

import java.util.List;
import com.http.mska.dto.ObtieneR;

/** Interfáz con métodos definidos */
public interface IObtieneRService {

	/** Listar obtieneR */
	public List<ObtieneR> listarObtieneR();
	
	/** Buscar obtieneR por identificador */
	public ObtieneR buscarObtieneRXIdentificador(Long id);
	
	/** Crear un nuevo obtieneR */
	public ObtieneR crearObtieneR(ObtieneR obtieneR);
	
	/** Modificar un obtieneR existente */
	public ObtieneR modificarObtieneR(ObtieneR obtieneR);
	
	/** Eliminar un obtieneR por identificador */
	public void eliminarObtieneR(Long id);
}
