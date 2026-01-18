package uml_practica2_change;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
	private List<Contacto> contactos;
	private int siguienteId;

	public Agenda() {
		this.contactos = new ArrayList<>();
		this.siguienteId = 1;
	}

	public int getSiguienteId() {
		int id = this.siguienteId;
		this.siguienteId = this.siguienteId + 1;
		return id;
	}

	public void agregarContacto(Contacto c) {
		this.contactos.add(c);
	}

	public List<Contacto> listarContactos() {
		return new ArrayList<>(this.contactos);
	}

	public Contacto obtenerPorId(int id) {
		for (Contacto c : this.contactos) {
			if (c.getId() == id) {
				return c;
			}
		}
		return null;
	}

	public boolean eliminarContactoPorId(int id) {
		int i = 0;
		while (i < this.contactos.size()) {
			if (this.contactos.get(i).getId() == id) {
				this.contactos.remove(i);
				return true;
			}
			i++;
		}
		return false;
	}

	public List<Contacto> buscarPorNombre(String texto) {
		String t = texto.toLowerCase();
		List<Contacto> resultados = new ArrayList<>();

		for (Contacto c : this.contactos) {
			String nombreCompleto = (c.getNombre() + " " + c.getApellidos()).toLowerCase();
			if (nombreCompleto.contains(t)) {
				resultados.add(c);
			}
		}
		return resultados;
	} 
	
	static Contacto crearContacto(Scanner sc, int id) {
		String nombre = Main.leerTextoNoVacio(sc, "Nombre: ");
		String apellidos = Main.leerTextoNoVacio(sc, "Apellidos: ");
		String email = Main.leerTexto(sc, "Email (opcional): ");

		Direccion direccion = Contacto.crearDireccion(sc);

		Contacto c = new Contacto(id, nombre, apellidos, email, direccion);

		int cuantos = Main.leerEntero(sc, "¿Cuántos teléfonos quieres añadir ahora? (0..n): ");
		int i = 0; 
		while (i < cuantos) {
			Telefono t = Contacto.crearTelefono(sc);
			c.agregarTelefono(t);
			i++;
		}

		return c;
	}
}
