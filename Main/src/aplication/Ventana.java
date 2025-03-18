package aplication;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
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
import javax.swing.JRadioButtonMenuItem;
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
		
		this.add(login());	//LLAMAMOS AL METODO APRA INVOCAR EL PANEL
//		this.add(registro());
//		this.add(consultar());
		
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
		
		JLabel titulo = new JLabel("Usuarios");
		titulo.setBounds(374, 20, 470, 50);
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
		fondoRecuperar.setBackground(Color.DARK_GRAY);
		fondoRecuperar.setLayout(null);
		
		//ETIQUETAS DE TEXTO
		JLabel tituloRecuperarCuenta = new JLabel("Recuperacion de cuenta");
		tituloRecuperarCuenta.setBounds(100, 23, 470, 100);
		tituloRecuperarCuenta.setForeground(Color.WHITE);
		tituloRecuperarCuenta.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 60));	//PODEMOS ESTABLECER UN FONT DIRECTAMENTE A LA ETIQUETA
		fondoRecuperar.add(tituloRecuperarCuenta);
		
		return fondoRecuperar;
	}
	
	public JPanel altaUsuarios()
	{
		JPanel fondoAlta = new JPanel();
		fondoAlta.setBounds(0, 0, 1024, 720);
		fondoAlta.setOpaque(true);
		fondoAlta.setBackground(Color.GRAY);
		fondoAlta.setLayout(null);
		
		JLabel tituloAlta = new JLabel("Alta de usuario");
		tituloAlta.setBounds(430, 50, 260, 20);
		tituloAlta.setOpaque(false);
		tituloAlta.setLayout(null);
		tituloAlta.setForeground(Color.WHITE);
		tituloAlta.setFont(new Font("Arial", Font.BOLD, 20));
		fondoAlta.add(tituloAlta);
		
		return fondoAlta;
	}
	
	public JPanel bajaUsuarios()
	{
		JPanel fondoBaja = new JPanel();
		fondoBaja.setBounds(0, 0, 1024, 720);
		fondoBaja.setOpaque(true);
		fondoBaja.setBackground(Color.BLACK);
		fondoBaja.setLayout(null);
		
		JLabel tituloBaja = new JLabel("Baja de usuario");
		tituloBaja.setBounds(430, 50, 260, 20);
		tituloBaja.setOpaque(false);
		tituloBaja.setLayout(null);
		tituloBaja.setForeground(Color.WHITE);
		tituloBaja.setFont(new Font("Arial", Font.BOLD, 20));
		fondoBaja.add(tituloBaja);
		
		return fondoBaja;
	}
	
	public JPanel comoCrearUsuario()
	{
		JPanel fondoCrearUsuario = new JPanel();
		fondoCrearUsuario.setBounds(0, 0, 1024, 720);
		fondoCrearUsuario.setOpaque(true);
		fondoCrearUsuario.setBackground(Color.ORANGE);
		fondoCrearUsuario.setLayout(null);
		
		JLabel tituloCrearUsuario = new JLabel("Como crear usuario");
		tituloCrearUsuario.setBounds(400, 50, 260, 20);
		tituloCrearUsuario.setOpaque(false);
		tituloCrearUsuario.setLayout(null);
		tituloCrearUsuario.setForeground(Color.BLACK);
		tituloCrearUsuario.setFont(new Font("Arial", Font.BOLD, 20));
		fondoCrearUsuario.add(tituloCrearUsuario);
		
		return fondoCrearUsuario;
	}
	
	public JPanel comoAccederSistema()
	{
		JPanel fondoAccederSistema = new JPanel();
		fondoAccederSistema.setBounds(0, 0, 1024, 720);
		fondoAccederSistema.setOpaque(true);
		fondoAccederSistema.setBackground(Color.PINK);
		fondoAccederSistema.setLayout(null);
		
		JLabel tituloAccederSistema = new JLabel("Como acceder al sistema");
		tituloAccederSistema.setBounds(400, 50, 260, 20);
		tituloAccederSistema.setOpaque(false);
		tituloAccederSistema.setLayout(null);
		tituloAccederSistema.setForeground(Color.BLACK);
		tituloAccederSistema.setFont(new Font("Arial", Font.BOLD, 20));
		fondoAccederSistema.add(tituloAccederSistema);
		
		return fondoAccederSistema;
	}
	
	public JPanel comoRecuperarContraseña()
	{
		JPanel fondoRecuperarContraseña = new JPanel();
		fondoRecuperarContraseña.setBounds(0, 0, 1024, 720);
		fondoRecuperarContraseña.setOpaque(true);
		fondoRecuperarContraseña.setBackground(Color.RED);
		fondoRecuperarContraseña.setLayout(null);
		
		JLabel tituloRecuperarContraseña = new JLabel("Como recuperar contraseña");
		tituloRecuperarContraseña.setBounds(400, 50, 280, 20);
		tituloRecuperarContraseña.setOpaque(false);
		tituloRecuperarContraseña.setLayout(null);
		tituloRecuperarContraseña.setForeground(Color.WHITE);
		tituloRecuperarContraseña.setFont(new Font("Arial", Font.BOLD, 20));
		fondoRecuperarContraseña.add(tituloRecuperarContraseña);
		
		return fondoRecuperarContraseña;
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