package aplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.Font;

public class Rompecabezas {

	private JFrame frame;
	
	String [][] m = {{" ", "1", "2", "3",},
					{"4", "5", "6", "7",},
					{"8", "9", "10", "11",},
					{"12", "13", "14", "15"}};
	ImageIcon skinTablero = new ImageIcon("skinTablero.jpg");
	ImageIcon skinTableroHorizontal = new ImageIcon(skinTablero.getImage().getScaledInstance(2000, 55, Image.SCALE_DEFAULT));
	ImageIcon skinTableroVertical = new ImageIcon(skinTablero.getImage().getScaledInstance(55, 2000, Image.SCALE_DEFAULT));
	
	ImageIcon skinCuadro = new ImageIcon("skinCuadros.jpg");
	ImageIcon skinCuadroRender = new ImageIcon(skinCuadro.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT));
	ImageIcon skinCuadroMini = new ImageIcon(skinCuadro.getImage().getScaledInstance(150, 55, Image.SCALE_SMOOTH));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rompecabezas window = new Rompecabezas();
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
	public Rompecabezas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(31, 24, 19));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 20, 20));
		panel.setBorder(new EmptyBorder(20, 20, 20, 20));
		
		JButton btnNewButton_1 = new JButton(m[0][0]);
		panel.add(btnNewButton_1);
		btnNewButton_1.setIcon(skinCuadro);
		
		JButton btnNewButton_2 = new JButton(m[0][1]);
		btnNewButton_2.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_2);
		btnNewButton_2.setIcon(skinCuadro);
		btnNewButton_2.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JButton btnNewButton_3 = new JButton(m[0][2]);
		btnNewButton_3.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_3);
		btnNewButton_3.setIcon(skinCuadro);
		btnNewButton_3.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JButton btnNewButton_4 = new JButton(m[0][3]);
		btnNewButton_4.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_4);
		btnNewButton_4.setIcon(skinCuadro);
		btnNewButton_4.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JButton btnNewButton_5 = new JButton(m[1][0]);
		btnNewButton_5.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_5);
		btnNewButton_5.setIcon(skinCuadro);
		btnNewButton_5.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JButton btnNewButton_6 = new JButton(m[1][1]);
		btnNewButton_6.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_6);
		btnNewButton_6.setIcon(skinCuadro);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JButton btnNewButton_7 = new JButton(m[1][2]);
		btnNewButton_7.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_7);
		btnNewButton_7.setIcon(skinCuadro);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JButton btnNewButton_8 = new JButton(m[1][3]);
		btnNewButton_8.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_8);
		btnNewButton_8.setIcon(skinCuadro);
		btnNewButton_8.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JButton btnNewButton_9 = new JButton(m[2][0]);
		btnNewButton_9.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_9);
		btnNewButton_9.setIcon(skinCuadro);
		btnNewButton_9.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JButton btnNewButton_10 = new JButton(m[2][1]);
		btnNewButton_10.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_10);
		btnNewButton_10.setIcon(skinCuadro);
		btnNewButton_10.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JButton btnNewButton_11 = new JButton(m[2][2]);
		btnNewButton_11.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_11);
		btnNewButton_11.setIcon(skinCuadro);
		btnNewButton_11.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JButton btnNewButton_12 = new JButton(m[2][3]);
		btnNewButton_12.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_12);
		btnNewButton_12.setIcon(skinCuadro);
		btnNewButton_12.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JButton btnNewButton_13 = new JButton(m[3][0]);
		btnNewButton_13.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_13);
		btnNewButton_13.setIcon(skinCuadro);
		btnNewButton_13.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JButton btnNewButton_14 = new JButton(m[3][1]);
		btnNewButton_14.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_14);
		btnNewButton_14.setIcon(skinCuadro);
		btnNewButton_14.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JButton btnNewButton_15 = new JButton(m[3][2]);
		btnNewButton_15.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_15);
		btnNewButton_15.setIcon(skinCuadro);
		btnNewButton_15.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JButton btnNewButton_16 = new JButton(m[3][3]);
		btnNewButton_16.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_16);
		btnNewButton_16.setIcon(skinCuadro);
		btnNewButton_16.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		panel_1.setBackground(Color.BLACK);
		
		JButton btnNewButton = new JButton("Reiniciar");
		panel_1.add(btnNewButton, BorderLayout.WEST);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setBorder(new LineBorder(null, 5, false));
		btnNewButton.setIcon(skinCuadroMini);
		btnNewButton.setFont(new Font("Bernard MT Condensed", Font.BOLD, 35));
		
		JLabel lblNewLabel_3 = new JLabel("");
		panel_1.add(lblNewLabel_3, BorderLayout.CENTER);
		lblNewLabel_3.setIcon(skinTableroHorizontal);
		
		JLabel lblNewLabel_4 = new JLabel("");
		panel_1.add(lblNewLabel_4, BorderLayout.EAST);
		lblNewLabel_4.setIcon(skinTableroHorizontal);

		JLabel lblNewLabel = new JLabel("");
		frame.getContentPane().add(lblNewLabel, BorderLayout.SOUTH);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setIcon(skinTableroHorizontal);
		
		JLabel lblNewLabel_1 = new JLabel("");
		frame.getContentPane().add(lblNewLabel_1, BorderLayout.EAST);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(Color.CYAN);
		lblNewLabel_1.setIcon(skinTableroVertical);
		
		JLabel lblNewLabel_2 = new JLabel("");
		frame.getContentPane().add(lblNewLabel_2, BorderLayout.WEST);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(Color.CYAN);
		lblNewLabel_2.setIcon(skinTableroVertical);
		
		panel.repaint();
		panel.revalidate();
	}

}
