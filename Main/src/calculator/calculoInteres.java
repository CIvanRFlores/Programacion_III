package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class calculoInteres extends JFrame
{
	Color fondoPanelArriba = new Color(143, 222, 223);
	Color fondoPanelAbajo = new Color(237, 144, 9);
	Font tipoTxtFld = new Font("New Roman", Font.TRUETYPE_FONT, 25);
	Font tipoTxtLbl = new Font("New Roman", Font.ITALIC, 25);
	
	public calculoInteres (String tittle)
	{
		
		this.setTitle(tittle);
		this.setVisible(true);
		this.setSize(650, 750);
		this.setResizable(true);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.add(main(), BorderLayout.CENTER);
		
		this.repaint();
		this.revalidate();
	}
	
	public JPanel main()
	{
		JPanel mainPanel = new JPanel();
		mainPanel.setOpaque(true);
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setLayout(new BorderLayout(0, 55));
		
		//ETIQUETA ARRIBA
		JLabel txt_Interes = new JLabel("Interés");
		txt_Interes.setOpaque(false);
		txt_Interes.setFont(new Font("Arial", Font.ITALIC, 40));
		txt_Interes.setForeground(Color.RED);
		mainPanel.add(txt_Interes, BorderLayout.NORTH);
		
		//ELABORACION PANEL DE ARRIBA
		JPanel panelArriba = new JPanel();
		panelArriba.setLayout(new BorderLayout());
		panelArriba.setOpaque(false);
		panelArriba.setBorder(BorderFactory.createLineBorder(Color.WHITE, 20,false));
		mainPanel.add(panelArriba, BorderLayout.CENTER);
		
		JPanel interior = new JPanel();
		interior.setLayout(new BorderLayout());
		interior.setBackground(fondoPanelArriba);
		panelArriba.add(interior, BorderLayout.CENTER);
		
		//ETIQUETA CALCULO INTERES
		JLabel calculoInteres = new JLabel("Calulcar Interés");
		calculoInteres.setOpaque(false);
		calculoInteres.setFont(tipoTxtLbl);
		interior.add(calculoInteres, BorderLayout.NORTH);
		
		JPanel elementos = new JPanel();
		elementos.setBackground(fondoPanelArriba);
		elementos.setLayout(new GridLayout(3, 2, 40, 40));
		elementos.setBorder(new EmptyBorder(70,30,70,30));
		interior.add(elementos, BorderLayout.CENTER);
				
		//ELEMENTOS DEL PANEL ELEMENTOS
		JLabel capital = new JLabel("Capital:");
		capital.setFont(tipoTxtLbl);
		capital.setHorizontalAlignment(JLabel.RIGHT);
		
		JTextField inse_Capital = new JTextField("$");
		inse_Capital.setFont(tipoTxtFld);
		
		JLabel tiempo = new JLabel("Tiempo:");
		tiempo.setFont(tipoTxtLbl);
		tiempo.setHorizontalAlignment(JLabel.RIGHT);
		
		JTextField inse_Tiempo = new JTextField("$");
		inse_Tiempo.setFont(tipoTxtFld);
		
		JLabel tasaInteres = new JLabel("Tasa de interés:");
		tasaInteres.setFont(tipoTxtLbl);
		tasaInteres.setHorizontalAlignment(JLabel.RIGHT);
		
		JTextField inse_TasaInteres = new JTextField("$");
		inse_TasaInteres.setFont(tipoTxtFld);
		
		elementos.add(capital);
		elementos.add(inse_Capital);
		elementos.add(tiempo);
		elementos.add(inse_Tiempo);
		elementos.add(tasaInteres);
		elementos.add(inse_TasaInteres);
		
		//PANEL PARA BOTONES
		JPanel botones = new JPanel();
		botones.setBackground(fondoPanelArriba);
		botones.setLayout(new FlowLayout());
		panelArriba.add(botones, BorderLayout.SOUTH);
		
		JButton calcular = new JButton("Calcular");
		calcular.setOpaque(true);
		calcular.setBackground(Color.DARK_GRAY);
		calcular.setForeground(Color.WHITE);
		calcular.setFont(new Font("Arial", Font.BOLD, 20));
		botones.add(calcular);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setOpaque(true);
		cancelar.setBackground(Color.DARK_GRAY);
		cancelar.setForeground(Color.WHITE);
		cancelar.setFont(new Font("Arial", Font.BOLD, 20));
		botones.add(cancelar);
				
		//ELABORACION PANEL DE ABAJO
		JPanel panelAbajo = new JPanel();
		panelAbajo.setLayout(new GridLayout(2, 2));
		panelAbajo.setOpaque(true);
		panelAbajo.setBackground(fondoPanelAbajo);
		panelAbajo.setBorder(BorderFactory.createLineBorder(Color.WHITE, 20,false));
		mainPanel.add(panelAbajo, BorderLayout.SOUTH);
		
		JLabel interes = new JLabel("Interés:   ");
		interes.setForeground(Color.WHITE);
		interes.setFont(tipoTxtLbl);
		interes.setHorizontalAlignment(JLabel.RIGHT);
		
		JTextField inse_Interes = new JTextField();
		inse_Interes.setFont(tipoTxtFld);
		
		JLabel monto = new JLabel("Monto:   ");
		monto.setForeground(Color.WHITE);
		monto.setFont(tipoTxtLbl);
		monto.setHorizontalAlignment(JLabel.RIGHT);
		
		JTextField inse_Monto = new JTextField();
		inse_Monto.setFont(tipoTxtFld);
		
		panelAbajo.add(interes);
		panelAbajo.add(inse_Interes);
		panelAbajo.add(monto);
		panelAbajo.add(inse_Monto);
		
		return mainPanel;
	}
}
