package aplication;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SecondWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondWindow frame = new SecondWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SecondWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setBackground(Color.CYAN);

		setContentPane(contentPane);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;	//SE CREA EL PINCEL
		
		g2.setColor(Color.RED);	//SIRVE PARA CAMBIAR EL COLOR DEL PINCEL
		
		g2.clearRect(100, 100, 50, 50);	//FUNCIONA COMO UN BORRADOR
		
		g2.drawRect(50, 50, 400, 400);	//DIBUJA EL CONTORNO DE LA FIGURA
		
		g2.fillRect(200, 200, 200, 200);	//DIBUJA LA FIGURA RELLENADA
		
		g2.setColor(Color.GREEN);
		
		g2.fillRoundRect(460, 80, 200, 200, 30, 30);	//DIBUJA LA FIGURA RELLENA PERO CON BORDES REDONDOS
		
		g2.setColor(Color.YELLOW);
		
		g2.setStroke(new BasicStroke(10));	//MODIFICA EL GROSOR DEL PINCEL
		
		g2.drawLine(10, 10, 710, 670);	//DIBUJA UNA LINEA DE UN PUNTO A OTRO
		
		g2.setColor(Color.CYAN);
		
		g2.drawOval(570, 300, 90, 180);
		
		g2.fillOval(480, 300, 90, 180);
		
		g2.setColor(Color.ORANGE);
		
		g2.drawArc(80, 400, 100, 100, 0, -180);
		
		g2.fillArc(80, 400, 100, 100, 0, 180);
		
		g2.setColor(Color.MAGENTA);
		
		g2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		g2.drawString("Buenos dias pibe", 30, 560);
		
		BufferedImage image;
		try {
			image = ImageIO.read(new File("cat.png"));
			g2.drawImage(image, 200, 200, 400, 400, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int[] xs = {100,100,400};
		int[] ys = {100,200,400};
		
		g2.drawPolygon(xs, ys, 3);
		
		int[] xs2 = {200,200,400};
		int[] ys2 = {200,300,400};
		
		g2.fillPolygon(xs2, ys2, 3);
	}


}
