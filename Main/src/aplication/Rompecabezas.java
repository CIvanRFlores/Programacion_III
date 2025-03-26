package aplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.Timer;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class Rompecabezas {

	private JFrame frame;
	
	public List<Integer> randNumeros = new ArrayList<Integer>();
	
	public int movimientos = 0;
	
	int milisegundos;
	
	int segundos;
	
	int minutos;
	
	Timer temporizador;
		
	ImageIcon skinTablero = new ImageIcon("skinTablero.jpg");
	ImageIcon skinTableroHorizontal = new ImageIcon(skinTablero.getImage().getScaledInstance(2000, 80, Image.SCALE_DEFAULT));
	ImageIcon skinTableroVertical = new ImageIcon(skinTablero.getImage().getScaledInstance(55, 2000, Image.SCALE_DEFAULT));
	ImageIcon skinTableroMovimientos = new ImageIcon(skinTablero.getImage().getScaledInstance(200, 80, Image.SCALE_DEFAULT));
	ImageIcon skinTableroTemporizador = new ImageIcon(skinTablero.getImage().getScaledInstance(500, 80, Image.SCALE_DEFAULT));
	
	
	ImageIcon skinCuadro = new ImageIcon("skinCuadros.jpg");
	ImageIcon skinCuadroRender = new ImageIcon(skinCuadro.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT));
	ImageIcon skinCuadroMini = new ImageIcon(skinCuadro.getImage().getScaledInstance(150, 70, Image.SCALE_SMOOTH));

	JButton btnNewButton_1 = new JButton();
	JButton btnNewButton_2 = new JButton();
	JButton btnNewButton_3 = new JButton();
	JButton btnNewButton_4 = new JButton();
	JButton btnNewButton_5 = new JButton();
	JButton btnNewButton_6 = new JButton();
	JButton btnNewButton_7 = new JButton();
	JButton btnNewButton_8 = new JButton();
	JButton btnNewButton_9 = new JButton();
	JButton btnNewButton_10 = new JButton();
	JButton btnNewButton_11 = new JButton();
	JButton btnNewButton_12 = new JButton();
	JButton btnNewButton_13 = new JButton();
	JButton btnNewButton_14 = new JButton();
	JButton btnNewButton_15 = new JButton();
	JButton btnNewButton_16 = new JButton();
	
	JLabel lblNewLabel_4 = new JLabel("Movimientos = " + movimientos);
	
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
		
		for(int i = 1; i < 16; i++)
		{
			randNumeros.add(i);
		}
		
		Collections.shuffle(randNumeros);
		
		int[] arreglo = new int[randNumeros.size()];
		
		for(int i = 0; i <  randNumeros.size(); i++)
		{
			arreglo[i] = randNumeros.get(i);
		}
		
		frame = new JFrame();
		frame.setBounds(0, 0, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(31, 24, 19));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 20, 20));
		panel.setBorder(new EmptyBorder(20, 20, 20, 20));
		
		btnNewButton_1.setText(" ");
		btnNewButton_1.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_1);
		btnNewButton_1.setIcon(skinCuadro);
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) {
					
						if(btnNewButton_2.getText().equals(" "))
						{
							btnNewButton_2.setText(btnNewButton_1.getText());
							btnNewButton_1.setText(" ");

							movimientos++;
							lblNewLabel_4.setText("Movimientos = " + movimientos);
						}
						else if(btnNewButton_5.getText().equals(" "))
						{
							btnNewButton_5.setText(btnNewButton_1.getText());
							btnNewButton_1.setText(" ");
							
							movimientos++;
							lblNewLabel_4.setText("Movimientos = " + movimientos);
						}
						validarGanar();
					}
				});
		
		btnNewButton_2.setText(Integer.toString(arreglo[0]));
		btnNewButton_2.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_2);
		btnNewButton_2.setIcon(skinCuadro);
		btnNewButton_2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(btnNewButton_1.getText().equals(" "))
				{
					btnNewButton_1.setText(btnNewButton_2.getText());
					btnNewButton_2.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				if(btnNewButton_3.getText().equals(" "))
				{
					btnNewButton_3.setText(btnNewButton_2.getText());
					btnNewButton_2.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_6.getText().equals(" "))
				{
					btnNewButton_6.setText(btnNewButton_2.getText());
					btnNewButton_2.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				validarGanar();
			}
		});
		
		btnNewButton_3.setText(Integer.toString(arreglo[1]));
		btnNewButton_3.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_3);
		btnNewButton_3.setIcon(skinCuadro);
		btnNewButton_3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(btnNewButton_2.getText().equals(" "))
				{
					btnNewButton_2.setText(btnNewButton_3.getText());
					btnNewButton_3.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_4.getText().equals(" "))
				{
					btnNewButton_4.setText(btnNewButton_3.getText());
					btnNewButton_3.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_7.getText().equals(" "))
				{
					btnNewButton_7.setText(btnNewButton_3.getText());
					btnNewButton_3.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				validarGanar();
			}
		});
		
		btnNewButton_4.setText(Integer.toString(arreglo[2]));
		btnNewButton_4.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_4);
		btnNewButton_4.setIcon(skinCuadro);
		btnNewButton_4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(btnNewButton_3.getText().equals(" "))
				{
					btnNewButton_3.setText(btnNewButton_4.getText());
					btnNewButton_4.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_8.getText().equals(" "))
				{
					btnNewButton_8.setText(btnNewButton_4.getText());
					btnNewButton_4.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				validarGanar();
			}
		});
		
		btnNewButton_5.setText(Integer.toString(arreglo[3]));
		btnNewButton_5.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_5);
		btnNewButton_5.setIcon(skinCuadro);
		btnNewButton_5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_5.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(btnNewButton_1.getText().equals(" "))
				{
					btnNewButton_1.setText(btnNewButton_5.getText());
					btnNewButton_5.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_6.getText().equals(" "))
				{
					btnNewButton_6.setText(btnNewButton_5.getText());
					btnNewButton_5.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_9.getText().equals(" "))
				{
					btnNewButton_9.setText(btnNewButton_5.getText());
					btnNewButton_5.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				validarGanar();
			}
		});
		
		btnNewButton_6.setText(Integer.toString(arreglo[4]));
		btnNewButton_6.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_6);
		btnNewButton_6.setIcon(skinCuadro);
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(btnNewButton_2.getText().equals(" "))
				{
					btnNewButton_2.setText(btnNewButton_6.getText());
					btnNewButton_6.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_5.getText().equals(" "))
				{
					btnNewButton_5.setText(btnNewButton_6.getText());
					btnNewButton_6.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_7.getText().equals(" "))
				{
					btnNewButton_7.setText(btnNewButton_6.getText());
					btnNewButton_6.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_10.getText().equals(" "))
				{
					btnNewButton_10.setText(btnNewButton_6.getText());
					btnNewButton_6.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				validarGanar();
			}
		});
		
		btnNewButton_7.setText(Integer.toString(arreglo[5]));
		btnNewButton_7.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_7);
		btnNewButton_7.setIcon(skinCuadro);
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(btnNewButton_3.getText().equals(" "))
				{
					btnNewButton_3.setText(btnNewButton_7.getText());
					btnNewButton_7.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_6.getText().equals(" "))
				{
					btnNewButton_6.setText(btnNewButton_7.getText());
					btnNewButton_7.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_8.getText().equals(" "))
				{
					btnNewButton_8.setText(btnNewButton_7.getText());
					btnNewButton_7.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_11.getText().equals(" "))
				{
					btnNewButton_11.setText(btnNewButton_7.getText());
					btnNewButton_7.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				validarGanar();
			}
		});
		
		btnNewButton_8.setText(Integer.toString(arreglo[6]));
		btnNewButton_8.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_8);
		btnNewButton_8.setIcon(skinCuadro);
		btnNewButton_8.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_8.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(btnNewButton_4.getText().equals(" "))
				{
					btnNewButton_4.setText(btnNewButton_8.getText());
					btnNewButton_8.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_7.getText().equals(" "))
				{
					btnNewButton_7.setText(btnNewButton_8.getText());
					btnNewButton_8.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_12.getText().equals(" "))
				{
					btnNewButton_12.setText(btnNewButton_8.getText());
					btnNewButton_8.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				validarGanar();
			}
		});
		
		btnNewButton_9.setText(Integer.toString(arreglo[7]));
		btnNewButton_9.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_9);
		btnNewButton_9.setIcon(skinCuadro);
		btnNewButton_9.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_9.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(btnNewButton_5.getText().equals(" "))
				{
					btnNewButton_5.setText(btnNewButton_9.getText());
					btnNewButton_9.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_10.getText().equals(" "))
				{
					btnNewButton_10.setText(btnNewButton_9.getText());
					btnNewButton_9.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_13.getText().equals(" "))
				{
					btnNewButton_13.setText(btnNewButton_9.getText());
					btnNewButton_9.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				validarGanar();
			}
		});
		
		btnNewButton_10.setText(Integer.toString(arreglo[8]));
		btnNewButton_10.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_10);
		btnNewButton_10.setIcon(skinCuadro);
		btnNewButton_10.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_10.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(btnNewButton_6.getText().equals(" "))
				{
					btnNewButton_6.setText(btnNewButton_10.getText());
					btnNewButton_10.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_9.getText().equals(" "))
				{
					btnNewButton_9.setText(btnNewButton_10.getText());
					btnNewButton_10.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_11.getText().equals(" "))
				{
					btnNewButton_11.setText(btnNewButton_10.getText());
					btnNewButton_10.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_14.getText().equals(" "))
				{
					btnNewButton_14.setText(btnNewButton_10.getText());
					btnNewButton_10.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				validarGanar();
			}
		});
		
		btnNewButton_11.setText(Integer.toString(arreglo[9]));
		btnNewButton_11.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_11);
		btnNewButton_11.setIcon(skinCuadro);
		btnNewButton_11.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_11.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(btnNewButton_7.getText().equals(" "))
				{
					btnNewButton_7.setText(btnNewButton_11.getText());
					btnNewButton_11.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_10.getText().equals(" "))
				{
					btnNewButton_10.setText(btnNewButton_11.getText());
					btnNewButton_11.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_12.getText().equals(" "))
				{
					btnNewButton_12.setText(btnNewButton_11.getText());
					btnNewButton_11.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_15.getText().equals(" "))
				{
					btnNewButton_15.setText(btnNewButton_11.getText());
					btnNewButton_11.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				validarGanar();
			}
		});
		
		btnNewButton_12.setText(Integer.toString(arreglo[10]));
		btnNewButton_12.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_12);
		btnNewButton_12.setIcon(skinCuadro);
		btnNewButton_12.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_12.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(btnNewButton_8.getText().equals(" "))
				{
					btnNewButton_8.setText(btnNewButton_12.getText());
					btnNewButton_12.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_11.getText().equals(" "))
				{
					btnNewButton_11.setText(btnNewButton_12.getText());
					btnNewButton_12.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_16.getText().equals(" "))
				{
					btnNewButton_16.setText(btnNewButton_12.getText());
					btnNewButton_12.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				validarGanar();
			}
		});
		
		btnNewButton_13.setText(Integer.toString(arreglo[11]));
		btnNewButton_13.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_13);
		btnNewButton_13.setIcon(skinCuadro);
		btnNewButton_13.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_13.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(btnNewButton_9.getText().equals(" "))
				{
					btnNewButton_9.setText(btnNewButton_13.getText());
					btnNewButton_13.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_14.getText().equals(" "))
				{
					btnNewButton_14.setText(btnNewButton_13.getText());
					btnNewButton_13.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				validarGanar();
			}
		});
		
		btnNewButton_14.setText(Integer.toString(arreglo[12]));
		btnNewButton_14.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_14);
		btnNewButton_14.setIcon(skinCuadro);
		btnNewButton_14.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_14.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(btnNewButton_10.getText().equals(" "))
				{
					btnNewButton_10.setText(btnNewButton_14.getText());
					btnNewButton_14.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_13.getText().equals(" "))
				{
					btnNewButton_13.setText(btnNewButton_14.getText());
					btnNewButton_14.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_15.getText().equals(" "))
				{
					btnNewButton_15.setText(btnNewButton_14.getText());
					btnNewButton_14.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				validarGanar();
			}
		});
		
		btnNewButton_15.setText(Integer.toString(arreglo[13]));
		btnNewButton_15.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_15);
		btnNewButton_15.setIcon(skinCuadro);
		btnNewButton_15.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_15.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(btnNewButton_11.getText().equals(" "))
				{
					btnNewButton_11.setText(btnNewButton_15.getText());
					btnNewButton_15.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_14.getText().equals(" "))
				{
					btnNewButton_14.setText(btnNewButton_15.getText());
					btnNewButton_15.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_16.getText().equals(" "))
				{
					btnNewButton_16.setText(btnNewButton_15.getText());
					btnNewButton_15.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				validarGanar();
			}
		});
		
		btnNewButton_16.setText(Integer.toString(arreglo[14]));
		btnNewButton_16.setFont(new Font("Bernard MT Condensed", Font.BOLD, 80));
		panel.add(btnNewButton_16);
		btnNewButton_16.setIcon(skinCuadro);
		btnNewButton_16.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_16.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(btnNewButton_12.getText().equals(" "))
				{
					btnNewButton_12.setText(btnNewButton_16.getText());
					btnNewButton_16.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				else if(btnNewButton_15.getText().equals(" "))
				{
					btnNewButton_15.setText(btnNewButton_16.getText());
					btnNewButton_16.setText(" ");
					
					movimientos++;
					lblNewLabel_4.setText("Movimientos = " + movimientos);
				}
				validarGanar();
			}
		});
		
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
		btnNewButton.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) {
						reseteo();
					}
			
				});
		
		JLabel lblNewLabel_3 = new JLabel("00:00:00");
		panel_1.add(lblNewLabel_3, BorderLayout.CENTER);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Bernard MT Condensed", Font.BOLD, 35));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setIcon(skinTableroTemporizador);
		
		temporizador = new Timer(4, new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						milisegundos++;
						
						if(milisegundos == 100)
						{
							segundos++;
							milisegundos = 0;
						}
						if(segundos == 60)
						{
							minutos++;
							segundos = 0;
						}
						
						String tiempo = String.format("%02d:%02d:%02d", minutos, segundos, milisegundos);
						lblNewLabel_3.setText(tiempo);
					}
			
				});
		
		temporizador.start();
		
		//btnNewLabel_4 atributos
		panel_1.add(lblNewLabel_4, BorderLayout.EAST);
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(skinTableroMovimientos);
		lblNewLabel_4.setFont(new Font("Bernard MT Condensed", Font.BOLD, 25));
		lblNewLabel_4.setForeground(Color.WHITE);

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
	public void validarGanar()
	{
		if(btnNewButton_1.getText().equals("1") && btnNewButton_2.getText().equals("2") && btnNewButton_3.getText().equals("3") && btnNewButton_4.getText().equals("4")
				&& btnNewButton_5.getText().equals("5") && btnNewButton_6.getText().equals("6") && btnNewButton_7.getText().equals("7") && btnNewButton_8.getText().equals("8")
				&& btnNewButton_9.getText().equals("9") && btnNewButton_10.getText().equals("10") && btnNewButton_11.getText().equals("11") && btnNewButton_12.getText().equals("12")
				&& btnNewButton_13.getText().equals("13") && btnNewButton_14.getText().equals("14") && btnNewButton_15.getText().equals("15") && btnNewButton_16.getText().equals(" "))
		{
			temporizador.stop();
			JOptionPane.showMessageDialog(null, "!Bien hecho ganaste¡");			
		}
	}
	public void reseteo()
	{
		Collections.shuffle(randNumeros);
		
		int[] nuevoArreglo = new int[randNumeros.size()];
		
		for(int i = 0; i <  randNumeros.size(); i++)
		{
			nuevoArreglo[i] = randNumeros.get(i);
		}	
		
		btnNewButton_1.setText(" ");
		btnNewButton_2.setText(Integer.toString(nuevoArreglo[0])); 
		btnNewButton_3.setText(Integer.toString(nuevoArreglo[1]));
		btnNewButton_4.setText(Integer.toString(nuevoArreglo[2]));
		btnNewButton_5.setText(Integer.toString(nuevoArreglo[3]));
		btnNewButton_6.setText(Integer.toString(nuevoArreglo[4]));
		btnNewButton_7.setText(Integer.toString(nuevoArreglo[5]));
		btnNewButton_8.setText(Integer.toString(nuevoArreglo[6]));
		btnNewButton_9.setText(Integer.toString(nuevoArreglo[7]));
		btnNewButton_10.setText(Integer.toString(nuevoArreglo[8]));
		btnNewButton_11.setText(Integer.toString(nuevoArreglo[9]));
		btnNewButton_12.setText(Integer.toString(nuevoArreglo[10]));
		btnNewButton_13.setText(Integer.toString(nuevoArreglo[11]));
		btnNewButton_14.setText(Integer.toString(nuevoArreglo[12]));
		btnNewButton_15.setText(Integer.toString(nuevoArreglo[13]));
		btnNewButton_16.setText(Integer.toString(nuevoArreglo[14]));
		
		movimientos = 0;
		lblNewLabel_4.setText("Movimientos = " + movimientos);
		
		milisegundos = 0;
		segundos = 0;
		minutos = 0;
		temporizador.start();
	}
}
