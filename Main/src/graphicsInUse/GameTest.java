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
	
	Image bg, p_Frente, p_Atras, p_Izquierda, p_Derecha;
	
	int coordX = 485, coordY = 225, tecla = 83;
	
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
							if(coordY == 0)
							{
								coordY += 15;
							}
							coordY -= 15;
							tecla = 87;
						}
						//Tecla S
						if(e.getKeyCode() == 83)
						{
							if(coordY == 495)
							{
								coordY -= 15;
							}
							coordY += 15;
							tecla = 83;
						}
						//Tecla A
						if(e.getKeyCode() == 65)
						{
							if(coordX == 20)
							{
								coordX += 15;
							}
							coordX -= 15;
							tecla = 65;
						}
						//Tecla D
						if(e.getKeyCode() == 68)
						{
							if(coordX == 1040)
							{
								coordX-= 15;
							}
							coordX += 15;
							tecla = 68;
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
						coordX = 485;
						coordY = 225;
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
			
			try {
				bg = ImageIO.read(new File("bg.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			g2.drawImage(bg, 0, 0, 1130, 610, this);
			
			try {
				p_Frente = ImageIO.read(new File("isaacFrente.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				p_Atras = ImageIO.read(new File("isaacAtras.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				p_Izquierda = ImageIO.read(new File("isaacIzquierda.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				p_Derecha = ImageIO.read(new File("isaacDerecha.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			if(tecla == 87)
			{
				g2.drawImage(p_Atras, coordX, coordY, 70, 70, this);				
			}
			if(tecla == 83)
			{
				g2.drawImage(p_Frente, coordX, coordY, 80, 80, this);				
			}
			if(tecla == 65)
			{
				g2.drawImage(p_Izquierda, coordX, coordY, 70, 70, this);				
			}
			if(tecla == 68)
			{
				g2.drawImage(p_Derecha, coordX, coordY, 70, 70, this);				
			}
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
}
