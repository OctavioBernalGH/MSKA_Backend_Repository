package com.http.mska.services;

import java.util.List;
import com.http.mska.dto.PostUsuario;

/** Definición de métodos a implementar en la capa service */
public interface IPostUsuarioService {

	/** Listar post usuario */
	public List<PostUsuario> listarPostUsuario();
	
	/** Buscar un post por identificador */
	public PostUsuario buscarPostUsuarioXIdentificador(Long id);
	
	/** Crear un nuevo post de usuario */
	public PostUsuario crearPostUsuario(PostUsuario postUsuario);
	
	/** Modificar un post existente */
	public PostUsuario modificarPostUsuario(PostUsuario postUsuario);
	
	/** Eliminar un post mediante el identificador */
	public void eliminarPostUsuario(Long id);
}
