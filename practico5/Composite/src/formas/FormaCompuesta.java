package formas;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormaCompuesta extends FormaBase {
	 protected List<Forma> hijos = new ArrayList<>();

	    public FormaCompuesta(Forma... components) {
	        super(0, 0, Color.BLACK);
	        add(components);
	    }

	    public void add(Forma component) {
	        hijos.add(component);
	    }

	    public void add(Forma... components) {
	        hijos.addAll(Arrays.asList(components));
	    }

	    public void remove(Forma hijo) {
	        hijos.remove(hijo);
	    }

	    public void remove(Forma... components) {
	        hijos.removeAll(Arrays.asList(components));
	    }

	    public void clear() {
	        hijos.clear();
	    }

	    @Override
	    public int getX() {
	        if (hijos.size() == 0) {
	            return 0;
	        }
	        int x = hijos.get(0).getX();
	        for (Forma hijo : hijos) {
	            if (hijo.getX() < x) {
	                x = hijo.getX();
	            }
	        }
	        return x;
	    }

	    @Override
	    public int getY() {
	        if (hijos.size() == 0) {
	            return 0;
	        }
	        int y = hijos.get(0).getY();
	        for (Forma hijo : hijos) {
	            if (hijo.getY() < y) {
	                y = hijo.getY();
	            }
	        }
	        return y;
	    }

	    @Override
	    public int getWidth() {
	        int maxWidth = 0;
	        int x = getX();
	        for (Forma hijo : hijos) {
	            int hijosRelativeX = hijo.getX() - x;
	            int hijoWidth = hijosRelativeX + hijo.getWidth();
	            if (hijoWidth > maxWidth) {
	                maxWidth = hijoWidth;
	            }
	        }
	        return maxWidth;
	    }

	    @Override
	    public int getHeight() {
	        int maxHeight = 0;
	        int y = getY();
	        for (Forma hijo : hijos) {
	            int hijosRelativeY = hijo.getY() - y;
	            int hijoHeight = hijosRelativeY + hijo.getHeight();
	            if (hijoHeight > maxHeight) {
	                maxHeight = hijoHeight;
	            }
	        }
	        return maxHeight;
	    }

	    @Override
	    public void move(int x, int y) {
	        for (Forma hijo : hijos) {
	            hijo.move(x, y);
	        }
	    }

	    @Override
	    public boolean isInsideBounds(int x, int y) {
	        for (Forma hijo : hijos) {
	            if (hijo.isInsideBounds(x, y)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    @Override
	    public void unSelect() {
	        super.unSelect();
	        for (Forma hijo : hijos) {
	            hijo.unSelect();
	        }
	    }

	    public boolean selecthijoAt(int x, int y) {
	        for (Forma hijo : hijos) {
	            if (hijo.isInsideBounds(x, y)) {
	                hijo.select();
	                return true;
	            }
	        }
	        return false;
	    }

	    @Override
	    public void paint(Graphics graphics) {
	        if (isSelected()) {
	            enableSelectionStyle(graphics);
	            graphics.drawRect(getX() - 1, getY() - 1, getWidth() + 1, getHeight() + 1);
	            disableSelectionStyle(graphics);
	        }

	        for (Forma hijo : hijos) {
	            hijo.paint(graphics);
	        }
	    }
	}