package poo;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private String color;
	private int pesoTotal;
	private boolean asientosCuero, climatizador;

	public Coche() {

		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
		// color = "rojo";

	}

	public String getDatos() {
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas" + ". Mide " + largo / 1000
				+ " metros con un ancho de " + ancho + " cm y un peso de plataforma de " + pesoPlataforma + " kg.";

	}

	public void setColor(String colorCoche) {
		color = colorCoche;
		// color = "azul";
	}

	public String getColor() {
		return "El color del vehiculo es " + color;
	}

	public void setAsientos(String asientosCuero) {
		if (asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero = true;
		} else {
			this.asientosCuero = false;
		}
	}

	public String getAsientos() {
		if (asientosCuero == true) {

			return "El coche tiene asientos de cuero";

		} else {

			return "El coche tiene asientos de serie";
		}
	}

	public void setClimatizador(String climatizador) {

		if (climatizador.equalsIgnoreCase("si")) {

			this.climatizador = true;

		} else {

			this.climatizador = false;
		}
	}

	public String getClimatizador() {

		if (climatizador == true) {

			return "El coche tiene climatizador";

		} else {

			return "El coche no tiene climatizador";
		}
	}

	public String pesoTotalCoche() { // SETTER + GETTER no es recomendable

		int pesoCarroceria = 500;
		pesoTotal = pesoPlataforma + pesoCarroceria;
		if (asientosCuero == true) {
			pesoTotal += 50;
		}
		if (climatizador == true) {
			pesoTotal += 20;
		}
		return "El peso total del coche es de " + pesoTotal + " kg";
	}

	public int precioCoche() {
		int precioFinal = 10000;
		
		if (asientosCuero == true) {
			precioFinal += 2000;
		}
		if (climatizador == true) {
			precioFinal += 1500;
		}

		return precioFinal;
	}

}
