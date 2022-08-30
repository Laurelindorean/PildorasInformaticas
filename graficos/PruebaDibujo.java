package graficos;

import java.awt.*;
import javax.swing.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConDibujos  miMarco = new MarcoConDibujos();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoConDibujos extends JFrame {

	public MarcoConDibujos() {
		
		setTitle("prueba de Dibujo");
		setSize(400, 400);
		LaminaConFiguras miLamina = new LaminaConFiguras();
		add(miLamina);
	}

}

class LaminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		//g.drawRect(50, 50, 200, 200); //para dibujar un cuadrado
		//g.drawLine(100, 100, 300, 200); //para dibujar una linea
		g.drawArc(50, 100, 100, 200, 120, 150); //para dibujar un arco
		
	}
	
	
}