

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class Controlador implements ActionListener {
	private Vista vista;
	private Idioma idioma;
	

	public Controlador() {

		this.vista=new Vista(this);
		this.vista.setVisible(true);

	}



	public void actionPerformed(ActionEvent e) {

		if(e.getSource().equals(getVista().getbtnTraducir())) {
		
		
		String lenguaje = getVista().getComboBoxIdiomas().getModel().getSelectedItem().toString();
		
		if ("frances".equals(lenguaje)) {
			idioma =new Frances();			
		}
		else if("ingles".equals(lenguaje)) {
			idioma =new Ingles();	
		}
		else if("portugues".equals(lenguaje)) {
			idioma =new Portugues();	
		}
		
		String frases = (String)getVista().getComboBoxFrases().getSelectedItem();		
		switch (frases) {
		case "saludar":
			JOptionPane.showMessageDialog(vista,idioma.saludar());
			break;

		case "despedirse" :
			JOptionPane.showMessageDialog(vista,idioma.despedirse());
			break;
		case "perdon" :
			JOptionPane.showMessageDialog(vista,idioma.perdon());
			break;
		case "pedirCafe" :
			
			JOptionPane.showMessageDialog(vista,idioma.pedirCafe());
			break;
		case "cuantoCuesta" :			
			JOptionPane.showMessageDialog(vista,idioma.cuantoCuesta());
;
			break;
		case "dondeQueda" :
			JOptionPane.showMessageDialog(vista,idioma.dondeQueda());
			break;
			
		}
		}
	}






	public Vista getVista() {
		return vista;
	}

	public void setVista(Vista vista) {
		this.vista = vista;
	}



}
