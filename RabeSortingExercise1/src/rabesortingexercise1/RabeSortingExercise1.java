/*
 * Owen Rabe
 * May 1 23
 * Write a program that reads in a list of 1000 integers from this data file. 
 * Sort the integers in ascending order using a Selection Sort and output them to the screen. *

 */
package rabesortingexercise1;

import java.io.File;
import java.util.Scanner;


public class RabeSortingExercise1 {

    static int[] a = new int[1000];
    public static void main(String[] args) {
        try {
            File f = new File("src/rabesortingexercise1/randomNumbers.txt");
            Scanner s = new Scanner(f);
            fillArray(s);
            selectSort(a.length);
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
            
        } catch (Exception e) {
            System.out.println("Error: "+ e);
        }
    }
    public static void selectSort(int numItems){
        int temp;
        for (int i = 0; i < numItems - 1; i++) {
            for (int j = i+1; j < numItems; j++) {
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
        
    public static void fillArray(Scanner s){
        int i = 0;
        while(s.hasNextLine()){
            a[i] = Integer.parseInt(s.nextLine());
            i++;
        }
    }    
    
    
}
