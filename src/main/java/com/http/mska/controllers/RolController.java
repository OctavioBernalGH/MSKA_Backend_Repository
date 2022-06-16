package com.http.mska.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.http.mska.dto.Rol;
import com.http.mska.services.RolServiceImpl;

@RestController
@RequestMapping("/api")
public class RolController {

	@Autowired
	RolServiceImpl rolServiceImpl;
	
	@GetMapping("/rol")
	public List<Rol> listarRoles() {
		return rolServiceImpl.listarRoles();
	}

	@PostMapping("/rol")
	public Rol crearRol(@RequestBody Rol rol) {
		return rolServiceImpl.crearNuevoRol(rol);
	}

	@GetMapping("/rol/{id}")
	public Rol buscarRolXIdentificador(@PathVariable(name = "id") Long id) {
		return rolServiceImpl.buscarRolXIdentificador(id);
	}

	@PutMapping("/rol/{id}")
	public Rol modificarRol(@RequestBody Rol rol, @PathVariable(name = "id") Long id) {

		Rol rol_a_actualizar = new Rol();
		Rol rol_actualizado = new Rol();

		rol_a_actualizar = rolServiceImpl.buscarRolXIdentificador(id);

		rol_a_actualizar.setId(rol.getId());
		rol_a_actualizar.setNombre(rol.getNombre());

		rol_actualizado = rolServiceImpl.modificarRol(rol_a_actualizar);
		return rol_actualizado;
	}

	@DeleteMapping("/rol/{id}")
	public void eliminarRol(@PathVariable(name = "id") Long id) {
		rolServiceImpl.eliminarRol(id);
	}
}
