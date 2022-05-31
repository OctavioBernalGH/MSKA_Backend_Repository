package com.http.mska.services;

import java.util.List;
import com.http.mska.dto.Posee;

/** Interfaz de métodos a implementar en la capa service */
public interface IPoseeService {
	
	/** Se listan los posee */
	public List<Posee> listarPosee();
	
	/** Buscar posee por identificador */
	public Posee buscarPoseeXIdentificador(Long id);
	
	/** Se crea un nuevo posee */
	public Posee crearPosee(Posee posee);
	
	/** Se modifica un posee existente */
	public Posee modificarPosee(Posee posee);
	
	/** Se elimina un posee por identificador */
	public void eliminarPosee(Long id);

}
