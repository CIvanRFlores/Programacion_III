package aplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Scrollbar;

import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FirstWindow {

	private JFrame frame;
	private JTextField txtChristianIvan;
	private JTextField txtRivera;
	private JTextField txtFlores;
	private Color bg = new Color(88, 129, 87);
	private Color letters = new Color(218, 215, 205);
	private Color bg_2 = new Color(163, 177, 138);
	
	private Image userImg = new ImageIcon("caler.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	ImageIcon userIcon = new ImageIcon(userImg);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindow window = new FirstWindow();
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
	public FirstWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(52, 78, 65));
		frame.setBounds(0, 0, 917, 920);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.setLocationRelativeTo(null);
		
		JPanel main = new JPanel();
		main.setBackground(new Color(52, 78, 65));
		frame.getContentPane().add(main, BorderLayout.CENTER);
		main.setLayout(new BorderLayout(0, 0));
		main.setBorder(new EmptyBorder(15, 15, 15, 15));
		
		JLabel lblNewLabel = new JLabel("Registros de usuarios");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setForeground(new Color(218, 215, 205));
		lblNewLabel.setBorder(new EmptyBorder(0, 10, 0, 0));
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(52, 78, 65));
		main.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 20, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(88, 129, 87));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		panel_1.setBorder(new EmptyBorder(10,10,10,40));
		
		JLabel lblNewLabel_1 = new JLabel("Datos generales");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setForeground(letters);
		panel_1.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(88, 129, 87));
		panel_1.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(6, 2, 20, 20));
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setBackground(new Color(88, 129, 87));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBorder(new LineBorder(bg, 14, false));
		lblNewLabel_2.setHorizontalAlignment(JLabel.RIGHT);
		lblNewLabel_2.setPreferredSize(new Dimension(20,13));
		lblNewLabel_2.setForeground(letters);
		panel_5.add(lblNewLabel_2);
		
		txtChristianIvan = new JTextField();
		txtChristianIvan.setBackground(new Color(218, 215, 205));
		txtChristianIvan.setPreferredSize(new Dimension(20, 13));
		txtChristianIvan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtChristianIvan.setText("Christian Ivan");
		txtChristianIvan.setBorder(new LineBorder(bg, 10, false));
		txtChristianIvan.setHorizontalAlignment(JLabel.LEFT);
		panel_5.add(txtChristianIvan);
		txtChristianIvan.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido paterno:");
		lblNewLabel_3.setBackground(new Color(88, 129, 87));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBorder(new LineBorder(bg, 14, true));
		lblNewLabel_3.setHorizontalAlignment(JLabel.RIGHT);
		lblNewLabel_3.setForeground(letters);
		panel_5.add(lblNewLabel_3);
		
		txtRivera = new JTextField();
		txtRivera.setBackground(new Color(218, 215, 205));
		txtRivera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtRivera.setText("Rivera");
		txtRivera.setBorder(new LineBorder(bg, 10, false));
		txtRivera.setHorizontalAlignment(JLabel.LEFT);
		panel_5.add(txtRivera);
		txtRivera.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido materno:");
		lblNewLabel_4.setBackground(new Color(88, 129, 87));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBorder(new LineBorder(bg, 14, true));
		lblNewLabel_4.setHorizontalAlignment(JLabel.RIGHT);
		lblNewLabel_4.setForeground(letters);
		panel_5.add(lblNewLabel_4);
		
		txtFlores = new JTextField();
		txtFlores.setBackground(new Color(218, 215, 205));
		txtFlores.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFlores.setText("Flores");
		txtFlores.setBorder(new LineBorder(bg, 10, false));
		txtFlores.setHorizontalAlignment(JLabel.LEFT);
		panel_5.add(txtFlores);
		txtFlores.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_5.setBackground(new Color(88, 129, 87));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBorder(new LineBorder(bg, 14, true));
		lblNewLabel_5.setHorizontalAlignment(JLabel.RIGHT);
		lblNewLabel_5.setForeground(letters);
		panel_5.add(lblNewLabel_5);
		
		JPanel panel_9 = new JPanel();
		panel_5.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("07/11/2004");
		lblNewLabel_8.setBackground(new Color(218, 215, 205));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBorder(new LineBorder(bg, 1, false));
		lblNewLabel_8.setHorizontalAlignment(JLabel.LEFT);
		panel_9.add(lblNewLabel_8, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton();
		btnNewButton.setBackground(new Color(218, 215, 205));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\prank\\Documents\\GitHub\\Programacion_III\\Main\\src\\aplication\\cal.png"));
		btnNewButton.setOpaque(true);
		panel_9.add(btnNewButton, BorderLayout.EAST);
		
		JLabel lblNewLabel_6 = new JLabel("Sexo:");
		lblNewLabel_6.setBackground(new Color(88, 129, 87));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBorder(new LineBorder(bg, 14, true));
		lblNewLabel_6.setHorizontalAlignment(JLabel.RIGHT);
		lblNewLabel_6.setForeground(letters);
		panel_5.add(lblNewLabel_6);
		
		JPanel panel_8 = new JPanel();
		panel_5.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBackground(new Color(88, 129, 87));
		rdbtnNewRadioButton.setForeground(letters);
		panel_8.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setBackground(new Color(88, 129, 87));
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton_1.setForeground(letters);
		panel_8.add(rdbtnNewRadioButton_1, BorderLayout.SOUTH);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnNewRadioButton_1);
		grupo.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_7 = new JLabel("Nacionalidad:");
		lblNewLabel_7.setBackground(new Color(88, 129, 87));
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setBorder(new LineBorder(bg, 14, true));
		lblNewLabel_7.setHorizontalAlignment(JLabel.RIGHT);
		lblNewLabel_7.setForeground(letters);
		panel_5.add(lblNewLabel_7);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBackground(new Color(218, 215, 205));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Elija una opcion", "Mexico", "Peru", "Honduras", "Brasil"}));
		comboBox.setBorder(new LineBorder(bg, 9, false));
		panel_5.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(163, 177, 138));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		panel_2.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		JLabel lblNewLabel_1_1 = new JLabel("Perfil de usuario");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_2.add(lblNewLabel_1_1, BorderLayout.NORTH);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(163, 177, 138));
		panel_2.add(panel_6, BorderLayout.SOUTH);
		panel_6.setLayout(new BorderLayout(0, 0));
		panel_6.setBorder(new EmptyBorder(30, 30, 20, 65));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(163, 177, 138));
		panel_6.add(panel_10, BorderLayout.CENTER);
		panel_10.setLayout(new GridLayout(2, 2, 15, 15));
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar fecha de nacimiento");
		panel_10.add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox_1.setHorizontalAlignment(JCheckBox.CENTER);
		chckbxNewCheckBox_1.setOpaque(false);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
		panel_10.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox.setHorizontalAlignment(JCheckBox.CENTER);
		chckbxNewCheckBox.setOpaque(false);
		
		JButton lblNewLabel_12 = new JButton("");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\prank\\Documents\\GitHub\\Programacion_III\\Main\\src\\aplication\\pls.png"));
		lblNewLabel_12.setBackground(new Color(218, 215, 205));
		panel_2.add(lblNewLabel_12, BorderLayout.CENTER);
		lblNewLabel_12.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_12.setOpaque(true);
		lblNewLabel_12.setBorder(new LineBorder(bg_2, 35, false));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(163, 177, 138));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		panel_3.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		JLabel lblNewLabel_1_2 = new JLabel("Datos opcionales");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_3.add(lblNewLabel_1_2, BorderLayout.NORTH);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(163, 177, 138));
		panel_3.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new GridLayout(2, 2, 0, 0));

		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(163, 177, 138));
		panel_7.add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(163, 177, 138));
		panel_7.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		
		JTextArea txtrQueEsIds = new JTextArea(10, 17);
		txtrQueEsIds.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JScrollPane scrollPane_1 = new JScrollPane(txtrQueEsIds);
		
		txtrQueEsIds.setText("Que es IDS? \r\nPara el ciego, es la luz.\r\nPara el hambriento, es el pan. \r\nPara el enfermo, es la cura. \r\nPara el solitario, es el compañero.\r\nPara el triste, es la alegría. \r\nPara el prisionero, es la libertad. \r\nPara el pobre, es el tesoro. \r\nPara el deudor, es el perdón\r\nQue es IDS? \r\nPara el ciego, es la luz.\r\nPara el hambriento, es el pan. \r\nPara el enfermo, es la cura. \r\nPara el solitario, es el compañero.\r\nPara el triste, es la alegría. \r\nPara el prisionero, es la libertad. \r\nPara el pobre, es el tesoro. \r\nPara el deudor, es el perdón");
		panel_12.add(scrollPane_1, BorderLayout.EAST);
		
		JTextArea txtrAquiPuraIngenieria = new JTextArea(10, 17);
		txtrAquiPuraIngenieria.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtrAquiPuraIngenieria.setText("Aqui pura Ingenieria en Desarrollo de Software\r\nUABCS Gatos Salvajes\r\nAqui pura Ingenieria en Desarrollo de Software\r\nUABCS Gatos Salvajes\r\nAqui pura Ingenieria en Desarrollo de Software\r\nUABCS Gatos Salvajes\r\nAqui pura Ingenieria en Desarrollo de Software\r\nUABCS Gatos Salvajes\r\nAqui pura Ingenieria en Desarrollo de Software\r\nUABCS Gatos Salvajes\r\nAqui pura Ingenieria en Desarrollo de Software\r\nUABCS Gatos Salvajes\r\nAqui pura Ingenieria en Desarrollo de Software\r\nUABCS Gatos Salvajes\r\nAqui pura Ingenieria en Desarrollo de Software\r\nUABCS Gatos Salvajes\r\nAqui pura Ingenieria en Desarrollo de Software\r\nUABCS Gatos Salvajes");
		
		JScrollPane scrollPane = new JScrollPane(txtrAquiPuraIngenieria);
		
		panel_12.add(scrollPane, BorderLayout.WEST);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		
				
		JLabel lblNewLabel_10 = new JLabel("Descripcion");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_10.setHorizontalAlignment(JLabel.LEFT);
		lblNewLabel_10.setVerticalAlignment(JLabel.NORTH);
		lblNewLabel_10.setBorder(new EmptyBorder(20,20,20,20));
		panel_11.add(lblNewLabel_10, BorderLayout.EAST);
		
		JLabel lblNewLabel_11 = new JLabel("Preferencias");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_11.setHorizontalAlignment(JLabel.RIGHT);
		lblNewLabel_11.setVerticalAlignment(JLabel.NORTH);
		lblNewLabel_11.setBorder(new EmptyBorder(20,20,20,20));
		panel_11.add(lblNewLabel_11, BorderLayout.WEST);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(88, 129, 87));
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 40, 40));
		panel_4.setBorder(new EmptyBorder(80,130,80,130));
		
		JButton btnNewButton_1 = new JButton("Nuevo");
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setBackground(new Color(218, 215, 205));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\prank\\Documents\\GitHub\\Programacion_III\\Main\\src\\aplication\\qw.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Guardar");
		btnNewButton_2.setBackground(new Color(218, 215, 205));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\prank\\Documents\\GitHub\\Programacion_III\\Main\\src\\aplication\\save.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Salir");
		btnNewButton_3.setBackground(new Color(218, 215, 205));
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\prank\\Documents\\GitHub\\Programacion_III\\Main\\src\\aplication\\exit.png"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_4.add(btnNewButton_3);
	}

}
