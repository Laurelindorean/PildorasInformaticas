package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reloj miReloj = new Reloj(); //Al quitar las variables y el constructor, tenemos que pasar los parametros en el metodo
		miReloj.enMarcha(3000, true);
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
		System.exit(0);

	}

}

class Reloj {

	//al convertir las variables de clase en parametros de entrada en el metodo enMarcha, no tiene sentido tener el constructor
	/*public Reloj(int intervalo, boolean sonido) {

		this.intervalo = intervalo;
		this.sonido = sonido;

	}*/

	public void enMarcha(int intervalo, final boolean sonido) { //convertimos en constante "final" el parametro sonido, porque se utiliza en la clase interna local

		class DameLaHora2 implements ActionListener { // clase interna local

			public void actionPerformed(ActionEvent evento) {

				Date ahora = new Date();
				System.out.println("Te pongo la hora cada 3 segundos " + ahora);

				if (sonido) {

					Toolkit.getDefaultToolkit().beep();
				}
			}
		}

		ActionListener oyente = new DameLaHora2();
		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();

	}


}