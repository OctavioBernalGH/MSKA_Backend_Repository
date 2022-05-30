package com.http.mska.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.http.mska.dao.IObtieneRDAO;
import com.http.mska.dto.ObtieneR;

/** Se define capa de servicio implementando la intefaz generada */
@Service
public class ObtieneRServiceImpl implements IObtieneRService{

	/** Se inyectan las dependencias del DAO heredadas de JPA*/
	@Autowired
	IObtieneRDAO iObtieneRDAO;
	
	/** Listar */
	@Override
	public List<ObtieneR> listarObtieneR() {
		return iObtieneRDAO.findAll();
	}

	/** Buscar por identificador */
	@Override
	public ObtieneR buscarObtieneRXIdentificador(Long id) {
		return iObtieneRDAO.findById(id).get();
	}

	/** Crear */
	@Override
	public ObtieneR crearObtieneR(ObtieneR obtieneR) {
		return iObtieneRDAO.save(obtieneR);
	}

	/** Modificar */
	@Override
	public ObtieneR modificarObtieneR(ObtieneR obtieneR) {
		return iObtieneRDAO.save(obtieneR);
	}

	/** Eliminar por identificador */
	@Override
	public void eliminarObtieneR(Long id) {
		 iObtieneRDAO.deleteById(id);
	}

}
