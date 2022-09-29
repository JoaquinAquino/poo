


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;

public class Vista extends JFrame {

	private JPanel contentPane;
	private Controlador controlador;
	private JButton btnTraducir;
	private JComboBox<String> comboBoxIdiomas;
	private JComboBox<String> comboBoxFrases;
	private String[] idiomas= {"frances","ingles","portugues"};
	private String[] frases= {"saludar","despedirse","perdon","pedirCafe","cuantoCuesta","dondeQueda"};

	public Vista(Controlador controlador) {
		this.setControlador(controlador);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btnTraducir = new JButton("traducir");
		btnTraducir.addActionListener(getControlador());
		panel.add(btnTraducir);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		comboBoxIdiomas = new JComboBox<String>();
		comboBoxIdiomas.setModel(new DefaultComboBoxModel<String>(idiomas));
		comboBoxIdiomas.addActionListener(getControlador());
		comboBoxIdiomas.setBounds(64, 106, 112, 34);
		panel_1.add(comboBoxIdiomas);
		
		JLabel lblLenguajel = new JLabel("Lenguaje");
		lblLenguajel.setBounds(93, 67, 46, 14);
		panel_1.add(lblLenguajel);
		
		comboBoxFrases = new JComboBox<String>();
		comboBoxFrases.setModel(new DefaultComboBoxModel<String>(frases));
		comboBoxFrases.addActionListener(getControlador());
		comboBoxFrases.setBounds(297, 106, 98, 34);
		panel_1.add(comboBoxFrases);
		
		JLabel lblNewLabel = new JLabel("frase");
		lblNewLabel.setBounds(324, 67, 46, 14);
		panel_1.add(lblNewLabel);
	
	}





	public JComboBox<String> getComboBoxIdiomas() {
		return comboBoxIdiomas;
	}


	public JComboBox<String> getComboBoxFrases() {
		return comboBoxFrases;
	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public JButton getbtnTraducir() {
		return btnTraducir;

	}





	public String[] getIdiomas() {
		return idiomas;
	}





	public void setIdiomas(String[] idiomas) {
		this.idiomas = idiomas;
	}


	public String[] getFrases() {
		return frases;
	}

	public void setFrases(String[] frases) {
		this.frases = frases;
	}
}
