package graphicsInUse;

import javax.swing.JFrame;

public class SuperMarioWorld extends JFrame
{
	public SuperMarioWorld (String tittle)
	{
		
		this.setTitle(tittle);
		this.setVisible(true);
		this.setSize(1280, 720);
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}
