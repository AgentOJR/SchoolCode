/*
 * Owen Rabe
 * Apr 19 23
 * Method  to reduce a given fraction to its smallest form
 */
package raberecursionexercise4;

import java.util.Scanner;

/**
 *
 * @author owenrabe
 */
public class RabeRecursionExercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the numberator");
            int n = Integer.parseInt(s.nextLine());
            System.out.println("Enter the demominator");
            int d  = Integer.parseInt(s.nextLine());
            int gcd = gcd(n,d);
            System.out.println("The reduced form is " + n/gcd + "/" + d/gcd + ".");
        } catch (Exception e) {
        }
    }
    public static int gcd(int a, int b) {
   if (b==0) return a;
   return gcd(b,a%b);
}
    
}
