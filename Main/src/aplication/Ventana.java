package aplication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.color.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame 
{
	Font etiquetas = new Font("Ajua", Font.PLAIN, 26);	//Podemos definir un Font (Fuente de letra)
	
	public Ventana (String title)
	{
		
		this.setTitle(title);
		this.setVisible(true);
		this.setSize(1024, 720);
		this.setResizable(true);
		this.setLayout(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Que pasa cuando cierro mi aplicacion
		
		this.setLocationRelativeTo(null);	//Sobre que elemento colocare mi item
		
		this.setMinimumSize(new Dimension(400, 400));	//Definir tamaño minimo de la ventana
		
		JPanel login = new JPanel();	//Se invoca un panel
		login.setBounds(0,  0, 1024, 720);
		login.setOpaque(true);
		login.setBackground(Color.DARK_GRAY);	//Se puede personalizar el color con RGB o HEX
		login.setVisible(true);
		login.setLayout(null);	//Permite manejar de forma directa las etiquetas, en este caso su ubicacion
		
		this.add(login);
		this.repaint();
		
		JLabel etiqueta1 = new JLabel("Menu de prueba");
//		etiqueta1.setLocation(490, 5);
//		etiqueta1.setSize(70, 50);
		etiqueta1.setBounds(390, 5, 245, 50);	//Bounds es util para combinar la ubicacion y tamaño de una etiqueta (insertandolos en ese orden)
		etiqueta1.setOpaque(true);	//Es nesesario volver opaco el fondo del boton, viene invisible por defecto
		etiqueta1.setBackground(new Color(147, 147, 147));
		etiqueta1.setFont(new Font("Hola mundo", Font.ITALIC, 32));	//Podemos establecr directamente un font a la etiqueta
		login.add(etiqueta1);	//Se puede insertar las etiquetas
		
		JLabel etiqueta2 = new JLabel("probando 1 2 1 2");
//		etiqueta2.setLocation(512, 60);
//		etiqueta2.setSize(180, 45);
		etiqueta2.setBounds(405, 60, 215, 45);
		etiqueta2.setOpaque(true);
		etiqueta2.setBackground(new Color(147, 147, 147));
		etiqueta2.setFont(etiquetas);	//Podemos utilizar un font ya establecido
		login.add(etiqueta2);
		
	}
	
	public JPanel loign()
	{
		
		
		return null;
	}
}
