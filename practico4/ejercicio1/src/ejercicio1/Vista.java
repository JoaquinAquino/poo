package ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JButton btnAceptar1;
	private Controlador controlador;
	private JButton btnAceptar2;



	public Vista(Controlador controlador) {
		this.setControlador(controlador);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAceptar1 = new JButton("iniciar1");
		btnAceptar1.addActionListener(getControlador());
		
		btnAceptar1.setBounds(59, 107, 89, 23);
		contentPane.add(btnAceptar1);
		
		btnAceptar2 = new JButton("iniciar2");
		btnAceptar2.addActionListener(getControlador());
		btnAceptar2.setBounds(245, 107, 89, 23);
		contentPane.add(btnAceptar2);
	}
	
	
	
	

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public JButton getBtnAcetpar1() {
		return btnAceptar1;
	}
	public JButton getBtnAcetpar2() {
		return btnAceptar2;
	}
}
