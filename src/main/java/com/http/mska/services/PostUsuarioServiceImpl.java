package com.http.mska.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.http.mska.dao.IPostUsuarioDAO;
import com.http.mska.dto.PostUsuario;

/** Se define la clase como capa service */
@Service
public class PostUsuarioServiceImpl implements IPostUsuarioService{

	/** Se inyectan dependencias heredadas de JPA */
	@Autowired
	IPostUsuarioDAO iPostUsuarioDAO;
	
	/** Listar post usuario*/
	@Override
	public List<PostUsuario> listarPostUsuario() {
		return iPostUsuarioDAO.findAll();
	}

	/** Buscar post usuario por identificador */
	@Override
	public PostUsuario buscarPostUsuarioXIdentificador(Long id) {
		return iPostUsuarioDAO.findById(id).get();
	}

	/** Crear un nuevo post de usuario */
	@Override
	public PostUsuario crearPostUsuario(PostUsuario postUsuario) {
		return iPostUsuarioDAO.save(postUsuario);
	}

	/** Modificar un post existente */
	@Override
	public PostUsuario modificarPostUsuario(PostUsuario postUsuario) {
		return iPostUsuarioDAO.save(postUsuario);
	}

	/** Eliminar un post existente mediante el identificador */
	@Override
	public void eliminarPostUsuario(Long id) {
		iPostUsuarioDAO.deleteById(id);
	}

}
