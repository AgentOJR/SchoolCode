/*
 * Owen Rabe
 * Apr 19 23
 * making a program to determine how many blocks are in a triangle with a given heoght
 */
package raberecursionexercise3;

import java.util.Scanner;


public class RabeRecursionExercise3 {

    
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number of rows");
            int n = Integer.parseInt(s.nextLine());
            System.out.println("A triangle with " + n + " rows uses " + triBlo(n) + " blocks");
        } catch (Exception e) {
        }
    }
    public static int triBlo(int n){
        if(n == 0){
            return 0;
        }else if(n ==1){
            return 1;
        }else{
            return (triBlo(n-1) + n);
        }
    }
    
}
