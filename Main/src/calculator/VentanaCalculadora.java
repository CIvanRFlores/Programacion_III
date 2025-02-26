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
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//QUE PASA CUANDO CIERRO MI APLICACION
		this.setLocationRelativeTo(null);	//SOBRE QUE ELEMENTOS COLOCARE MIS ITEMS
		
		this.add(calculadora());
		
		this.repaint();
		this.revalidate();
	}
	
	public JPanel calculadora()
	{
		//FONDO DE LA CALCULADORA
		JPanel wallaper = new JPanel();
		wallaper.setBounds(0, 0, 400, 600);
		wallaper.setOpaque(true);
		wallaper.setBackground(cremita);
		wallaper.setLayout(null);
		
		//ETIQUETA SUPERIOR DONDE APARECERAN LOS NUMEROS Y RESULTADOS
		JLabel pantalla = new JLabel("192.10");
		pantalla.setBounds(20, 35, 344, 70);
		pantalla.setFont(new Font("Arial", Font.BOLD, 44));
		pantalla.setOpaque(true);
		pantalla.setBackground(new Color(206, 208, 186));
		pantalla.setBorder(new LineBorder(Color.BLACK, 5, true));
		wallaper.add(pantalla);
		
		wallaper.add(botones());	//SE AGREGARON LOS BOTONES COMO METODO EXTERNO PARA UNA MEJOR ORGANIZACION
		wallaper.add(botonesSup());
		
		return wallaper;
	}
	
	public JPanel botones()
	{
		//PANEL PARA AGREGAR BOTONES
		JPanel botones = new JPanel();
		botones.setBounds(20, 215, 344, 325);
		botones.setOpaque(true);
		botones.setBackground(cremita);
		
		//BOTONES INFERIORES
		botones.setLayout(new GridLayout(4, 4, 15, 15));	//SE DEFINE EL GRIDLAYOUT CON LA CANTIDAD DE FILAS, COLUMNAS Y LA SEPARACION ENTRE BOTONES
		
		JButton boton1 = new JButton("1");	//SE DEFINE CADA BOTON CON SUS PROPIEDADES
		boton1.setFont(boton);
		boton1.setForeground(Color.WHITE);
		boton1.setBackground(vino);
		boton1.setBorder(new LineBorder(Color.WHITE, 5, true));
		botones.add(boton1);	//SE AGREGA EL BOTON DENTRO DEL PANEL DE BOTONES SIGUIENDO LA ESTRUCTURA DEL GRIDLAYOUT
		JButton boton2 = new JButton("2");
		boton2.setFont(boton);
		boton2.setForeground(Color.WHITE);
		boton2.setBackground(vino);
		boton2.setBorder(new LineBorder(Color.WHITE, 5, true));
		botones.add(boton2);
		JButton boton3 = new JButton("3");
		boton3.setFont(boton);
		boton3.setForeground(Color.WHITE);
		boton3.setBackground(vino);
		boton3.setBorder(new LineBorder(Color.WHITE, 5, true));
		botones.add(boton3);
		JButton boton4 = new JButton("*");
		boton4.setFont(boton);
		boton4.setForeground(Color.WHITE);
		boton4.setBackground(vino);
		boton4.setBorder(new LineBorder(Color.WHITE, 5, true));
		botones.add(boton4);
		JButton boton5 = new JButton("4");
		boton5.setFont(boton);
		boton5.setForeground(Color.WHITE);
		boton5.setBackground(vino);
		boton5.setBorder(new LineBorder(Color.WHITE, 5, true));
		botones.add(boton5);
		JButton boton6 = new JButton("5");
		boton6.setFont(boton);
		boton6.setForeground(Color.WHITE);
		boton6.setBackground(vino);
		boton6.setBorder(new LineBorder(Color.WHITE, 5, true));
		botones.add(boton6);
		JButton boton7 = new JButton("6");
		boton7.setFont(boton);
		boton7.setForeground(Color.WHITE);
		boton7.setBackground(vino);
		boton7.setBorder(new LineBorder(Color.WHITE, 5, true));
		botones.add(boton7);
		JButton boton8 = new JButton("/");
		boton8.setFont(boton);
		boton8.setForeground(Color.WHITE);
		boton8.setBackground(vino);
		boton8.setBorder(new LineBorder(Color.WHITE, 5, true));
		botones.add(boton8);
		JButton boton9 = new JButton("7");
		boton9.setFont(boton);
		boton9.setForeground(Color.WHITE);
		boton9.setBackground(vino);
		boton9.setBorder(new LineBorder(Color.WHITE, 5, true));
		botones.add(boton9);
		JButton boton10 = new JButton("8");
		boton10.setFont(boton);
		boton10.setForeground(Color.WHITE);
		boton10.setBackground(vino);
		boton10.setBorder(new LineBorder(Color.WHITE, 5, true));
		botones.add(boton10);
		JButton boton11 = new JButton("9");
		boton11.setFont(boton);
		boton11.setForeground(Color.WHITE);
		boton11.setBackground(vino);
		boton11.setBorder(new LineBorder(Color.WHITE, 5, true));
		botones.add(boton11);
		JButton boton12 = new JButton("-");
		boton12.setFont(boton);
		boton12.setForeground(Color.WHITE);
		boton12.setBackground(vino);
		boton12.setBorder(new LineBorder(Color.WHITE, 5, true));
		botones.add(boton12);
		JButton boton13 = new JButton(".");
		boton13.setFont(boton);
		boton13.setForeground(Color.WHITE);
		boton13.setBackground(vino);
		boton13.setBorder(new LineBorder(Color.WHITE, 5, true));
		botones.add(boton13);
		JButton boton14 = new JButton("0");
		boton14.setFont(boton);
		boton14.setForeground(Color.WHITE);
		boton14.setBackground(vino);
		boton14.setBorder(new LineBorder(Color.WHITE, 5, true));
		botones.add(boton14);
		JButton boton15 = new JButton("=");
		boton15.setFont(boton);
		boton15.setForeground(Color.WHITE);
		boton15.setBackground(vino);
		boton15.setBorder(new LineBorder(Color.WHITE, 5, true));
		botones.add(boton15);
		JButton boton16 = new JButton("+");
		boton16.setFont(boton);
		boton16.setForeground(Color.WHITE);
		boton16.setBackground(vino);
		boton16.setBorder(new LineBorder(Color.WHITE, 5, true));
		botones.add(boton16);
		
		return botones;
	}
	
	public JPanel botonesSup()
	{
		//SUBPANEL PARA AGREGAR BOTONES
		JPanel botonesSup = new JPanel();
		botonesSup.setBounds(20, 130, 344, 50);
		botonesSup.setOpaque(false);
		botonesSup.setBackground(cremita);
		
		//BOTONES SUPERIORES
		botonesSup.setLayout(new GridLayout(1, 2, 15, 15));
		
		JButton mc = new JButton("MC");		
		mc.setFont(boton);
		mc.setForeground(Color.WHITE);
		mc.setBackground(vino);
		mc.setBorder(new LineBorder(Color.WHITE, 5, true));
		botonesSup.add(mc);
		JButton mPlus = new JButton("M+");		
		mPlus.setFont(boton);
		mPlus.setForeground(Color.WHITE);
		mPlus.setBackground(vino);
		mPlus.setBorder(new LineBorder(Color.WHITE, 5, true));
		botonesSup.add(mPlus);		
		
		return botonesSup;
	}
}
