

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
	private JButton btnGuardar;
	private JTextField direccionArchivo;
	private JButton btnSeleccionar;



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
		
		btnGuardar = new JButton("guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btnSeleccionar = new JButton("seleccionar");
		panel.add(btnSeleccionar);
		panel.add(btnGuardar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ingrese el archivo");
		lblNewLabel.setBounds(148, 51, 110, 24);
		panel_1.add(lblNewLabel);
		
		direccionArchivo = new JTextField();
		direccionArchivo.setBounds(78, 86, 271, 20);
		panel_1.add(direccionArchivo);
		direccionArchivo.setColumns(10);
		
		
	}
	
	
	
	

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}
	
	public JTextField getDireccionArchivo() {
		return direccionArchivo;
	}


	public JButton getBtnSeleccionar() {
		return btnSeleccionar;
	}

	

	
}
