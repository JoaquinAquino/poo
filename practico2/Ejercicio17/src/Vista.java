import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JButton btnBoton3;
	private JButton btnBoton2;
	private JButton btnBoton1;
    private Controlador controlador;
	
	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public JButton getBtnBoton3() {
		return btnBoton3;
	}

	public JButton getBtnBoton2() {
		return btnBoton2;
	}

	public JButton getBtnBoton1() {
		return btnBoton1;
	}

	public Vista(Controlador controlador) {
		this.setControlador(controlador);
		setBackground(SystemColor.inactiveCaptionText);
		setTitle("                                                                                Botón saludador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 121);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnBoton1 = new JButton("Boton 1");
		btnBoton1.addActionListener(getControlador());
		btnBoton1.setBounds(125, 33, 89, 23);
		contentPane.add(btnBoton1);
		
		btnBoton2 = new JButton("Boton 2");
		btnBoton2.setEnabled(false);
		btnBoton2.addActionListener(getControlador());
		btnBoton2.setBounds(247, 33, 89, 23);
		contentPane.add(btnBoton2);
		
		btnBoton3 = new JButton("Boton 3");
		
		btnBoton3.addActionListener(getControlador());
		btnBoton3.setEnabled(false);
		btnBoton3.setBounds(366, 33, 89, 23);
		contentPane.add(btnBoton3);
	}

}
