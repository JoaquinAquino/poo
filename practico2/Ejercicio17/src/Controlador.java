import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
private Vista vista;

	public Controlador() {
	super();
	this.vista = new Vista(this);
	this.vista.setVisible(true);
}

	public Vista getVista() {
		return vista;
	}

	public void setVista(Vista vista) {
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(getVista().getBtnBoton1())){
		getVista().getBtnBoton1().setEnabled(false);
		getVista().getBtnBoton2().setEnabled(true);}
		if(e.getSource().equals(getVista().getBtnBoton2())){
		getVista().getBtnBoton2().setEnabled(false);
		getVista().getBtnBoton3().setEnabled(true);}
		if(e.getSource().equals(getVista().getBtnBoton3())){
		getVista().getBtnBoton3().setEnabled(false);
		getVista().getBtnBoton1().setEnabled(true);}
		
	}

}
