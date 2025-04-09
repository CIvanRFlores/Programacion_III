package graphicsInUse;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import graphicsInUse.paint.Puntero;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class GameTest implements KeyListener{

	private JFrame frame;
	public JPanel MainPanel;
	
	Image bg, imagenJugador, ImagenBloque;
	
	int tecla = 83;
	
	Jugador jugador;
	
	ArrayList<Jugador> obstaculos = new ArrayList<Jugador>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameTest window = new GameTest();
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
	public GameTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		jugador = new Jugador(480, 225, 60, 60, imagenJugador);
		
		obstaculos.add(new Jugador(210, 300, 60, 60, ImagenBloque));
		obstaculos.add(new Jugador(540, 120, 60, 60, ImagenBloque));
		obstaculos.add(new Jugador(330, 450, 60, 60, ImagenBloque));
		obstaculos.add(new Jugador(780, 285, 60, 60, ImagenBloque));
		
		//inicializar obstaculos
		
		frame = new JFrame();
		frame.setBounds(0, 0, 1140, 672);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Code's Dungeon");
		frame.setResizable(false);
		frame.setFocusable(true);
		frame.addKeyListener(new KeyListener()
				{

					@Override
					public void keyTyped(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void keyPressed(KeyEvent e) {
						
						System.out.println("\nCodigo de tecla: " + e.getKeyCode());
						
						//Tecla W
						if(e.getKeyCode() == 87)
						{
							for(Jugador obstaculo : obstaculos)
							{
								if(jugador.colision(obstaculo))
								{
									System.out.println("Colision detectada");
									
									System.out.println("Coordenada x: " + obstaculo.x + " Coordenada y: " + obstaculo.y);
									System.out.println("coordenada jugador x: " + jugador.x + " coordenada jugador y: " + jugador.y);
									
									jugador.y += 15;
								}
							}
							if(jugador.y == 0)
							{
								jugador.y += 15;
							}
							jugador.y -= 15;
							tecla = 87;
						}
						//Tecla S
						if(e.getKeyCode() == 83)
						{
							for(Jugador obstaculo : obstaculos)
							{
								if(jugador.colision(obstaculo))
								{
									System.out.println("Colision detectada");
									
									System.out.println("Coordenada x: " + obstaculo.x + " Coordenada y: " + obstaculo.y);
									System.out.println("coordenada jugador x: " + jugador.x + " coordenada jugador y: " + jugador.y);
									
									jugador.y -= 15;
								}
							}
							if(jugador.y == 495)
							{
								jugador.y -= 15;
							}
							jugador.y += 15;
							tecla = 83;
						}
						//Tecla A
						if(e.getKeyCode() == 65)
						{
							for(Jugador obstaculo : obstaculos)
							{
								if(jugador.colision(obstaculo))
								{
									System.out.println("Colision detectada");
									
									System.out.println("Coordenada x: " + obstaculo.x + " Coordenada y: " + obstaculo.y);
									System.out.println("coordenada jugador x: " + jugador.x + " coordenada jugador y: " + jugador.y);
									
									jugador.x += 15;
								}
							}
							if(jugador.x == 20)
							{
								jugador.x += 15;
							}
							jugador.x -= 15;
							tecla = 65;
						}
						//Tecla D
						if(e.getKeyCode() == 68)
						{
							for(Jugador obstaculo : obstaculos)
							{
								if(jugador.colision(obstaculo))
								{
									System.out.println("Colision detectada");
									
									System.out.println("Coordenada x: " + obstaculo.x + " Coordenada y: " + obstaculo.y);
									System.out.println("coordenada jugador x: " + jugador.x + " coordenada jugador y: " + jugador.y);
									
									jugador.x -= 15;
								}
							}
							if(jugador.x == 1040)
							{
								jugador.x -= 15;
							}
							jugador.x += 15;
							tecla = 68;
						}
						//Tecla R = RESETEAR
						if(e.getKeyCode() == 82)
						{
							frame.requestFocusInWindow();
							jugador.x = 485;
							jugador.y = 225;
							tecla = 83;
							frame.repaint();
						}
						frame.repaint();
						frame.revalidate();
					}

					@Override
					public void keyReleased(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
		
		MainPanel = new pintarPanel();
		MainPanel.setBounds(0, 0, 1126, 603);
		frame.getContentPane().add(MainPanel, BorderLayout.CENTER);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JButton reiniciar = new JButton("REINICIAR");
		reiniciar.setFocusTraversalPolicyProvider(true);
		reiniciar.setFocusPainted(false);
		reiniciar.setFont(new Font("Tahoma", Font.BOLD, 20));
		reiniciar.setForeground(new Color(255, 255, 255));
		reiniciar.setBackground(new Color(181, 136, 68));
		frame.getContentPane().add(reiniciar, BorderLayout.SOUTH);
		reiniciar.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						frame.requestFocusInWindow();
						jugador.x = 485;
						jugador.y = 225;
						tecla = 83;
						frame.repaint();
					}
			
				});
		
		frame.repaint();
	}
	
	public  class pintarPanel extends JPanel
	{
		public pintarPanel()
		{
			this.setBackground(Color.BLACK);
		}
		
		public void paint (Graphics g)
		{
			super.paint(g);
			
			Graphics2D g2 = (Graphics2D) g;
			
			g2.setColor(Color.YELLOW);
			
			//DIBUJAR FONDO-------------------------------------------------------------
			try {
				bg = ImageIO.read(new File("bg.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			g2.drawImage(bg, 0, 0, 1130, 610, this);

			//DIBUJAR BLOQUE____________________________________________________________
			try {
				ImagenBloque = ImageIO.read(new File("Block.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			for(Jugador obstaculo : obstaculos)
			{
				g2.drawImage(ImagenBloque, obstaculo.x, obstaculo.y, 60, 60, this);
				g2.setColor(Color.BLUE);
//				g2.fillRect(obstaculo.x, obstaculo.y, obstaculo.ancho, obstaculo.alto);
			}
			
			//DIBUJAR JUGADOR---------------------------------------------------------
			if(tecla == 87)
			{
				try {
					imagenJugador = ImageIO.read(new File("isaacAtras.png"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				g2.drawImage(imagenJugador, jugador.x - 5, jugador.y - 5, 70, 70, this);
			}
			if(tecla == 83)
			{
				try {
					imagenJugador = ImageIO.read(new File("isaacFrente.png"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				g2.drawImage(imagenJugador, jugador.x - 5, jugador.y - 5, 70, 70, this);				
			}
			if(tecla == 65)
			{
				try {
					imagenJugador = ImageIO.read(new File("isaacIzquierda.png"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				g2.drawImage(imagenJugador, jugador.x - 5, jugador.y - 5, 70, 70, this);				
			}
			if(tecla == 68)
			{
				try {
					imagenJugador = ImageIO.read(new File("isaacDerecha.png"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				g2.drawImage(imagenJugador, jugador.x - 5, jugador.y - 5, 70, 70, this);				
			}
			g2.setColor(Color.YELLOW);
//			g2.fillRect(jugador.x, jugador.y, jugador.ancho, jugador.alto);
		}
	}

	//Metodos de KeyListener
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	class Jugador
	{
		int x = 0, y = 0, ancho = 0, alto = 0;
		Color c = Color.BLACK;
		Image imagen;
		
		public Jugador(int  x, int y, int ancho, int alto, Image imagen)
		{
			this.x = x;
			this.y = y;
			this.ancho = ancho;
			this.alto = alto;
			this.imagen = imagen;
		}
		
		public boolean colision(Jugador target)
		{
			return (this.x < target.x + target.ancho &&
	                this.x + this.ancho > target.x &&
	                this.y < target.y + target.alto &&
	                this.y + this.alto > target.y);
		}
	}
}
