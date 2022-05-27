package com.http.mska.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.http.mska.dao.IUsuarioDAO;
import com.http.mska.dto.Usuario;

/** Se define la anotación @Service */
@Service

/**
 * Se implementa la interfaz @IUsuarioService para el uso de sus métodos.
 */
public class UsuarioServiceImp implements IUsuarioService {

	/** Mediante @Autowired se inyectan las dependencias del DAO */
	@Autowired
	IUsuarioDAO iUsuarioDAO;
	
	
	@Override
	public List<Usuario> listarUsuarios() {
		// Listar todos los Usuarios.
		return iUsuarioDAO.findAll();
	}

	@Override
	public Usuario buscarUsuarioXIdentificador(Long id) {
		// Buscar un usuario mediante el identificador.
		return iUsuarioDAO.findById(id).get();
	}

	@Override
	public Usuario crearUsuario(Usuario usuario) {
		// Crear un nuevo usuario.
		return iUsuarioDAO.save(usuario);
	}

	@Override
	public Usuario modificarUsuario(Usuario usuario) {
		// Modificar un usuario existente
		return iUsuarioDAO.save(usuario);
	}

	@Override
	public void eliminarUsuario(Long id) {
		// Eliminar un usuario mediante identificador.
		iUsuarioDAO.deleteById(id);
		System.out.println("Se eliminó el usuario satisfactoriamente.");
	}

}
