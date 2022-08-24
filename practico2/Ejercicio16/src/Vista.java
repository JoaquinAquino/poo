import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Vista extends JFrame {

	private JPanel panelPrincipal;
	private JButton btnSaludar;
	private JTextField txtNombre;
    private ControladorUsuario controlador;

	public ControladorUsuario getControlador() {
		return controlador;
	}

	public void setControlador(ControladorUsuario controlador) {
		this.controlador = controlador;
	}

	public JButton getBtnSaludar() {
		return btnSaludar;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}


	public Vista(ControladorUsuario controlador) {
		this.setControlador(controlador);
		setTitle("Boton saludador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 116);
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(SystemColor.activeCaption);
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese su nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(40, 0, 121, 48);
		panelPrincipal.add(lblNewLabel);
		
		btnSaludar = new JButton("Saludar");
		btnSaludar.setBackground(SystemColor.textHighlight);
		btnSaludar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSaludar.addActionListener(this.getControlador());
		btnSaludar.setBounds(224, 46, 89, 23);
		panelPrincipal.add(btnSaludar);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(169, 15, 228, 20);
		panelPrincipal.add(txtNombre);
		txtNombre.setColumns(10);
		
	}
}
