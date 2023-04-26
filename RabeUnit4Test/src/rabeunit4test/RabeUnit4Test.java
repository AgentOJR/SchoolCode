/**
 * Owen Rabe
 * Apr 26 23
 * Write a program LastNameUnit4Test which prompts the user for a base and an 
 * exponent and outputs to them the result of raising the base to that exponent. 
 * You can assume that the numbers entered by the user will be integers greater 
 * than or equal to 0 (and they won’t both be zero). Include a recursive method 
 * in your program which accepts a base and exponent as parameters and returns 
 * the result. Continue to prompt the user until they enter “-1”. Do not ask for 
 * an exponent if “-1” is entered.
 */
package rabeunit4test;
import javax.swing.JOptionPane;

public class RabeUnit4Test {

    
    public static void main(String[] args) {
        int base,exp,soln;
        boolean running = true;
        //loop only terminated when the user enters -1
        while(running){
            //getting input from the user for the base
            base = Integer.parseInt(JOptionPane.showInputDialog("Hi there! please enter the base (or -1 to exit)"));
            //if the user enters valid input
            if(base>=0){
                //program continues to ask for the power
                exp = Integer.parseInt(JOptionPane.showInputDialog("Great Job! now please enter the exponent"));
                //using user's values as parameters for the getPower method
                soln = getPower(base,exp);
                //outputting results to the user
                JOptionPane.showMessageDialog(null,"" + base + " ^ " + exp + " = " + soln);
            }
            //if the user enters the indicated end program value
            else if(base == -1){
                //loop will not repeat
                running = false;
                //goodbye message
                JOptionPane.showMessageDialog(null, "Goodbye!");
            }
            //if the user entered an unsupported input
            else{
                //error message propting to try again
                JOptionPane.showMessageDialog(null, "Error: bad input for base, cannot be negative. Please try again!");
            }
        }
    }
    /**
     * a recursive method to repeatedly multiply the base of the exponent by the
     * base to the power of one less, until it gets to base to the power of 1 
     * which is just the base, or the exp is 0 in which case 1 is returned
     * @param base the base of the exponent, a in a^x
     * @param exp the power to which the base is raised, x in a^x
     * @return the calculated number of raising the base to the power of the exponent
     */
    private static int getPower(int base, int exp) {
        //if the base is requested to be raised to the power of 0 (base case)
        if(exp == 0){
            return 1;
        //if the base is requested to be raised to the power of 1 (base case)
        }else if (exp == 1){
            return base;
         //if the exponent is any other number 
        }else{
            return base * getPower(base,exp -1);
        }
    }
    
}
