package com.http.mska.controllers;

/**
 * @author MSKA
 */

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
import com.http.mska.dto.Mensaje;
import com.http.mska.services.MensajeServiceImp;

/** Controlador del tipo rest con ruta inicial endpoint */
@RestController
@RequestMapping("/api")
public class MensajeController {

	/** Se inyecta el conjunto de métodos de la capa service */
	@Autowired
	MensajeServiceImp mensajeServiceImpl;

	@GetMapping("/mensaje")
	public List<Mensaje> listarMensajes() {
		return mensajeServiceImpl.listarMensaje();
		// Se listan los mensajes.
	}

	@GetMapping("/mensaje/{id}")
	public Mensaje buscarMensajeXIdentificador(@PathVariable(name = "id") Long id) {
		return mensajeServiceImpl.buscarMensajeXIdentificador(id);
		// Se busca un mensaje por el identificador en ruta.
	}

	@PostMapping("/mensaje")
	public Mensaje crearMensaje(@RequestBody Mensaje mensaje) {
		return mensajeServiceImpl.crearMensaje(mensaje);
		// Se crea un nuevo mensaje.
	}

	@PutMapping("/mensaje/{id}")
	public Mensaje modificarMensaje(@PathVariable(name = "id") Long id, @RequestBody Mensaje mensaje) {
		// Se crean instancias de mensaje.
		Mensaje mensaje_a_modificar = new Mensaje();
		Mensaje modificado = new Mensaje();

		// Se busca el mensaje a modificar mediante el identificador.
		mensaje_a_modificar = mensajeServiceImpl.buscarMensajeXIdentificador(id);

		// Se modifica el mensaje mediante set.
		mensaje_a_modificar.setId(mensaje.getId());
		mensaje_a_modificar.setMensaje(mensaje.getMensaje());
		mensaje_a_modificar.setFecha_mensaje(mensaje.getFecha_mensaje());
		mensaje_a_modificar.setUsuario(mensaje.getUsuario());
		mensaje_a_modificar.setDestinatario(mensaje.getDestinatario());
		// Se vuelcan las modificaciones.
		modificado = mensajeServiceImpl.modificarMensaje(mensaje_a_modificar);

		// Se devuelve el mensaje modificado.
		return modificado;
	}

	@DeleteMapping("/mensaje/{id}")
	public String eliminarMensajeXIdentificador(@PathVariable(name = "id") Long id) {
		mensajeServiceImpl.eliminarMensaje(id);
		return "Usuario eliminado con éxito";
		// Se elimina un usuario mediante el identificador.
		// Se modifica el método a tipo String para visualizar la acción en postman.
	}
}
