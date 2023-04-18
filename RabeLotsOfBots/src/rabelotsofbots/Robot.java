/*
 * Owen Rabe
 * Mar 29 23
 * An interface to outline what robot type objects must be able to do
 */
package rabelotsofbots;

import TurtleGraphics.StandardPen;


public interface Robot {
    public void move(int x,int y);
    public int getXPos();
    public int getYPos();
    public double getWeight();
    //change weight of bot
    //return true if weight meets class rules
    public boolean setWeight(double weight);
    public double getCost();
    //change cost of robot
    //return true if it meets class rules
    public boolean setCost(double cost);
    public String getPowerSource();
    public int getEnergy();
    public boolean setEnergy(int energy);
    public String getMovementType();
    public String getSensorType();
    public void setSensorType(String sensorType);
    public void draw(StandardPen p);
    public String toString();
            
    
}
