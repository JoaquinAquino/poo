package ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener {
	private Vista vista;

	public Controlador() {

		this.vista=new Vista(this);
this.vista.setVisible(true);

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(getVista().getBtnAcetpar1())) {

			String [] arreglo = {"Aceptar","Cancelar"};
			JOptionPane.showOptionDialog(vista, "Está seguro que quiere dar de baja al usuario", null, 0, 0, null, arreglo, "");
		};
		
		if(e.getSource().equals(getVista().getBtnAcetpar2())) {
			String texto=JOptionPane.showInputDialog(vista,"ingrese un texto"); 
			JOptionPane.showMessageDialog(vista,texto);
		};

	}

	
	
	
	

	public Vista getVista() {
		return vista;
	}

	public void setVista(Vista vista) {
		this.vista = vista;
	}
	
	
	
}
