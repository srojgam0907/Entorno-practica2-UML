package uml_practica2;

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
}
