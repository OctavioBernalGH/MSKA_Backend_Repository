package com.http.mska.services;

import java.util.List;
import com.http.mska.dto.Rol;

public interface IRolService {

	/** Listar roles */
	public List<Rol> listarRoles();
	
	/** Crear un nuevo rol */
	public Rol crearNuevoRol(Rol rol);
	
	/** Buscar un rol por el identificador */
	public Rol buscarRolXIdentificador(Long id);
	
	/** Modificar un rol existente */
	public Rol modificarRol(Rol rol);
	
	/** Eliminar un rol */
	public void eliminarRol(Long id);
}
