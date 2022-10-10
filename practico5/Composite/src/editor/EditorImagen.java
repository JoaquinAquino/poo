package editor;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

import formas.Forma;
import formas.FormaCompuesta;

public class EditorImagen {
	 private EditorCanvas canvas;
	    private FormaCompuesta formas = new FormaCompuesta();

	    public EditorImagen() {
	        canvas = new EditorCanvas();
	    }

	    public void loadFormas(Forma... Formas) {
	        formas.clear();
	        formas.add(Formas);
	        canvas.refresh();
	    }

	    private class EditorCanvas extends Canvas {
	        JFrame frame;

	        private static final int PADDING = 10;

	        EditorCanvas() {
	            createFrame();
	            refresh();
	            addMouseListener(new MouseAdapter() {
	                @Override
	                public void mousePressed(MouseEvent e) {
	                    formas.unSelect();
	                    formas.selecthijoAt(e.getX(), e.getY());
	                    e.getComponent().repaint();
	                }
	            });
	        }

	        void createFrame() {
	            frame = new JFrame();
	            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	            frame.setLocationRelativeTo(null);

	            JPanel contentPanel = new JPanel();
	            Border padding = BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING);
	            contentPanel.setBorder(padding);
	            frame.setContentPane(contentPanel);

	            frame.add(this);
	            frame.setVisible(true);
	            frame.getContentPane().setBackground(Color.LIGHT_GRAY);
	        }

	        public int getWidth() {
	            return formas.getX() + formas.getWidth() + PADDING;
	        }

	        public int getHeight() {
	            return formas.getY() + formas.getHeight() + PADDING;
	        }

	        void refresh() {
	            this.setSize(getWidth(), getHeight());
	            frame.pack();
	        }

	        public void paint(Graphics graphics) {
	            formas.paint(graphics);
	        }
	    }
}
