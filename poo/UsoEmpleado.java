package poo;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {

		Jefatura jefeRRHH = new Jefatura("Sirius Black", 100000, 2020, 3, 5);

		Empleado[] misEmpleados = new Empleado[6];
		misEmpleados[0] = new Empleado("Miguel Ángel Sastre", 24000, 2020, 2, 1);
		misEmpleados[1] = new Empleado("Palmira Romia", 35000, 2022, 12, 20);
		misEmpleados[2] = new Empleado("Rippley Sastre", 85000, 2017, 1, 18);
		misEmpleados[3] = new Empleado("Nela Romia");
		misEmpleados[4] = jefeRRHH; // polimorfismo. Principio de sustitucion
		misEmpleados[5] = new Jefatura("Harry Potter", 95000, 1999, 5, 26);
		Jefatura jefaFinanzas = (Jefatura) misEmpleados[5];
		jefaFinanzas.setIncentivo(55000);

		System.out.println(jefaFinanzas.tomarDecisiones("Dar más días de vacaciones a los empleados"));

		System.out.println("El jefe " + jefaFinanzas.getNombre() + " tiene un bonus de " + jefaFinanzas.setBonus(500));
		System.out.println(misEmpleados[3].getNombre() + " tiene un bonus de: " + misEmpleados[3].setBonus(200));

		for (Empleado e : misEmpleados) {
			e.setSubeSueldo(5);
		}

		Arrays.sort(misEmpleados);

		for (Empleado e : misEmpleados) {
			System.out.println("Nombre: " + e.getNombre() + " Sueldo: " + e.getSueldo() + " Fecha de Alta: "
					+ e.getFechaContrato());
		}
	}

}

class Empleado implements Comparable, Trabajadores {

	public Empleado(String nom, double sou, int any, int mes, int dia) {

		nombre = nom;
		sueldo = sou;
		GregorianCalendar calendario = new GregorianCalendar(any, mes - 1, dia);
		altaContrato = calendario.getTime();
		idSiguiente++;
		id = idSiguiente;

	}

	public double setBonus(double gratificacion) {

		return Trabajadores.bonusBase + gratificacion;
	}

	public Empleado(String nom) {
		this(nom, 30000, 2000, 01, 01);
	}

	public String getNombre() {
		return nombre + " Id: " + id;
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

	public int compareTo(Object miObjeto) {

		Empleado otroEmpleado = (Empleado) miObjeto;

		if (this.id < otroEmpleado.id) {
			return -1;
		}
		if (this.id > otroEmpleado.id) {
			return 1;
		} else {
			return 0;
		}

	}

	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente;
	private int id;

}

class Jefatura extends Empleado implements Jefes {

	public Jefatura(String nom, double sou, int any, int mes, int dia) {
		super(nom, sou, any, mes, dia);

	}

	@Override
	public String tomarDecisiones(String decision) {

		return "Un miembro de la dirección ha tomado la decisión de: " + decision;
	}

	public double setBonus(double gratificacion) {

		double prima = 2000;

		return Trabajadores.bonusBase + gratificacion + prima;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	public double getSueldo() {
		double sueldoJefe = super.getSueldo();
		return sueldoJefe + incentivo;
	}

	private double incentivo;

}
