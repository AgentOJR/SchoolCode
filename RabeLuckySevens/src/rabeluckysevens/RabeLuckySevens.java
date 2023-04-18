/*
 * Owen Rabe
 * 1/3/23
 * Create a LuckySevens dice playing program. Design and implement a Dice class. Each instance of this class should contain the die’s current side. The method roll should generate a new side using the method Math.random(). This method returns a random integer betw
 */
package rabeluckysevens;

import java.util.Scanner;


public class RabeLuckySevens {

    
    public static void main(String[] args) {
        boolean running = true;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the starting number of tokens");
        int numTokens = Integer.parseInt(s.nextLine());
        Dice d = new Dice();
        int numRolls = 0;
        int highScore = numTokens;
        String rollYN;
        while (running) {
            System.out.println("Would you like to roll?");
            rollYN = (s.nextLine());
            if(rollYN.equalsIgnoreCase("y")){
                numTokens += rollDice(d);
                numRolls++;
                
                if (numTokens > highScore) {
                    highScore = numTokens;
                }
                if (numTokens <= 0) {
                    running = false;
                }
            }else{
                running = false;
            }
        }
        System.out.println("Game Over!");
        System.out.println("Match Stats:");
        System.out.println("Number of Rolls: " +numRolls);
        System.out.println("High Score: " + highScore);
    }
    public static int rollDice(Dice d){
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            sum+= d.roll();
        }
        if (sum == 7) {
            System.out.println("Winner!");
            return 4;
            
        }
        else{
            System.out.println("Loser!");
            return -1;
            
        }
    }
    
}
