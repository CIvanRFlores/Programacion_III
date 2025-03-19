package aplication;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

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
	Font jugador = new Font("Tahoma", Font.BOLD, 50);
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
		frame.setBounds(0, 0, 614, 637);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		frame.setBackground(Color.CYAN);
		
		JPanel panel = new JPanel();
		panel.setBounds(0 ,0, 600, 600);
		panel.setLayout(new GridLayout(3, 3, 5, 5));
		panel.setOpaque(true);
		panel.setBackground(Color.CYAN);
		frame.add(panel);
		
		btnNewButton = new JButton("");
		panel.add(btnNewButton);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
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
						}
						else
						{
							turno = true;
							player = "O";
						}
						
						btnNewButton.setText(player);
						btnNewButton.setEnabled(false);
						ganador();
					}
			
				});
		
		btnNewButton_1 = new JButton(" ");
		panel.add(btnNewButton_1);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.WHITE);
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
				}
				else
				{
					turno = true;
					player = "O";
				}
				
				btnNewButton_1.setText(player);
				btnNewButton_1.setEnabled(false);
				ganador();
			}
	
		});
		
		btnNewButton_2 = new JButton("  ");
		panel.add(btnNewButton_2);
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setForeground(Color.WHITE);
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
				}
				else
				{
					turno = true;
					player = "O";
				}
				
				btnNewButton_2.setText(player);
				btnNewButton_2.setEnabled(false);
				ganador();
			}
	
		});
		
		btnNewButton_3 = new JButton("   ");
		panel.add(btnNewButton_3);
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setForeground(Color.WHITE);
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
				}
				else
				{
					turno = true;
					player = "O";
				}
				
				btnNewButton_3.setText(player);
				btnNewButton_3.setEnabled(false);
				ganador();
			}
	
		});
		
		btnNewButton_4 = new JButton("    ");
		panel.add(btnNewButton_4);
		btnNewButton_4.setBackground(Color.BLACK);
		btnNewButton_4.setForeground(Color.WHITE);
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
				}
				else
				{
					turno = true;
					player = "O";
				}
				
				btnNewButton_4.setText(player);
				btnNewButton_4.setEnabled(false);
				ganador();
			}
	
		});
		
		btnNewButton_5 = new JButton("     ");
		panel.add(btnNewButton_5);
		btnNewButton_5.setBackground(Color.BLACK);
		btnNewButton_5.setForeground(Color.WHITE);
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
				}
				else
				{
					turno = true;
					player = "O";
				}
				
				btnNewButton_5.setText(player);
				btnNewButton_5.setEnabled(false);
				ganador();
			}
	
		});
		
		btnNewButton_6 = new JButton("      ");
		panel.add(btnNewButton_6);
		btnNewButton_6.setBackground(Color.BLACK);
		btnNewButton_6.setForeground(Color.WHITE);
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
				}
				else
				{
					turno = true;
					player = "O";
				}
				
				btnNewButton_6.setText(player);
				btnNewButton_6.setEnabled(false);
				ganador();
			}
	
		});
		
		btnNewButton_7 = new JButton("       ");
		panel.add(btnNewButton_7);
		btnNewButton_7.setBackground(Color.BLACK);
		btnNewButton_7.setForeground(Color.WHITE);
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
				}
				else
				{
					turno = true;
					player = "O";
				}
				
				btnNewButton_7.setText(player);
				btnNewButton_7.setEnabled(false);
				ganador();
			}
	
		});
		
		btnNewButton_8 = new JButton("        ");
		panel.add(btnNewButton_8);
		btnNewButton_8.setBackground(Color.BLACK);
		btnNewButton_8.setForeground(Color.WHITE);
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
				}
				else
				{
					turno = true;
					player = "O";
				}
				
				btnNewButton_8.setText(player);
				btnNewButton_8.setEnabled(false);
				ganador();
			}
	
		});
	}
		public void ganador()
	{
		
		if(btnNewButton.getText().equals(btnNewButton_1.getText()) && btnNewButton_1.getText().equals(btnNewButton_2.getText()))
		{
			JOptionPane.showMessageDialog(null, "Gano jugador " + player);
			System.exit(0);
		}
		else if(btnNewButton_3.getText().equals(btnNewButton_4.getText()) && btnNewButton_4.getText().equals(btnNewButton_5.getText()))
		{
			JOptionPane.showMessageDialog(null, "Gano jugador " + player);
			System.exit(0);
		}
		else if(btnNewButton_6.getText().equals(btnNewButton_7.getText()) && btnNewButton_7.getText().equals(btnNewButton_8.getText()))
		{
			JOptionPane.showMessageDialog(null, "Gano jugador " + player);
			System.exit(0);
		}
		else if(btnNewButton.getText().equals(btnNewButton_3.getText()) && btnNewButton_3.getText().equals(btnNewButton_6.getText()))
		{
			JOptionPane.showMessageDialog(null, "Gano jugador " + player);
			System.exit(0);
		}
		else if(btnNewButton_1.getText().equals(btnNewButton_4.getText()) && btnNewButton_4.getText().equals(btnNewButton_7.getText()))
		{
			JOptionPane.showMessageDialog(null, "Gano jugador " + player);
			System.exit(0);
		}
		else if(btnNewButton_2.getText().equals(btnNewButton_5.getText()) && btnNewButton_5.getText().equals(btnNewButton_8.getText()))
		{
			JOptionPane.showMessageDialog(null, "Gano jugador " + player);
			System.exit(0);
		}
		else if(btnNewButton.getText().equals(btnNewButton_4.getText()) && btnNewButton_4.getText().equals(btnNewButton_8.getText()))
		{
			JOptionPane.showMessageDialog(null, "Gano jugador " + player);
			System.exit(0);
		}
		else if(btnNewButton_6.getText().equals(btnNewButton_4.getText()) && btnNewButton_4.getText().equals(btnNewButton_2.getText()))
		{
			JOptionPane.showMessageDialog(null, "Gano jugador " + player);
			System.exit(0);
		}
		else if(btnNewButton.isEnabled() == false && btnNewButton_1.isEnabled() == false && btnNewButton_2.isEnabled() == false 
				&& btnNewButton_3.isEnabled() == false && btnNewButton_4.isEnabled() == false && btnNewButton_5.isEnabled() == false 
				&& btnNewButton_6.isEnabled() == false && btnNewButton_7.isEnabled() == false && btnNewButton_8.isEnabled() == false)
		{
			JOptionPane.showMessageDialog(null, "Empate, no hubo ganador :c");
			System.exit(0);
		}
	}

}
