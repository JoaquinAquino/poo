

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Controlador implements ActionListener {
	private Vista vista;

	public Controlador() {

		this.vista=new Vista(this);
		this.vista.setVisible(true);

	}


	public void actionPerformed(ActionEvent e) {


		if(e.getSource().equals(getVista().getBtnGuardar())) {
			//creamos un objeto de JFileChoose
			JFileChooser fc = new JFileChooser();
			fc.setVisible(true);

			//Indicamos que podemos seleccionar varios ficheros
			fc.setMultiSelectionEnabled(true);

			//indicamos lo que podemos seleccionar
			fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

			//creamos el filtro para seleccionar ficheros legibles como los txt
			FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT","txt");

			//			indico el filtro
			fc.setFileFilter(filtro);

			//			abrimos la ventana, guardamos la opcion seleccionada por el usuario
			int seleccion = fc.showOpenDialog(getVista().getContentPane());

			if (seleccion == JFileChooser.APPROVE_OPTION){

				//				seleccionamos el fichero

				File fichero = fc.getSelectedFile(); 

				//				hacemos un array de ficheros para poder tener muchos ficheros seleccionados
				//				File [] ficheros = fc.getSelectedFiles() con un for abajo que cubra todo el try

				//				escribe la ruta del fichero seleccionado en el campo texto

				getVista().getDireccionArchivo().setText(fichero.getAbsolutePath());

				try (FileReader fr = new FileReader(fichero)){
					String cadena=" ";
					int valor = fr.read();
					while (valor!= -1) {
						cadena = cadena +(char)valor;
						valor=fr.read();
					}
					getVista().getDireccionArchivo().setText(cadena);
				}catch (IOException e1) {
					e1.printStackTrace();
				}

			}	
		}
		

		
	
	if(e.getSource().equals(getVista().getBtnGuardar())) {	
		JFileChooser fc = new JFileChooser();
		
        int seleccion = fc.showSaveDialog(getVista().getContentPane());
        
        if (seleccion == JFileChooser.APPROVE_OPTION) {
//     	   seleccionamos el fichero
			File fichero = fc.getSelectedFile();
			
			try (FileWriter fv = new FileWriter (fichero)){
				
//				escribimos el texto en el fichero
				fv.write(getVista().getDireccionArchivo().getText());
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
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
