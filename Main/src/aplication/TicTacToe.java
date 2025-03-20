package aplication;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ColorUIResource;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class TicTacToe {

	private JFrame frame;

	public boolean turno = true;
	public String player = "X";
	public JButton btnNewButton;
	public JButton btnNewButton_1;
	public JButton btnNewButton_2;
	public JButton btnNewButton_3;
	public JButton btnNewButton_4;
	public JButton btnNewButton_5;
	public JButton btnNewButton_6;
	public JButton btnNewButton_7;
	public JButton btnNewButton_8;
	Font jugador = new Font("Tahoma", Font.BOLD, 0);
	public int player_X = 0;
	public int player_O = 0;
	private JLabel lblNewLabel;
	private JButton btnNewButton_9;
	
	ImageIcon iconPX = new ImageIcon("PX.png");
	ImageIcon iconMPX = new ImageIcon(iconPX.getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
	
	ImageIcon iconPO = new ImageIcon("PO.png");
	ImageIcon iconMPO = new ImageIcon(iconPO.getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 613, 635);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setBackground(Color.CYAN);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 3, 15, 15));
		panel.setOpaque(true);
		panel.setBackground(new Color(211, 134, 0));
		frame.getContentPane().add(panel);
		
		btnNewButton = new JButton("");
		panel.add(btnNewButton);
		btnNewButton.setBackground(new Color(255, 255, 132));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorder(new LineBorder(Color.WHITE, 4));
		btnNewButton.setFont(jugador);
		btnNewButton.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) 
					{						
						if(turno)
						{
							turno = false;
							player = "X";
							btnNewButton.setIcon(iconMPX);
							btnNewButton.setDisabledIcon(iconMPX);
						}
						else
						{
							turno = true;
							player = "O";
							btnNewButton.setIcon(iconMPO);
							btnNewButton.setDisabledIcon(iconMPO);
						}
						
						btnNewButton.setText(player);
						btnNewButton.setEnabled(false);
						ganador();
					}
			
				});
		
		btnNewButton_1 = new JButton(" ");
		panel.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(255, 255, 132));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBorder(new LineBorder(Color.WHITE, 4));
		btnNewButton_1.setFont(jugador);
		btnNewButton_1.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				if(turno)
				{
					turno = false;
					player = "X";
					btnNewButton_1.setIcon(iconMPX);
					btnNewButton_1.setDisabledIcon(iconMPX);
				}
				else
				{
					turno = true;
					player = "O";
					btnNewButton_1.setIcon(iconMPO);
					btnNewButton_1.setDisabledIcon(iconMPO);
				}
				
				btnNewButton_1.setText(player);
				btnNewButton_1.setEnabled(false);
				ganador();
			}
	
		});
		
		btnNewButton_2 = new JButton("  ");
		panel.add(btnNewButton_2);
		btnNewButton_2.setBackground(new Color(255, 255, 132));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBorder(new LineBorder(Color.WHITE, 4));
		btnNewButton_2.setFont(jugador);
		btnNewButton_2.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				if(turno)
				{
					turno = false;
					player = "X";
					btnNewButton_2.setIcon(iconMPX);
					btnNewButton_2.setDisabledIcon(iconMPX);
				}
				else
				{
					turno = true;
					player = "O";
					btnNewButton_2.setIcon(iconMPO);
					btnNewButton_2.setDisabledIcon(iconMPO);
				}
				
				btnNewButton_2.setText(player);
				btnNewButton_2.setEnabled(false);
				ganador();
			}
	
		});
		
		btnNewButton_3 = new JButton("   ");
		panel.add(btnNewButton_3);
		btnNewButton_3.setBackground(new Color(255, 255, 132));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBorder(new LineBorder(Color.WHITE, 4));
		btnNewButton_3.setFont(jugador);
		btnNewButton_3.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				if(turno)
				{
					turno = false;
					player = "X";
					btnNewButton_3.setIcon(iconMPX);
					btnNewButton_3.setDisabledIcon(iconMPX);
				}
				else
				{
					turno = true;
					player = "O";
					btnNewButton_3.setIcon(iconMPO);
					btnNewButton_3.setDisabledIcon(iconMPO);
				}
				
				btnNewButton_3.setText(player);
				btnNewButton_3.setEnabled(false);
				ganador();
			}
	
		});
		
		btnNewButton_4 = new JButton("    ");
		panel.add(btnNewButton_4);
		btnNewButton_4.setBackground(new Color(255, 255, 132));
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBorder(new LineBorder(Color.WHITE, 4));
		btnNewButton_4.setFont(jugador);
		btnNewButton_4.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				if(turno)
				{
					turno = false;
					player = "X";
					btnNewButton_4.setIcon(iconMPX);
					btnNewButton_4.setDisabledIcon(iconMPX);
				}
				else
				{
					turno = true;
					player = "O";
					btnNewButton_4.setIcon(iconMPO);
					btnNewButton_4.setDisabledIcon(iconMPO);
				}
				
				btnNewButton_4.setText(player);
				btnNewButton_4.setEnabled(false);
				ganador();
			}
	
		});
		
		btnNewButton_5 = new JButton("     ");
		panel.add(btnNewButton_5);
		btnNewButton_5.setBackground(new Color(255, 255, 132));
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBorder(new LineBorder(Color.WHITE, 4));
		btnNewButton_5.setFont(jugador);
		btnNewButton_5.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				if(turno)
				{
					turno = false;
					player = "X";
					btnNewButton_5.setIcon(iconMPX);
					btnNewButton_5.setDisabledIcon(iconMPX);
				}
				else
				{
					turno = true;
					player = "O";
					btnNewButton_5.setIcon(iconMPO);
					btnNewButton_5.setDisabledIcon(iconMPO);
				}
				
				btnNewButton_5.setText(player);
				btnNewButton_5.setEnabled(false);
				ganador();
			}
	
		});
		
		btnNewButton_6 = new JButton("      ");
		panel.add(btnNewButton_6);
		btnNewButton_6.setBackground(new Color(255, 255, 132));
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setBorder(new LineBorder(Color.WHITE, 4));
		btnNewButton_6.setFont(jugador);
		btnNewButton_6.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				if(turno)
				{
					turno = false;
					player = "X";
					btnNewButton_6.setIcon(iconMPX);
					btnNewButton_6.setDisabledIcon(iconMPX);
				}
				else
				{
					turno = true;
					player = "O";
					btnNewButton_6.setIcon(iconMPO);
					btnNewButton_6.setDisabledIcon(iconMPO);
				}
				
				btnNewButton_6.setText(player);
				btnNewButton_6.setEnabled(false);
				ganador();
			}
	
		});
		
		btnNewButton_7 = new JButton("       ");
		panel.add(btnNewButton_7);
		btnNewButton_7.setBackground(new Color(255, 255, 132));
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.setBorder(new LineBorder(Color.WHITE, 4));
		btnNewButton_7.setFont(jugador);
		btnNewButton_7.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				if(turno)
				{
					turno = false;
					player = "X";
					btnNewButton_7.setIcon(iconMPX);
					btnNewButton_7.setDisabledIcon(iconMPX);
				}
				else
				{
					turno = true;
					player = "O";
					btnNewButton_7.setIcon(iconMPO);
					btnNewButton_7.setDisabledIcon(iconMPO);
				}
				
				btnNewButton_7.setText(player);
				btnNewButton_7.setEnabled(false);
				ganador();
			}
	
		});
		
		btnNewButton_8 = new JButton("        ");
		panel.add(btnNewButton_8);
		btnNewButton_8.setBackground(new Color(255, 255, 132));
		btnNewButton_8.setForeground(Color.WHITE);
		btnNewButton_8.setBorder(new LineBorder(Color.WHITE, 4));
		btnNewButton_8.setFont(jugador);
		
		btnNewButton_8.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				if(turno)
				{
					turno = false;
					player = "X";
					btnNewButton_8.setIcon(iconMPX);
					btnNewButton_8.setDisabledIcon(iconMPX);
				}
				else
				{
					turno = true;
					player = "O";
					btnNewButton_8.setIcon(iconMPO);
					btnNewButton_8.setDisabledIcon(iconMPO);
				}
				
				btnNewButton_8.setText(player);
				btnNewButton_8.setEnabled(false);
				ganador();
			}
	

		});
		lblNewLabel = new JLabel("Jugador X : " + player_X + "| " + player_O + " : Jugador O");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		
		btnNewButton_9 = new JButton("Reiniciar");
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_9.setBackground(Color.DARK_GRAY);
		btnNewButton_9.setForeground(Color.WHITE);
		
		btnNewButton_9.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						turno = true;
						player = "X";
						
						btnNewButton.setIcon(null);
						btnNewButton.setText("");
						btnNewButton.setEnabled(true);
						
						btnNewButton_1.setIcon(null);
						btnNewButton_1.setText(" ");
						btnNewButton_1.setEnabled(true);
						
						btnNewButton_2.setIcon(null);
						btnNewButton_2.setText("  ");
						btnNewButton_2.setEnabled(true);
						
						btnNewButton_3.setIcon(null);
						btnNewButton_3.setText("   ");
						btnNewButton_3.setEnabled(true);
						
						btnNewButton_4.setIcon(null);
						btnNewButton_4.setText("    ");
						btnNewButton_4.setEnabled(true);
						
						btnNewButton_5.setIcon(null);
						btnNewButton_5.setText("     ");
						btnNewButton_5.setEnabled(true);
						
						btnNewButton_6.setIcon(null);
						btnNewButton_6.setText("      ");
						btnNewButton_6.setEnabled(true);
						
						btnNewButton_7.setIcon(null);
						btnNewButton_7.setText("       ");
						btnNewButton_7.setEnabled(true);
						
						btnNewButton_8.setIcon(null);
						btnNewButton_8.setText("        ");
						btnNewButton_8.setEnabled(true);
						
					}
			
				});
		
		frame.getContentPane().add(btnNewButton_9, BorderLayout.SOUTH);

	}
		public void ganador()
	{
		
		if(btnNewButton.getText().equals(btnNewButton_1.getText()) && btnNewButton_1.getText().equals(btnNewButton_2.getText()))
		{
			JOptionPane.showMessageDialog(null, "Gano jugador " + player);
			
			if(player.equals("X"))
			{
				player_X++;
				lblNewLabel.setText("Jugador X : " + player_X + "| " + player_O + " : Jugador O");
			}
			else
			{
				player_O++;
				lblNewLabel.setText("Jugador X : " + player_X + "| " + player_O + " : Jugador O");
			}
		}
		else if(btnNewButton_3.getText().equals(btnNewButton_4.getText()) && btnNewButton_4.getText().equals(btnNewButton_5.getText()))
		{
			JOptionPane.showMessageDialog(null, "Gano jugador " + player);
			
			if(player.equals("X"))
			{
				player_X++;
				lblNewLabel.setText("Jugador X : " + player_X + "| " + player_O + " : Jugador O");
			}
			else
			{
				player_O++;
				lblNewLabel.setText("Jugador X : " + player_X + "| " + player_O + " : Jugador O");
			}
			lblNewLabel.revalidate();
		}
		else if(btnNewButton_6.getText().equals(btnNewButton_7.getText()) && btnNewButton_7.getText().equals(btnNewButton_8.getText()))
		{
			JOptionPane.showMessageDialog(null, "Gano jugador " + player);
			
			if(player.equals("X"))
			{
				player_X++;
				lblNewLabel.setText("Jugador X : " + player_X + "| " + player_O + " : Jugador O");
			}
			else
			{
				player_O++;
				lblNewLabel.setText("Jugador X : " + player_X + "| " + player_O + " : Jugador O");
			}
			lblNewLabel.revalidate();
		}
		else if(btnNewButton.getText().equals(btnNewButton_3.getText()) && btnNewButton_3.getText().equals(btnNewButton_6.getText()))
		{
			JOptionPane.showMessageDialog(null, "Gano jugador " + player);
			
			if(player.equals("X"))
			{
				player_X++;
				lblNewLabel.setText("Jugador X : " + player_X + "| " + player_O + " : Jugador O");
			}
			else
			{
				player_O++;
				lblNewLabel.setText("Jugador X : " + player_X + "| " + player_O + " : Jugador O");
			}
			lblNewLabel.revalidate();
		}
		else if(btnNewButton_1.getText().equals(btnNewButton_4.getText()) && btnNewButton_4.getText().equals(btnNewButton_7.getText()))
		{
			JOptionPane.showMessageDialog(null, "Gano jugador " + player);
			
			if(player.equals("X"))
			{
				player_X++;
				lblNewLabel.setText("Jugador X : " + player_X + "| " + player_O + " : Jugador O");
			}
			else
			{
				player_O++;
				lblNewLabel.setText("Jugador X : " + player_X + "| " + player_O + " : Jugador O");
			}
			lblNewLabel.revalidate();
		}
		else if(btnNewButton_2.getText().equals(btnNewButton_5.getText()) && btnNewButton_5.getText().equals(btnNewButton_8.getText()))
		{
			JOptionPane.showMessageDialog(null, "Gano jugador " + player);
			
			if(player.equals("X"))
			{
				player_X++;
				lblNewLabel.setText("Jugador X : " + player_X + "| " + player_O + " : Jugador O");
			}
			else
			{
				player_O++;
				lblNewLabel.setText("Jugador X : " + player_X + "| " + player_O + " : Jugador O");
			}
			lblNewLabel.revalidate();
		}
		else if(btnNewButton.getText().equals(btnNewButton_4.getText()) && btnNewButton_4.getText().equals(btnNewButton_8.getText()))
		{
			JOptionPane.showMessageDialog(null, "Gano jugador " + player);
			
			if(player.equals("X"))
			{
				player_X++;
				lblNewLabel.setText("Jugador X : " + player_X + "| " + player_O + " : Jugador O");
			}
			else
			{
				player_O++;
				lblNewLabel.setText("Jugador X : " + player_X + "| " + player_O + " : Jugador O");
			}
			lblNewLabel.revalidate();
		}
		else if(btnNewButton_6.getText().equals(btnNewButton_4.getText()) && btnNewButton_4.getText().equals(btnNewButton_2.getText()))
		{
			JOptionPane.showMessageDialog(null, "Gano jugador " + player);
			
			if(player.equals("X"))
			{
				player_X++;
				lblNewLabel.setText("Jugador X : " + player_X + "| " + player_O + " : Jugador O");
			}
			else
			{
				player_O++;
				lblNewLabel.setText("Jugador X : " + player_X + "| " + player_O + " : Jugador O");
			}
			lblNewLabel.revalidate();
		}
		else if(btnNewButton.isEnabled() == false && btnNewButton_1.isEnabled() == false && btnNewButton_2.isEnabled() == false 
				&& btnNewButton_3.isEnabled() == false && btnNewButton_4.isEnabled() == false && btnNewButton_5.isEnabled() == false 
				&& btnNewButton_6.isEnabled() == false && btnNewButton_7.isEnabled() == false && btnNewButton_8.isEnabled() == false)
		{
			JOptionPane.showMessageDialog(null, "Empate, no hubo ganador :c");
		}
	}

}
