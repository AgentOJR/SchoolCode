/**
 * owen rabe
 * mar 20 23
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

public class Circle implements Shape{
   
    private double xPos, yPos;
    private double radius;
    private final static double PI = 3.14;
        /**
         * Constructor
         * makes a circle object with default attributes
         */
    public Circle(){
        xPos = 0;
        yPos = 0;
        radius = 1; 
    }
    
    /**
     * constructor
     * makes a circle object with specified attributes
     * @param xLoc x location of the circle
     * @param yLoc y location of the circle
     * @param r the radius of the circle
     */
    public Circle(double xLoc, double yLoc, double r){
        this();
        xPos = xLoc;
        yPos = yLoc;
        radius = r;         
    }
    
   /**
    * method to determine and return the area of the circle
    * @return the area of the circle
    */
    public double area(){
        return PI * radius * radius;
    }
        
    /**
     * Method to draw the circle on a given pen
     * @param p the pen to be used
     */
    public void draw(Pen p){
        double side = 2.0 * PI * radius /120.0;
        p.up();
        p.move(xPos + radius, yPos - side / 2.0);
        p.setDirection(90);
        p.down();
        //loop to smoothly draw the circle
        for(int i = 0; i <120; i++){
            p.move(side);
            p.turn(3);
        }
    }
    
    /**
     * method to stretch the circle 
     * @param factor the factor to stretch the circle by
     */
    public void stretchBy(double factor){
        radius = radius * factor;
    }
    /**
     * accessor for xpos value
     * @return the xpos
     */
     public double getXPos(){
        return xPos;
    }
    /**
     * accessor for ypos value
     * @return the ypos
     */
    public double getYPos(){
        return yPos;
    }
    /**
     * Mutator to move the circle to specified location
     * @param xLoc specified x position
     * @param yLoc specified y position
     */
    public void move(double xLoc, double yLoc){
        xPos = xLoc;
        yPos= yLoc;
    }
    /**
     * generic tostring method
     * @return  the string version of the circle object
     */
    public String toString(){
        String str = "CIRCLE\n"
                + "Radius: " + radius + "\n"
                + "(X,Y) Position: (" + xPos + "," + yPos + ")\n" 
                + "Area: " + area();
        return str;
    }
}
