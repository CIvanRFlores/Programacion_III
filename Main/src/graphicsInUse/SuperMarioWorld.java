package graphicsInUse;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SuperMarioWorld extends JFrame
{
	public SuperMarioWorld (String tittle)
	{
		
		this.setTitle(tittle);
		this.setVisible(true);
		this.setSize(1097, 799);
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		ImageIcon icon = new ImageIcon("SMWIcon.png");
		this.setIconImage(icon.getImage());
	}
	
	public void paint (Graphics g)
	{
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		//FONDO
		
		g2.setColor(new Color(6, 101, 192));

		g2.fillRect(0, 0, 1097, 799);
		
		//nubes del fondo
		
		////
		
		g2.setColor(new Color(178, 210, 213));
		
		g2.fillArc(830, 290, 90, 50, 90, 180);
		
		g2.fillRect(875, 290, 150, 50);
		
		g2.fillArc(980, 290, 90, 50, 90, -180);
		
		g2.setColor(new Color(234, 245, 250));
		
		g2.fillArc(830, 280, 90, 50, 90, 180);
		
		g2.fillRect(875, 280, 150, 50);
		
		g2.fillArc(980, 280, 90, 50, 90, -180);
		
		////
		
		g2.setColor(new Color(178, 210, 213));
		
		g2.fillArc(900, 230, 90, 50, 90, 180);
		
		g2.fillRect(945, 230, 150, 50);
		
		g2.fillArc(1050, 230, 90, 50, 90, -180);
		
		g2.setColor(new Color(234, 245, 250));
		
		g2.fillArc(900, 220, 90, 50, 90, 180);
		
		g2.fillRect(945, 220, 150, 50);
		
		g2.fillArc(1050, 220, 90, 50, 90, -180);
		
		////

		g2.setColor(new Color(178, 210, 213));
		
		g2.fillArc(360, 510, 90, 50, 90, 180);
		
		g2.fillRect(405, 510, 150, 50);
		
		g2.fillArc(510, 510, 90, 50, 90, -180);
		
		g2.setColor(new Color(234, 245, 250));
		
		g2.fillArc(360, 500, 90, 50, 90, 180);
		
		g2.fillRect(405, 500, 150, 50);
		
		g2.fillArc(510, 500, 90, 50, 90, -180);
		
		////
		
		g2.setColor(new Color(178, 210, 213));
		
		g2.fillArc(250, 570, 90, 50, 90, 180);
		
		g2.fillRect(295, 570, 150, 50);
		
		g2.fillArc(400, 570, 90, 50, 90, -180);
		
		g2.setColor(new Color(234, 245, 250));
		
		g2.fillArc(250, 560, 90, 50, 90, 180);
		
		g2.fillRect(295, 560, 150, 50);
		
		g2.fillArc(400, 560, 90, 50, 90, -180);
		
		////

		g2.setColor(new Color(178, 210, 213));
		
		g2.fillArc(370, 630, 90, 50, 90, 180);
		
		g2.fillRect(415, 630, 150, 50);
		
		g2.fillArc(520, 630, 90, 50, 90, -180);
		
		g2.setColor(new Color(234, 245, 250));
		
		g2.fillArc(370, 620, 90, 50, 90, 180);
		
		g2.fillRect(415, 620, 150, 50);
		
		g2.fillArc(520, 620, 90, 50, 90, -180);
		
		//estructuras
		g2.setColor(new Color(161, 200, 204));
		
		g2.fillRect(50, 280, 220, 600);
		
		g2.fillArc(50, 190, 220, 180, 0, 180);
		
		g2.setColor(new Color(185, 223, 224));
		
		g2.fillRect(40, 280, 210, 600);
		
		g2.fillArc(40, 190, 210, 180, 0, 180);
		
		g2.setColor(new Color(198, 227, 231));
		
		g2.fillRect(30, 280, 200, 600);
		
		g2.fillArc(30, 190, 200, 180, 0, 180);
		
		
		////

		g2.setColor(new Color(161, 200, 204));
		
		g2.fillRect(510, 280, 220, 600);
		
		g2.fillArc(510, 190, 220, 180, 0, 180);
		
		g2.setColor(new Color(185, 223, 224));
		
		g2.fillRect(500, 280, 210, 600);
		
		g2.fillArc(500, 190, 210, 180, 0, 180);
		
		g2.setColor(new Color(198, 227, 231));
		
		g2.fillRect(490, 280, 200, 600);
		
		g2.fillArc(490, 190, 200, 180, 0, 180);
		
		
		////
		
		g2.setColor(new Color(161, 200, 204));
		
		g2.fillRect(750, 180, 220, 630);
		
		g2.fillArc(750, 80, 220, 210, 0, 180);
		
		g2.setColor(new Color(185, 223, 224));
		
		g2.fillRect(740, 180, 210, 630);
		
		g2.fillArc(740, 80, 210, 210, 0, 180);
		
		g2.setColor(new Color(198, 227, 231));
		
		g2.fillRect(730, 180, 200, 630);
		
		g2.fillArc(730, 80, 200, 210, 0, 180);
		
		////
		
		g2.setColor(new Color(178, 210, 213));
		
		g2.fillArc(650, 430, 90, 50, 90, 180);
		
		g2.fillRect(695, 430, 150, 50);
		
		g2.fillArc(800, 430, 90, 50, 90, -180);
		
		g2.setColor(new Color(234, 245, 250));
		
		g2.fillArc(650, 420, 90, 50, 90, 180);
		
		g2.fillRect(695, 420, 150, 50);
		
		g2.fillArc(800, 420, 90, 50, 90, -180);
		
		////
		
		g2.setColor(new Color(28, 85, 117));
		
		g2.fillRect(30, 578, 170, 110);
		
		g2.fillArc(-40, 484, 241, 220, 0, 180);
		
		g2.setColor(new Color(69, 132, 168));
		
		g2.fillRect(10, 578, 170, 110);
		
		g2.fillArc(-60, 484, 241, 220, 0, 180);
		
		g2.setColor(new Color(118, 178, 215));
		
		g2.fillRect(0, 578, 160, 110);
		
		g2.fillArc(-70, 484, 231, 220, 0, 180);
		
		////

		g2.setColor(new Color(28, 85, 117));
		
		g2.fillRect(537, 578, 246, 110);
		
		g2.fillArc(534, 480, 249, 220, 0, 180);
		
		g2.setColor(new Color(69, 132, 168));
		
		g2.fillRect(517, 578, 246, 110);
		
		g2.fillArc(514, 480, 249, 220, 0, 180);
		
		g2.setColor(new Color(118, 178, 215));
		
		g2.fillRect(497, 590, 246, 110);
		
		g2.fillArc(495, 480, 249, 220, 0, 180);
		
		////

		g2.setColor(new Color(28, 85, 117));
		
		g2.fillRect(823, 420, 248, 400);
		
		g2.fillArc(823, 322, 249, 220, 0, 180);
		
		g2.setColor(new Color(69, 132, 168));
		
		g2.fillRect(803, 420, 248, 400);
		
		g2.fillArc(803, 322, 249, 220, 0, 180);
		
		g2.setColor(new Color(118, 178, 215));
		
		g2.fillRect(783, 420, 248, 400);
		
		g2.fillArc(783, 322, 249, 220, 0, 180);
		
		//circulos
		g2.setColor(new Color(239, 243, 255));
		
		g2.fillArc(160,  250, 30, 50, 0, 360);
		
		g2.fillArc(160,  380, 30, 50, 0, 360);
		
		g2.fillArc(60,  420, 30, 50, 0, 360);
		
		g2.fillArc(520,  420, 30, 50, 0, 360);
		
		g2.fillArc(520,  300, 30, 50, 0, 360);
		
		g2.fillArc(620,  250, 30, 50, 0, 360);
		
		g2.fillArc(770,  250, 30, 50, 0, 360);
		
		g2.fillArc(860,  150, 30, 50, 0, 360);
		
		g2.setColor(new Color(197, 226, 229));
		
		g2.fillArc(830,  390, 30, 50, 0, 360);
		
		g2.fillArc(930,  570, 30, 50, 0, 360);
		
		//NUBES DELANTE

		g2.setColor(new Color(178, 210, 213));
		
		g2.fillArc(-50, 320, 90, 50, 90, 180);
		
		g2.fillRect(-5, 320, 150, 50);
		
		g2.fillArc(100, 320, 90, 50, 90, -180);
		
		g2.setColor(new Color(234, 245, 250));
		
		g2.fillArc(-50, 310, 90, 50, 90, 180);
		
		g2.fillRect(-5, 310, 150, 50);
		
		g2.fillArc(100, 310, 90, 50, 90, -180);
		
		/////
		g2.setColor(new Color(178, 210, 213));
		
		g2.fillArc(300, 370, 90, 50, 90, 180);
		
		g2.fillRect(345, 370, 150, 50);
		
		g2.fillArc(450, 370, 90, 50, 90, -180);
		
		g2.setColor(new Color(234, 245, 250));
		
		g2.fillArc(300, 360, 90, 50, 90, 180);
		
		g2.fillRect(345, 360, 150, 50);
		
		g2.fillArc(450, 360, 90, 50, 90, -180);
		
		//TUBO
		
		//tubo 1
		g2.setColor(new Color(136, 133, 207));
		
		g2.fillRect(565, 480, 140, 45);
		
		g2.fillRect(575, 523, 120, 153);
		
		g2.setColor(Color.WHITE);
		
		g2.fillRect(593, 480, 10, 45);
		
		g2.fillRect(600, 523, 10, 153);
		
		g2.setColor(new Color(77, 76, 151));
		
		g2.fillRect(673, 480, 34, 45);
		
		g2.fillRect(666, 523, 31, 153);
		
		g2.setColor(new Color(136, 133, 207));
		
		g2.fillRect(680, 480, 5, 45);
		
		g2.fillRect(676, 523, 5, 153);
		
		g2.setColor(Color.BLACK);
		
		g2.setStroke(new BasicStroke(5));
		
		g2.drawRoundRect(565, 480, 140, 45, 15, 15);
		
		g2.drawRect(575, 525, 120, 149);
		
		//tubo 2
		g2.setColor(new Color(136, 133, 207));
		
		g2.fillRect(1015, 550, 140, 45);
		
		g2.fillRect(1025, 593, 120, 153);
		
		g2.setColor(Color.WHITE);
		
		g2.fillRect(1043, 550, 10, 45);
		
		g2.fillRect(1050, 593, 10, 153);
		
		g2.setColor(new Color(77, 76, 151));
		
		g2.fillRect(1123, 550, 34, 45);
		
		g2.fillRect(1116, 593, 31, 153);
		
		g2.setColor(new Color(136, 133, 207));
		
		g2.fillRect(1130, 550, 5, 45);
		
		g2.fillRect(1126, 593, 5, 153);
		
		g2.setColor(Color.BLACK);
		
		g2.setStroke(new BasicStroke(5));
		
		g2.drawRoundRect(1015, 550, 140, 45, 15, 15);
		
		g2.drawRect(1025, 595, 120, 149);
		
		
		//SUPERFICIE
		
		//piso
		g2.setColor(new Color(207, 159, 88));
		
		g2.fillRect(0, 674, 1097, 125);
		
		//pasto
		g2.setColor(new Color(122, 103, 44));
		
		int x = -8;
		int y = 32;
		
		for(int i = 0; i < 15; i++)
		{	
			g2.fillArc(x, 672, 45, 40, 0, -180);
			
			g2.fillArc(y, 662, 60, 50, 0, -180);
			
			x += 100;
			y += 100;
		}
		
		g2.setColor(new Color(15, 198, 13));
		
		g2.fillRect(0, 674, 1097, 10);
		
		x = -4;
		y = 40;
		
		for(int i = 0; i < 15; i++)
		{	
			g2.fillArc(x, 664, 45, 40, 0, -180);
			
			g2.fillArc(y, 654, 60, 50, 0, -180);
			
			x += 100;
			y += 100;
		}
		
		g2.setColor(Color.BLACK);
		
		g2.setStroke(new BasicStroke(3));
		
		g2.drawLine(0, 675, 1097, 675);
		
		//PIEDRAS

		g2.setColor(new Color(119, 116, 118));
		
		g2.fillRoundRect(953, 613, 60, 60, 20, 20);
		
		g2.fillRoundRect(953, 553, 60, 60, 20, 20);
		
		g2.fillRoundRect(953, 493, 60, 60, 20, 20);
		
		g2.fillRoundRect(953, 433, 60, 60, 20, 20);
		
		g2.setColor(new Color(232, 176, 38));
		
		g2.fillRoundRect(1013, 433, 60, 60, 20, 20);
		
		g2.fillRoundRect(1073, 433, 60, 60, 20, 20);
		
		g2.setColor(new Color(192, 189, 193));
		
		g2.fillRoundRect(953, 613, 53, 53, 20, 20);
		
		g2.fillRoundRect(953, 553, 53, 53, 20, 20);
		
		g2.fillRoundRect(953, 493, 53, 53, 20, 20);
		
		g2.fillRoundRect(953, 433, 53, 53, 20, 20);
		
		g2.setColor(new Color(247, 220, 36));
		
		g2.fillRoundRect(1013, 433, 53, 53, 20, 20);
		
		g2.fillRoundRect(1073, 433, 53, 53, 20, 20);
		
		g2.setColor(Color.BLACK);
		
		g2.setStroke(new BasicStroke(4));
		
		g2.drawRoundRect(953, 613, 60, 60, 20, 20);
		
		g2.drawRoundRect(953, 553, 60, 60, 20, 20);
		
		g2.drawRoundRect(953, 493, 60, 60, 20, 20);
		
		g2.drawRoundRect(953, 433, 60, 60, 20, 20);
		
		g2.drawRoundRect(1013, 433, 60, 60, 20, 20);
		
		g2.drawRoundRect(1073, 433, 60, 60, 20, 20);
		
		g2.fillArc(1050, 445, 7, 23, 0, 360);
		
		g2.fillArc(1029, 445, 7, 23, 0, 360);
	}
}
