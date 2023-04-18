/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rabeitemshierarchy;


public class Car extends AbstractVehicle{
    final private double efficiency = 0.5;
    public Car(String name, int seats){
        super();
        this.name = name;
        this.seats = seats;
    }
    public void drive(double distance){
        double fuelUsed = ((double) distance) * efficiency;
        fuel-=fuelUsed;
        System.out.println("Travelled " + distance + "m using " + fuelUsed +"% of your fuel.");
    }
}
