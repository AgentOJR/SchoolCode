/*
 * Owen Rabe
 * Mar 7 23
 * A class for a player on a team in a basketball simulator
 */
package rabebasketball4u;

public class Player {

    String name;
    private int speed;
    private int threePoint;
    private int dunk;
    private int defence;

    /**
     * Constructor for a player with unspecified stats
     * @param name the name for the player
     */
    public Player(String name) {
        this.name = name;
        speed = (int) ((Math.random() * 11) + 0);
        threePoint = (int) ((Math.random() * 11) + 0);
        dunk = (int) ((Math.random() * 11) + 0);
        defence = (int) ((Math.random() * 11) + 0);
    }

    /**
     * constructor for a player with specified stats
     * @param name the player's name
     * @param speed the player's speed score
     * @param threePoint their 3point score
     * @param dunk their dunk score
     * @param defence their defence score
     */
    public Player(String name, int speed, int threePoint, int dunk, int defence) {
        this(name);
        this.speed = speed;
        this.threePoint = threePoint;
        this.dunk = dunk;
        this.defence = defence;
    }

    //getters
    /**
     *getter method for the name attribute
     * @return the player's name
     */
    public String getName() {
        return name;
    }

    /**
     *getter method for the speed attribute
     * @return the player's speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     *getter method for the 3point attribute
     * @return the 3point stat
     */
    public int getThreePoint() {
        return threePoint;
    }

    /**
     *getter method for the dunk attribute
     * @return the dunk
     */
    public int getDunk() {
        return dunk;
    }

    /**
     *getter method for the defence attribute
     * @return the defence
     */
    public int getDefence() {
        return defence;
    }

    //setters
    /**
     *the setter method for the name attribute
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *the setter method for the speed attribute
     * @param speed the new speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     *the setter method for the name attribute
     * @param threePoint the new 3point stat
     */
    public void setThreePoint(int threePoint) {
        this.threePoint = threePoint;
    }

    /**
     *he setter method for the dunk  attribute
     * @param dunk the new dunk stat
     */
    public void setDunk(int dunk) {
        this.dunk = dunk;
    }

    /**
     *he setter method for the defence attribute
     * @param defence the new defence attribute
     */
    public void setDefence(int defence) {
        this.defence = defence;
    }

    //tostring
    /**
     * basic tostring method
     * @return the string of the player object
     */
    public String toString() {
        return (name + "\n" + "Speed: " + speed + "/10\n" + "Three Point: " + threePoint + "/10\n" + "Dunk: " + dunk + "/10\n" + "Defence: " + defence + "/10");
    }
}
