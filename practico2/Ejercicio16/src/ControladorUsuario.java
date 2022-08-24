import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ControladorUsuario implements ActionListener {
private Vista vista ;
private Modelo modelo;

	
public ControladorUsuario() {
	super();
	this.vista = new Vista(this);
	this.modelo = new Modelo();
	this.vista.setVisible(true);
}
public Vista getVista() {
	return vista;  
}
public void setVista(Vista vista) {
	this.vista = vista;
}
public Modelo getModelo() {
	return modelo;
}
public void setModelo(Modelo modelo) {
	this.modelo = modelo;
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(getVista().getBtnSaludar()));
	modelo.saludar(getVista().getTxtNombre().getText());
////	this.vista.getTxtNombre().setText(modelo.getCadena());
	JOptionPane.showMessageDialog(null,modelo.getCadena());

}
}
