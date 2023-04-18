/*
 * Owen Rabe
 * Mar 31 23
 * Third robot type
 */
package rabelotsofbots;

import TurtleGraphics.StandardPen;
import java.awt.Color;


public class LawyerBot extends AbstractRobot{
    private boolean sued;
    /**
     * Default constructor to set all attribiutes to defaults
     */
    public LawyerBot() {
        super();
        sued  = false;
    }
    /**
     * constructor to specify xy position
     * @param x x loc
     * @param y y loc
     */
    public LawyerBot(int x,int y){
        super(x,y);
        sued = false;
    }
    /**
     * detailed constructor for clone method
     * @param x x loc
     * @param y y loc
     * @param weight weight of bot
     * @param cost cost of bot
     * @param powerSource bot powersource
     * @param movementType bot movementtype
     * @param sensorType bot sensortype
     * @param sued if the bot is in a lawsuit or not
     */
    public LawyerBot(int x, int y, double weight, double cost, String powerSource, String movementType, String sensorType, boolean sued){
        super(x,y,weight,cost,powerSource,movementType,sensorType);
        this.sued = sued;
    }
    /**
     * method to draw the bot at its position
     * @param p the pen to use
     */
    public void draw(StandardPen p){
        p.setColor(Color.RED);
        p.up();
        double radius = 20;
        drawCircle(x, y, radius, p);
        drawCircle(x - radius / 2.5, y + radius / 3, radius / 4, p);
        drawCircle(x + radius / 2.5, y + radius / 3, radius / 4, p);
        drawLine(x - radius / 3, y - radius / 2, x + radius / 3, y - radius / 2, p);
        drawLine(x - radius / 3, y - radius / 2, x - radius / 3 - 5, y - radius / 2 + 5, p);
        drawLine(x + radius / 3, y - radius / 2, x + radius / 3 + 5, y - radius / 2 + 5, p);
    }
    /**
     * method to create a clone of the bot
     * @return the new clone
     */
    public LawyerBot clone(){
        LawyerBot clone = new LawyerBot(x,y,weight,cost,powerSource,movementType,sensorType,sued);
    return clone;
    }
    /**
     * method to compare 2 lawyerbots and see if they are equivalent
     * @param other the other bot to compare to
     * @return if they are the same or not
     */
    public boolean equals(LawyerBot other){
        return this.weight == other.getWeight()&&
                this.energy == other.getEnergy()&&
                this.cost == other.getCost() &&
                this.movementType.equals(other.getMovementType())&&
                this.sensorType.equals(other.getSensorType())&&
                this.powerSource.equals(other.getPowerSource()) &&
                this.sued == other.getSued();
    }
    /**
     * checks to see if the bot is in a suit or not
     * @return if it is or not
     */
    public boolean getSued(){
        return sued;
    }
    /**
     * setting the suit status of the bot
     * @param sued new status
     */
    public void setSued(boolean sued){
        this.sued = sued;
    }
    /**
     * tostring method for lawyerbots
     * @return the string version of the bot
     */
    public String toString(){
        return "LAWYERBOT SUMMARY:\nxPos: " + x + "\nyPos: " + y + "\nWeight: " + weight + "kg\nCost: " + money.format(cost) +  "\nMovement Type: " + movementType + "\nSensorType: " + sensorType + "\nPower Source: " + powerSource + "\nIn Lawsuit?: " + sued;
    }
    
}
