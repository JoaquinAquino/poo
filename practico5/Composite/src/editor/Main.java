package editor;

import java.awt.Color;

import formas.Circulo;
import formas.FormaCompuesta;
import formas.Punto;
import formas.Rectangulo;

public class Main {

	public static void main(String[] args) {
		 EditorImagen editor = new EditorImagen();

	        editor.loadFormas(
	                new Circulo(10, 10, 10, Color.BLUE),

	                new FormaCompuesta(
	                    new Circulo(110, 110, 50, Color.RED),
	                    new Punto(160, 160, Color.RED)
	                ),

	                new FormaCompuesta(
	                        new Rectangulo(250, 250, 100, 100, Color.GREEN),
	                        new Punto(240, 240, Color.GREEN),
	                        new Punto(240, 360, Color.GREEN),
	                        new Punto(360, 360, Color.GREEN),
	                        new Punto(360, 240, Color.GREEN)
	                )
	        );
	    }
	}