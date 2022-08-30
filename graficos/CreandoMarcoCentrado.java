package graficos;

import java.awt.Toolkit;

import javax.swing.*;
import java.awt.*;


public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado miMarco = new MarcoCentrado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamanyoPantalla = miPantalla.getScreenSize();
		int alturaPantalla = tamanyoPantalla.height;
		int anchoPantalla = tamanyoPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
		setTitle("marcoCentrado");
		Image miIcono = miPantalla.getImage("src/graficos/icono.png");
		setIconImage(miIcono);
	}
	
}