/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rabelotsofbots;

import TurtleGraphics.StandardPen;
import java.text.DecimalFormat;

/**
 *
 * @author owenrabe
 */
abstract public class AbstractRobot implements Robot {

    public final DecimalFormat money = new DecimalFormat("#,##$0.00");
    protected int x, y, energy;
    protected double weight, cost;
    protected String powerSource, movementType, sensorType;
    final private static double MIN_WEIGHT = 10;
    final private static double MAX_WEIGHT = 100;
    final private static double MIN_COST = 100;
    final private static double MAX_COST = 1000;
    final private static int MIN_ENERGY = -1;
    final private static int MAX_ENERGY = 101;
    private static int NUM_ROBOTS = 0;

    /**
     * Default constructor to set all attributes to defaults, increment num
     * robots counter.
     */
    public AbstractRobot() {
        x = 0;
        y = 0;
        energy = 99;
        weight = 50;
        cost = 399.99;
        powerSource = "Battery";
        movementType = "Wheels";
        sensorType = "Infared";
        NUM_ROBOTS += 1;

    }

    /**
     * Constructor with specified x and y location
     *
     * @param x the desired x location
     * @param y the desired y location
     */
    public AbstractRobot(int x, int y) {
        this();
        this.x = x;
        this.y = y;
    }

    /**
     * constructor with specified xLoc, yLoc, weight and cost, sets all other
     * attributes to defaults via chaining
     *
     * @param x specified x loc
     * @param y specified y loc
     * @param weight specified weight
     * @param cost specified height
     */
    public AbstractRobot(int x, int y, double weight, double cost) {
        this(x, y);
        this.weight = weight;
        this.cost = cost;
    }

    /**
     * constructor with specified xLoc, yLoc, weight cost,power source, sensor
     * type and movement type. sets all other attributes to defaults via
     * chaining
     *
     * @param x specified x loc
     * @param y specified y loc
     * @param weight specified weight
     * @param cost specified height
     * @param powerSource specified power source
     * @param movementType specified movement type
     * @param sensorType specified sensor type
     */
    public AbstractRobot(int x, int y, double weight, double cost, String powerSource, String movementType, String sensorType) {
        this(x, y, weight, cost);
        this.powerSource = powerSource;
        this.movementType = movementType;
        this.sensorType = sensorType;
    }

    /**
     * moves the robot to a desired location
     *
     * @param x desired x loc
     * @param y desired y loc
     */
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * returns the current x pos of the robot
     *
     * @return current x pos
     */
    public int getXPos() {
        return x;
    }

    /**
     * returns the current y pos of the robot
     *
     * @return current y pos
     */
    public int getYPos() {
        return y;
    }

    /**
     * returns the weight of the robot
     *
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * sets the weight of the robot to a desired value if it meets certain
     * criteria
     *
     * @param weight the desired weight
     * @return if the weight was set or not
     */
    public boolean setWeight(double weight) {
        //if weight meets min and max criteria
        if (weight > MIN_WEIGHT && weight < MAX_WEIGHT) {
            this.weight = weight;
            return true;
        }
        return false;
    }

    /**
     * get the cost of the robot
     *
     * @return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * Sets the cost of the robot to s specified value if it meets certain
     * parameters
     *
     * @param cost the desired cost
     * @return if the cost was set successfully or not
     */
    public boolean setCost(double cost) {
        //if the cost is within the min and max thresholds
        if (cost > MIN_COST && cost < MAX_COST) {
            this.cost = cost;
            return true;
        }
        return false;
    }

    /**
     * get the power source of the robot
     *
     * @return the name of the power source
     */
    public String getPowerSource() {
        return powerSource;
    }

    /**
     * get the current energy level of the robot
     *
     * @return the current energy level
     */
    public int getEnergy() {
        return energy;

    }

    /**
     * sets the energy of the robot to a desired value if it is within the
     * parameters
     *
     * @param energy the desired energy level
     * @return if the energy was set or not
     */
    public boolean setEnergy(int energy) {
        //if the energy is within the bounds
        if (energy > MIN_ENERGY && energy < MAX_ENERGY) {
            this.energy = energy;
            return true;
        }
        return false;
    }

    /**
     * gives the movement type
     *
     * @return the name of the movement type
     */
    public String getMovementType() {
        return movementType;
    }

    /**
     * gives the sensor type
     *
     * @return the name of the sensor type
     */
    public String getSensorType() {
        return sensorType;
    }

    /**
     * allows the changing of the sensor type
     *
     * @param sensorType the new sensor type
     */
    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    /**
     * mathod to draw the robot
     *
     * @param p the pen to use
     */
    abstract public void draw(StandardPen p);

    /**
     * gives a string version of the robot's attributes
     *
     * @return the string version
     */
    public String toString() {
        return "ROBOT SUMMARY:\nxPos: " + x + "\nyPos: " + y + "\nWeight: " + weight + "\nCost: " + money.format(cost) + "\nWeight: " + weight + "kg\nMovement Type: " + movementType + "\nSensorType: " + sensorType + "\nPower Source: " + powerSource;
    }

    /**
     *gives the weight rules (Min and Max)
     * @return the rules
     */
    public static String getWeightRules() {
        return "Max: " + MAX_WEIGHT + " Min: " + MIN_WEIGHT;
    }

    /**
     * gives the max and min for what a robot can cost
     * @return an outline of the rules for cost
     */
    public static String getCostRules() {
        return "Max: " + MAX_COST + " Min: " + MIN_COST;
    }

    /**
     * the max and min energy capscity
     * @returnan outline of the energy rules
     */
    public static String getEnergyRules() {
        return "Max: " + MAX_ENERGY + " Min: " + MIN_ENERGY;
    }

    /**
     * gives how many robots have been instantiated
     * @return the number of robots
     */
    public static int getNumRobots() {
        return NUM_ROBOTS;
    }

    /**
     *allows the altering of the numRobots value (perhaps if one is destroyed)
     * @param numRobots the new value for the NUM_ROBOTS
     */
    public static void setNumRobots(int numRobots) {
        NUM_ROBOTS = numRobots;
    }
    public void drawLine(double x1, double y1, double x2, double y2,StandardPen p) {
        p.up();
        p.move(x1, y1);
        p.down();
        p.move(x2, y2);
    }
    public void drawCircle(double x, double y, double r, StandardPen p) {
        double side = 2.0 * Math.PI * r / 120.0;
        p.up();
        p.move(x + r, y - side / 2.0);
        p.setDirection(90);
        p.down();
        //a loop to have the pen actually draw the circle
        for (int i = 0; i < 120; i++) {
            p.move(side);
            p.turn(3);
        }
    }
}
