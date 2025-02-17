package aplication;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.color.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame 
{	
	Font label = new Font("Italic", Font.ITALIC, 28);
	Font txtBox = new Font("Plain", Font.PLAIN, 30);
	Color grisOscuro = new Color(48, 38, 28);
	Color verdeAzulado = new Color(54, 84, 79);
	
	public Ventana (String tittle)
	{
		
		this.setTitle(tittle);
		this.setVisible(true);
		this.setSize(1024, 720);
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Que pasa cuando cierro mi aplicacion
		this.setLocationRelativeTo(null);	//Sobre que elemento colocare mi item
		
		this.add(login());	//Llamamos al metodo para invocar el panel.
		
		this.repaint();
	}
	
	public JPanel login()	//Metodo que crea el panel de logueo
	{		
		JPanel fondoLogin = new JPanel();	//Fondo del login
		fondoLogin.setBounds(0, 0, 1024, 720);
		fondoLogin.setOpaque(true);
		fondoLogin.setBackground(grisOscuro);
		fondoLogin.setLayout(null);
		
		JPanel login = new JPanel();	//Panel del login
		login.setBounds(177, 0, 670, 720);	//Bounds es util para combinar la ubicacion y tamaño de una etiqueta (insertandolos en ese orden)
		login.setOpaque(true);
		login.setBackground(new Color(31, 95, 97));	//Se puede personalizar el color con RGB o HEX
		login.setLayout(null);	//Permite manejar de forma directa los componentes, en este caso su ubicacion
		fondoLogin.add(login);	//Se añade el panel a la pantalla
		
		//Etiquetas guia
		JLabel iniciaSesion = new JLabel("INICIAR SESIÓN");
		iniciaSesion.setBounds(100, 23, 470, 100);
		iniciaSesion.setForeground(Color.WHITE);
		iniciaSesion.setFont(new Font("Roman Baseline", Font.ROMAN_BASELINE, 60));	//Podemos establecr directamente un font a la etiqueta
		login.add(iniciaSesion);
		
		JLabel ingresaUsuario = new JLabel("Nombre de usuario*");
		ingresaUsuario.setBounds(20, 160, 260, 45);
		ingresaUsuario.setForeground(Color.WHITE);
		ingresaUsuario.setFont(label);
		
		login.add(ingresaUsuario);
		
		JLabel ingresaContraseña = new JLabel("Contraseña*");
		ingresaContraseña.setBounds(20, 320, 240, 45);
		ingresaContraseña.setForeground(Color.WHITE);
		ingresaContraseña.setFont(label);
		login.add(ingresaContraseña);
		
		JLabel contactaSoporte = new JLabel("¿Nesesitas ayuda? contacta");
		contactaSoporte.setBounds(20, 640 , 250, 45);
		contactaSoporte.setForeground(Color.WHITE);
		contactaSoporte.setFont(new Font("Italic", Font.ITALIC, 19));
		login.add(contactaSoporte);
		
		//Cajas de texto para capturar informacion
		JTextField usuario = new JTextField();
		usuario.setBounds(20, 240, 480, 48);
		usuario.setForeground(Color.WHITE);
		usuario.setOpaque(true);
		usuario.setBackground(verdeAzulado);
		usuario.setFont(txtBox);;
		login.add(usuario);
		
		JPasswordField contraseña = new JPasswordField();
		contraseña.setBounds(20, 400, 480, 48);
		contraseña.setForeground(Color.WHITE);
		contraseña.setOpaque(true);
		contraseña.setBackground(verdeAzulado);
		contraseña.setFont(txtBox);;
		login.add(contraseña);
		
		//Caja de confirmacion
		JCheckBox guardarContraseña = new JCheckBox("Recordar");
		guardarContraseña.setBounds(20, 470, 240, 54);
		guardarContraseña.setOpaque(false);
		guardarContraseña.setForeground(Color.WHITE);
		guardarContraseña.setFont(new Font("Italic", Font.ITALIC, 20));
		login.add(guardarContraseña);
		
		//Boton de confirmacion
		JButton confirmar = new JButton("Confirmar");
		confirmar.setBounds(260, 490, 240, 70);
		confirmar.setForeground(Color.WHITE);
		confirmar.setFont(new Font("Italic", Font.ITALIC, 40));
		confirmar.setOpaque(true);
		confirmar.setBackground(verdeAzulado);
		login.add(confirmar);
		
		JButton olvidoContraseña = new JButton("¿Olvidaste tu contraseña?");
		olvidoContraseña.setBounds(248, 570, 268, 30);
		olvidoContraseña.setForeground(grisOscuro);
		olvidoContraseña.setFont(new Font("Italic", Font.ROMAN_BASELINE, 20));
		olvidoContraseña.setOpaque(false);
		olvidoContraseña.setBackground(new Color(54, 84, 79));
		olvidoContraseña.setBorder(null);
		login.add(olvidoContraseña);
		
		JButton soporteTecnico = new JButton("Soporte Tecnico");
		soporteTecnico.setBounds(262, 647 , 150, 30);
		soporteTecnico.setForeground(grisOscuro);
		soporteTecnico.setFont(new Font("Italic", Font.ITALIC, 19));
		soporteTecnico.setOpaque(false);
		soporteTecnico.setBackground(new Color(54, 84, 79));
		soporteTecnico.setBorder(null);
		login.add(soporteTecnico);
				
		return fondoLogin;
	}
}
