/**
 * Owen Rabe
 * Mar 22 23
 * A program to determine employee pay
 */
package employeepayrollsystem;

import java.util.Scanner;

public class EmployeePayrollSystem {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Employee emp;
        String name;
        int type = -1;
        double rate;
        int hours;
        String prompt;
        boolean moreInput = true;
        boolean invalidType;
        boolean invalidRate;
        boolean invalidHours;
        //looping while the employee still wants to enter input
        while (moreInput) {
            
            System.out.println("Enter employee data");
            System.out.println("  Name(or q to quit):");
            name = reader.nextLine();
            if (name.equalsIgnoreCase("q")) {
                moreInput = false;
            } else {
                
                invalidType = true;
                //error checking to make sure they enter the right input
                while (invalidType) {
                    prompt = " Type (" + Employee.getTypeRules() + ")";
                    System.out.println(prompt);
                    type = Integer.parseInt(reader.nextLine());
                    //if the user enters good data end the loop
                    if (Employee.typeOK(type)) {
                        invalidType=false;
                    }
                }

                //if user selected fulltime instantiate emp to a new FullTimeEmployee
                if (type == 1) {
                    emp = new FullTimeEmployee();
                    //otherwise instantiate emp to a new part time employee
                } else {
                    emp = new PartTimeEmployee();
                }
                //set the instantiated employeee's name to the given name
                emp.setName(name);
                
                invalidRate = true;  
                //error checking to see if the user entered a valid rate
                while (invalidRate) {
                    prompt = " Hourly Rate (" + Employee.getRateRules() + "): ";
                    System.out.println(prompt);
                    rate = Double.parseDouble(reader.nextLine());
                    if (emp.setRate(rate)) {
                        invalidRate = false;
                    }
                }

                invalidHours = true;
                //error checking to see if the user entered valid hours
                while (invalidHours){
                    prompt = " Hours worked (" + Employee.getHoursRules() + "): ";
                    System.out.println(prompt);
                    hours = Integer.parseInt(reader.nextLine());
                    if(emp.setHours(hours)){
                        invalidHours = false;
                    }
                }
            
                //outputting the weekly pay for the employee
                System.out.println(" The weekly pay for " + emp.getName() + " is " + emp.getPay());
            }

        }
        //outputting the total pay for the employee
        System.out.println("\nTotal pay: " + Employee.getTotalPay());
    }

}
