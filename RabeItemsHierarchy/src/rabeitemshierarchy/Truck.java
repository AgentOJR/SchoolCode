/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rabeitemshierarchy;


public class Truck extends AbstractVehicle{
    private static double efficiency = 1.25;
    private boolean hitch;
    private boolean load;
    public Truck(String name, int seats){
        super();
        this.name = name;
        this.seats = seats;
        hitch = false;
    }
    public void drive(double distance){
        double fuelUsed = distance * efficiency;
        fuel -= fuelUsed;
        
        System.out.println("Used " + fuelUsed + "% of the tank to drive " + distance + "m");
    }
    public void toggleHitch(){
        if(hitch){
            hitch = false;
        }else{
            hitch = true;
        }
    }
    public void loadUnload(){
        if(load){
            load = false;
        }else{
            load = true;
        }
    }
}
