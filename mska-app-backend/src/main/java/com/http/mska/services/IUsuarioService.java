package com.http.mska.services;

import java.util.List;
import com.http.mska.dto.Usuario;

/** Plantilla de métodos CRUD */
public interface IUsuarioService {

	/** Método para listar usuarios */
	public List<Usuario> listarUsuarios();
	
	/** Métodos para buscar usuario por identificador */
	public Usuario buscarUsuarioXIdentificador(Long id);
	
	/** Método para crear un nuevo usuario */
	public Usuario crearUsuario(Usuario usuario);
	
	/** Método para modificar un usuario existente */
	public Usuario modificarUsuario(Usuario usuario);
	
	/** Método para eliminar un usuario existente */
	public Usuario eliminarUsuario(Long id);
}
