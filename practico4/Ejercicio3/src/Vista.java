

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Vista extends JFrame {

	private JPanel contentPane;
	private Controlador controlador;
	private JTextField textMonto;
	private JTextField textDia;
	private JTextField textMes;
	private JTextField textAño;
	private JRadioButton radioEEUU;
	private JRadioButton radioArg;
	private JLabel labelMes;
	private JLabel labelDia;
	private JButton btnTransformar;
	private JTextField textMontoResultado;
	private JTextField textFechaResultado;
	
	public ButtonGroup grupoBotones = new ButtonGroup();



	public Vista(Controlador controlador) {
		this.setControlador(controlador);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MONTO");
		lblNewLabel.setBounds(10, 58, 96, 47);
		panel_1.add(lblNewLabel);
		
		textMonto = new JTextField();
		textMonto.setBounds(55, 71, 266, 20);
		panel_1.add(textMonto);
		textMonto.setColumns(10);
		
		labelDia = new JLabel("DIA");
		labelDia.setBounds(55, 136, 46, 14);
		panel_1.add(labelDia);
		
		labelMes = new JLabel("MES");
		labelMes.setBounds(154, 136, 46, 14);
		panel_1.add(labelMes);
		
		JLabel Año = new JLabel("AÑO");
		
		Año.setBounds(258, 136, 46, 14);
		panel_1.add(Año);
		
		textDia = new JTextField();
		textDia.addActionListener(getControlador());
		textDia.setBounds(20, 161, 86, 20);
		panel_1.add(textDia);
		textDia.setColumns(10);
		
		textMes = new JTextField();
		textMes.setBounds(127, 161, 86, 20);
		panel_1.add(textMes);
		textMes.setColumns(10);
		
		textAño = new JTextField();
		textAño.setBounds(232, 161, 86, 20);
		panel_1.add(textAño);
		textAño.setColumns(10);
		
		btnTransformar = new JButton("transformar");
		btnTransformar.addActionListener(getControlador());
		btnTransformar.setBounds(248, 282, 89, 23);
		panel_1.add(btnTransformar);
		
		JLabel lblNewLabel_1 = new JLabel("resultados");
		lblNewLabel_1.setBounds(445, 36, 72, 14);
		panel_1.add(lblNewLabel_1);
		
		textMontoResultado = new JTextField();
		textMontoResultado.setBounds(420, 71, 119, 20);
		panel_1.add(textMontoResultado);
		textMontoResultado.setColumns(10);
		
		textFechaResultado = new JTextField();
		textFechaResultado.setBounds(420, 161, 115, 20);
		panel_1.add(textFechaResultado);
		textFechaResultado.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.NORTH);
		
		radioEEUU = new JRadioButton("formato EEUU");
		radioEEUU.addActionListener(getControlador());
		panel_2.add(radioEEUU);
		
		radioArg = new JRadioButton("Formato ARG");
		radioArg.addActionListener(getControlador());
		panel_2.add(radioArg);
		
	

	}
	
	
	
	

	public void setTextMontoResultado(String textMontoResultado) {
		
		this.textMontoResultado.setText(textMontoResultado);
	}





	public void setTextFechaResultado(String textFechaResultado) {
		this.textFechaResultado.setText(textFechaResultado);
	}





	public void setLabelDia(String textDia) {
	
		this.labelDia.setText(textDia); 
	}

	public void setLabelMes(String textMes) {
		this.labelMes.setText(textMes); 
	}


	public JTextField getTextMontoResultado() {
		return textMontoResultado;
	}

	public JTextField getTextFechaResultado() {
		return textFechaResultado;
	}


	public JButton getBtnTransformar() {
		return btnTransformar;
	}


	public JTextField getTextMonto() {
		return textMonto;
	}

	public JTextField getTextDia() {
		return textDia;
	}

	public JTextField getTextMes() {
		return textMes;
	}

	public JTextField getTextAño() {
		return textAño;
	}

	public JRadioButton getRadioEEUU() {
		return radioEEUU;
	}

	public JRadioButton getRadioArg() {
		return radioArg;
	}
	

	public void setTextDia() {
		this.textDia = null;
	}

	public void setTextMes() {
		this.textMes = null;
	}
	public void setTextAño() {
		this.textAño = null;
	}





	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
}
