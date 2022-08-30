package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona[] lasPersonas = new Persona[2];
		lasPersonas[0] = new Empleado2("Palmira Romia", 50000, 2022, 12, 25);
		lasPersonas[1] = new Alumno("Nela Ripley", "Psicologia");

		for (Persona e : lasPersonas) {
			System.out.println(e.getNombre() + ". " + e.getDescripcion());
		}
	}

}

abstract class Persona {

	public Persona(String nom) {
		nombre = nom;
	}

	public String getNombre() {
		return nombre;
	}

	public abstract String getDescripcion();

	private String nombre;

}

class Empleado2 extends Persona {

	public Empleado2(String nom, double sou, int any, int mes, int dia) {
		super(nom);
		sueldo = sou;
		GregorianCalendar calendario = new GregorianCalendar(any, mes - 1, dia);
		altaContrato = calendario.getTime();
		++idSiguiente;
		id = idSiguiente;
	}

	public String getDescripcion() {
		return "Este empleado tiene un Id = " + id + " con un sueldo = " + sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public Date getFechaContrato() {
		return altaContrato;
	}

	public void setSubeSueldo(double porcentaje) {

		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

	public static String getIdSiguiente() {
		return "El IdSiguiente es: " + idSiguiente;
	}

	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente;
	private int id;

}

class Alumno extends Persona {

	public Alumno(String nom, String car) {
		super(nom);
		this.carrera = car;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Este alumno está estudiando la carrera de " + carrera;
	}

	private String carrera;
}