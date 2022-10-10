package formas;

import java.awt.Graphics;

public interface Forma {
	public int getX();
	public int getY();
	public int getWidth();
	public int getHeight();
	public void move(int x, int y);
	public boolean isInsideBounds(int x, int y);
	public void select();
	public void unSelect();
	public boolean isSelected();
	public void paint(Graphics graphics);
}
