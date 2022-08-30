package poo;

public class Furgoneta extends Coche { // indicamos con la palabra "extends" que Furgoneta hereda de Coche.
										// Coche=superclase o clase Padre y Furgoneta=subclase o clase hijo
	private int capacidadCarga;
	private int plazasExtra;

	public Furgoneta(int plazasExtra, int capacidadCarga) {

		super(); // "super" llama al constructor de la clase padre
		this.capacidadCarga = capacidadCarga;
		this.plazasExtra = plazasExtra;

	}

	public String getDatosFurgoneta() {
		return "La Capacidad de Carga es: " + capacidadCarga + ", y las plazas son: " + plazasExtra;
	}
	
}
