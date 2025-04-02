package graphicsInUse;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import graphicsInUse.paint.ColocarFigura;
import graphicsInUse.paint.Puntero;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import javax.swing.JCheckBox;

public class paint implements MouseListener, MouseMotionListener{

	private JFrame frame;
	
	public  JPanel lienzo;
	
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

	ArrayList<Puntero> coords = new ArrayList<Puntero>();
	
	List<List<Puntero>> listaCoords = new ArrayList<>();
	
	ArrayList<ColocarFigura> figuritas = new ArrayList<ColocarFigura>();
	
	List<List<ColocarFigura>> listaFiguras = new ArrayList<>();
		
	Color seleccionColor = Color.BLACK;
	
	int seleccionGrosor = 3, tool = 1, coordX, coordY;
	
	boolean relleno = false;
	
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
		brocha.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						if(tool == 6)
						{
							seleccionColor = Color.BLACK;
						}
						tool = 1;
					}
				});
		utiles.add(brocha);
		
		JButton borrador = new JButton("Borrador");
		borrador.setForeground(new Color(255, 255, 255));
		borrador.setBackground(new Color(82, 82, 82));
		borrador.setFocusPainted(false);
		borrador.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		borrador.setFont(new Font("Arial", Font.BOLD, 20));
		borrador.setBorder(new LineBorder(Color.LIGHT_GRAY, 4, false));
		borrador.setIcon(borrador_redux);
		borrador.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) {
					tool = 6;
					seleccionColor = new Color(255, 255, 255);
					}
				});
		utiles.add(borrador);
		
		JSlider slider  =new JSlider(1, 50, 3);
		slider.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
		slider.setBackground(new Color(82, 82, 82));
		slider.addChangeListener(new ChangeListener()
				{
					@Override
					public void stateChanged(ChangeEvent e) {
					seleccionGrosor = slider.getValue();
					}
				});
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
		rectangulo.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) {
						tool = 2;
					}
				});
		figuras.add(rectangulo);
		
		JButton circulo = new JButton("");
		circulo.setBackground(new Color(82, 82, 82));
		circulo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		circulo.setFocusPainted(false);
		circulo.setBorder(new LineBorder(Color.LIGHT_GRAY, 4, false));
		circulo.setIcon(circulo_redux);
		circulo.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				tool = 3;
			}
		});
		figuras.add(circulo);
		
		JButton triangulo = new JButton("");
		triangulo.setBackground(new Color(82, 82, 82));
		triangulo.setFocusPainted(false);
		triangulo.setBorder(new LineBorder(Color.LIGHT_GRAY, 4, false));
		triangulo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		triangulo.setIcon(triangulo_redux);
		triangulo.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) {
						tool = 4;
					}			
				});
		figuras.add(triangulo);
		
		JButton linea = new JButton("");
		linea.setBackground(new Color(82, 82, 82));
		linea.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		linea.setFocusPainted(false);
		linea.setBorder(new LineBorder(Color.LIGHT_GRAY, 4, false));
		linea.setIcon(linea_redux);
		linea.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				tool = 5 ;
			}			
		});
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
		limpiar.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						coords.clear();
						listaCoords.clear();
						
						figuritas.clear();
						listaFiguras.clear();
						
						lienzo.repaint();
					}
			
				});
		borrado.add(limpiar, BorderLayout.CENTER);
		
		JCheckBox rellenoFigura = new JCheckBox("Rellenar figuras");
		rellenoFigura.setFocusPainted(false);
		rellenoFigura.setBorderPaintedFlat(true);
		rellenoFigura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rellenoFigura.setBackground(new Color(82, 82, 82));
		rellenoFigura.setFont(new Font("Tahoma", Font.BOLD, 19));
		rellenoFigura.setForeground(new Color(255, 255, 255));
		rellenoFigura.setBorder(new LineBorder(Color.LIGHT_GRAY, 4, false));
		rellenoFigura.addItemListener(new ItemListener()
				{
					@Override
					public void itemStateChanged(ItemEvent e) {
						if(rellenoFigura.isSelected())
						{
							relleno = true;
						}
						else
						{
							relleno = false;
						}
					}
				});
		borrado.add(rellenoFigura, BorderLayout.NORTH);
		
		//LIENZO DONDE SE DIBUJA
		lienzo = new pintarPanel();
		lienzo.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		lienzo.addMouseListener(this);
		lienzo.addMouseMotionListener(this);
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
		c_Blanco.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) {
						seleccionColor = new Color(255, 255, 255);
					}
				});
		colores.add(c_Blanco);
		
		JButton c_Negro = new JButton("                            ");
		c_Negro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		c_Negro.setBackground(new Color(0, 0, 0));
		c_Negro.setOpaque(true);
		c_Negro.setBorder(new LineBorder(Color.LIGHT_GRAY, 6, false));
		c_Negro.setFocusPainted(false);
		c_Negro.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(tool != 6)
				{
					seleccionColor = new Color(0, 0, 0);					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No es posible cambiar el color del borrador");
				}
			}
		});
		colores.add(c_Negro);
		
		JButton c_Gris = new JButton("");
		c_Gris.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		c_Gris.setBackground(new Color(128, 128, 128));
		c_Gris.setOpaque(true);
		c_Gris.setBorder(new LineBorder(Color.LIGHT_GRAY, 6, false));
		c_Gris.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tool != 6)
				{
					seleccionColor = new Color(128, 128, 128);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No es posible cambiar el color del borrador");
				}
			}
	
		});
		colores.add(c_Gris);
		
		JButton c_Azul = new JButton("");
		c_Azul.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		c_Azul.setBackground(new Color(0, 128, 255));
		c_Azul.setOpaque(true);
		c_Azul.setBorder(new LineBorder(Color.LIGHT_GRAY, 6, false));
		c_Azul.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tool != 6)
				{
					seleccionColor = new Color(0, 128, 255);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No es posible cambiar el color del borrador");
				}
			}
	
		});
		colores.add(c_Azul);
		
		JButton c_Rojo = new JButton("");
		c_Rojo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		c_Rojo.setBackground(new Color(128, 0, 0));
		c_Rojo.setOpaque(true);
		c_Rojo.setBorder(new LineBorder(Color.LIGHT_GRAY, 6, false));
		c_Rojo.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tool != 6)
				{
					seleccionColor = new Color(128, 0, 0);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No es posible cambiar el color del borrador");
				}
			}
	
		});
		colores.add(c_Rojo);
		
		JButton c_Verde = new JButton("");
		c_Verde.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		c_Verde.setBackground(new Color(0, 128, 0));
		c_Verde.setOpaque(true);
		c_Verde.setBorder(new LineBorder(Color.LIGHT_GRAY, 6, false));
		c_Verde.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tool != 6)
				{
					seleccionColor = new Color(0, 128, 0);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No es posible cambiar el color del borrador");
				}
			}
	
		});
		colores.add(c_Verde);
		
		JButton c_Naranja = new JButton("");
		c_Naranja.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		c_Naranja.setBackground(new Color(255, 128, 0));
		c_Naranja.setOpaque(true);
		c_Naranja.setBorder(new LineBorder(Color.LIGHT_GRAY, 6, false));
		c_Naranja.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tool != 6)
				{
					seleccionColor = new Color(255, 128, 0);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No es posible cambiar el color del borrador");
				}
			}
	
		});
		colores.add(c_Naranja);
		
		JButton c_Morado = new JButton("");
		c_Morado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		c_Morado.setBackground(new Color(128, 0, 128));
		c_Morado.setOpaque(true);
		c_Morado.setBorder(new LineBorder(Color.LIGHT_GRAY, 6, false));
		c_Morado.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tool != 6)
				{
					seleccionColor = new Color(128, 0, 128);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No es posible cambiar el color del borrador");
				}
			}
	
		});
		colores.add(c_Morado);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(tool == 2)
		{
			figuritas.add(new ColocarFigura(e.getX() - (seleccionGrosor * 4), e.getY() - (seleccionGrosor * 4) / 2, (seleccionGrosor * 4) * 2, (seleccionGrosor * 4), seleccionGrosor, seleccionColor, tool, relleno));
		}
		if(tool == 3)
		{
			figuritas.add(new ColocarFigura(e.getX() - (seleccionGrosor * 4), e.getY() - (seleccionGrosor * 4), (seleccionGrosor * 4) * 2, (seleccionGrosor * 4) * 2, seleccionGrosor, seleccionColor, tool, relleno));
		}
		if(tool == 5)
		{
			figuritas.add(new ColocarFigura(e.getX(), e.getY(), e.getX(), e.getY(),  seleccionGrosor, seleccionColor, tool, false));
		}
		lienzo.repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(tool == 5)
		{
			figuritas.add(new ColocarFigura(e.getX(), e.getY(), e.getX(), e.getY(), seleccionGrosor, seleccionColor, tool, false));
		}
		coordX = e.getX();
		coordY = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(tool == 1 || tool == 6)
		{
			ArrayList listaAux = (ArrayList)coords.clone();
			
			listaCoords.add(listaAux);
						
			coords.clear();			
		}
		if(tool == 2 || tool == 3)
		{
			ArrayList figurasAux = (ArrayList)figuritas.clone();
			
			listaFiguras.add(figurasAux);
		}
		if(tool == 5)
		{
			figuritas.add(new ColocarFigura(e.getX(), e.getY(), coordX, coordY, seleccionGrosor, seleccionColor, tool, false));
		}
		lienzo.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(tool == 1 || tool == 6)
		{
			
			coords.add(new Puntero(e.getX(), e.getY(), seleccionGrosor, seleccionColor));
		}
		lienzo.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		lienzo.repaint();
	}

	//CLASE PARA PINTAR
	public  class pintarPanel extends JPanel
	{
		public pintarPanel()
		{
			this.setBackground(Color.white);
		}
		
		public void paint (Graphics g)
		{
			super.paint(g);
			
			Graphics2D g2 = (Graphics2D) g;
						
			g2.setStroke(new BasicStroke(3));
			
			//VUELVE A DIBUJAR TODAS LAS LINEAS ALMACENADAS
			for(Iterator<List<Puntero>> iterator = listaCoords.iterator(); iterator.hasNext();)
			{
				List<Puntero> pintar = (List<Puntero>) iterator.next();
				
				System.out.println(listaCoords.size());
				
				//DIBUJA LINEAS EN TIEMPO REAL
				if(pintar.size() > 1)
				{	
					for(int i = 1 ; i < pintar.size() ; i++)
					{	
						Puntero p1 = pintar.get(i - 1);
						
						Puntero p2 = pintar.get(i);
						
						g2.setColor(p1.seleccionColor);
						
						g2.setStroke(new BasicStroke(p1.seleccionGrosor));
						
						g2.drawLine(p1.x, p1.y, p2.x, p2.y);
					}
				}
			}
			
			//VUELVE A DIBUJAR TODAS LAS FIGURAS ALMACENADAS
			for(Iterator<List<ColocarFigura>> iterator = listaFiguras.iterator(); iterator.hasNext();)
			{
				List<ColocarFigura> colocar = (List<ColocarFigura>) iterator.next();
				
				System.out.println(listaFiguras.size());
				
				if(colocar.size() > 1)
				{
					for(int i = 1 ; i < colocar.size() ; i++)
					{
						ColocarFigura f = colocar.get(i - 1);
						
						g2.setColor(f.seleccionColor);
						g2.setStroke(new BasicStroke(3));
						
						//dIBUJA FIGURAS EN TIEMPO REAL
						if(f.t == 2 && f.relleno == false)
						{
							g2.drawRect(f.x, f.y, f.ancho, f.largo);						
						}
						else if(f.t == 2 && f.relleno == true)
						{
							g2.fillRect(f.x, f.y, f.ancho, f.largo);						
						}
						else if(f.t == 3 && f.relleno == false)
						{
							g2.drawArc(f.x, f.y, f.ancho, f.largo, 0, 360);
						}
						else if(f.t == 3 && f.relleno == true)
						{
							g2.fillArc(f.x, f.y, f.ancho, f.largo, 0, 360);
						}
						else if(f.t == 5)
						{
							g2.drawLine(f.x, f.y, f.ancho, f.largo);
							g2.drawLine(f.x, f.y, f.ancho, f.largo);
						}
					}
				}
			}
				
			//DIBUJA LINEAS EN TIEMPO REAL
			if(coords.size() > 1)
			{
				for(int i = 1 ; i < coords.size() ; i++)
				{		
					Puntero p1 = coords.get(i - 1);
					
					Puntero p2 = coords.get(i);
					
					g2.setColor(p1.seleccionColor);
					
					g2.setStroke(new BasicStroke(p1.seleccionGrosor));
					
					g2.drawLine(p1.x, p1.y, p2.x, p2.y);						
				}
			}
			
			//DIBUJA FIGURAS EN TIEMPO REAL
			if(figuritas.size() > 0)
			{
				for(int i = 0 ; i < figuritas.size() ; i++)
				{
					ColocarFigura f = figuritas.get(i);
					
					g2.setColor(f.seleccionColor);
					g2.setStroke(new BasicStroke(3));
					
					if(f.t == 2 && f.relleno == false)
					{
						g2.drawRect(f.x, f.y, f.ancho, f.largo);						
					}
					else if(f.t == 2 && f.relleno == true)
					{
						g2.fillRect(f.x, f.y, f.ancho, f.largo);						
					}
					else if(f.t == 3 && f.relleno == false)
					{
						g2.drawArc(f.x, f.y, f.ancho, f.largo, 0, 360);
					}
					else if(f.t == 3 && f.relleno == true)
					{
						g2.fillArc(f.x, f.y, f.ancho, f.largo, 0, 360);
					}
					else if(f.t == 5)
					{
						g2.drawLine(f.x, f.y, f.ancho, f.largo);
						g2.drawLine(f.x, f.y, f.ancho, f.largo);
					}
				}
			}
		}
	}

	//CLASE PARA CAMBIAR DE COLOR Y GROSOR
	public class Puntero
	{
		int x, y, seleccionGrosor;
		Color seleccionColor;
		
		public  Puntero(int x, int y, int seleccionGrosor, Color seleccionColor)
		{
			this.x = x;
			this.y = y;
			this.seleccionGrosor = seleccionGrosor;
			this.seleccionColor = seleccionColor;
		}
	}
	
	//CLASE PARA CREAR FIGURAS
	public class ColocarFigura 
	{
		int x, y, ancho, largo, seleccionGrosor, t;
		Color seleccionColor;
		boolean relleno;
		
		public  ColocarFigura(int x, int y, int ancho, int largo, int seleccionGrosor, Color seleccionColor, int t, boolean relleno)
		{
			this.x = x;
			this.y = y;
			this.ancho = ancho;
			this.largo = largo;
			this.seleccionGrosor = seleccionGrosor;
			this.seleccionColor = seleccionColor;
			this.t = t;
			this.relleno = relleno;
		}
	}
	
}
