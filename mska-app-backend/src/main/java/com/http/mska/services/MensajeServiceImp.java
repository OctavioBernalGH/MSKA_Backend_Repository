package com.http.mska.services;

/**
 * @author MSKA
 */
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.http.mska.dao.IMensajeDAO;
import com.http.mska.dto.Mensaje;

/** Se define como capa service */
@Service
public class MensajeServiceImp implements IMensajeService {

	/**
	 * Se inyectan dependencias de los métodos heredados de JPA en la interfaz DAO
	 */
	@Autowired
	IMensajeDAO iMensajeDAO;

	/** Listar mensajes */
	@Override
	public List<Mensaje> listarMensaje() {
		return iMensajeDAO.findAll();
	}

	/** Buscar mensaje por identificador */
	@Override
	public Mensaje buscarMensajeXIdentificador(Long id) {
		return iMensajeDAO.findById(id).get();
	}

	/** Crear un nuevo mensaje */
	@Override
	public Mensaje crearMensaje(Mensaje mensaje) {
		return iMensajeDAO.save(mensaje);
	}

	/** Modificar mensaje existente */
	@Override
	public Mensaje modificarMensaje(Mensaje mensaje) {
		return iMensajeDAO.save(mensaje);
	}

	/** Eliminar un mensaje por identificador */
	@Override
	public void eliminarMensaje(Long id) {
		iMensajeDAO.deleteById(id);

	}

}
