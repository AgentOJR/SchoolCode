/*
 * Owen Rabe
 * 2/9/23
 * calculates worker's pay from hours and rate
 */
package rabereviewproblem21;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class RabeReviewProblem21 {
static DecimalFormat money = new DecimalFormat("$###,###0.00");
    
    public static void main(String[] args) {
        String name = getInfo("Hello! what is your name?");
       double hours = wantHours();
       double payRate = wantPay();
       generateReport(name, hours, payRate);
       
       
    }
    public static String getInfo(String message){
        String info;
        info = JOptionPane.showInputDialog(message);
        return info;
    }
    public static double wantHours(){
        boolean goodData = false;
        double goodInfo = 0;
        String info = "";
        while(!goodData){
        try {
            info = getInfo("How many hours did you work this week?");
            goodInfo = Double.parseDouble(info);
            if(goodInfo > 136){
                displayError("There aren't that many hours in a week!");
            }
            else if(goodInfo < 0){
                displayError("No negative numbers!!");
            }
            else{
            goodData = true;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, info + " isn't a number! Try again");
        }}
        return goodInfo;
    }
    public static void displayError(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    public static double wantPay(){
        boolean goodData = false;
        double goodInfo = 0;
        String info = "";
        while(!goodData){
        try {
            info = getInfo("What is your hourly pay rate?");
            goodInfo = Double.parseDouble(info);            
            if(goodInfo < 0){
                displayError("No negative numbers!!");
            }
            else{
            goodData = true;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, info + " isn't a number! Try again");
        }}
        return goodInfo;
    }

    private static void generateReport(String name, double hours, double payRate) {
        double otHours = hours -44;
        double regHours;
        double otPayRate;
        double regPay;
        double otPay;
        double totalPay;
        if(otHours > 0){
           regHours = 44; 
           regPay = regHours * payRate;
           otPayRate = payRate *1.5;
           otPay = otPayRate * otHours;
           totalPay = otPay + regPay;
           JOptionPane.showMessageDialog(null, "Total hours worked: " + hours + "\nRegular pay rate: " + money.format(payRate) + "\nRegular hours: " + regHours + "\nRegular pay: " + money.format(regPay) + "\n_________\nOT pay Rate: " + money.format(otPayRate) + "\nOT hours: " + otHours + "\nOT pay: " + money.format(otPay) + "\n__________\nTotal pay: " + money.format(totalPay), "PAY REPORT FOR " + name, JOptionPane.PLAIN_MESSAGE);
        }
        else{
            regPay = payRate * hours;
            JOptionPane.showMessageDialog(null, "Total hours worked: " + hours + "\nRegular pay rate: " + money.format(payRate) + "\nRegular hours: " + hours + "\nTotal pay: " + money.format(regPay) , "PAY REPORT FOR " + name, JOptionPane.PLAIN_MESSAGE);
        }
    }
}
