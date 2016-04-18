package nervousShapes;

import java.awt.*;

public class Triangle extends Shape {
	
	private int length;
	private int height;
	private int width;
	private int x2;
	private int x3;
	private int y2;
	private int y3;

	
	public Triangle ( int x, int y, int x2, int y2, int x3, int y3, Color color, int length) { 
		super (x, y, color);
		this.x2 = x2;
		this.x3 = x3;
		this.y2 = y2;
		this.y3 = y3;
		this.length = length;
		
	}
	
	  public void draw(Graphics g) {
		  

		int num = getX();
		int x = getX();
		int y = getY();
		int x2 = x+length;
		int y2 = y;
		int x3 = (int) x+length/2;
		int y3 = (int) y+length;
		int xCoords[] = {x, x2, x3, x};
		int yCoords[] = {y, y2, y3, y};
		
		Polygon p = new Polygon(xCoords, yCoords, 4 );
		
		g.setColor(getColor());
		g.fillPolygon(p);
		
	  }


		  public int getHeight() {
		    return height;
		  }

		  public int getWidth() {
		    return width;
		  }
		  
		  public int getLength(){
			  return length;
		  }
		}



