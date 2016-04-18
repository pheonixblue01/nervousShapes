package nervousShapes;

// Represents a rectangle that can be displayed in a graphics
// context

import java.awt.*;

public class Rectangle extends Shape {
  // Instance variables
  private int width;
  private int height;
  private int length;

  // Constructor
  public Rectangle(int x, int y, Color color,
                   int width, int height) {
    super(x, y, color);
    this.width = width;
    this.height = height;
  }
  // Instance methods
  public void draw(Graphics g) {
    g.setColor(getColor());
    g.fillRect(getX(), getY(), width, height);
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
