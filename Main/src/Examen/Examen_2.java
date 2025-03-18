package Examen;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Examen_2 extends JFrame
{
	public Examen_2 ()
	{
		this.setTitle("Sistema de facturacion");
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(670, 720);
		this.setLocationRelativeTo(null);
		
		this.add(ventana());
		
		this.repaint();
		this.revalidate();
	}
	
	public JPanel ventana()
	{
		JPanel principal = new JPanel();
		principal.setBounds(0, 0, 670, 720);
		principal.setLayout(null);
		principal.setOpaque(true);
		principal.setBackground(new Color(0, 102, 153));
		
		JPanel centro = new JPanel();
		centro.setBounds(0, 80, 670, 590);
		centro.setVisible(true);
		centro.setLayout(null);
		centro.setBackground(Color.WHITE);
		principal.add(centro);

		JLabel msjSuperior = new JLabel("Factura en Java - NetBeans - ArrayList Y POO");
		msjSuperior.setBounds(20, 6, 550, 50);
		msjSuperior.setForeground(Color.WHITE);
		msjSuperior.setFont(new Font("Tahoma", Font.BOLD, 20));
		msjSuperior.setOpaque(false);
		principal.add(msjSuperior);
		
		JLabel subMsjSuperior = new JLabel("[Sin Base de datos]");
		subMsjSuperior.setBounds(25, 30, 400, 50);
		subMsjSuperior.setForeground(Color.WHITE);
		subMsjSuperior.setFont(new Font("Arial", Font.PLAIN, 15));
		subMsjSuperior.setOpaque(false);
		principal.add(subMsjSuperior);
		
		//PRIMER PANEL

		JLabel txtDatosCliente = new JLabel("Datos del cliente");
		txtDatosCliente.setBounds(30, 0, 110, 40);
		txtDatosCliente.setBackground(Color.WHITE);
		txtDatosCliente.setForeground(Color.BLACK);
		txtDatosCliente.setOpaque(true);
		txtDatosCliente.setFont(new Font("Arial", Font.PLAIN, 14));
		centro.add(txtDatosCliente);
		
		JPanel panelCliente = new JPanel();
		panelCliente.setBounds(20,  20,  620,  85);
		panelCliente.setOpaque(false);
		panelCliente.setLayout(null);
		panelCliente.setBorder(new LineBorder(Color.GRAY, 1));
		centro.add(panelCliente);
		
		JLabel documento = new JLabel("Documento:");
		documento.setBounds(25, 10, 110, 40);
		documento.setBackground(Color.WHITE);
		documento.setForeground(Color.BLACK);
		documento.setOpaque(false);
		documento.setFont(new Font("Arial", Font.PLAIN, 14));
		panelCliente.add(documento);
		
		JTextField campoDocumento = new JTextField();
		campoDocumento.setBounds(110, 20, 130, 23);
		campoDocumento.setOpaque(false);
		campoDocumento.setBackground(Color.WHITE);
		campoDocumento.setForeground(Color.BLACK);
		campoDocumento.setBorder(new LineBorder(Color.BLACK, 1));
		campoDocumento.setFont(new Font("Arial", Font.PLAIN, 14));
		panelCliente.add(campoDocumento);
		
		JLabel direccion = new JLabel("Direccion:");
		direccion.setBounds(25, 40, 110, 40);
		direccion.setBackground(Color.WHITE);
		direccion.setForeground(Color.BLACK);
		direccion.setOpaque(false);
		direccion.setFont(new Font("Arial", Font.PLAIN, 14));
		panelCliente.add(direccion);

		JTextField campoDireccion = new JTextField();
		campoDireccion.setBounds(110, 50, 130, 23);
		campoDireccion.setOpaque(false);
		campoDireccion.setBackground(Color.WHITE);
		campoDireccion.setForeground(Color.BLACK);
		campoDireccion.setBorder(new LineBorder(Color.BLACK, 1));
		campoDireccion.setFont(new Font("Arial", Font.PLAIN, 14));
		panelCliente.add(campoDireccion);
		
		JLabel nombres = new JLabel("Nombres:");
		nombres.setBounds(270, 10, 110, 40);
		nombres.setBackground(Color.WHITE);
		nombres.setForeground(Color.BLACK);
		nombres.setOpaque(false);
		nombres.setFont(new Font("Arial", Font.PLAIN, 14));
		panelCliente.add(nombres);
		
		JTextField campoNombres = new JTextField();
		campoNombres.setBounds(360, 20, 235, 23);
		campoNombres.setOpaque(false);
		campoNombres.setBackground(Color.WHITE);
		campoNombres.setForeground(Color.BLACK);
		campoNombres.setBorder(new LineBorder(Color.BLACK, 1));
		campoNombres.setFont(new Font("Arial", Font.PLAIN, 14));
		panelCliente.add(campoNombres);
		
		JLabel telefono = new JLabel("Telefono:");
		telefono.setBounds(270, 40, 110, 40);
		telefono.setBackground(Color.WHITE);
		telefono.setForeground(Color.BLACK);
		telefono.setOpaque(false);
		telefono.setFont(new Font("Arial", Font.PLAIN, 14));
		panelCliente.add(telefono);

		JTextField campoTelefonos = new JTextField();
		campoTelefonos.setBounds(360, 50, 235, 23);
		campoTelefonos.setOpaque(false);
		campoTelefonos.setBackground(Color.WHITE);
		campoTelefonos.setForeground(Color.BLACK);
		campoTelefonos.setBorder(new LineBorder(Color.BLACK, 1));
		campoTelefonos.setFont(new Font("Arial", Font.PLAIN, 14));
		panelCliente.add(campoTelefonos);
		
		//SEGUNDO PANEL

		JLabel txtDatosFactura = new JLabel("Datos de factura");
		txtDatosFactura.setBounds(30, 100, 110, 40);
		txtDatosFactura.setBackground(Color.WHITE);
		txtDatosFactura.setForeground(Color.BLACK);
		txtDatosFactura.setOpaque(true);
		txtDatosFactura.setFont(new Font("Arial", Font.PLAIN, 14));
		centro.add(txtDatosFactura);
		
		JPanel panelFactura = new JPanel();
		panelFactura.setBounds(20,  120,  620,  60);
		panelFactura.setOpaque(false);
		panelFactura.setLayout(null);
		panelFactura.setBorder(new LineBorder(Color.GRAY, 1));
		centro.add(panelFactura);
		
		JLabel nFactura = new JLabel("N° Factura:");
		nFactura.setBounds(10, 10, 110, 40);
		nFactura.setBackground(Color.WHITE);
		nFactura.setForeground(Color.BLACK);
		nFactura.setOpaque(false);
		nFactura.setFont(new Font("Arial", Font.PLAIN, 14));
		panelFactura.add(nFactura);
		
		JLabel digito = new JLabel("1");
		digito.setBounds(120, 10, 110, 40);
		digito.setBackground(Color.WHITE);
		digito.setForeground(Color.BLACK);
		digito.setOpaque(false);
		digito.setFont(new Font("Arial", Font.BOLD, 14));
		panelFactura.add(digito);
		
		JLabel fecha = new JLabel("Fecha:");
		fecha.setBounds(285, 10, 110, 40);
		fecha.setBackground(Color.WHITE);
		fecha.setForeground(Color.BLACK);
		fecha.setOpaque(false);
		fecha.setFont(new Font("Arial", Font.PLAIN, 14));
		panelFactura.add(fecha);
		
		JLabel digitoFecha = new JLabel("2021/50/21");
		digitoFecha.setBounds(360, 10, 110, 40);
		digitoFecha.setBackground(Color.WHITE);
		digitoFecha.setForeground(Color.BLACK);
		digitoFecha.setOpaque(false);
		digitoFecha.setFont(new Font("Arial", Font.BOLD, 14));
		panelFactura.add(digitoFecha);
		
		//TERCER PANEL
		
		JPanel panelLista = new JPanel();
		panelLista.setBounds(20,  195,  620,  200);
		panelLista.setOpaque(false);
		panelLista.setLayout(null);
		panelLista.setBorder(new LineBorder(Color.GRAY, 1));
		centro.add(panelLista);
		
		JButton listaFacturas = new JButton("Ver listado de facturas");
		listaFacturas.setBounds(10, 10, 195, 30);
		ImageIcon icono = new ImageIcon("mn.png");
		ImageIcon iconoM = new ImageIcon(icono.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		listaFacturas.setIcon(iconoM);
		listaFacturas.setBackground(Color.WHITE);
		listaFacturas.setBorder(null);
		listaFacturas.setOpaque(false);
		panelLista.add(listaFacturas);
		
		JButton añadir = new JButton("Añadir");
		añadir.setBounds(420, 10, 85, 30);
		ImageIcon icono_2 = new ImageIcon("sv.png");
		ImageIcon iconoM_2 = new ImageIcon(icono_2.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		añadir.setIcon(iconoM_2);
		añadir.setBackground(Color.WHITE);
		añadir.setBorder(null);
		añadir.setOpaque(false);
		panelLista.add(añadir);
		
		JButton eliminar = new JButton("Eliminar");
		eliminar.setBounds(510, 10, 95, 30);
		ImageIcon icono_3 = new ImageIcon("dlt.png");
		ImageIcon iconoM_3 = new ImageIcon(icono_3.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		eliminar.setIcon(iconoM_3);
		eliminar.setBackground(Color.WHITE);
		eliminar.setBorder(null);
		eliminar.setOpaque(false);
		panelLista.add(eliminar);
		
		//TABLA
		
		String[] clases = {"Producto", "Cantidad", "Valor", "SubTotal"};
		String[][] datos = {{"Agua", "2", "500", "1000.0"},
							{"Cereal", "5", "1000", "5000.0"},
							{"Leche", "3", "300", "600.0"}};
		
		JTable listaFactura = new JTable(datos, clases);
		JScrollPane scrollPane = new JScrollPane(listaFactura);
		listaFactura.setVisible(true);
		listaFactura.setForeground(Color.BLACK);
		listaFactura.setOpaque(true);
		listaFactura.setBackground(Color.WHITE);
		add(scrollPane);
		scrollPane.setBounds(0, 50, 620, 150);
		panelLista.add(scrollPane);
		
		//EN PANEL CENTRAL
		
		JLabel subTotal = new JLabel("SubTotal:");
		subTotal.setBounds(40, 400, 110, 40);
		subTotal.setBackground(Color.WHITE);
		subTotal.setForeground(Color.BLACK);
		subTotal.setOpaque(false);
		subTotal.setFont(new Font("Arial", Font.PLAIN, 14));
		centro.add(subTotal);
		
		JLabel digitoSubTotal = new JLabel("6600.0");
		digitoSubTotal.setBounds(150, 400, 110, 40);
		digitoSubTotal.setBackground(Color.WHITE);
		digitoSubTotal.setForeground(Color.BLACK);
		digitoSubTotal.setOpaque(false);
		digitoSubTotal.setFont(new Font("Arial", Font.BOLD, 14));
		centro.add(digitoSubTotal);
		
		JLabel descuento = new JLabel("% Descuento:");
		descuento.setBounds(40, 435, 110, 40);
		descuento.setBackground(Color.WHITE);
		descuento.setForeground(Color.BLACK);
		descuento.setOpaque(false);
		descuento.setFont(new Font("Arial", Font.PLAIN, 14));
		centro.add(descuento);
		
		JTextField campoDescuento = new JTextField();
		campoDescuento.setBounds(150, 445, 45, 23);
		campoDescuento.setOpaque(false);
		campoDescuento.setBackground(Color.WHITE);
		campoDescuento.setForeground(Color.BLACK);
		campoDescuento.setBorder(new LineBorder(Color.BLACK, 1));
		campoDescuento.setFont(new Font("Arial", Font.PLAIN, 14));
		centro.add(campoDescuento);
		
		JCheckBox verificar = new JCheckBox();
		verificar.setBounds(215, 445, 45, 23);
		verificar.setOpaque(false);
		centro.add(verificar);
		
		JLabel valorDescontado = new JLabel("Valor Descontado:");
		valorDescontado.setBounds(255, 435, 130, 40);
		valorDescontado.setBackground(Color.WHITE);
		valorDescontado.setForeground(Color.BLACK);
		valorDescontado.setOpaque(false);
		valorDescontado.setFont(new Font("Arial", Font.PLAIN, 14));
		centro.add(valorDescontado);
		
		JLabel digitoValorDescontado = new JLabel("330.0");
		digitoValorDescontado.setBounds(390, 435, 110, 40);
		digitoValorDescontado.setBackground(Color.WHITE);
		digitoValorDescontado.setForeground(Color.BLACK);
		digitoValorDescontado.setOpaque(false);
		digitoValorDescontado.setFont(new Font("Arial", Font.BOLD, 14));
		centro.add(digitoValorDescontado);
		
		JLabel iva = new JLabel("IVA 19%:");
		iva.setBounds(40, 470, 110, 40);
		iva.setBackground(Color.WHITE);
		iva.setForeground(Color.BLACK);
		iva.setOpaque(false);
		iva.setFont(new Font("Arial", Font.PLAIN, 14));
		centro.add(iva);
		
		JLabel digitoIva = new JLabel("1254.0");
		digitoIva.setBounds(150, 470, 110, 40);
		digitoIva.setBackground(Color.WHITE);
		digitoIva.setForeground(Color.BLACK);
		digitoIva.setOpaque(false);
		digitoIva.setFont(new Font("Arial", Font.BOLD, 14));
		centro.add(digitoIva);
		
		JLabel total = new JLabel("Total Factura:");
		total.setBounds(40, 505, 110, 40);
		total.setBackground(Color.WHITE);
		total.setForeground(Color.BLACK);
		total.setOpaque(false);
		total.setFont(new Font("Arial", Font.PLAIN, 14));
		centro.add(total);
		
		JLabel digitoTotal = new JLabel("7524.0");
		digitoTotal.setBounds(150, 505, 110, 40);
		digitoTotal.setBackground(Color.WHITE);
		digitoTotal.setForeground(Color.BLACK);
		digitoTotal.setOpaque(false);
		digitoTotal.setFont(new Font("Arial", Font.BOLD, 14));
		centro.add(digitoTotal);
		
		JButton finalizar = new JButton("Finalizar factura");
		finalizar.setBounds(410, 555, 140, 25);
		finalizar.setOpaque(true);
		finalizar.setForeground(Color.BLACK);
		finalizar.setBorder(new LineBorder(Color.BLACK, 1));
		finalizar.setFont(new Font("Arial", Font.PLAIN, 14));
		centro.add(finalizar);
		
		JButton limpiar = new JButton("Limpiar");
		limpiar.setBounds(565, 555, 75, 25);
		limpiar.setOpaque(true);
		limpiar.setForeground(Color.BLACK);
		limpiar.setBorder(new LineBorder(Color.BLACK, 1));
		limpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		centro.add(limpiar);
		
		return principal;
	}
}
