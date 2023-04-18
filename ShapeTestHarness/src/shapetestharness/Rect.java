/**
 * Owen Rabe
 * Mar 20 23
 * The shape interface outlines what methods must be contained in a class that implements shape, so it forces this class to have methods public double area();
    public void draw(Pen p);
    public double getXPos();
    public double getYPos();
    public void move(double xLoc, double yLoc);
    public void stretchBy(double factor);
    public String toString();
 */
package shapetestharness;
import TurtleGraphics.Pen;

public class Rect implements Shape{
    
    private double xPos, yPos;
    private double height, width;
    
    /**
     * makes a rectangle object with default attributes
     */
    public Rect(){
        xPos = 0;
        yPos = 0;
        height = 1;
        width = 1;
    }
    
    /**
     * Creates a rectangle object at a specified location with a specified size
     * @param xLoc
     * @param yLoc
     * @param h
     * @param w 
     */
    public Rect(double xLoc, double yLoc, double h, double w){
        this();
        xPos = xLoc;
        yPos = yLoc;
        height = h;
        width = w;
    }
       /**
        * method to give the area of the rectangle
        * @return the calculated area
        */
    public double area(){
        return height * width;
    }
    /**
     * draw method to draw the rectangle using it's attributes
     * @param p the pen to use to draw the rectangle
     */
    public void draw(Pen p){
        p.up();
        p.move(xPos, yPos);        
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(-90);
        p.move(height);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(height);
    }
    
     /**
      * accessor method for the xpos attribute
      * @return the xpos of the rect
      */
    public double getXPos(){
        return xPos;
    }
    /**
      * accessor method for the ypos attribute
      * @return the ypos of the rect
      */
    public double getYPos(){
        return yPos;
    }
    /**
     * mutator method to move the rect changing xpos and ypos attributes
     * @param xLoc new xpos
     * @param yLoc new ypos
     */
    public void move(double xLoc, double yLoc){
        xPos = xLoc;
        yPos= yLoc;
    }
    /**
     * method to stretch the rectangle (technically mutator for size attributes i guess)
     * @param factor the factor to stretch by 
     */
    public void stretchBy(double factor){
        height = height * factor;
        width = width * factor;
    }
     /**
      * standard tostring method
      * @return the string version of the rect
      */
    public String toString(){
        String str = "RECTANGLE\n"
                + "Width and Height: " + width + " and " + height + "\n"
                + "(X,Y) Position: (" + xPos + "," + yPos + ")\n" 
                + "Area: " + area();
        return str;
    }
}
