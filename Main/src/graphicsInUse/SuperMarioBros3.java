package graphicsInUse;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SuperMarioBros3 extends JFrame
{
	public SuperMarioBros3 (String tittle)
	{
		
		this.setTitle(tittle);
		this.setVisible(true);
		this.setSize(1280, 720);
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		ImageIcon icono = new ImageIcon("SM3Icon.png");
		this.setIconImage(icono.getImage());
	}
	
	public void paint ( Graphics g)
	{
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		//CIELO
		g2.setColor(new Color(162, 240, 255));
		
		g2.fillRect(0, 0, 1280, 720);
		
		//PLATAFORMAS
		
		//plataforma 1
		g2.setColor(Color.BLACK);
		
		g2.fillRoundRect(480, 275, 260, 369, 35, 35);
		
		g2.setColor(new Color(113, 194, 255));
		
		g2.fillRoundRect(440, 240, 260, 400, 35, 35);
		
		g2.setColor(new Color(0, 148, 230));
		
		g2.fillRect(679, 245, 21, 390);

		g2.setColor(new Color(0, 109, 174));
		
		g2.fillRect(444, 618, 252, 20);
		
		g2.setColor(Color.BLACK);
		
		g2.setStroke(new BasicStroke(5));
		
		g2.drawRoundRect(440, 240, 260, 400, 35, 35);
		
		g2.setColor(new Color(175, 168, 180));
		
		g2.fillArc(448, 248, 30, 30, 0, 360);
		
		g2.fillArc(654, 248, 30, 30, 0, 360);
		
		g2.fillArc(654, 590, 30, 30, 0, 360);
		
		g2.setColor(Color.BLACK);
		
		g2.setStroke(new BasicStroke(4));
		
		g2.drawArc(448, 248, 30, 30, 0, 360);
		
		g2.drawArc(654, 248, 30, 30, 0, 360);
		
		g2.drawArc(654, 590, 30, 30, 0, 360);
		
		g2.setColor(Color.BLACK);
		
		g2.setStroke(new BasicStroke(3));
		
		g2.drawLine(452, 273, 475, 255);
		
		g2.drawLine(657, 273, 679, 255);
		
		g2.drawLine(657, 614, 679, 596);
		
		//plataforma 2
		g2.setColor(Color.BLACK);
		
		g2.fillRoundRect(315, 435, 260, 209, 35, 35);;
		
		g2.setColor(new Color(255, 192, 181));
		
		g2.fillRoundRect(275, 400, 260, 240, 35, 35);
		
		g2.setColor(new Color(246, 139, 100));
		
		g2.fillRect(514, 404, 20, 232);

		g2.setColor(new Color(231, 159, 129));
		
		g2.fillRect(279, 618, 252, 20);

		g2.setColor(Color.BLACK);
		
		g2.setStroke(new BasicStroke(5));
		
		g2.drawRoundRect(275, 400, 260, 240, 35, 35);
		
		g2.setColor(new Color(175, 168, 180));
		
		g2.fillArc(289, 408, 30, 30, 0, 360);
		
		g2.fillArc(289, 589, 30, 30, 0, 360);
		
		g2.fillArc(490, 408, 30, 30, 0, 360);
		
		g2.fillArc(490, 589, 30, 30, 0, 360);
		
		g2.setColor(Color.BLACK);
		
		g2.setStroke(new BasicStroke(4));
		
		g2.drawArc(289, 408, 30, 30, 0, 360);
		
		g2.drawArc(289, 589, 30, 30, 0, 360);
		
		g2.drawArc(490, 408, 30, 30, 0, 360);
		
		g2.drawArc(490, 589, 30, 30, 0, 360);
		
		g2.setColor(Color.BLACK);
		
		g2.setStroke(new BasicStroke(3));
		
		g2.drawLine(293, 433, 317, 414);
		
		g2.drawLine(293, 614, 317, 595);
		
		g2.drawLine(494, 433, 514, 414);
		
		g2.drawLine(494, 614, 514, 595);
		
		//plataforma 3
		
		g2.setColor(Color.BLACK);
		
		g2.fillRoundRect(1090, 435, 260, 209, 35, 35);;
		
		g2.setColor(new Color(0, 221, 91));
		
		g2.fillRoundRect(1050, 400, 260, 240, 35, 35);
		
		g2.setColor(new Color(10, 96, 31));
		
		g2.fillRect(1054, 618, 252, 20);

		g2.setColor(Color.BLACK);
		
		g2.setStroke(new BasicStroke(5));
		
		g2.drawRoundRect(1050, 400, 260, 240, 35, 35);
		
		g2.setColor(new Color(175, 168, 180));
		
		g2.fillArc(1064, 408, 30, 30, 0, 360);
		
		g2.fillArc(1064, 589, 30, 30, 0, 360);
		
		g2.setColor(Color.BLACK);
		
		g2.setStroke(new BasicStroke(4));
		
		g2.drawArc(1064, 408, 30, 30, 0, 360);
		
		g2.drawArc(1064, 589, 30, 30, 0, 360);
		
		g2.setColor(Color.BLACK);
		
		g2.setStroke(new BasicStroke(3));
		
		g2.drawLine(1068, 433, 1091, 415);
		
		g2.drawLine(1068, 614, 1092, 595);
		
		//PISO
		g2.setColor(new Color(255, 201, 189));
		
		g2.fillRect(0, 640, 1280, 720);
		
		g2.setColor(new Color(50, 42, 29));
		
		g2.setStroke(new BasicStroke(5));
		
		g2.drawLine(0, 640, 1280, 640);
		
		g2.drawLine(0, 660, 1280, 660);
		
		g2.setColor(new Color(255, 151, 102));
		
		g2.fillRect(0, 662, 1280, 58);
		
		//PICOS DEL PISO
		
		g2.setColor(new Color(58, 4, 4));
		
		int[] mover = {40, 40, 40};
		
		int[] xs = {0, 15, 15};
		
		int[] xs2 = {15, 25, 25};
		
		int[] xs3 = {25, 45, 45};
		
		for(int i = 0; i != 34; i++)
		{
			int[] ys = {662, 682, 662};
			
			g2.fillPolygon(xs, ys, 3);
			
			int[] ys2 = {682, 692, 682};
			
			g2.fillPolygon(xs2, ys2, 3);
			
			int[] ys3 = {692, 712, 692};
			
			g2.fillPolygon(xs3, ys3, 3);				

			for(int j = 0; j != 3; j++)
			{
				xs[j] += mover[j];
				xs2[j] += mover[j];
				xs3[j] += mover[j];
			}
		}
		
		//ARBUSTO
		
		//sombra
		g2.setColor(Color.BLACK);
		
		g2.fillRect(60, 630, 60, 10);
		
		g2.fillRect(50, 620, 75, 10);
		
		g2.fillRect(50, 610, 75, 10);
		
		g2.fillRect(60, 600, 60, 10);
		
		g2.fillRect(65, 590, 50, 10);
		
		g2.fillRect(65, 580, 45, 10);
		
		g2.fillRect(75, 570, 25, 10);
		
		//hojas
		g2.setColor(new Color(0, 212, 99));
		
		g2.fillRect(68, 630, 44, 10);
		
		g2.fillRect(58, 620, 59, 10);
		
		g2.fillRect(58, 610, 59, 10);
		
		g2.fillRect(68, 600, 44, 10);
		
		g2.fillRect(73, 590, 35, 10);
		
		g2.fillRect(73, 580, 29, 10);
		
		//BLOQUES FLOTANTES
		
		//sombras
		g2.setColor(Color.BLACK);
		
		g2.fillRect(50, 330, 75, 75);
		
		g2.fillRect(205, 120, 145, 75);
		
		g2.fillRect(1120, 200, 75, 75);
		
		//relleno
		g2.setColor(new Color(255, 136, 82));
		
		g2.fillRoundRect(55, 335, 65, 65, 10, 10);
		
		g2.fillRoundRect(210, 125, 65, 65, 10, 10);
		
		g2.fillRoundRect(280, 125, 65, 65, 10, 10);
		
		g2.fillRoundRect(1125, 205, 65, 65, 10, 10);
		
		//puntos bloque 1
		g2.setColor(Color.BLACK);
		
		g2.fillArc(60, 340, 7, 7, 0, 360);
		
		g2.fillArc(105, 340, 7, 7, 0, 360);
		
		g2.fillArc(60, 385, 7, 7, 0, 360);
		
		g2.fillArc(105, 385, 7, 7, 0, 360);
		
		//puntos bloque 2
		g2.fillArc(215, 130, 7, 7, 0, 360);
		
		g2.fillArc(260, 130, 7, 7, 0, 360);
		
		g2.fillArc(215, 175, 7, 7, 0, 360);
		
		g2.fillArc(260, 175, 7, 7, 0, 360);
		
		//puntos bloque 3
		g2.fillArc(285, 130, 7, 7, 0, 360);
		
		g2.fillArc(330, 130, 7, 7, 0, 360);
		
		g2.fillArc(285, 175, 7, 7, 0, 360);
		
		g2.fillArc(330, 175, 7, 7, 0, 360);
		
		//puntos bloque 3
		g2.fillArc(1130, 210, 7, 7, 0, 360);
		
		g2.fillArc(1175, 210, 7, 7, 0, 360);
		
		g2.fillArc(1130, 255, 7, 7, 0, 360);
		
		g2.fillArc(1175, 255, 7, 7, 0, 360);
		
		//TUBO
		
		g2.setColor(new Color(0, 139, 0));
		
		g2.fillRect(815, 400, 155, 70);
		
		g2.fillRect(825, 470, 135, 168);
		
		g2.setColor(new Color(0, 229, 85));
		
		g2.fillRect(828, 400, 8, 70);
		
		g2.fillRect(843, 400, 16, 70);
		
		g2.fillRect(868, 400, 4, 70);
		
		g2.fillRect(910, 400, 8, 70);
		
		g2.fillRect(835, 470, 8, 168);
		
		g2.fillRect(850, 470, 16, 168);
		
		g2.fillRect(875, 470, 4, 168);
		
		g2.fillRect(903, 470, 8, 168);
		
		g2.setColor(new Color(0, 29, 0));
		
		g2.fillRect(918, 400, 49, 70);
		
		g2.fillRect(911, 470, 46, 168);
		
		g2.setColor(new Color(40, 83, 52));
		
		g2.fillRect(922, 400, 4, 70);
		
		g2.fillRect(930, 400, 5, 70);
		
		g2.fillRect(956, 400, 4, 70);
		
		g2.fillRect(916, 470, 4, 168);
		
		g2.fillRect(926, 470, 5, 168);
		
		g2.fillRect(949, 470, 4, 168);
		
		g2.setColor(Color.BLACK);
		
		g2.setStroke(new BasicStroke(7));
		
		g2.drawRect(815, 400, 155, 70);
		
		g2.drawRect(825, 470, 135, 164);
		
		//IMAGENES
		
		//planta carnivora
		
		BufferedImage image;
		try {
			image = ImageIO.read(new File("piranhaPlant.png"));
			g2.drawImage(image, 790, 270, 220, 150, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Mario Bros
		
		BufferedImage image_2;
		try {
			image_2 = ImageIO.read(new File("mariobros.png"));
			g2.drawImage(image_2, 680, 514, 70, 125, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
