/**
 * Owen Rabe
 * May 1 23
 * Numbers with insertion sort
 */
package rabesortingexercise3;

import java.io.File;
import java.util.Scanner;


public class RabeSortingExercise3 {

    static int[] a = new int[1000];
    public static void main(String[] args) {
        try {
            File f = new File("src/rabesortingexercise3/randomNumbers.txt");
            Scanner s = new Scanner(f);
            loadArray(s);
            insertSort(a.length);
            for (int i = 999; i >=0; i--) {
                System.out.println(a[i]);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    public static void loadArray(Scanner s){
        for (int i = 0; i < 1000; i++) {
            a[i] = Integer.parseInt(s.nextLine());
        }
    }
    public static void insertSort(int numItems){
        int temp;
        int j;
        for (int i = 1; i < numItems; i++) {
            temp = a[i];
            j = i -1;
            while(j >= 0 && a[j] > temp){
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = temp;
        }
    }
        
    
}
