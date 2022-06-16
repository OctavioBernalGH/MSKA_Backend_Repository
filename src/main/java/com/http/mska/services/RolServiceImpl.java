package com.http.mska.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.http.mska.dao.IRolDAO;
import com.http.mska.dto.Rol;

@Service
public class RolServiceImpl implements IRolService{

	@Autowired
	IRolDAO iRolDAO;
	
	@Override
	public List<Rol> listarRoles() {
		return iRolDAO.findAll();
	}

	@Override
	public Rol crearNuevoRol(Rol rol) {
		return iRolDAO.save(rol);
	}

	@Override
	public Rol buscarRolXIdentificador(Long id) {
		return iRolDAO.findById(id).get();
	}

	@Override
	public Rol modificarRol(Rol rol) {
		return iRolDAO.save(rol);
	}

	@Override
	public void eliminarRol(Long id) {
		iRolDAO.deleteById(id);
		
	}

}
