

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;

public class Vista extends JFrame {

	private JPanel contentPane;
	private Controlador controlador;
	private JButton btnAceptar;
	private JTextField direccionArchivo;
	private JTextField direccionAGuardar;



	public Vista(Controlador controlador) {
		this.setControlador(controlador);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btnAceptar = new JButton("aceptar");
		panel.add(btnAceptar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ingrese el archivo");
		lblNewLabel.setBounds(10, 11, 110, 24);
		panel_1.add(lblNewLabel);
		
		direccionArchivo = new JTextField();
		direccionArchivo.setBounds(130, 13, 271, 20);
		panel_1.add(direccionArchivo);
		direccionArchivo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ingrese la ubicacion");
		lblNewLabel_1.setBounds(10, 131, 110, 14);
		panel_1.add(lblNewLabel_1);
		
		direccionAGuardar = new JTextField();
		direccionAGuardar.setBounds(130, 128, 271, 20);
		panel_1.add(direccionAGuardar);
		direccionAGuardar.setColumns(10);
		
		
	}
	
	
	
	

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public JButton getBtnAcetpar() {
		return btnAceptar;
	}
	
	public JTextField getDireccionArchivo() {
		return direccionArchivo;
	}

	public JTextField getDireccionAGuardar() {
		return direccionAGuardar;
	}

	
}
