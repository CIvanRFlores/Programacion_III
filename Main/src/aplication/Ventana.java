package aplication;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame 
{	
	Font label = new Font("Italic", Font.ITALIC, 22);
	Font txtBox = new Font("Plain", Font.PLAIN, 30);
	Color grisOscuro = new Color(48, 38, 28);
	Color verdeAzulado = new Color(54, 84, 79);
	Color grisClaro = new Color(204, 204, 204);
	LineBorder bordeado = new LineBorder(Color.BLACK, 3);	//Se crea un tipo de bordeado
	
	public Ventana (String tittle)
	{
		
		this.setTitle(tittle);
		this.setVisible(true);
		this.setSize(1024, 720);
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Que pasa cuando cierro mi aplicacion
		this.setLocationRelativeTo(null);	//Sobre que elemento colocare mi item
		
//		this.add(login());	//Llamamos al metodo para invocar el panel.
		this.add(registro());
		
		this.repaint();
	}
	
	public JPanel login()	//Metodo que crea el panel de logueo
	{	
		//Paneles
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
		
		//Etiquetas de texto
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
	
	public JPanel registro()
	{
		//Paneles
		JPanel fondoRegistro = new JPanel();
		fondoRegistro.setBounds(0, 0, 1024, 720);
		fondoRegistro.setOpaque(true);
		fondoRegistro.setBackground(new Color(41, 44, 55));
		fondoRegistro.setLayout(null);
		
		JPanel registro = new JPanel();
		registro.setBounds(177, 0, 670, 720);
		registro.setOpaque(true);
		registro.setBackground(new Color(177, 22, 35));
		registro.setLayout(null);
		fondoRegistro.add(registro);
		
		//Etiquetas de texto
		JLabel Registrarse = new JLabel("REGISTRO");
		Registrarse.setBounds(179, 0, 312, 100);
		Registrarse.setForeground(Color.WHITE);
		Registrarse.setFont(new Font("Roman Baseline", Font.ROMAN_BASELINE, 60));
		registro.add(Registrarse);
		
		JLabel ingresaUsuario = new JLabel("Nombre de usuario*");
		ingresaUsuario.setBounds(20, 95, 260, 45);
		ingresaUsuario.setForeground(Color.WHITE);
		ingresaUsuario.setFont(label);
		registro.add(ingresaUsuario);
		
		JLabel ingresaContraseña = new JLabel("Contraseña*");
		ingresaContraseña.setBounds(20, 200, 240, 45);
		ingresaContraseña.setForeground(Color.WHITE);
		ingresaContraseña.setFont(label);
		registro.add(ingresaContraseña);
		
		JLabel biografia = new JLabel("Biografia*");
		biografia.setBounds(284, 305, 99, 45);
		biografia.setForeground(Color.WHITE);
		biografia.setFont(label);
		registro.add(biografia);
		
		JLabel pref = new JLabel("Peferencias*");
		pref.setBounds(20, 445, 140, 45);
		pref.setForeground(Color.WHITE);
		pref.setFont(label);
		registro.add(pref);
		
		JLabel contactaSoporte = new JLabel("¿Nesesitas ayuda? contacta");
		contactaSoporte.setBounds(20, 640 , 250, 45);
		contactaSoporte.setForeground(Color.WHITE);
		contactaSoporte.setFont(new Font("Italic", Font.ITALIC, 19));
		registro.add(contactaSoporte);
		
		//Cajas de texto para capturar informacion
		JTextField usuario = new JTextField();
		usuario.setBounds(20, 140, 480, 48);
		usuario.setForeground(Color.BLACK);
		usuario.setOpaque(true);
		usuario.setBackground(grisClaro);
		usuario.setBorder(bordeado);	//Se utiliza el tipo de bordeado creado
		usuario.setFont(txtBox);
		registro.add(usuario);
		
		JPasswordField contraseña = new JPasswordField();
		contraseña.setBounds(20, 245, 480, 48);
		contraseña.setForeground(Color.BLACK);
		contraseña.setOpaque(true);
		contraseña.setBackground(grisClaro);
		contraseña.setBorder(bordeado);	//Se utiliza el tipo de bordeado creado
		contraseña.setFont(txtBox);
		registro.add(contraseña);
		
		JTextArea bio = new JTextArea();
		bio.setBounds(20, 355, 630, 87);
		bio.setForeground(Color.BLACK);
		bio.setOpaque(true);
		bio.setBackground(grisClaro);
		bio.setBorder(bordeado);	//Se utiliza el tipo de bordeado creado
		bio.setFont(new Font("Plain", Font.PLAIN, 20));
		registro.add(bio);
		
		//Cajas de confirmacion
		JCheckBox notif1 = new JCheckBox("Recibir notificaciones de estado");
		notif1.setBounds(20, 475, 320, 45);
		notif1.setOpaque(false);
		notif1.setForeground(Color.WHITE);
		notif1.setFont(new Font("Italic", Font.ITALIC, 20));
		registro.add(notif1);
		
		JCheckBox notif2 = new JCheckBox("Recibir notificaciones de alertas");
		notif2.setBounds(20, 505, 320, 45);
		notif2.setOpaque(false);
		notif2.setForeground(Color.WHITE);
		notif2.setFont(new Font("Italic", Font.ITALIC, 20));
		registro.add(notif2);
		
		JRadioButton aceptar = new JRadioButton("Acepto los terminos y condiciones");	//Primer Radio Button
		aceptar.setBounds(20, 555, 320, 45);
		aceptar.setOpaque(false);
		aceptar.setForeground(Color.WHITE);
		aceptar.setFont(new Font("Italic", Font.ITALIC, 17));
		registro.add(aceptar);
		
		JRadioButton rechazar = new JRadioButton("Rechazo los terminos y condiciones");	//Segundo Radio Button
		rechazar.setBounds(20, 585, 320, 45);
		rechazar.setOpaque(false);
		rechazar.setForeground(Color.WHITE);
		rechazar.setFont(new Font("Italic", Font.ITALIC, 17));
		registro.add(rechazar);
		
		ButtonGroup termYCond = new ButtonGroup();	//Se crea un grupo de Radio Buttons
		termYCond.add(aceptar);	//Se agrega el primer Radio Button
		termYCond.add(rechazar);	//Se agrega el segundo Radio Button
		
		
		//Caja desplegable
		JComboBox <String> ubi = new JComboBox<String>();	//El combo box se establece de tipo String
		ubi.setBounds(400, 490, 250, 45);
		ubi.setForeground(Color.BLACK);
		ubi.setFont(new Font("Plain", Font.PLAIN, 20));
		ubi.setBackground(grisClaro);
		ubi.setBorder(bordeado);	//Se utiliza el tipo de bordeado creado
		ubi.addItem("Seleccione su ubicacion");	//Empieza siendo la primer opcion
		ubi.addItem("Camino Real");	//Segunda opcion
		ubi.addItem("Calafia");	//Tercera opcion
		ubi.addItem("Peninsula Sur");	//Cuarta opcion
		ubi.addItem("Valle del mezquite");	//Quinta opcion
		ubi.setSelectedItem(1);	//Se selecciona en la caja la primer opcion por default
		registro.add(ubi);
		
		//Boton de confirmacion
		JButton confirmar = new JButton("Registrarse");
		confirmar.setBounds(420, 604, 240, 70);
		confirmar.setForeground(Color.BLACK);
		confirmar.setFont(new Font("Italic", Font.ITALIC, 40));
		confirmar.setOpaque(true);
		confirmar.setBackground(grisClaro);
		confirmar.setBorderPainted(true);
		confirmar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));	//Se establece un color y grosor de borde
		registro.add(confirmar);
		
		JButton soporteTecnico = new JButton("Soporte Tecnico");
		soporteTecnico.setBounds(262, 647 , 150, 30);
		soporteTecnico.setForeground(Color.BLACK);
		soporteTecnico.setFont(new Font("Italic", Font.ITALIC, 19));
		soporteTecnico.setOpaque(false);
		soporteTecnico.setBackground(new Color(54, 84, 79));
		soporteTecnico.setBorder(null);
		registro.add(soporteTecnico);
				
		return fondoRegistro;
	}
}
