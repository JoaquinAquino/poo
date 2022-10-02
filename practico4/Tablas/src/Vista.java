


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;

public class Vista extends JFrame {

	private JPanel contentPane;
	private Controlador controlador;
	private JTable table;
	private JButton boton;
	private DefaultTableModel cuerpo;
	private JTextField textField;



	public Vista(Controlador controlador) {
		this.setControlador(controlador);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 423);
		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("PLANETAS");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setBackground(new Color(0, 51, 102));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
				
		
		String encabezado[]= {"id","nombre","radio","lunas","gaseoso"};
		cuerpo=new DefaultTableModel(null,encabezado);		
		table = new JTable(cuerpo);

		table.setBounds(27, 11, 442, 333);
		table.setVisible(true);
		
		table.setDefaultEditor(Object.class, null);//no deja editar las columnas
		
		table.getColumnModel().getColumn(0).setMaxWidth(0);
		table.getColumnModel().getColumn(0).setMinWidth(0);
		table.getColumnModel().getColumn(0).setPreferredWidth(0);//se esconde el id
		
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);// solo se puede seleccionar uno
		
		table.getSelectionModel().addListSelectionListener(getControlador());
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 11, 442, 333);
		scrollPane.setViewportView(table);
		panel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		contentPane.add(panel_1, BorderLayout.EAST);
		
		boton = new JButton("boton");
		boton.addActionListener(getControlador());
		boton.setEnabled(false);
		boton.setVerticalAlignment(SwingConstants.BOTTOM);
		boton.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(boton);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("Buscar");
		panel_2.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.addKeyListener(this.getControlador());
		panel_2.add(textField);
		textField.setColumns(20);
	 
	}
	
	
	
	

	public JTextField getTextField() {
		return textField;
	}





	public JTable getTable() {
		return table;
	}





	public JButton getBoton() {
		return boton;
	}





	public DefaultTableModel getCuerpo() {
		return cuerpo;
	}





	public void setCuerpo(DefaultTableModel cuerpo) {
		this.cuerpo = cuerpo;
	}





	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
}
