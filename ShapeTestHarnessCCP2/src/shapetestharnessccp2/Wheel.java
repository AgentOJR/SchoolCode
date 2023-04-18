/**
 * Owen Rabe
 * Mar 22 23
 * Class to create a wheel object
 */
package shapetestharnessccp2;
import TurtleGraphics.Pen;

public class Wheel extends Circle {
    private int spokes;
    
    /**
     * Constructor for a wheel with no spokes and default size and location
     */
    public Wheel(){
        super();            
        spokes = 0; 
    }
    
   /**
    * constructor for a wheel with specified size, location, and number of spokes
    * @param xLoc the  requested x location
    * @param yLoc the requested y location
    * @param r the requested size (radius)
    * @param s the requested number of spokes
    */
    public Wheel(double xLoc, double yLoc, double r, int s){
        super(xLoc, yLoc, r);        
        spokes = s;
    }
    /**
     * a method to draw the wheel
     * @param p the pen to use to draw
     */
    public void draw(Pen p){        
        //invoking the draw method from the superclass to draw a circle
        super.draw(p);
      //loop to draw spokes all the way around the wheel
        for(int i = 1; i <= spokes; i++){
            p.up();
            p.move(xPos, yPos);
            p.setDirection(i*360.0 / spokes);
            p.down();
            p.move(radius);
        }
        
    }
    /**
     * mutator for the number of spokes
     * @param s new num of spokes
     */
    public void setSpokes(int s){
        spokes = s;
    }
    
    /**
     * tostring method with wheel specific info
     * @return the string version of the wheel
     */
    public String toString(){
        String str = "WHEEL\n"
                + "Radius: " + radius + "\n"
                + "Spokes: " + spokes + "\n"
                + "(X,Y) Position: (" + xPos + "," + yPos + ")\n"
                + "Area: " + area();
        return str;
    }
    
}
