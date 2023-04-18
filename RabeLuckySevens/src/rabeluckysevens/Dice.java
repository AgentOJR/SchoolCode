
package rabeluckysevens;


public class Dice {
    private int value, numSides;
    public Dice(){
        value = 1;
        numSides = 6;
    }
    public Dice(int value){
        this();
        this.value = value;
        
    }
    public Dice(int value, int numSides){
        this(value);
        this.numSides = numSides;
    }
    public int getValue(){
        return value;
    }
    public int getNumSides(){
        return numSides;
    }
    public void setValue(int value){
    this.value = value;
    
}
    public void setNumSides(int numSides){
        this.numSides = numSides;
    }
    public int roll(){
        value = (int) ((Math.random() * numSides) + 1);
        return value;
    }
    public String toString(){
        return ("Summary of the Dice:\nNumber of Sides: " + numSides + "\nValue Up: " + value);
    }
    
}
