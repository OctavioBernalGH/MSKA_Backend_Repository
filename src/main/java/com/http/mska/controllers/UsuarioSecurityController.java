package com.http.mska.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.http.mska.dao.IUsuarioSecurityDAO;
import com.http.mska.dto.UsuarioSecurity;
import com.http.mska.services.UsuarioSecurityServiceImpl;

@RestController
@RequestMapping("/usuariosecurity")
public class UsuarioSecurityController {
	@Autowired
	UsuarioSecurityServiceImpl usuarioSecurityServiceImpl;
	IUsuarioSecurityDAO iUsuarioSecurityDAO;
	
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public UsuarioSecurityController(IUsuarioSecurityDAO iUsuarioSecurityDAO, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.iUsuarioSecurityDAO = iUsuarioSecurityDAO;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	
	
	@GetMapping("/response-entity-builder-with-http-headers")
	public ResponseEntity<String> usingResponseEntityBuilderAndHttpHeaders() {
	    HttpHeaders responseHeaders = new HttpHeaders();
	    responseHeaders.set("Baeldung-Example-Header", 
	      "Value-ResponseEntityBuilderWithHttpHeaders");

	    return ResponseEntity.ok()
	      .headers(responseHeaders)
	      .body("Response with header using ResponseEntity");
	}
	
	@PreAuthorize("hasAnyAuthority('ADMIN')")
	@PostMapping("/")
	public UsuarioSecurity crearUsuarioSecurity(@RequestBody UsuarioSecurity usuarioSecurity) {
		usuarioSecurity.setPassword(bCryptPasswordEncoder.encode(usuarioSecurity.getPassword()));
		iUsuarioSecurityDAO.save(usuarioSecurity);
		return usuarioSecurity;
	}

	@PreAuthorize("hasAnyAuthority('ADMIN')")
	@GetMapping("/")
	public List<UsuarioSecurity> listarUsuarioSecurity() {
		return usuarioSecurityServiceImpl.listarUsuarioSecurity();
	}

	@PreAuthorize("hasAnyAuthority('ADMIN')")
	@GetMapping("/{id}")
	public UsuarioSecurity usuariosSecurityXID(@PathVariable(name = "id") Long id) {

		UsuarioSecurity usuario_xid = new UsuarioSecurity();

		usuario_xid = usuarioSecurityServiceImpl.buscarUsuarioSecurity(id);

		return usuario_xid;
	}
    
	@PreAuthorize("hasAnyAuthority('ADMIN')")
	@PutMapping("/{id}")
	public UsuarioSecurity modificarUsuarioSecurity(@PathVariable(name = "id") Long id, @RequestBody UsuarioSecurity usuarioSecurity) {

		UsuarioSecurity usuario_seleccionado = new UsuarioSecurity();
		UsuarioSecurity usuario_actualizado = new UsuarioSecurity();

		usuario_seleccionado = usuarioSecurityServiceImpl.buscarUsuarioSecurity(id);

		usuario_seleccionado.setUsername(usuarioSecurity.getUsername());
		usuario_seleccionado.setPassword(bCryptPasswordEncoder.encode(usuarioSecurity.getPassword()));
		usuario_seleccionado.setRole(usuarioSecurity.getRole());
		
		usuario_actualizado = usuarioSecurityServiceImpl.modificarUsuarioSecurity(usuario_seleccionado);

		return usuario_actualizado;
	}

	@PreAuthorize("hasAnyAuthority('ADMIN')")
	@DeleteMapping("/{id}")
	public String eliminarUsuarios(@PathVariable(name = "id") Long id) {
		usuarioSecurityServiceImpl.eliminarUsuarioSecurity(id);
		return "usuario " + id + "eliminado correctamente";
	}
}

