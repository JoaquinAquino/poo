

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
		
		if(e.getSource().equals(getVista().getBtnAcetpar())) {
			String Archivo= getVista().getDireccionArchivo().getText();
			String direccionaGuardar= getVista().getDireccionAGuardar().getText();

			
		};
	
	}

	
	
	
	

	public Vista getVista() {
		return vista;
	}

	public void setVista(Vista vista) {
		this.vista = vista;
	}
	
	
	
}
