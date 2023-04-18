/*
 * Owen Rabe
 * Mar 30 23
 * Class for the worker bots in the lotsofbots summative
 */
package rabelotsofbots;

import TurtleGraphics.StandardPen;
import java.awt.Color;

public class WorkerBot extends AbstractRobot {

    private String gripperType;
    private int liftCapacity;
    final private Color magenta = new Color(255, 0, 255);
    final private static int MIN_CAPACITY = 0;
    final private static int MAX_CAPACITY = 100;

    /**
     * Default constructor to instantiate a workerbot with default attributes
     */
    public WorkerBot() {
        super();
        gripperType = "Claw";
        liftCapacity = 99;
    }

    /**
     * Constructor to chain to default constructor but specify x and y loc
     *
     * @param x x loc
     * @param y y loc
     */
    public WorkerBot(int x, int y) {
        this();
        this.x = x;
        this.y = y;
    }

    /**
     * constructor that specifies every attribute, likely just used in clone but
     * usable everywhere just in case
     *
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
    public WorkerBot(int x, int y, double weight, double cost, String powerSource, String movementType, String sensorType, String gripperType, int liftCapacity) {
        super(x, y, weight, cost, powerSource, movementType, sensorType);
        this.gripperType = gripperType;
        this.liftCapacity = liftCapacity;
    }

    /**
     * returns the gripper tupe
     *
     * @return the gripper type
     */
    public String getGripperType() {
        return gripperType;
    }

    /**
     * gives the curreft lift capacity
     *
     * @return the lift capacity
     */
    public int getLiftCapacity() {
        return liftCapacity;
    }

    /**
     * allows the setting of liftCapaity, given it fits certain parameters
     *
     * @param lift the desired lift capacity
     * @return if the capacity was changed or not
     */
    public boolean setLiftCapacity(int lift) {
        //if the wanted capacity fits within predefined parameters
        if (lift > MIN_CAPACITY && lift < MAX_CAPACITY) {
            liftCapacity = lift;
            return true;
        }
        //otherwise
        return false;
    }

    /**
     * draws the robot in it's position
     *
     * @param p the pen to use to draw it
     */
    public void draw(StandardPen p) {
        p.up();
        p.setColor(magenta);
        double radius = 20;
        drawCircle(x, y, radius, p);
        drawCircle(x - radius / 2.5, y + radius / 3, radius / 4, p);
        drawCircle(x + radius / 2.5, y + radius / 3, radius / 4, p);
        drawLine(x - radius / 3, y - radius / 2, x + radius / 3, y - radius / 2, p);
        drawLine(x - radius / 3, y - radius / 2, x - radius / 3 - 5, y - radius / 2 + 5, p);
        drawLine(x + radius / 3, y - radius / 2, x + radius / 3 + 5, y - radius / 2 + 5, p);

    }

    /**
     * returns a string version of the robot's attribvurs
     *
     * @return the summary
     */
    public String toString() {
        return "WORKERBOT SUMMARY:\nxPos: " + x + "\nyPos: " + y + "\nWeight: " + weight + "kg\nCost: " + money.format(cost) + "\nMovement Type: " + movementType + "\nSensorType: " + sensorType + "\nPower Source: " + powerSource + "\nGripper Type: " + gripperType + "\nLift Capacity: " + liftCapacity;

    }

    /**
     * comparing 2 workerbot objects to see if they are equal (all attributes
     * except location
     *
     * @param other the other bot
     * @return true if they are equal, otherwise false
     */
    public boolean equals(WorkerBot other) {
        if (this.weight == other.getWeight()
                && this.energy == other.getEnergy()
                && this.cost == other.getCost()
                && this.movementType.equals(other.getMovementType())
                && this.sensorType.equals(other.getSensorType())
                && this.powerSource.equals(other.getPowerSource())
                && this.gripperType.equals(other.getGripperType())
                && this.liftCapacity == other.getLiftCapacity()) {
            return true;
        }
        return false;
    }

    /**
     * creates a dublicate of the requested robot
     *
     * @return the clone
     */
    public WorkerBot clone() {
        WorkerBot clone = new WorkerBot(x, y, weight, cost, powerSource, movementType, sensorType, gripperType, liftCapacity);
        return clone;
    }

    /**
     * gives the max and min capacity outline
     *
     * @return the outline
     */
    public static String getCapacityRules() {
        return "Min: " + MIN_CAPACITY + " Max: "
                + MAX_CAPACITY;
    }
}
