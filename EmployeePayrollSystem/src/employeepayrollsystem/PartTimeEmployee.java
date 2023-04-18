
package employeepayrollsystem;

public class PartTimeEmployee extends Employee{
    //constructor just calls the inherited constructor from the EMployee Abstract
    public PartTimeEmployee(){
        super();
    }
    /**
     * method to calculate the employees pay
     * @return the calculated weekly pay
     */
    public double getPay(){
        double pay;        
        pay = rate * hours;
        totalPay = totalPay + pay;
        return pay;
    }
}
