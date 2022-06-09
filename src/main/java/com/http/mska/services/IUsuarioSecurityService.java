package com.http.mska.services;

import java.util.List;

import com.http.mska.dto.UsuarioSecurity;

public interface IUsuarioSecurityService {
	public List<UsuarioSecurity> listarUsuarioSecurity();
	
	public UsuarioSecurity crearUsuarioSecurity(UsuarioSecurity usuarioSecurity);

	public UsuarioSecurity modificarUsuarioSecurity(UsuarioSecurity usuarioSecurity);

	public void eliminarUsuarioSecurity(Long id);

	public UsuarioSecurity buscarUsuarioSecurity(Long id);
	
}
