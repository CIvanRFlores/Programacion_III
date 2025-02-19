package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class VentanaCalculadora extends JFrame 
{
	Color cremita = new Color(214, 191, 147);
	Color vino = new Color(83 ,39 ,40);
	Font boton = new Font("Arial", Font.BOLD, 34);
	
	public VentanaCalculadora (String tittle)
	{
		
		this.setTitle(tittle);
		this.setVisible(true);
		this.setSize(400, 600);
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Que pasa cuando cierro mi aplicacion
		this.setLocationRelativeTo(null);	//Sobre que elemento colocare mi item
		
		this.add(calculadora());
		
		this.repaint();
	}
	
	public JPanel calculadora()
	{
		//Fondo de la calculadora
		JPanel wallaper = new JPanel();
		wallaper.setBounds(0, 0, 400, 600);
		wallaper.setOpaque(true);
		wallaper.setBackground(cremita);
		wallaper.setLayout(null);
		
		//Etiqueta superior donde apareceran los numeros y resultados
		JLabel pantalla = new JLabel("192.10");
		pantalla.setBounds(20, 20, 344, 100);
		pantalla.setFont(new Font("Arial", Font.BOLD, 44));
		pantalla.setOpaque(true);
		pantalla.setBackground(new Color(206, 208, 186));
		pantalla.setBorder(new LineBorder(Color.BLACK, 3));		
		wallaper.add(pantalla);
		
		JButton clear = new JButton("C");
		clear.setBounds(290, 145, 70,50);
		clear.setFont(boton);
		clear.setForeground(Color.WHITE);
		clear.setBackground(vino);
		wallaper.add(clear);
		
		wallaper.add(botones());	//Se agregaron los botones como metodo externo para una mejor organizacion
		
		return wallaper;
	}
	
	public JPanel botones()
	{
		//Panel para agregar botones
		JPanel botones = new JPanel();
		botones.setBounds(20, 215, 344, 325);
		botones.setOpaque(true);
		botones.setBackground(cremita);
		
		//Botones
		botones.setLayout(new GridLayout(4, 4, 15, 15));	//Se define el GridLayout con la cantidad de filas, columnas y la separacion entre botones
		JButton boton1 = new JButton("1");	//Se define cada boton con sus propiedades
		boton1.setFont(boton);
		boton1.setForeground(Color.WHITE);
		boton1.setBackground(vino);
		botones.add(boton1);	//Se agrega el boton dentro del panel de botones siguiendo la estructura del GridLayout
		JButton boton2 = new JButton("2");
		boton2.setFont(boton);
		boton2.setForeground(Color.WHITE);
		boton2.setBackground(vino);
		botones.add(boton2);
		JButton boton3 = new JButton("3");
		boton3.setFont(boton);
		boton3.setForeground(Color.WHITE);
		boton3.setBackground(vino);
		botones.add(boton3);
		JButton boton4 = new JButton("*");
		boton4.setFont(boton);
		boton4.setForeground(Color.WHITE);
		boton4.setBackground(vino);
		botones.add(boton4);
		JButton boton5 = new JButton("4");
		boton5.setFont(boton);
		boton5.setForeground(Color.WHITE);
		boton5.setBackground(vino);
		botones.add(boton5);
		JButton boton6 = new JButton("5");
		boton6.setFont(boton);
		boton6.setForeground(Color.WHITE);
		boton6.setBackground(vino);
		botones.add(boton6);
		JButton boton7 = new JButton("6");
		boton7.setFont(boton);
		boton7.setForeground(Color.WHITE);
		boton7.setBackground(vino);
		botones.add(boton7);
		JButton boton8 = new JButton("/");
		boton8.setFont(boton);
		boton8.setForeground(Color.WHITE);
		boton8.setBackground(vino);
		botones.add(boton8);
		JButton boton9 = new JButton("7");
		boton9.setFont(boton);
		boton9.setForeground(Color.WHITE);
		boton9.setBackground(vino);
		botones.add(boton9);
		JButton boton10 = new JButton("8");
		boton10.setFont(boton);
		boton10.setForeground(Color.WHITE);
		boton10.setBackground(vino);
		botones.add(boton10);
		JButton boton11 = new JButton("9");
		boton11.setFont(boton);
		boton11.setForeground(Color.WHITE);
		boton11.setBackground(vino);
		botones.add(boton11);
		JButton boton12 = new JButton("-");
		boton12.setFont(boton);
		boton12.setForeground(Color.WHITE);
		boton12.setBackground(vino);
		botones.add(boton12);
		JButton boton13 = new JButton(".");
		boton13.setFont(boton);
		boton13.setForeground(Color.WHITE);
		boton13.setBackground(vino);
		botones.add(boton13);
		JButton boton14 = new JButton("0");
		boton14.setFont(boton);
		boton14.setForeground(Color.WHITE);
		boton14.setBackground(vino);
		botones.add(boton14);
		JButton boton15 = new JButton("=");
		boton15.setFont(boton);
		boton15.setForeground(Color.WHITE);
		boton15.setBackground(vino);
		botones.add(boton15);
		JButton boton16 = new JButton("+");
		boton16.setFont(boton);
		boton16.setForeground(Color.WHITE);
		boton16.setBackground(vino);
		botones.add(boton16);
				
		return botones;
	}
}
