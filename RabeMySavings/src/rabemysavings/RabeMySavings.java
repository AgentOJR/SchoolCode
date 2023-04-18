/*
 * Owen Rabe
 * Mar 2 23
 * Create a MySavings application that displays a menu of choices for entering pennies, nickels, dimes, and quarters into a piggy bank and then prompts the user to make a selection.
 */
package rabemysavings;

import java.util.Scanner;

public class RabeMySavings {

    public static void main(String[] args) {
        boolean running = true;
        int choice;
        int temp;
        PiggyBank p = new PiggyBank();
        while (running) {
            System.out.println("1. Show total in bank.\n"
                    + "	2. Show breakdown of coins in bank. \n"
                    + "	3. Add penny.\n"
                    + "	4. Add nickel.\n"
                    + "	5. Add dime.\n"
                    + "	6. Add quarter. \n"
                    + "	7. Remove specific coins. \n"
                    + "	8. Take money out of bank. \n"
                    + "	9. Quit");
            Scanner s = new Scanner(System.in);
            try {
                choice = Integer.parseInt(s.nextLine());
                if (choice < 1 || choice > 9) {
                    temp = Integer.parseInt("ThrowErrorPlease");
                    
                }
                if (choice == 1) {
                    System.out.println("Total: " + p.getTotal());
                } else if(choice ==2) {
                    System.out.println(p);
                }else if(choice > 2 && choice < 7){
                    p.addCoin(choice, 1);
                
                }else if(choice ==7){
                    removeCoin(p);
                }else if(choice == 8){
                    
                }else if(choice ==9){
                    
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: invalid input!");
            }
            
        }
    }
    public static void removeCoin(PiggyBank p){
        int choice;
        System.out.println("Which Coin would you like to Remove?\n1. Penny\n2. Nickel\n3. Dime\n4. Quarter");
        Scanner s = new Scanner(System.in);
        
    }

}
