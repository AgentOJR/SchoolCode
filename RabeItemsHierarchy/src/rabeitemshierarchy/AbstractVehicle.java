/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rabeitemshierarchy;

abstract public class AbstractVehicle implements Vehicle {
    protected int passengers;
    protected int fuel;
    protected int seats;
    protected int position;
    protected String name;
    public AbstractVehicle(){
        name = "";
        seats = 4;
        passengers  = 0;
        fuel = 100;
        position = 0;
    }
    abstract public void drive(double distance);
    public int getFuel(){
        return fuel;
    }
    public void addFuel(){
        fuel+=10;
        System.out.println("Vehicle Refueled by 10%");
    }
    public int getPassengers(){
        return passengers;
    }
    public void setPassengers(int passengers){
        this.passengers = passengers;
    }
    
}
