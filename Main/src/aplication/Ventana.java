package aplication;

import java.awt.Color;
import java.awt.color.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame 
{
	public Ventana (String title)
	{
		this.setTitle(title);
		this.setVisible(true);
		this.setSize(1024, 720);
		this.setResizable(true);
		this.setLayout(null);
		
		//Que pasa cuando cierro mi aplicacion
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Sobre que elemento colocare mi item
		this.setLocationRelativeTo(null);
		
		JLabel etiqueta1 = new JLabel("Bienvenido");
		
		etiqueta1.setSize(70, 50);
		etiqueta1.setLocation(490, 5);
		
		//Es nesesario volver opaco el fondo del boton, viene invisible por defecto
		etiqueta1.setOpaque(true);
		etiqueta1.setBackground(Color.BLUE);
		
		this.add(etiqueta1);
	}
}
