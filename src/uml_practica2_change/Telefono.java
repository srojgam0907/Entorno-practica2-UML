package uml_practica2_change;

import java.util.Scanner;

public class Telefono {
	private String numero;
	private TipoTelefono tipo;

	public Telefono(String numero, TipoTelefono tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return this.tipo + ": " + this.numero;
	}
	
	static TipoTelefono elegirTipoTelefono(Scanner sc) {
		System.out.println("Tipo de teléfono:");
		TipoTelefono[] valores = TipoTelefono.values();

		int i = 0;
		while (i < valores.length) {
			System.out.println((i + 1) + ") " + valores[i]);
			i++;
		}

		int opcion = Main.leerEnteroRango(sc, "Elige tipo (1-" + valores.length + "): ", 1, valores.length);
		return valores[opcion - 1];
	}
}
