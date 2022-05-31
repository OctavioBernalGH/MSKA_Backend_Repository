package com.http.mska.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.http.mska.dao.IPoseeDAO;
import com.http.mska.dto.Posee;

/** Se define la clase como capa service */
@Service
public class PoseeServiceImpl implements IPoseeService {

	/** Se inyectan las dependencias heredadas en el DAO de JPA */
	@Autowired
	IPoseeDAO iPoseeDAO;

	/** Se listan Posee */
	@Override
	public List<Posee> listarPosee() {
		return iPoseeDAO.findAll();
	}

	/** Se busca un Posee por identificador */
	@Override
	public Posee buscarPoseeXIdentificador(Long id) {
		return iPoseeDAO.findById(id).get();
	}

	/** Se crea un nuevo Posee */
	@Override
	public Posee crearPosee(Posee posee) {
		return iPoseeDAO.save(posee);
	}

	/** Se modifica un posee existente */
	@Override
	public Posee modificarPosee(Posee posee) {
		return iPoseeDAO.save(posee);
	}

	/** Eliminar posee mediante el identificador */
	@Override
	public void eliminarPosee(Long id) {
		iPoseeDAO.deleteById(id);
	}
}
