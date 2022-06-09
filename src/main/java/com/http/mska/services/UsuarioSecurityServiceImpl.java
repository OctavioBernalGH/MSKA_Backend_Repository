package com.http.mska.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.http.mska.dao.IUsuarioSecurityDAO;
import com.http.mska.dto.UsuarioSecurity;

@Service
public class UsuarioSecurityServiceImpl implements IUsuarioSecurityService, UserDetailsService{
	@Autowired
	IUsuarioSecurityDAO iUsuarioSecurityDAO;


	@Override
	public List<UsuarioSecurity> listarUsuarioSecurity() {
		return iUsuarioSecurityDAO.findAll();
	}

	@Override
	public UsuarioSecurity crearUsuarioSecurity(UsuarioSecurity usuarioSecurity) {
		return iUsuarioSecurityDAO.save(usuarioSecurity);
	}

	@Override
	public UsuarioSecurity modificarUsuarioSecurity(UsuarioSecurity usuarioSecurity) {
		return iUsuarioSecurityDAO.save(usuarioSecurity);
	}

	@Override
	public void eliminarUsuarioSecurity(Long id) {
		iUsuarioSecurityDAO.deleteById(id);

	}

	@Override
	public UsuarioSecurity buscarUsuarioSecurity(Long id) {
		return iUsuarioSecurityDAO.findById(id).get();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UsuarioSecurity usuarioSecurity = iUsuarioSecurityDAO.buscarXNombre(username);
		if (usuarioSecurity == null) {
			throw new UsernameNotFoundException(username);
			
		}
		return new User(usuarioSecurity.getUsername(), usuarioSecurity.getPassword(), usuarioSecurity.getAuthorities());
	}

}
