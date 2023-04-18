
package rabecomputerclass;


public class Computer {
private double clockSpeed; 
private double hddSize; 
private boolean laptop;
private String gpuName; 
private boolean on;
private boolean programRunning;
private int ramAmt;
public Computer(double clockSpeed, double hddSize, int ramAmt){
    this.clockSpeed = clockSpeed;
    this.hddSize = hddSize;
    this.ramAmt = ramAmt;
    laptop = false;
    gpuName = "Integrated";
    on = false;
    programRunning  = false;
    
}
/**
 * Constructor #1
 * @param clockSpeed the computer's clock speed
 * @param hddSize the size of the computer's HDD
 * @param laptop
 * @param gpuName
 * @param on
 * @param programRunning
 * @param ramAmt 
 */
public Computer(double clockSpeed, double hddSize, boolean laptop, String gpuName, boolean on, boolean programRunning, int ramAmt){
    this( clockSpeed,  hddSize,  ramAmt);
    
    this.laptop = laptop;
    this.gpuName = gpuName;
    this.on = on;
    this.programRunning = programRunning;
    
}
public void setClockSpeed(double clockSpeed){
    this.clockSpeed = clockSpeed;
}
public double getClockSpeed(){
    return clockSpeed;
}
public boolean isLaptop(){
    return laptop;
}
public void setLaptop(boolean laptop){
    this.laptop = laptop;
}
public String getGpuName(){
    return gpuName;
}
public void setGpuName(String gpuName){
    this.gpuName = gpuName;
}
public void toggleOnOff(){
    if(on){
        on = false;
    }else{
        on = true;
    }
}
public boolean isOn(){
    return on;
}
public void killProgram(){
    programRunning = false;
}
public boolean isProgramRunning(){
    return programRunning;
}
public int getRamAmt(){
    return ramAmt;
}
public void setRamAmt( int ramAmt){
    this.ramAmt = ramAmt;
}
public void sendEmail(String msg, String reciever){
    System.out.println("An email containing the text " + msg + " has been sent to " + reciever);
}
public void runProgram(String program){
    System.out.println("Program " + program + " is now running.");
}
public String toString(){
   String msg = "Computer summary:\nCPU Clock Speed: " + clockSpeed + "\nLaptop?: " + laptop + "\nHDD Size" + hddSize +"\nGPU Name: " + gpuName + "\nOn?: " + on + "Program Running?: " + programRunning + "Ram Amount: " + ramAmt;
   return msg;
}

}
