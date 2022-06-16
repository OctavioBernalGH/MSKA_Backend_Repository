package com.http.mska.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.http.mska.dao.IUsuarioDAO;
import com.http.mska.dto.Usuario;

public class UsuarioDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private IUsuarioDAO iUsuarioDAO;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = iUsuarioDAO.findByUsername(username);
		if (usuario == null) {
			throw new UsernameNotFoundException(username);
		}
		return new User(usuario.getUsername(), usuario.getPassword(), usuario.getAuthorities());
	}
}
