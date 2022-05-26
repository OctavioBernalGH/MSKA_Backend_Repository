package com.http.mska.services;

import java.util.List;
import com.http.mska.dto.Mensaje;

/** Interfaz de definición de métodos */
public interface IMensajeService {

	/** Listas mensajes */
	public List<Mensaje> listarMensaje();

	/** Buscar mensajes por identificador */
	public Mensaje buscarMensajeXIdentificador(Long id);

	/** Crear un nuevo mensaje */
	public Mensaje crearMensaje(Mensaje mensaje);

	/** Modificar mensaje existente */
	public Mensaje modificarMensaje(Mensaje mensaje);

	/** ELiminar un mensaje mediante identificador */
	public void eliminarMensaje(Long id);
}
