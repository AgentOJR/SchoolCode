/*
 * Owen Rabe
 * Apr 19 23
 * Recursive method to find the nth fibonacci number
 */
package raberecursionexercise1;

import java.util.Scanner;


public class RabeRecursionExercise1 {

    
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int n = Integer.parseInt(s.nextLine());
          
            System.out.println("The " + n + "th Fibonacci Number is " + fibo(n));
        } catch (Exception e) {
        }
    }
    public static int fibo(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
    
}
