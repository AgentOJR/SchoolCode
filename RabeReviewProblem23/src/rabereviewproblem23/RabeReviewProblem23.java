/*
 *  Owen Rabe
 * Feb 12 2023
 * Tickets program
 */
package rabereviewproblem23;

import java.text.DecimalFormat;
import javax.swing.*;

public class RabeReviewProblem23 {

   
    public static void main(String[] args) {
        //initializing variables
        DecimalFormat money = new DecimalFormat("$#,##0.00");
        //user input, variable altered often
        int age = 0;
        double kidsCost;
        double adultsCost;
        double seniorsCost;
        double totalCost;
        int kids = 0;
        int adults = 0;
        int seniors = 0 ;
        //loop until the user enters the end value
        while (age != 999) {
            //asking the user the age of the person they are buying a ticket for
            age = getInt("What age are you getting a ticket for?");
            //if the user enters the end value
            if (age==999) {
                //calculates the total cost for each age group
                kidsCost = kids * 6;
                adultsCost = adults * 7.5; 
                seniorsCost = seniors * 6.5;
                //calculates the total for all age groups
                totalCost= kidsCost + seniorsCost + adultsCost;
                //displays a summary of the ticket amounts and prices
                JOptionPane.showMessageDialog(null, "TICKET SUMMARY:\n" 
                        + kids + " - 12 and under ticket(s) which is: " + money.format(kidsCost) +
                        "\n"+ adults + " - 13 to 64 ticket(s) which is: " + money.format(adultsCost) +
                        "\n" + seniors + " - 65 and up ticket(s) which is: " + money.format(seniorsCost) +
                        "\nYour overall total owing is: " + money.format(totalCost));
           //checks for an invalid number (I think the oldest person alive is/was 136?)
            }else if(age < 0 || age  > 136){ 
                giveError("INVALID AGE");
           //if kids ticket add to kids counter
            }else if(age <= 12){
                kids++;
                //if adult ticket  add to adult counter
            }else if(age <= 64){
                adults++;
                //otherwise add to senior counter
            }else{ 
                seniors++;
            }
        }
                
            }
    //method to get an int value from the user
public static int getInt(String msg) {
        String sNum;
        int num = 0;
        boolean goodInput = false; 
        //until the user gives a good value
        while (!goodInput) {
            
            sNum = JOptionPane.showInputDialog(msg);
            //attempts to parse an int out of the input
            try { 
                num = Integer.parseInt(sNum); 
                //if it throws an error it goes to catch, otherwise it is a good input
                goodInput = true; 
            } catch (NumberFormatException e) { 
                giveError(sNum + " isn't a number! Try again");
                
            }
        }
        
        return num;

    }
//displays a JOptionPane with a specified error message to the user
    public static void giveError(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Error: ", JOptionPane.ERROR_MESSAGE);
    }        
}
    
    
    

