package graphicsInUse;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class House extends JFrame
{
	public House (String tittle)
	{
		
		this.setTitle(tittle);
		this.setVisible(true);
		this.setSize(727, 708);
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//QUE PASA CUANDO CIERRO MI APLICACION
		this.setLocationRelativeTo(null);	//SOBRE QUE ELEMENTOS COLOCARE MI ITEM
	}
	
	public void paint (Graphics g)
	{
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		//CASA
		
		g2.setColor(new Color(28, 25, 54));
		
		g2.fillRect(0, 0, 727, 700);
		
		g2.setColor(Color.BLACK);
		
		g2.setStroke(new BasicStroke(3));
		
		g2.drawRect(213,105,300,400);
		
		g2.setColor(new Color(176,179,169));
		
		g2.fillRect(213, 105, 300, 400);
		
		g2.fillRect(213, 75, 190, 250);
		
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(2));
		
		g2.drawRect(212, 75, 190, 250);
		
		g2.setColor(new Color(80,82,77));
		
		int[] xs = {213, 240, 370, 403};
		int[] ys = {325, 340, 340, 325};
		
		g2.fillPolygon(xs, ys, 4);;
		
		//TECHO
		
		g2.setColor(new Color(204, 220, 247));
		
		g2.fillRect(203, 55, 210, 20);
		
		g2.fillRect(403, 85, 123, 19);
		
		g2.setColor(new Color(84, 91, 102));
		
		int[] xs2 = {203, 213, 402, 412};
		int[] ys2 = {75, 83, 83, 75};
		
		g2.fillPolygon(xs2, ys2, 4);
		
		int[] xs3 = {403, 403, 516, 526};
		int[] ys3 = {104, 114, 114, 104};
		
		g2.fillPolygon(xs3, ys3, 4);
		
		//VENTANA
		
		g2.setColor(new Color(255, 242, 0));
		
		g2.fillRect(413, 151, 65, 80);
		
		g2.fillRect(413, 383, 65, 80);
		
		g2.setColor(Color.BLACK);
		
		g2.drawLine(453, 151, 453, 231);
		
		g2.drawLine(433, 383, 433, 463);
		
		g2.drawRect(413, 151, 65, 80);
		
		g2.drawRect(413, 383, 65, 80);
		
		
		//PUERTA
		
		g2.setColor(Color.BLACK);
		
		g2.drawRect(308, 385, 70, 120);
		
		g2.setColor(new Color(232, 168, 86));
		
		g2.fillRect(308, 385, 70, 120);
		
		g2.setColor(Color.BLACK);
		
		g2.drawArc(315, 445, 10, 10, 0, 360);
		
		g2.setColor(new Color(255, 201, 14));
		
		g2.fillArc(315, 445, 10, 10, 0, 360);
		
		//VALLAS
		
		g2.setColor(new Color(120, 70, 23));
		
		int[] xs4 = {0, 0, 213, 213};
		int[] ys4 = {350, 595, 505, 445};
		
		g2.fillPolygon(xs4, ys4, 4);
		
		int[] xs5 = {513, 513, 727, 727};
		int[] ys5 = {445, 505, 595, 350};
		
		g2.fillPolygon(xs5, ys5, 4);
		
		g2.setColor(new Color(186, 108, 35));
		
		g2.setStroke(new BasicStroke(3));
		
		//VALLA IZQUIERDA
		g2.drawLine(40, 385, 40, 560);
		
		g2.drawLine(120, 420, 120, 530);
		
		g2.drawLine(190, 450, 190, 505);
		
		
		//VALLA DERECHA
		g2.drawLine(536, 450, 536, 505);

		g2.drawLine(606, 420, 606, 530);

		g2.drawLine(686, 385, 686, 560);
		
		//PATIO
		
		g2.setColor(new Color(71, 194, 21));
		
		int[] xs6 = {0, 0, 213, 513, 727, 727};
		int[] ys6 = {708, 595, 505, 505, 595, 708};
		
		g2.fillPolygon(xs6, ys6, 6);
		
		//CIELO
		
		g2.setColor(Color.white);
		
		g2.fillArc(65, 80, 80, 80, 0, 360);
		
		g2.fillArc(100, 200, 10, 10, 0, 360);
		
		g2.fillArc(130, 240, 10, 10, 0, 360);
		
		g2.fillArc(170, 180, 10, 10, 0, 360);
		
		g2.fillArc(540, 150, 10, 10, 0, 360);
		
		g2.fillArc(580, 170, 10, 10, 0, 360);
		
		g2.fillArc(640, 245, 10, 10, 0, 360);
		
		g2.fillArc(655, 100, 10, 10, 0, 360);
	}
}
