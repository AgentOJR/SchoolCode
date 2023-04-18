/**
 * Owen Rabe
 * Mar 22 23
 * Abstract class for shape type objects
 */
package shapetestharnessccp2;
import TurtleGraphics.Pen;

abstract public class AbstractShape implements Shape {
    
    protected double xPos;
    protected double yPos;
    
  
    public AbstractShape (){
        xPos = 0;
        yPos = 0;        
    }
    
    public AbstractShape(double xLoc, double yLoc){
        this();
        xPos = xLoc;
        yPos = yLoc;
    }
    
  
    /**
     * //abstract method saying all subclasses must have a method for calculating area of a the
     * @return the calculated area
     */
    abstract public double area();
    
    /**
     * abstract method sayingn all subclasses need to have a method to draw the shape
     * @param p the pen to be used to draw the shape
     */
    abstract public void draw(Pen p);
    /**
     *   accessor method for the xPos value
     * @return the xpos
     */
    public final double getXPos(){
        return xPos;
    }
/**
 * accessor method for the yPos value
 * @return the ypos value
 */
    public final double getYPos(){
        return yPos;
    }
    
/**
 * //mutator method for x and y pos attributes
 * @param xLoc the new xpos value
 * @param yLoc the new ypos value
 */
    public void move(double xLoc, double yLoc){
        xPos = xLoc;
        yPos= yLoc;
    }
/**
 * abstract method saying we have to have a method to stretch the shape by a given factor
 * @param factor the factor to stretch the shape by
 */
    abstract public void stretchBy(double factor);
  /**
   * typical tostring method
   * @return the string version of the shape
   */
    public String toString(){
        String str= "(X,Y) Position: (" + xPos + "," + yPos + ")\n" 
                + "Area: " + area();
        return str;
    }
    abstract public double perimiter();
}
