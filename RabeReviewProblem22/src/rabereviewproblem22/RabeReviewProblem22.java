/*
 * Owen Rabe
 * 2/10/23
 * Error checked for and while adding program
 */
package rabereviewproblem22;

import javax.swing.JOptionPane;


public class RabeReviewProblem22 {

    
    public static void main(String[] args) {
        int num = getInt("Enter a number please");
        String line1 = forLoop(num);
        String line2 = whileLoop(num);
        JOptionPane.showMessageDialog(null, "Using a for loop:\n" + line1 + "\n\nUsing a while loop:\n" + line2);
    }
    public static int getInt(String message){
        boolean goodInfo = false;
        int input = 0;
        while(!goodInfo){
            try {
                input = Integer.parseInt(JOptionPane.showInputDialog(message));
                if(input < 0){
                    JOptionPane.showMessageDialog(null,"Error: no negatives please!","ERROR",0);
                }
                else{
                    goodInfo = true;
                }
            } catch (NumberFormatException e) {
              JOptionPane.showMessageDialog(null,"Error: invalid input!","ERROR",0);
            }
        }
        return input;
    }
    public static String forLoop(int input){
        String line = "" + input;
        for(int i = input +1; i<= (input+5); i++){
            line+= (", " + i);
        }
        return line;
    }
    public static String whileLoop(int input){
        String line = "" + input;
        int a  = input;
        int b = input +6;
        while(a< b){
            input+=1;
            line+= (", " + input);
            a++;
        }
        return line;
    }
    
}
