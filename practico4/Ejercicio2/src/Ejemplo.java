
public class Ejemplo {

	import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.filechooser.FileNameExtensionFilter;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import javax.swing.JFileChooser;
	import javax.swing.JTextArea;
	import javax.swing.JScrollPane;
	import java.awt.event.ActionListener;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.awt.event.ActionEvent;

	public class Vista extends JFrame {

		private JPanel contentPane;
		private JTextField textField;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Vista frame = new Vista();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 * @throws IOException 
		 * @throws FileNotFoundException 
		 */
		public Vista() throws FileNotFoundException, IOException {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			textField = new JTextField();
			textField.setText("selecciona un fichero o directorio");
			textField.setBounds(28, 44, 176, 22);
			contentPane.add(textField);
			textField.setColumns(10);
			
		
			JTextArea textArea = new JTextArea();
			textArea.setBounds(10, 98, 414, 152);
			contentPane.add(textArea);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(241, 68, -24, -49);
			contentPane.add(scrollPane);
			
			JButton btn = new JButton("Selecciona..");
			btn.setBounds(289, 11, 117, 22);
			contentPane.add(btn);
			
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

	//creamos un objeto de JFileChoose
			JFileChooser fc = new JFileChooser();
			
	//Indicamos que podemos seleccionar varios ficheros
			fc.setMultiSelectionEnabled(true);
			
//			indicamos lo que podemos seleccionar
			fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			
	//creamos el filtro para seleccionar ficheros legibles como los txt
			FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT","txt");
			
//			indico el filtro
			fc.setFileFilter(filtro);
			
//			abrimos la ventana, guardamos la opcion seleccionada por el usuario
			int seleccion = fc.showOpenDialog(contentPane);
			
		
//			si el usuario pincha en aceptar
			if (seleccion == JFileChooser.APPROVE_OPTION){
				
//				seleccionamos el fichero

				File fichero = fc.getSelectedFile(); 

//				hacemos un array de ficheros para poder tener muchos ficheros seleccionados
//				File [] ficheros = fc.getSelectedFiles() con un for abajo que cubra todo el try
			
//				escribe la ruta del fichero seleccionado en el campo texto
				
				textField.setText(fichero.getAbsolutePath());

				try (FileReader fr = new FileReader(fichero)){
					String cadena=" ";
					int valor = fr.read();
				while (valor!= -1) {
					cadena = cadena +(char)valor;
					valor=fr.read();
				}
				textArea.setText(cadena);
				}catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}	
				}
			});	
			
			JButton btn1 = new JButton("Guardar");
			btn1.setBounds(289, 43, 117, 21);
			contentPane.add(btn1);

			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					JFileChooser fc = new JFileChooser();
		
	           int seleccion = fc.showSaveDialog(contentPane);
	           
	           if (seleccion == JFileChooser.APPROVE_OPTION) {
//	        	   seleccionamos el fichero
				File fichero = fc.getSelectedFile();
				
				try (FileWriter fv = new FileWriter (fichero)){
					
//					escribimos el texto en el fichero
					fv.write(textArea.getText());
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
				}
			});
			
		}
	}
}
