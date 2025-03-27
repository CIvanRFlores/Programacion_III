package aplication;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame 
{	
	Font label = new Font("Arial", Font.BOLD, 22);	//FUENTE DE LETRA PERSONALIZADO
	Font txtBox = new Font("SansSeriff", Font.PLAIN, 30);	//FUENTE DE LETRA PERSONALIZADO
	Color verdeAzulado = new Color(54, 84, 79);	//COLOR PERSONALIZADO
	Color grisBajo = new Color(77, 77, 77);	//COLOR PERSONALIZADO
	LineBorder bordeado = new LineBorder(Color.BLACK, 3);	//SE CREA UN TIPO DE BORDEADO
	Border redondo = BorderFactory.createLineBorder(Color.WHITE, 4, true);	//TIPO DE BORDEADO PARA REDONDEAR
	ImageIcon etiquetas = new ImageIcon("etiquetas.jpg");	//iMAGEN DE FONDO PARA CAMPOS
	
	public Ventana (String tittle)
	{
		
		this.setTitle(tittle);
		this.setVisible(true);
		this.setSize(1024, 740);
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//QUE PASA CUANDO CIERRO MI APLICACION
		this.setLocationRelativeTo(null);	//SOBRE QUE ELEMENTOS COLOCARE MI ITEM
		
//		this.add(login());	//LLAMAMOS AL METODO APRA INVOCAR EL PANEL
//		this.add(registro());
//		this.add(consultar());
		this.add(aleatorio());
		
		this.repaint();
		this.revalidate();
		
		//BARRA DEL MENU
		JMenuBar barra = new JMenuBar();	//BARRA DEL MENU
		
		//OPCIONES DEL MENU
		JMenu menu1 = new JMenu("Cuenta");	//OPCION DEL MENU
		
		//ITEMS DEL MENU
		JMenuItem op_Login = new JMenuItem("Iniciar sesion");
		
		op_Login.addActionListener(new ActionListener() {	//ACCION PARA CAMBIAR ENTRE PANELES / VENTANAS

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				goTo("login");	
			}
		});
		
		JMenuItem op_Registro = new JMenuItem("Registrarse");
		
		op_Registro.addActionListener(new ActionListener() {	//ACCION PARA CAMBIAR ENTRE PANELES / VENTANAS

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				goTo("registro");	
			}
		});
		
		JMenuItem op_RecupCuenta = new JMenuItem("Recuperar cuenta");
		
		op_RecupCuenta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				goTo("recuperarCuenta");
			}
			
		});
		
		//SE AÑADEN LOS ITEMS AL MENU
		menu1.add(op_Login);
		menu1.add(op_Registro);
		menu1.add(op_RecupCuenta);
		
		//OPCIONES DEL MENU
		JMenu menu2 = new JMenu("Usuarios");
		
		//ITEMS DEL MENU
		JMenuItem op_Alta = new JMenuItem("Alta");
		
		op_Alta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				goTo("altaUsuarios");
			}
			
		});
		
		JMenuItem op_Baja = new JMenuItem("Baja");
		
		op_Baja.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				goTo("bajaUsuarios");
			}
			
		});
		
		JMenuItem op_Consultar = new JMenuItem("Consultar");
		
		op_Consultar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				goTo("consultar");
			}
			
		});
	
		//SE AÑADEN LOS ITEMS AL MENU
		menu2.add(op_Alta);
		menu2.add(op_Baja);
		menu2.add(op_Consultar);
		
		//OPCIONES DEL MENU
		JMenu menu3 = new JMenu("Ayuda");
		
		//ITEMS DEL MENU
		JMenuItem op_CrearUsuario = new JMenuItem("¿Como crear un usuario?");
		
		op_CrearUsuario.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				goTo("comoCrearUsuario");
			}
			
		});
		
		JMenuItem op_AccederSistema = new JMenuItem("¿Como acceder al sistema?");
		
		op_AccederSistema.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				goTo("comoAccederSistema");
			}
			
		});
		
		JMenuItem op_OlvidoContraseña = new JMenuItem("¿Que pasa si olvide mi contraseña?");
		
		op_OlvidoContraseña.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				goTo("comoRecuperarContraseña");
			}
			
		});
		
		//SE AÑADEN LOS ITEMS AL MENU
		menu3.add(op_CrearUsuario);
		menu3.add(op_AccederSistema);
		menu3.add(op_OlvidoContraseña);
		
		//SE AÑADEN LAS OPCIONES A LA BARRA
		barra.add(menu1);
		barra.add(menu2);
		barra.add(menu3);
		
		//SE INVOCA LA BARRA EN LA VENTANA
		this.setJMenuBar(barra);
		
		//AGREGAR UN ICONO A LA VENTANA
		ImageIcon icono = new ImageIcon("iconoVentana.png");	//SE CREA UN NUEVO IMAGEICON CON LA DIRECICON DE LA IMAGEN A UTILIZAR
		this.setIconImage(icono.getImage());	//SE ESTABLECE EL ICONO DE LA VENTANA CON EL IMAGEICON CREADO
		
		this.repaint();
		this.revalidate();
	}
	
	public JPanel login()	//METODO QUE CREA EL PANEL DE LOGEO
	{	
		//PANELES
		JPanel fondoLogin = new JPanel();	//FONDO DEL LOGIN
		fondoLogin.setBounds(0, 0, 1024, 720);
		fondoLogin.setOpaque(true);
		fondoLogin.setLayout(null);
		
		JPanel login = new JPanel();	//PANEL DEL LOGIN
		login.setBounds(177, 0, 670, 720);	//BOUNDS ES UTIL PARA COMBINAR LA UBICACION Y TAMAÑO DE UNA ETIQUETA (INSERTANDOLOS EN ESE ORDEN)
		login.setOpaque(true);
		login.setLayout(null);	//PERMITE MANEJAR DE FORMA DIRECTA LOS COMPONENTES, EN ESTE CASO SU UBICACION
		fondoLogin.add(login);	//SE AÑADE EL PANEL A LA PANTALLA
		
		//ETIQUETAS DE TEXTO
		JLabel iniciaSesion = new JLabel("INICIAR SESIÓN");
		iniciaSesion.setBounds(100, 23, 470, 100);
		iniciaSesion.setForeground(Color.WHITE);
		iniciaSesion.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 60));	//PODEMOS ESTABLECER UN FONT DIRECTAMENTE A LA ETIQUETA
		login.add(iniciaSesion);
		
		JLabel ingresaUsuario = new JLabel("Nombre de usuario*");
		ingresaUsuario.setBounds(20, 180, 260, 45);
		ingresaUsuario.setIcon(new ImageIcon("etiqueta"));
		ingresaUsuario.setForeground(Color.WHITE);
		ingresaUsuario.setFont(label);
		login.add(ingresaUsuario);
		
		JLabel ingresaContraseña = new JLabel("Contraseña*");
		ingresaContraseña.setBounds(20, 340, 260, 45);
		ingresaContraseña.setForeground(Color.WHITE);
		ingresaContraseña.setFont(label);
		login.add(ingresaContraseña);
		
		JLabel contactaSoporte = new JLabel("¿Nesesitas ayuda? contacta");
		contactaSoporte.setBounds(20, 640 , 250, 45);
		contactaSoporte.setForeground(Color.WHITE);
		contactaSoporte.setFont(new Font("Italic", Font.ITALIC, 19));
		login.add(contactaSoporte);
		
		//CAJAS DE TEXTO PARA CAPTURAR INFORMACION
		
		//ELEMENTOS PARA CAMPO DE USUARIO
		JTextField usuario = new JTextField();
		usuario.setBounds(21, 240, 480, 48);
		usuario.setForeground(Color.WHITE);
		usuario.setBorder(redondo);
		usuario.setOpaque(false);
		usuario.setFont(txtBox);
		login.add(usuario);
		
		JLabel fondoUsuario = new JLabel(etiquetas);
		fondoUsuario.setBounds(20, 240, 480, 48);
		fondoUsuario.setOpaque(true);
		fondoUsuario.setBorder(null);
		login.add(fondoUsuario);
		
		JLabel iconoUsuario = new JLabel(new ImageIcon("usuario.png"));
		iconoUsuario.setBounds(511, 240, 48, 48);
		iconoUsuario.setOpaque(false);
		login.add(iconoUsuario);
		
		//ELEMENTOS PARA CAMPO DE CONTRASEÑA
		JPasswordField contraseña = new JPasswordField();
		contraseña.setBounds(20, 400, 480, 48);
		contraseña.setForeground(Color.WHITE);
		contraseña.setBorder(redondo);
		contraseña.setOpaque(false);
		contraseña.setFont(txtBox);
		login.add(contraseña);
		
		JLabel fondoContraseña = new JLabel(etiquetas);
		fondoContraseña.setBounds(20, 400, 480, 48);
		fondoContraseña.setBorder(null);
		login.add(fondoContraseña);
		
		JLabel iconoContra = new JLabel(new ImageIcon("contra.png"));
		iconoContra.setBounds(511, 400, 58, 58);
		iconoContra.setOpaque(false);
		login.add(iconoContra);
		
		//CAJA DE CONFIRMACION
		JCheckBox guardarContraseña = new JCheckBox("Recordar");
		guardarContraseña.setBounds(20, 470, 240, 54);
		guardarContraseña.setOpaque(false);
		guardarContraseña.setForeground(Color.WHITE);
		guardarContraseña.setFont(new Font("Italic", Font.ITALIC, 20));
		guardarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {	//METODO MOUSE LISTENER PARA CAMBIAR ICONO DEL MOUSE SOBRE UN BOTON
            public void mouseEntered(java.awt.event.MouseEvent e) {
            	guardarContraseña.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            	
            }
            public void mouseExited(java.awt.event.MouseEvent e) {
            	guardarContraseña.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
		});
		login.add(guardarContraseña);
		
		//ELEMENTOS PARA BOTON DE CONFIRMACION
		JButton confirmar = new JButton("Confirmar");
		confirmar.setBounds(260, 490, 240, 70);
		confirmar.setForeground(Color.WHITE);
		confirmar.setBorder(null);
		confirmar.setFont(new Font("Arial", Font.BOLD, 40));
		confirmar.setOpaque(false);
		confirmar.setBackground(verdeAzulado);
		confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
            	confirmar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            	
            }
            public void mouseExited(java.awt.event.MouseEvent e) {
            	confirmar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
		});
		
		confirmar.addActionListener(new ActionListener() {	//METODO PARA AGREAGR UNA ACCION A UN ELEMENTO

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String cadenaContraseña = new String(contraseña.getPassword());
				
				if(usuario.getText().equals(""))	//-----------------USUARIO VACIO
				{
					usuario.setBorder(new LineBorder(Color.RED, 4, true));
					
					if(cadenaContraseña.equals(""))	//-----------------CONTRASEÑA VACIA
					{
						contraseña.setBorder(new LineBorder(Color.RED, 4, true));
					}
					else	//-----------------------------------------CONTRASEÑA LLENA PERO INCORRECTA
					{
						contraseña.setBorder(new LineBorder(Color.GREEN, 4, true));
					}
				}
				else	//---------------------------------------------USUARIO LLENO
				{
					if(usuario.getText().equals("Christian23"))	//-----USUARIO LLENO Y CORRECTO
					{
						usuario.setBorder(new LineBorder(Color.GREEN, 4, true));
						
						if(cadenaContraseña.equals("delunoalseis"))	//-CONTRASEÑA LLENA Y CORRECTA
						{
							contraseña.setBorder(new LineBorder(Color.GREEN, 4, true));
							JOptionPane.showMessageDialog(null, "Inicio de sesion exitoso", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
						}
						else	//-------------------------------------CONTRASEÑA LLENA PERO INCORRECTA
						{
							contraseña.setBorder(new LineBorder(Color.RED, 4, true));
							JOptionPane.showMessageDialog(null, "Datos incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}
					else	//----------------------------------------USUARIO LLENO PERO INCORRECTO
					{
						usuario.setBorder(new LineBorder(Color.GREEN, 4, true));

						if(cadenaContraseña.equals(""))	//------------CONTRASEÑA VACIA
						{
							contraseña.setBorder(new LineBorder(Color.RED, 4, true));
						}
						else	//------------------------------------CONTRASEÑA LLENA PERO INCORRECTA
						{
							contraseña.setBorder(new LineBorder(Color.GREEN, 4, true));
							JOptionPane.showMessageDialog(null, "Datos incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
			}
			
		});
		
		login.add(confirmar);
		
		JLabel fondoConfirmar = new JLabel(etiquetas);
		fondoConfirmar.setBounds(260, 490, 240, 70);
		fondoConfirmar.setBorder(redondo);
		login.add(fondoConfirmar);
		
		//ELEMENTOS PARA BOTON DE REGISTRO
		JButton registro = new JButton("Registrarse");
		registro.setBounds(520, 635, 145, 40);
		registro.setForeground(Color.WHITE);
		confirmar.setBorder(null);
		registro.setFont(new Font("Arial", Font.BOLD, 20));
		registro.setOpaque(false);
		registro.setBackground(verdeAzulado);
		registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
            	registro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            	
            }
            public void mouseExited(java.awt.event.MouseEvent e) {
            	registro.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
		});
		
		registro.addActionListener(new ActionListener() {	//ACCION PARA CAMBIAR ENTRE PANELES / VENTANAS

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				goTo("registro");	
			}
		});;
		login.add(registro);
		
		JLabel fondoRegistrar = new JLabel(etiquetas);
		fondoRegistrar.setBounds(520, 635, 145, 40);
		fondoRegistrar.setBorder(redondo);
		login.add(fondoRegistrar);
		
		//ELEMENTOS PARA BOTON DE OLVIDO CONTRASEÑA
		JButton olvidoContraseña = new JButton("¿Olvidaste tu contraseña?");
		olvidoContraseña.setBounds(248, 570, 268, 30);
		olvidoContraseña.setForeground(Color.CYAN);
		olvidoContraseña.setFont(new Font("Arial", Font.BOLD, 20));
		olvidoContraseña.setOpaque(false);
		olvidoContraseña.setBackground(new Color(54, 84, 79));
		olvidoContraseña.setBorder(null);
		olvidoContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
            	olvidoContraseña.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            	
            }
            public void mouseExited(java.awt.event.MouseEvent e) {
            	olvidoContraseña.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
		});
		login.add(olvidoContraseña);
		
		//ELEMENTOS PARA BOTON DE SOPORTE TECNICO
		JButton soporteTecnico = new JButton("Soporte Tecnico");
		soporteTecnico.setBounds(262, 647 , 160, 30);
		soporteTecnico.setForeground(Color.CYAN);
		soporteTecnico.setFont(new Font("Arial", Font.BOLD, 19));
		soporteTecnico.setOpaque(false);
		soporteTecnico.setBackground(new Color(54, 84, 79));
		soporteTecnico.setBorder(null);
		soporteTecnico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
            	soporteTecnico.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            	
            }
            public void mouseExited(java.awt.event.MouseEvent e) {
            	soporteTecnico.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
		});
		login.add(soporteTecnico);
		
		//IMAGENES DE FONDO
		JLabel imgFondo = new JLabel(new ImageIcon("fondoLogin.jpg"));
		imgFondo.setBounds(0, 0, 1024, 720);
		fondoLogin.add(imgFondo);
		
		JLabel imgLogin = new JLabel(new ImageIcon("login.jpg"));
		imgLogin.setBounds(0, 0, 670, 720);
		login.add(imgLogin);
				
		return fondoLogin;
	}
	
	public JPanel registro()
	{
		//PANELES
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
		
		//ETIQUETAS DE TEXTO
		JLabel Registrarse = new JLabel("REGISTRO");
		Registrarse.setBounds(179, 0, 312, 100);
		Registrarse.setForeground(Color.WHITE);
		Registrarse.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 60));
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
		biografia.setBounds(284, 305, 110, 45);
		biografia.setForeground(Color.WHITE);
		biografia.setFont(label);
		registro.add(biografia);
		
		JLabel pref = new JLabel("Peferencias*");
		pref.setBounds(20, 445, 140, 45);
		pref.setForeground(Color.WHITE);
		pref.setFont(label);
		registro.add(pref);
		
		JLabel contactaSoporte = new JLabel("¿Ya tienes una cuenta?");
		contactaSoporte.setBounds(20, 630 , 250, 45);
		contactaSoporte.setForeground(Color.WHITE);
		contactaSoporte.setFont(new Font("Italic", Font.ITALIC, 19));
		registro.add(contactaSoporte);
		
		//CAJAS DE TXETO PARA CAPTURAR INFORMACION
		JTextField usuario = new JTextField();
		usuario.setBounds(20, 140, 480, 48);
		usuario.setForeground(Color.WHITE);
		usuario.setOpaque(true);
		usuario.setBackground(grisBajo);
		usuario.setBorder(bordeado);	//SSE UTILIZA EL TIPO DE BORDEADO CREADO
		usuario.setFont(txtBox);
		registro.add(usuario);
		
		JPasswordField contraseña = new JPasswordField();
		contraseña.setBounds(20, 245, 480, 48);
		contraseña.setForeground(Color.WHITE);
		contraseña.setOpaque(true);
		contraseña.setBackground(grisBajo);
		contraseña.setBorder(bordeado);	//SE UTILIZA EL TIPO DE BORDEADO CREADO
		contraseña.setFont(txtBox);
		registro.add(contraseña);
		
		JTextArea bio = new JTextArea();
		bio.setBounds(20, 355, 630, 87);
		bio.setForeground(Color.WHITE);
		bio.setOpaque(true);
		bio.setBackground(grisBajo);
		bio.setBorder(bordeado);	//SE UTILIZA EL TIPO DE BORDEADO CREADO
		bio.setFont(new Font("Plain", Font.PLAIN, 20));
		registro.add(bio);
		
		//CAJAS DE CONFIRMACION
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
		
		JRadioButton aceptar = new JRadioButton("Acepto los terminos y condiciones");	//PRIMER RADIO BUTTON
		aceptar.setBounds(20, 555, 320, 45);
		aceptar.setOpaque(false);
		aceptar.setForeground(Color.WHITE);
		aceptar.setFont(new Font("Italic", Font.ITALIC, 17));
		registro.add(aceptar);
		
		JRadioButton rechazar = new JRadioButton("Rechazo los terminos y condiciones");	//SEGUNDO RADIO BUTOTN
		rechazar.setBounds(20, 585, 320, 45);
		rechazar.setOpaque(false);
		rechazar.setForeground(Color.WHITE);
		rechazar.setFont(new Font("Italic", Font.ITALIC, 17));
		registro.add(rechazar);
		
		ButtonGroup termYCond = new ButtonGroup();	//SE CREA UN GRUPO DE BOTONES
		termYCond.add(aceptar);	//SE AGREGA EL PRIMER RADIO BUTTON
		termYCond.add(rechazar);	//SE AGREGA EL SEGUDNO RADIO BUTTON
		
		
		//CAJA DESPEGABLE
		JComboBox <String> ubi = new JComboBox<String>();	//EL COMBO BOX SE ESTABLECE DE TIPO STRING
		ubi.setBounds(400, 490, 250, 45);
		ubi.setForeground(Color.WHITE);
		ubi.setFont(new Font("Plain", Font.PLAIN, 20));
		ubi.setBackground(grisBajo);
		ubi.setBorder(bordeado);	//SE UTILIZA EL TIPO DE BORDEADO CREADO
		ubi.addItem("Seleccione su ubicacion");	//EMPIEZA SIENDO LA PRIMER OPCION
		ubi.addItem("Camino Real");	//SEGUNDA OPCION
		ubi.addItem("Calafia");	//TERCERA OPCION
		ubi.addItem("Peninsula Sur");	//CUARTA OPCION
		ubi.addItem("Valle del mezquite");	//QUINTA OPCION
		ubi.setSelectedItem(1);	//SE SELECCIONA EN LA CAJA LA PRIMER OPCION POR DEFAULT
		registro.add(ubi);
		
		//BOTON DE CONFIRMACION
		JButton confirmar = new JButton("Registrarse");
		confirmar.setBounds(420, 604, 240, 70);
		confirmar.setForeground(Color.WHITE);
		confirmar.setFont(new Font("Italic", Font.ITALIC, 40));
		confirmar.setOpaque(true);
		confirmar.setBackground(grisBajo);
		confirmar.setBorderPainted(true);
		confirmar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));	//SE ESTABLECE UN COLOR Y GROSOR DE BORDE
		
		confirmar.addActionListener(new ActionListener() {	//METODO PARA AGREAGR UNA ACCION A UN ELEMENTO

			@Override
			public void actionPerformed(ActionEvent e) {

				String cadenaContraseña = new String(contraseña.getPassword());
				
				if(usuario.getText().equals(""))
				{
					usuario.setBorder(new LineBorder(Color.ORANGE, 4, true));
				}
				else
				{
					usuario.setBorder(new LineBorder(Color.GREEN, 4, true));
				}
				
				if(cadenaContraseña.equals(""))
				{
					contraseña.setBorder(new LineBorder(Color.ORANGE, 4, true));
				}
				else
				{
					contraseña.setBorder(new LineBorder(Color.GREEN, 4, true));
				}
				
			}
			
		});
		
		registro.add(confirmar);
		
		JButton soporteTecnico = new JButton("Inicia sesion");
		soporteTecnico.setBounds(224, 638 , 120, 30);
		soporteTecnico.setForeground(Color.RED);
		soporteTecnico.setFont(new Font("Arial", Font.BOLD, 19));
		soporteTecnico.setOpaque(false);
		soporteTecnico.setBackground(new Color(54, 84, 79));
		soporteTecnico.setBorder(null);
		
		soporteTecnico.addActionListener(new ActionListener() {	//ACCION PARA CAMBIAR ENTRE PANELES / VENTANAS

			@Override
			public void actionPerformed(ActionEvent e) 
			{	
				goTo("login");
			}
		});
		
		registro.add(soporteTecnico);
		
		//IMAGENES DE FONDO
		JLabel imgFondo = new JLabel(new ImageIcon("fondoRegistro.jpg"));
		imgFondo.setBounds(0, 0, 1024, 720);
		fondoRegistro.add(imgFondo);
		
		JLabel imgLogin = new JLabel(new ImageIcon("registro.jpg"));
		imgLogin.setBounds(0, 0, 670, 720);
		registro.add(imgLogin);
				
		return fondoRegistro;
	}	
	
	public JPanel consultar()
	{
		JPanel fondoUsuarios = new JPanel();	//FONDO DEL LOGIN
		fondoUsuarios.setBounds(0, 0, 1024, 720);
		fondoUsuarios.setOpaque(true);
		fondoUsuarios.setBackground(new Color(31, 95, 97));
		fondoUsuarios.setLayout(null);
		
		JLabel titulo = new JLabel("Lista de usuarios");
		titulo.setBounds(270, 20, 470, 50);
		titulo.setForeground(Color.WHITE);
		titulo.setFont(new Font("Roman Baseline", Font.ROMAN_BASELINE, 60));	//PODEMOS ESTABLECER DIRECTAMENTE UN FONT A LA ETIQUETA
		fondoUsuarios.add(titulo);
		
		JLabel cantUsuarios = new JLabel("Cantidad de usuarios: 100");
		cantUsuarios.setBounds(35, 160, 390, 45);
		cantUsuarios.setForeground(Color.WHITE);
		cantUsuarios.setFont(new Font("Arial", Font.BOLD, 30));
		fondoUsuarios.add(cantUsuarios);
		
		JButton siguiente = new JButton("Siguiente");
		siguiente.setBounds(780, 160, 200, 45);
		siguiente.setVisible(true);
		siguiente.setForeground(Color.BLACK);
		siguiente.setFont(new Font("Arial", Font.BOLD, 30));
		fondoUsuarios.add(siguiente);
		
		String[] columnNames = {"ID", "Nombre", "Correo electronico", "Edad", "Estado"};	//SON LAS COLUMNAS DE LA TABLA
		String[][] data = {	//SON LOS RENGLONES DE LA TABLA
				{"001", "Mary", "Mary1@gmail.com", "19", "Activo"},
				{"002", "Lhucas", "Lhucas2@gmail.com", "22", "Activo"},
				{"003", "Kathya", "Kathya3@gmail.com", "24", "Activo"},
				{"004", "Marcus", "Marcus4@gmail.com", "18", "Activo"},
				{"005", "Angela", "Angela5@gmail.com", "35", "Activo"},
				{"001", "Mary", "Mary1@gmail.com", "19", "Activo"},
				{"002", "Lhucas", "Lhucas2@gmail.com", "22", "Activo"},
				{"003", "Kathya", "Kathya3@gmail.com", "24", "Activo"},
				{"004", "Marcus", "Marcus4@gmail.com", "18", "Activo"},
				{"005", "Angela", "Angela5@gmail.com", "35", "Activo"},
				{"001", "Mary", "Mary1@gmail.com", "19", "Activo"},
				{"002", "Lhucas", "Lhucas2@gmail.com", "22", "Activo"},
				{"003", "Kathya", "Kathya3@gmail.com", "24", "Activo"},
				{"004", "Marcus", "Marcus4@gmail.com", "18", "Activo"},
				{"005", "Angela", "Angela5@gmail.com", "35", "Activo"},
				{"001", "Mary", "Mary1@gmail.com", "19", "Activo"},
				{"002", "Lhucas", "Lhucas2@gmail.com", "22", "Activo"},
				{"003", "Kathya", "Kathya3@gmail.com", "24", "Activo"},
				{"004", "Marcus", "Marcus4@gmail.com", "18", "Activo"},
				{"005", "Angela", "Angela5@gmail.com", "35", "Activo"},
				{"001", "Mary", "Mary1@gmail.com", "19", "Activo"},
				{"002", "Lhucas", "Lhucas2@gmail.com", "22", "Activo"},
				{"003", "Kathya", "Kathya3@gmail.com", "24", "Activo"},
				{"004", "Marcus", "Marcus4@gmail.com", "18", "Activo"},
				{"005", "Angela", "Angela5@gmail.com", "35", "Activo"},
				{"001", "Mary", "Mary1@gmail.com", "19", "Activo"},
				{"002", "Lhucas", "Lhucas2@gmail.com", "22", "Activo"},
				{"003", "Kathya", "Kathya3@gmail.com", "24", "Activo"},
				{"004", "Marcus", "Marcus4@gmail.com", "18", "Activo"},
				{"005", "Angela", "Angela5@gmail.com", "35", "Activo"}};
		
		JTable tablaDatos = new JTable(data, columnNames);	//SE CREA LA TABLA USANDO COMO REFERENCIA LAS COLUMNAS Y RENGLONES VISTOS ANTERIORMENTE
		JScrollPane sp = new JScrollPane(tablaDatos);	//Al crear y enlazar el scroll con la tabla sus propiedades ahora se manejan con el ScrollPaneA
		tablaDatos.setVisible(true);
		tablaDatos.setForeground(Color.BLACK);
		tablaDatos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		add(sp);	//SE DEBE AÑADIR EL SCROLLPANE
		sp.setBounds(30, 220, 954, 440);	//LO QUE SE TRATE DE UBICACIONY TAMAÑO DE LA TABLA LO MANEJA DIRECTAMENTE SCROLLPANE

		fondoUsuarios.add(sp);	//SE DEBE AGREAGR EL SCROLLPANE A LA VENTANA, EN ESTE CASO AL FONDO DONDE ESTAN EL RESTO DE ELEMENTOS
		
		return fondoUsuarios;
	}

	public JPanel recuperarCuenta()
	{
		JPanel fondoRecuperar = new JPanel();
		fondoRecuperar.setBounds(0, 0, 1024, 720);
		fondoRecuperar.setOpaque(true);
		fondoRecuperar.setBackground(new Color(186, 122, 2));
		fondoRecuperar.setLayout(null);
		
		JPanel recuperarCuenta = new JPanel();
		recuperarCuenta.setBounds(177, 0, 670, 720);
		recuperarCuenta.setOpaque(true);
		recuperarCuenta.setBackground(new Color(207, 163, 82));
		recuperarCuenta.setLayout(null);
		fondoRecuperar.add(recuperarCuenta);

		JLabel titulo = new JLabel("RECUPERAR CUENTA");
		titulo.setBounds(55, 18, 670, 100);
		titulo.setForeground(Color.WHITE);
		titulo.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 60));	//PODEMOS ESTABLECER UN FONT DIRECTAMENTE A LA ETIQUETA
		recuperarCuenta.add(titulo);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(20, 148, 500, 50);
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setOpaque(false);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 35));
		recuperarCuenta.add(lblUsuario);
		
		JTextField campoUsuario = new JTextField();
		campoUsuario.setBounds(20, 208, 500, 50);
		campoUsuario.setBackground(Color.GRAY);
		campoUsuario.setForeground(Color.WHITE);
		campoUsuario.setFont(new Font("Tahoma", Font.BOLD, 35));
		campoUsuario.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		recuperarCuenta.add(campoUsuario);
		
		JLabel lblCorreo = new JLabel("Correo electronico:");
		lblCorreo.setBounds(20, 278, 500, 50);
		lblCorreo.setForeground(Color.WHITE);
		lblCorreo.setOpaque(false);
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 40));
		recuperarCuenta.add(lblCorreo);
		
		JTextField campoCorreo = new JTextField();
		campoCorreo.setBounds(20, 338, 500, 50);
		campoCorreo.setBackground(Color.GRAY);
		campoCorreo.setForeground(Color.WHITE);
		campoCorreo.setFont(new Font("Tahoma", Font.BOLD, 35));
		campoCorreo.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		recuperarCuenta.add(campoCorreo);
		
		JButton botonRegreso = new JButton("<- Regresar");
		botonRegreso.setBounds(15, 610, 210, 55);
		botonRegreso.setFont(new Font("Arial", Font.BOLD, 30));
		botonRegreso.setForeground(Color.BLACK);
		recuperarCuenta.add(botonRegreso);
		
		JButton botonRecuperar = new JButton("Recuperar");
		botonRecuperar.setBounds(460, 610, 190, 55);
		botonRecuperar.setFont(new Font("Arial", Font.BOLD, 30));
		botonRecuperar.setForeground(Color.BLACK);
		recuperarCuenta.add(botonRecuperar);
		
		return fondoRecuperar;
	}
	
	public JPanel altaUsuarios()
	{
		JPanel fondoAlta = new JPanel();
		fondoAlta.setBounds(0, 0, 1024, 720);
		fondoAlta.setOpaque(true);
		fondoAlta.setLayout(null);
		fondoAlta.setBackground(new Color(45, 136, 140));
		fondoAlta.setLayout(null);
		
		JLabel fotoPerfil = new JLabel();
		fotoPerfil.setBounds(30, 30, 180, 280);
		fotoPerfil.setOpaque(true);
		fotoPerfil.setBackground(new Color(195, 195, 195));
		fotoPerfil.setBorder(new LineBorder(new Color(89, 89, 89), 2));
		fotoPerfil.setIcon(new ImageIcon("ftoPerfil.png"));
		fondoAlta.add(fotoPerfil);
		
		JLabel nombre = new JLabel("Nombre completo:");
		nombre.setBounds(240, 40, 400, 40);
		nombre.setForeground(Color.WHITE);
		nombre.setFont(new Font("Arial", Font.BOLD, 40));
		fondoAlta.add(nombre);
		
		JLabel cajaNombre = new JLabel();
		cajaNombre.setBounds(240, 110, 720, 50);
		cajaNombre.setForeground(Color.BLACK);
		cajaNombre.setOpaque(true);
		cajaNombre.setBackground(new Color(195, 195, 195));
		cajaNombre.setBorder(new LineBorder(new Color(89, 89, 89), 2));
		cajaNombre.setFont(new Font("Arial", Font.BOLD, 40));
		fondoAlta.add(cajaNombre);
		
		JLabel correo = new JLabel("Correo electronico:");
		correo.setBounds(240, 200, 400, 40);
		correo.setForeground(Color.WHITE);
		correo.setFont(new Font("Arial", Font.BOLD, 40));
		fondoAlta.add(correo);
		
		JLabel cajaCorreo = new JLabel();
		cajaCorreo.setBounds(240, 270, 720, 50);
		cajaCorreo.setForeground(Color.BLACK);
		cajaCorreo.setOpaque(true);
		cajaCorreo.setBackground(new Color(195, 195, 195));
		cajaCorreo.setBorder(new LineBorder(new Color(89, 89, 89), 2));
		cajaCorreo.setFont(new Font("Arial", Font.BOLD, 40));
		fondoAlta.add(cajaCorreo);
		
		JLabel biografia = new JLabel("Biografia:");
		biografia.setBounds(40, 335, 400, 40);
		biografia.setForeground(Color.WHITE);
		biografia.setFont(new Font("Arial", Font.BOLD, 40));
		fondoAlta.add(biografia);
		
		JLabel cajaBriografia = new JLabel();
		cajaBriografia.setBounds(40, 390, 920, 100);
		cajaBriografia.setForeground(Color.BLACK);
		cajaBriografia.setOpaque(true);
		cajaBriografia.setBackground(new Color(195, 195, 195));
		cajaBriografia.setBorder(new LineBorder(new Color(89, 89, 89), 2));
		cajaBriografia.setFont(new Font("Arial", Font.BOLD, 40));
		fondoAlta.add(cajaBriografia);
		
		JLabel ubicacion = new JLabel("Ubicacion:");
		ubicacion.setBounds(40, 510, 400, 40);
		ubicacion.setForeground(Color.WHITE);
		ubicacion.setFont(new Font("Arial", Font.BOLD, 40));
		fondoAlta.add(ubicacion);
		
		JLabel cajaUbicacion = new JLabel();
		cajaUbicacion.setBounds(260, 510, 300, 50);
		cajaUbicacion.setForeground(Color.BLACK);
		cajaUbicacion.setOpaque(true);
		cajaUbicacion.setBackground(new Color(195, 195, 195));
		cajaUbicacion.setBorder(new LineBorder(new Color(89, 89, 89), 2));
		cajaUbicacion.setFont(new Font("Arial", Font.BOLD, 40));
		fondoAlta.add(cajaUbicacion);
		
		JButton menu = new JButton("Menu");
		menu.setBounds(30, 600, 170, 60);
		menu.setFont(new Font("Arial", Font.PLAIN, 40));
		fondoAlta.add(menu);
		
		JButton consultar = new JButton("Consultar");
		consultar.setBounds(220, 600, 220, 60);
		consultar.setFont(new Font("Arial", Font.PLAIN, 40));
		fondoAlta.add(consultar);
		
		JButton darAlta = new JButton("Dar alta");
		darAlta.setBounds(460, 600, 200, 60);
		darAlta.setFont(new Font("Arial", Font.PLAIN, 40));
		fondoAlta.add(darAlta);
		
		JButton anterior = new JButton("<");
		anterior.setBounds(800, 600, 65, 60);
		anterior.setFont(new Font("Arial", Font.PLAIN, 40));
		fondoAlta.add(anterior);
		
		JButton siguiente = new JButton(">");
		siguiente.setBounds(875, 600, 65, 60);
		siguiente.setFont(new Font("Arial", Font.PLAIN, 40));
		fondoAlta.add(siguiente);
		
		return fondoAlta;
	}
	
	public JPanel bajaUsuarios()
	{
		JPanel fondoBaja = new JPanel();
		fondoBaja.setBounds(0, 0, 1024, 720);
		fondoBaja.setOpaque(true);
		fondoBaja.setBackground(new Color(22, 67, 69));
		fondoBaja.setLayout(null);
		
		JLabel fotoPerfil = new JLabel();
		fotoPerfil.setBounds(30, 30, 180, 280);
		fotoPerfil.setOpaque(true);
		fotoPerfil.setBackground(new Color(195, 195, 195));
		fotoPerfil.setBorder(new LineBorder(new Color(89, 89, 89), 2));
		fotoPerfil.setIcon(new ImageIcon("ftoPerfil.png"));
		fondoBaja.add(fotoPerfil);
		
		JLabel nombre = new JLabel("Nombre completo:");
		nombre.setBounds(240, 40, 400, 40);
		nombre.setForeground(Color.WHITE);
		nombre.setFont(new Font("Arial", Font.BOLD, 40));
		fondoBaja.add(nombre);
		
		JLabel cajaNombre = new JLabel();
		cajaNombre.setBounds(240, 110, 720, 50);
		cajaNombre.setForeground(Color.BLACK);
		cajaNombre.setOpaque(true);
		cajaNombre.setBackground(new Color(195, 195, 195));
		cajaNombre.setBorder(new LineBorder(new Color(89, 89, 89), 2));
		cajaNombre.setFont(new Font("Arial", Font.BOLD, 40));
		fondoBaja.add(cajaNombre);
		
		JLabel correo = new JLabel("Correo electronico:");
		correo.setBounds(240, 200, 400, 40);
		correo.setForeground(Color.WHITE);
		correo.setFont(new Font("Arial", Font.BOLD, 40));
		fondoBaja.add(correo);
		
		JLabel cajaCorreo = new JLabel();
		cajaCorreo.setBounds(240, 270, 720, 50);
		cajaCorreo.setForeground(Color.BLACK);
		cajaCorreo.setOpaque(true);
		cajaCorreo.setBackground(new Color(195, 195, 195));
		cajaCorreo.setBorder(new LineBorder(new Color(89, 89, 89), 2));
		cajaCorreo.setFont(new Font("Arial", Font.BOLD, 40));
		fondoBaja.add(cajaCorreo);
		
		JLabel biografia = new JLabel("Biografia:");
		biografia.setBounds(40, 335, 400, 40);
		biografia.setForeground(Color.WHITE);
		biografia.setFont(new Font("Arial", Font.BOLD, 40));
		fondoBaja.add(biografia);
		
		JLabel cajaBriografia = new JLabel();
		cajaBriografia.setBounds(40, 390, 920, 100);
		cajaBriografia.setForeground(Color.BLACK);
		cajaBriografia.setOpaque(true);
		cajaBriografia.setBackground(new Color(195, 195, 195));
		cajaBriografia.setBorder(new LineBorder(new Color(89, 89, 89), 2));
		cajaBriografia.setFont(new Font("Arial", Font.BOLD, 40));
		fondoBaja.add(cajaBriografia);
		
		JLabel ubicacion = new JLabel("Ubicacion:");
		ubicacion.setBounds(40, 510, 400, 40);
		ubicacion.setForeground(Color.WHITE);
		ubicacion.setFont(new Font("Arial", Font.BOLD, 40));
		fondoBaja.add(ubicacion);
		
		JLabel cajaUbicacion = new JLabel();
		cajaUbicacion.setBounds(260, 510, 300, 50);
		cajaUbicacion.setForeground(Color.BLACK);
		cajaUbicacion.setOpaque(true);
		cajaUbicacion.setBackground(new Color(195, 195, 195));
		cajaUbicacion.setBorder(new LineBorder(new Color(89, 89, 89), 2));
		cajaUbicacion.setFont(new Font("Arial", Font.BOLD, 40));
		fondoBaja.add(cajaUbicacion);
		
		JLabel servicio = new JLabel("Servicio:");
		servicio.setBounds(570, 510, 400, 40);
		servicio.setForeground(Color.WHITE);
		servicio.setFont(new Font("Arial", Font.BOLD, 40));
		fondoBaja.add(servicio);
		
		JLabel cajaServicio = new JLabel();
		cajaServicio.setBounds(740, 510, 220, 50);
		cajaServicio.setForeground(Color.BLACK);
		cajaServicio.setOpaque(true);
		cajaServicio.setBackground(new Color(195, 195, 195));
		cajaServicio.setBorder(new LineBorder(new Color(89, 89, 89), 2));
		cajaServicio.setFont(new Font("Arial", Font.BOLD, 40));
		fondoBaja.add(cajaServicio);
		
		JButton menu = new JButton("Menu");
		menu.setBounds(30, 600, 170, 60);
		menu.setFont(new Font("Arial", Font.PLAIN, 40));
		fondoBaja.add(menu);
		
		JButton consultar = new JButton("Consultar");
		consultar.setBounds(220, 600, 220, 60);
		consultar.setFont(new Font("Arial", Font.PLAIN, 40));
		fondoBaja.add(consultar);
		
		JButton darBaja = new JButton("Dar baja");
		darBaja.setBounds(460, 600, 200, 60);
		darBaja.setFont(new Font("Arial", Font.PLAIN, 40));
		fondoBaja.add(darBaja);
		
		JButton anterior = new JButton("<");
		anterior.setBounds(800, 600, 65, 60);
		anterior.setFont(new Font("Arial", Font.PLAIN, 40));
		fondoBaja.add(anterior);
		
		JButton siguiente = new JButton(">");
		siguiente.setBounds(875, 600, 65, 60);
		siguiente.setFont(new Font("Arial", Font.PLAIN, 40));
		fondoBaja.add(siguiente);
		
		return fondoBaja;
	}
	
	public JPanel comoCrearUsuario()
	{
		JPanel fondoCrearUsuario = new JPanel();
		fondoCrearUsuario.setBounds(0, 0, 1024, 720);
		fondoCrearUsuario.setOpaque(true);
		fondoCrearUsuario.setBackground(new Color(54, 48, 124));
		fondoCrearUsuario.setLayout(null);
		
		JLabel titulo = new JLabel("FAQ - ¿Como crear un usuario?");
		titulo.setBounds(40, 30, 500, 40);
		titulo.setOpaque(false);
		titulo.setLayout(null);
		titulo.setForeground(Color.WHITE);
		titulo.setFont(new Font("Tahoma", Font.BOLD, 30));
		fondoCrearUsuario.add(titulo);
		
		//PANEL DE INFOMRACION
		
		JPanel panelInfo = new JPanel();
		panelInfo.setBounds(40 ,85 ,934, 520);
		panelInfo.setBackground(new Color(184, 183, 186));
		panelInfo.setLayout(null);
		panelInfo.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		fondoCrearUsuario.add(panelInfo);
		
		JTextArea info = new JTextArea("1. Para iniciar el proceso de creacion de un usuario primero debe dirigirse a la \nventana principal y seleccionar la Opcion [Registrar] o puede navegar directamente \na la opcion."
				+ "\n\n2. Dentro de la seccion registro usted debe llenar los campos obligatorios y de ser \nposibles los opcionales."
				+ "\n\n3. Recuerde que al llenar el registro usted debe aceptar los terminos y condiciones, \npara esto solo marque la casilla [Acepto terminos y condiciones]."
				+ "\n\n4. Una vez registrado y aceptado todo selecciona la opcion [Registrar], al hacerlo se \nverificara que todos los campos esten llenos y la infomacion sea adecuada para el \nregistro.");
		info.setBounds(20, 20, 950, 550);
		info.setOpaque(false);
		info.setFont(new Font("Arial", Font.PLAIN, 25));
		info.setForeground(Color.BLACK);
		panelInfo.add(info);
		
		//BOTONES DE NAVEGACION
		
		JButton volverInicio = new JButton("Volver inicio");
		volverInicio.setBounds(40, 615, 200, 40);
		volverInicio.setBackground(Color.darkGray);
		volverInicio.setForeground(Color.WHITE);
		volverInicio.setBorder(new LineBorder(Color.GRAY, 2));
		volverInicio.setFont(new Font("Arial", Font.BOLD, 25));
		
		volverInicio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				goTo("login");
			}
			
		});
		
		fondoCrearUsuario.add(volverInicio);
		
		JButton siguiente = new JButton("Siguiente");
		siguiente.setBounds(770, 615, 200, 40);
		siguiente.setBackground(Color.darkGray);
		siguiente.setForeground(Color.WHITE);
		siguiente.setBorder(new LineBorder(Color.GRAY, 2));
		siguiente.setFont(new Font("Arial", Font.BOLD, 25));
		
		siguiente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				goTo("comoAccederSistema");
			}
			
		});
		
		fondoCrearUsuario.add(siguiente);
				
		return fondoCrearUsuario;
	}
	
	public JPanel comoAccederSistema()
	{
		JPanel fondoAccederSistema = new JPanel();
		fondoAccederSistema.setBounds(0, 0, 1024, 720);
		fondoAccederSistema.setOpaque(true);
		fondoAccederSistema.setBackground(new Color(12, 145, 143));
		fondoAccederSistema.setLayout(null);
		
		JLabel titulo = new JLabel("FAQ - ¿Como acceder al sistema?");
		titulo.setBounds(40, 30, 550, 40);
		titulo.setOpaque(false);
		titulo.setLayout(null);
		titulo.setForeground(Color.WHITE);
		titulo.setFont(new Font("Tahoma", Font.BOLD, 30));
		fondoAccederSistema.add(titulo);
		
		//PANEL DE INFOMRACION
		
		JPanel panelInfo = new JPanel();
		panelInfo.setBounds(40 ,85 ,934, 520);
		panelInfo.setBackground(new Color(184, 183, 186));
		panelInfo.setLayout(null);
		panelInfo.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		fondoAccederSistema.add(panelInfo);
		
		JTextArea info = new JTextArea("1. Para acceder al sistema, primero debe dirigirse a la ventana principal o \n[Iniciar sesion]."
				+ "\n\n2. Dentro de la ventana debe llenar los campos obligatorios, tambien puede \nseleccionar la opcion [Recordar] para guardar la informacion proporcionada para \nfuturos inicios de sesion."
				+ "\n\n3. Una vez llenados los camppos, seleccione la opcion [Entrar], posterior a eso se \nverificara que los datos proporcionados sean correctos o que no hayan datos \nfaltantes.");
		info.setBounds(20, 20, 950, 550);
		info.setOpaque(false);
		info.setFont(new Font("Arial", Font.PLAIN, 25));
		info.setForeground(Color.BLACK);
		panelInfo.add(info);
		
		//BOTONES DE NAVEGACION
		
		JButton volverInicio = new JButton("Volver inicio");
		volverInicio.setBounds(40, 615, 200, 40);
		volverInicio.setBackground(Color.darkGray);
		volverInicio.setForeground(Color.WHITE);
		volverInicio.setBorder(new LineBorder(Color.GRAY, 2));
		volverInicio.setFont(new Font("Arial", Font.BOLD, 25));
		
		volverInicio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				goTo("login");
			}
			
		});
		
		fondoAccederSistema.add(volverInicio);
		
		JButton siguiente = new JButton("Siguiente");
		siguiente.setBounds(770, 615, 200, 40);
		siguiente.setBackground(Color.darkGray);
		siguiente.setForeground(Color.WHITE);
		siguiente.setBorder(new LineBorder(Color.GRAY, 2));
		siguiente.setFont(new Font("Arial", Font.BOLD, 25));
		
		siguiente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				goTo("comoRecuperarContraseña");
			}
			
		});
		
		fondoAccederSistema.add(siguiente);
		
		JButton anterior = new JButton("Anterior");
		anterior.setBounds(560, 615, 200, 40);
		anterior.setBackground(Color.darkGray);
		anterior.setForeground(Color.WHITE);
		anterior.setBorder(new LineBorder(Color.GRAY, 2));
		anterior.setFont(new Font("Arial", Font.BOLD, 25));
		
		anterior.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				goTo("comoCrearUsuario");
			}
			
		});
		
		fondoAccederSistema.add(anterior);
		
		return fondoAccederSistema;
	}
	
	public JPanel comoRecuperarContraseña()
	{
		JPanel fondoRecuperarContraseña = new JPanel();
		fondoRecuperarContraseña.setBounds(0, 0, 1024, 720);
		fondoRecuperarContraseña.setOpaque(true);
		fondoRecuperarContraseña.setBackground(new Color(72, 49, 133));
		fondoRecuperarContraseña.setLayout(null);
		
		JLabel titulo = new JLabel("FAQ - ¿Como recuperar la contraseña?");
		titulo.setBounds(40, 30, 600, 40);
		titulo.setOpaque(false);
		titulo.setLayout(null);
		titulo.setForeground(Color.WHITE);
		titulo.setFont(new Font("Tahoma", Font.BOLD, 30));
		fondoRecuperarContraseña.add(titulo);
		
		//PANEL DE INFOMRACION
		
		JPanel panelInfo = new JPanel();
		panelInfo.setBounds(40 ,85 ,934, 520);
		panelInfo.setBackground(new Color(184, 183, 186));
		panelInfo.setLayout(null);
		panelInfo.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		fondoRecuperarContraseña.add(panelInfo);
		
		JTextArea info = new JTextArea("1. Para recuperar la contraseña de la cuenta, primero debe dirigirse a la ventana \n[Recuperar cuenta]."
				+ "\n\n2. Dentro de la ventana debe llenar uno de los dos campos solicitados ya sea \n[Usuario] o [Correo electronico], esto debe ser de manera obligatoria."
				+ "\n\n3. Una vez se tenga alguno de los campos lleno, se debe seleccionar la opcion \n[Recuperar]."
				+ "\n\n4. Empezara el proceso de recuperacion, para esto se enviara un mensaje via \ncorreo electronico donde se espere la confirmacion por parte del usuario para \nverificar que sea su cuenta, y tambien tendra la posibilidad de cambiar la \ncontraseña.");
		info.setBounds(20, 20, 950, 550);
		info.setOpaque(false);
		info.setFont(new Font("Arial", Font.PLAIN, 25));
		info.setForeground(Color.BLACK);
		panelInfo.add(info);
		
		//BOTONES DE NAVEGACION
		
		JButton volverInicio = new JButton("Volver inicio");
		volverInicio.setBounds(40, 615, 200, 40);
		volverInicio.setBackground(Color.darkGray);
		volverInicio.setForeground(Color.WHITE);
		volverInicio.setBorder(new LineBorder(Color.GRAY, 2));
		volverInicio.setFont(new Font("Arial", Font.BOLD, 25));
		
		volverInicio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				goTo("login");
			}
			
		});
		
		fondoRecuperarContraseña.add(volverInicio);
		
		JButton anterior = new JButton("Anterior");
		anterior.setBounds(560, 615, 200, 40);
		anterior.setBackground(Color.darkGray);
		anterior.setForeground(Color.WHITE);
		anterior.setBorder(new LineBorder(Color.GRAY, 2));
		anterior.setFont(new Font("Arial", Font.BOLD, 25));
		
		anterior.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				goTo("comoAccederSistema");
			}
			
		});
		
		fondoRecuperarContraseña.add(anterior);
		
		return fondoRecuperarContraseña;
	}
	
	public JPanel aleatorio()
	{
		JPanel main = new JPanel();
		main.setBounds(0, 0, 1024, 720);
		main.setBackground(Color.WHITE);
		main.setLayout(null);
		
		JButton boton = new JButton("PRESIONAME");
		boton.setBounds(380, 300, 270, 50);
		boton.setOpaque(true);
		boton.setBorder(new LineBorder(Color.BLACK, 3));
		boton.setFont(new Font("Arial", Font.BOLD, 30));
		boton.setForeground(Color.BLACK);
		boton.setBackground(Color.WHITE);
		
		boton.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Random rand = new Random();
				
				JButton randomBoton = new JButton("CLIKY AQUI");
				randomBoton.setBounds(rand.nextInt(980) + 0, rand.nextInt(600) + 0, rand.nextInt(200) + 40, rand.nextInt(200) + 40);
				randomBoton.setFont(new Font("Arial", Font.BOLD, rand.nextInt(30) + 10));
				randomBoton.setOpaque(true);
				randomBoton.setBackground(new Color(rand.nextInt(255) + 0, rand.nextInt(255) + 0, rand.nextInt(255) + 0));
				randomBoton.setForeground(new Color(rand.nextInt(255) + 0, rand.nextInt(255) + 0, rand.nextInt(255) + 0));
				randomBoton.setBorder(new LineBorder(Color.BLACK, 3));
				
				randomBoton.addActionListener(new ActionListener()
						{

							@Override
							public void actionPerformed(ActionEvent i) 
							{
								int opc = JOptionPane.showConfirmDialog(null, randomBoton.getBackground() + "\n¿Eliminar boton?", "ola jeje", JOptionPane.YES_NO_OPTION);		
								
								if(opc == JOptionPane.YES_OPTION)
								{
									main.remove(randomBoton);
									main.repaint();
									main.revalidate();
								}
							}
					
						});
				
				main.add(randomBoton);
				
				main.repaint();
				main.revalidate();
			}
	
		});
		
		main.add(boton);;
		
		return main;
	}
	
	public void goTo(String cambio)	//METODO PARA CAMBIO DE PANELES / VENTANAS
	{
		this.getContentPane().removeAll();

		switch(cambio)
		{
		case "login":
		{
			this.add(login());
		}
			break;
		case "registro":
		{
			this.add(registro());
		}
			break;
		case "consultar":
		{
			this.add(consultar());
		}
			break;
		case "recuperarCuenta":
		{
			this.add(recuperarCuenta());
		}
			break;
		case "altaUsuarios":
		{
			this.add(altaUsuarios());
		}
			break;
		case "bajaUsuarios":
		{
			this.add(bajaUsuarios());
		}
			break;
		case "comoCrearUsuario":
		{
			this.add(comoCrearUsuario());
		}
			break;
		case "comoAccederSistema":
		{
			this.add(comoAccederSistema());
		}
			break;
		case "comoRecuperarContraseña":
		{
			this.add(comoRecuperarContraseña());
		}
			break;
		}
		
		this.repaint();
		this.revalidate();		
	}
	
}