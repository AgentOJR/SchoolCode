
package employeepayrollsystem;

public class FullTimeEmployee extends Employee{
    
    public FullTimeEmployee(){
        super(); 
    }
    
    /**
     * method to calculate the pay of a full time worker (Including OT)
     * @return 
     */
    public double getPay(){
        double pay;
        if(hours <=40){
            pay = rate * hours;
        }else{ 
            pay = rate * 40 + (rate * 2 * (hours - 40));
        }
        totalPay = totalPay + pay;
        return pay;
    }
}
