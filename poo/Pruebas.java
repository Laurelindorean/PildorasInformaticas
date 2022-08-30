package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1 = new Empleados("Juan Palomo");
		Empleados trabajador2 = new Empleados("Maria Castaño");
		Empleados trabajador3 = new Empleados("Juana Soria");
		Empleados trabajador4 = new Empleados("Miguel Sastre");
		
		trabajador1.setSeccion("Contabilidad");
		
		System.out.println(trabajador1.getDatos() + "\n" + trabajador2.getDatos() + 
				"\n" + trabajador3.getDatos() + "\n" + trabajador4.getDatos());
		System.out.println(Empleados.getIdSiguiente());
		
		/*
		System.out.println(trabajador2.getDatos());
		System.out.println(trabajador3.getDatos());
		System.out.println(trabajador4.getDatos());
		*/
	}

}

class Empleados {

	public Empleados(String nom) {
		nombre = nom;
		seccion = "Administración";
		id = idSiguiente;
		idSiguiente++;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	

	public String getDatos() {
		return "El nombre es " + nombre + " y la seccion es " + seccion + " y el Id = " + id;
	}

	public static String getIdSiguiente() {
		return "El IdSiguiente es: " + idSiguiente;
	}

	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente = 1;
}