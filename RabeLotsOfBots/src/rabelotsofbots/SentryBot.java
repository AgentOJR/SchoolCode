/*
 * Owen Rabe
 * Mar 30 23
 * the Sentrybot class from the lotsofbots assignment
 */
package rabelotsofbots;

import TurtleGraphics.StandardPen;
import java.awt.Color;


public class SentryBot extends AbstractRobot{
    private String weaponType;
    /**
     * default constructor
     */
    public SentryBot(){
        super();
        weaponType = "Gun";
    }
    /**
     * constructor with specified x and y location
     * @param x desired x location
     * @param y desired y location
     */
    public SentryBot(int x,int y){
        super(x,y);
        weaponType = "Gun";
    }
    /**
     * constructor that specifies every attribute, likely just used in clone but usable everywhere just in case
     * @param x xloc
     * @param y yloc
     * @param weight desired weight
     * @param cost desired cost
     * @param powerSource desired power source
     * @param movementType desired movement type
     * @param sensorType desired sensorType
     * @param gripperType desired gripperType
     * @param liftCapacity desired lift capacity
     */
    public SentryBot(int x, int y, double weight, double cost, String powerSource, String movementType, String sensorType,String weaponType){
        super(x,y,weight,cost,powerSource,movementType,sensorType);
        this.weaponType = weaponType;
        
    }
    /**
     * method to change the bot's weapon to a new one
     * @param weapon the desired weapon
     */
    public void setWeaponType(String weapon){
        weaponType = weapon;
    }
    /**
     * Method to see what weapon a bot has
     * @return the weapon the bot has
     */
    public String getWeaponType(){
        return weaponType;
    }
    /**
     * tostring method to print a summary of the bot's info
     * @return the summary of the bot
     */
    public String toString(){
        return "SENTRYBOT SUMMARY:\nxPos: " + x + "\nyPos: " + y + "\nWeight: " + weight + "kg\nCost: " + money.format(cost) +  "\nMovement Type: " + movementType + "\nSensorType: " + sensorType + "\nPower Source: " + powerSource + "\nWeapon Type: " + weaponType;
    }
    /**
     * method to draw the bot in it's specific colour in it's locoation
     * @param p 
     */
    public void draw(StandardPen p){
        p.up();
        p.setColor(Color.ORANGE);
        double radius = 20;
        drawCircle(x, y, radius, p);
        drawCircle(x - radius / 2.5, y + radius / 3, radius / 4, p);
        drawCircle(x + radius / 2.5, y + radius / 3, radius / 4, p);
        drawLine(x - radius / 3, y - radius / 2, x + radius / 3, y - radius / 2, p);
        drawLine(x - radius / 3, y - radius / 2, x - radius / 3 - 5, y - radius / 2 + 5, p);
        drawLine(x + radius / 3, y - radius / 2, x + radius / 3 + 5, y - radius / 2 + 5, p);
    }
    /**
     * method to attack another bot and apply effects based on the attributes of the bots
     * @param other 
     */
    public void attack(Robot other){
        if (other instanceof WorkerBot) {
            other.setEnergy(0);
                
            
            ((WorkerBot)other).setLiftCapacity(((WorkerBot)other).getLiftCapacity() / 2);
        } else if(other instanceof SentryBot){
            if(this.weaponType.equals(((SentryBot)other).getWeaponType())){
                this.energy = this.energy /2;
                other.setEnergy(other.getEnergy() / 2);
            }else{
                other.setEnergy(other.getEnergy() / 2);
                this.energy = this.energy * 2;
                if(this.energy > 100){
                    this.energy = 100;
                }
            }
        }else{
            if(((LawyerBot)other).getSued()){
                ((LawyerBot)other).setSued(false);
            }else{
                ((LawyerBot)other).setSued(true);
            }
        }
        
    }
    /**
     * equals method to compare 2 sentrybots to see if they're the same
     * @param other the other bot
     * @return if they are the same or not
     */
    public boolean equals(SentryBot other){
        return this.weight == other.getWeight()&&
                this.energy == other.getEnergy()&&
                this.cost == other.getCost() &&
                this.movementType.equals(other.getMovementType())&&
                this.sensorType.equals(other.getSensorType())&&
                this.powerSource.equals(other.getPowerSource())&&
                this.weaponType.equals(other.getWeaponType());
    }
    /**
     * a method to create a duplicate with all the same attributes
     * @return the dupe
     */
    public SentryBot clone(){
        SentryBot clone = new SentryBot(x,y,weight,cost,powerSource,movementType,sensorType,weaponType);
    return clone;
    }
}
