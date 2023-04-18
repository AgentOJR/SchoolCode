/*
 * Owen Rabe
 * Mar 28 23
 * An interface to outline methods all vehicle objects must have
 */
package rabeitemshierarchy;


public interface Vehicle {
    public void drive(double distance);
    public int getFuel();
    public void addFuel();
    public int getPassengers();
    public void setPassengers(int passengers);
}
