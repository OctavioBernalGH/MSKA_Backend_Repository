package com.http.mska.controllers;

import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.http.mska.dao.IUsuarioSecurityDAO;
import com.http.mska.dto.UsuarioSecurity;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class UsuarioSecurityController {
	
	
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
	
	@PostMapping("/users/")
	public UsuarioSecurity saveUsuario(@RequestBody UsuarioSecurity usuarioSecurity) {
		usuarioSecurity.setPassword(bCryptPasswordEncoder.encode(usuarioSecurity.getPassword()));
		iUsuarioSecurityDAO.save(usuarioSecurity);
		return usuarioSecurity;
	}

	@GetMapping("/users/")
	public List<UsuarioSecurity> getAllUsuarios() {
		return iUsuarioSecurityDAO.findAll();
	}

	@GetMapping("/users/{username}")
	public UsuarioSecurity getUsuario(@PathVariable String username) {
		return iUsuarioSecurityDAO.findByUsername(username);
	}
	
	@DeleteMapping("/users/{id}")
	public String eliminarUser(@PathVariable(name="id")long id) {
		iUsuarioSecurityDAO.deleteById(id);
		return "User deleted.";
	}
}

