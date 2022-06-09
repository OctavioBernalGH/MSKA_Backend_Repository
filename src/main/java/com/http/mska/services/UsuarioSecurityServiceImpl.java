package com.http.mska.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import static java.util.Collections.emptyList;
import org.springframework.stereotype.Service;
import com.http.mska.dao.IUsuarioSecurityDAO;
import com.http.mska.dto.UsuarioSecurity;

@Service
public class UsuarioSecurityServiceImpl implements UserDetailsService{

	private IUsuarioSecurityDAO iUsuarioSecurityDAO;

	public UsuarioSecurityServiceImpl(IUsuarioSecurityDAO iUsuarioSecurityDAO) {
		this.iUsuarioSecurityDAO = iUsuarioSecurityDAO;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UsuarioSecurity usuarioSecurity = iUsuarioSecurityDAO.findByUsername(username);
		if (usuarioSecurity == null) {
			throw new UsernameNotFoundException(username);
		}
		return new User(usuarioSecurity.getUsername(), usuarioSecurity.getPassword(), emptyList());
	}
}
