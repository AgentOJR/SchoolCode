/*
 * Owen Rabe
 * Apr 20 23
 * generate a triangle using a given height.
 */
package raberecursionexercise5;

import java.util.Scanner;


public class RabeRecursionExercise5 {

    
    public static void main(String[] args) {
        try {
            Scanner s  = new Scanner(System.in);
            System.out.println("Enter a height for the triangle");
            int h = Integer.parseInt(s.nextLine());
            System.out.println(makeTriangle(h));
        } catch (Exception e) {
        }
    }
    public static String makeTriangle(int h){
        if(h == 0){
            return "";
        }else{
            return makeLine(1,h) + "\n" + makeTriangle(h-1);
            //return makeLine(h) + "\n" + makeTriangle(h-1);
        }
    }
//    public static String makeLine(int n){
//        if(n == 0){
//            return "";
//        }else{
//            return "*" + makeLine(n-1);
//        }
//    }
    public static String makeLine(int n,int count){
        if(count  == n){
            return "";
        }else{
            return "*" + makeLine(n+1,count);
        }
    }
        
    
}
