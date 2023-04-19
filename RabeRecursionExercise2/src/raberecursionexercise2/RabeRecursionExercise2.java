/*
 * Owen Rabe
 * Apr 19 23
 * A program to calculate how many combinations of items you can choose from a number of items
 */
package raberecursionexercise2;

import java.util.Scanner;


public class RabeRecursionExercise2 {

    
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number of objects!");
            int n = Integer.parseInt(s.nextLine());
            System.out.println("Enter how many items will be chosen!");
            int r = Integer.parseInt(s.nextLine());
            int choices = (fact(n))/(fact(r)*fact(n-r));
            System.out.println("There are " + choices + " different ways to choose " + r + " Objects from a set of " + n + " objects");
        } catch (Exception e) {
        }
    }
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return (fact(n-1) * n);
        }
    }
    
}
