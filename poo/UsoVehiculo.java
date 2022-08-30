package poo;

import javax.swing.*;

public class UsoVehiculo {

	public static void main(String[] args) {
		
		Coche miCoche1 = new Coche();
		miCoche1.setColor("Azul");
		
		Furgoneta miFurgo1 = new Furgoneta(7, 580);
		miFurgo1.setColor("Verde");
		miFurgo1.setAsientos("Si");
		miFurgo1.setClimatizador("Si");
		
		System.out.println(miCoche1.getDatos() + " " + miCoche1.getColor() + ".");
		System.out.println(miFurgo1.getDatos() + " " + miFurgo1.getDatosFurgoneta() + " " + miFurgo1.getColor());
		
		
		
		
		/*
		Coche miCoche = new Coche();
		miCoche.setColor(JOptionPane.showInputDialog("Introduce color deseado"));
		System.out.println(miCoche.getDatos());
		System.out.println(miCoche.getColor());
		miCoche.setAsientos(JOptionPane.showInputDialog("¿Desea que tenga asientos de cuero?"));
		miCoche.setClimatizador(JOptionPane.showInputDialog("¿Desea que tenga climatizador?"));
		System.out.println(miCoche.getAsientos());
		System.out.println(miCoche.getClimatizador());
		System.out.println(miCoche.pesoTotalCoche());
		System.out.println("El precio total del coche es de " + miCoche.precioCoche() + " euros");
		*/
	}
}
