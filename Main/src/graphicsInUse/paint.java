package graphicsInUse;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

import java.awt.Dimension;

public class paint {

	private JFrame frame;
	
	public ImageIcon pincel = new ImageIcon("pincel.png");
	public ImageIcon pincel_redux = new ImageIcon(pincel.getImage().getScaledInstance(40, 40, 10));
	
	public ImageIcon borrador = new ImageIcon("borrador.png");
	public ImageIcon borrador_redux = new ImageIcon(borrador.getImage().getScaledInstance(40, 40, 10));
	
	public ImageIcon rectangulo = new ImageIcon("rectangulo.png");
	public ImageIcon rectangulo_redux = new ImageIcon(rectangulo.getImage().getScaledInstance(60, 60, 10));
	
	public ImageIcon circulo = new ImageIcon("circulo.png");
	public ImageIcon circulo_redux = new ImageIcon(circulo.getImage().getScaledInstance(60, 60, 10));
	
	public ImageIcon triangulo = new ImageIcon("triangulo.png");
	public ImageIcon triangulo_redux = new ImageIcon(triangulo.getImage().getScaledInstance(60, 60, 10));
	
	public ImageIcon linea = new ImageIcon("linea.png");
	public ImageIcon linea_redux = new ImageIcon(linea.getImage().getScaledInstance(60, 60, 10));
	
	public ImageIcon limpiar = new ImageIcon("limpiar.png");
	public ImageIcon limpiar_redux = new ImageIcon(limpiar.getImage().getScaledInstance(60, 60, 10));
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paint window = new paint();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public paint() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setMinimumSize(new Dimension(1400, 800));
		frame.getContentPane().setBackground(new Color(45, 48, 66));
		frame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frame.setBounds(0, 0, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel herramientas = new JPanel();
		herramientas.setBackground(new Color(45, 48, 66));
		frame.getContentPane().add(herramientas, BorderLayout.WEST);
		herramientas.setLayout(new GridLayout(3, 0, 0, 30));
		herramientas.setBorder(new EmptyBorder(50, 10, 50, 10));
		
		JPanel utiles = new JPanel();
		utiles.setBackground(new Color(87, 94, 128));
		herramientas.add(utiles);
		utiles.setLayout(new GridLayout(3, 0, 10, 10));
		utiles.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		JButton brocha = new JButton("Pincel");
		brocha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		brocha.setFocusPainted(false);
		brocha.setForeground(new Color(255, 255, 255));
		brocha.setBackground(new Color(82, 82, 82));
		brocha.setFont(new Font("Arial", Font.BOLD, 20));
		brocha.setBorder(new LineBorder(Color.LIGHT_GRAY, 4, false));
		brocha.setIcon(pincel_redux);
		utiles.add(brocha);
		
		JButton borrador = new JButton("Borrador");
		borrador.setForeground(new Color(255, 255, 255));
		borrador.setBackground(new Color(82, 82, 82));
		borrador.setFocusPainted(false);
		borrador.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		borrador.setFont(new Font("Arial", Font.BOLD, 20));
		borrador.setBorder(new LineBorder(Color.LIGHT_GRAY, 4, false));
		borrador.setIcon(borrador_redux);
		utiles.add(borrador);
		
		JSlider slider = new JSlider();
		slider.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
		slider.setBackground(new Color(82, 82, 82));
		utiles.add(slider);
		
		JPanel figuras = new JPanel();
		figuras.setBackground(new Color(87, 94, 128));
		herramientas.add(figuras);
		figuras.setLayout(new GridLayout(2, 2, 10, 10));
		figuras.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		
		JButton rectangulo = new JButton("");
		rectangulo.setBackground(new Color(82, 82, 82));
		rectangulo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rectangulo.setFocusPainted(false);
		rectangulo.setBorder(new LineBorder(Color.LIGHT_GRAY, 4, false));
		rectangulo.setIcon(rectangulo_redux);
		figuras.add(rectangulo);
		
		JButton circulo = new JButton("");
		circulo.setBackground(new Color(82, 82, 82));
		circulo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		circulo.setFocusPainted(false);
		circulo.setBorder(new LineBorder(Color.LIGHT_GRAY, 4, false));
		circulo.setIcon(circulo_redux);
		figuras.add(circulo);
		
		JButton triangulo = new JButton("");
		triangulo.setBackground(new Color(82, 82, 82));
		triangulo.setFocusPainted(false);
		triangulo.setBorder(new LineBorder(Color.LIGHT_GRAY, 4, false));
		triangulo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		triangulo.setIcon(triangulo_redux);
		figuras.add(triangulo);
		
		JButton linea = new JButton("");
		linea.setBackground(new Color(82, 82, 82));
		linea.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		linea.setFocusPainted(false);
		linea.setBorder(new LineBorder(Color.LIGHT_GRAY, 4, false));
		linea.setIcon(linea_redux);
		figuras.add(linea);
		
		JPanel borrado = new JPanel();
		borrado.setBackground(new Color(87, 94, 128));
		herramientas.add(borrado);
		borrado.setLayout(new BorderLayout(0, 0));
		
		JButton limpiar = new JButton("Nuevo lienzo");
		limpiar.setForeground(new Color(255, 255, 255));
		limpiar.setBackground(new Color(82, 82, 82));
		limpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		limpiar.setFocusPainted(false);
		limpiar.setBorder(new LineBorder(Color.LIGHT_GRAY, 4, false));
		limpiar.setFont(new Font("Arial", Font.BOLD, 20));
		limpiar.setIcon(limpiar_redux);
		borrado.add(limpiar, BorderLayout.CENTER);
		
		JPanel lienzo = new JPanel();
		lienzo.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		frame.getContentPane().add(lienzo, BorderLayout.CENTER);
		
		JPanel colores = new JPanel();
		colores.setBackground(new Color(45, 48, 66));
		frame.getContentPane().add(colores, BorderLayout.EAST);
		colores.setLayout(new GridLayout(4, 2, 20, 50));
		colores.setBorder(new EmptyBorder(130, 10, 130, 10));
		
		JButton c_Blanco = new JButton("                              ");
		c_Blanco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		c_Blanco.setBackground(new Color(255, 255, 255));
		c_Blanco.setOpaque(true);
		c_Blanco.setBorder(new LineBorder(Color.LIGHT_GRAY, 6, false));
		c_Blanco.setFocusPainted(false);
		colores.add(c_Blanco);
		
		JButton c_Negro = new JButton("                            ");
		c_Negro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		c_Negro.setBackground(new Color(0, 0, 0));
		c_Negro.setOpaque(true);
		c_Negro.setBorder(new LineBorder(Color.LIGHT_GRAY, 6, false));
		c_Negro.setFocusPainted(false);
		colores.add(c_Negro);
		
		JButton c_Gris = new JButton("");
		c_Gris.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		c_Gris.setBackground(new Color(128, 128, 128));
		c_Gris.setOpaque(true);
		c_Gris.setBorder(new LineBorder(Color.LIGHT_GRAY, 6, false));
		colores.add(c_Gris);
		
		JButton c_Azul = new JButton("");
		c_Azul.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		c_Azul.setBackground(new Color(0, 128, 255));
		c_Azul.setOpaque(true);
		c_Azul.setBorder(new LineBorder(Color.LIGHT_GRAY, 6, false));
		colores.add(c_Azul);
		
		JButton c_Rojo = new JButton("");
		c_Rojo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		c_Rojo.setBackground(new Color(128, 0, 0));
		c_Rojo.setOpaque(true);
		c_Rojo.setBorder(new LineBorder(Color.LIGHT_GRAY, 6, false));
		colores.add(c_Rojo);
		
		JButton c_Verde = new JButton("");
		c_Verde.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		c_Verde.setBackground(new Color(0, 128, 0));
		c_Verde.setOpaque(true);
		c_Verde.setBorder(new LineBorder(Color.LIGHT_GRAY, 6, false));
		colores.add(c_Verde);
		
		JButton c_Naranja = new JButton("");
		c_Naranja.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		c_Naranja.setBackground(new Color(255, 128, 0));
		c_Naranja.setOpaque(true);
		c_Naranja.setBorder(new LineBorder(Color.LIGHT_GRAY, 6, false));
		colores.add(c_Naranja);
		
		JButton c_Morado = new JButton("");
		c_Morado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		c_Morado.setBackground(new Color(128, 0, 128));
		c_Morado.setOpaque(true);
		c_Morado.setBorder(new LineBorder(Color.LIGHT_GRAY, 6, false));
		colores.add(c_Morado);
	}

}
