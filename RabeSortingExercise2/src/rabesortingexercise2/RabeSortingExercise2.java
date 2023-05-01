/*
 * Owen Rabe
 * May 1 23
 * Compare strings w/ bubble sort
 */
package rabesortingexercise2;

import java.io.File;
import java.util.Scanner;


public class RabeSortingExercise2 {

    static String[] a = new String[1000];
    public static void main(String[] args) {
        try {
            File f = new File("src/rabesortingexercise2/randomWords.txt");
            Scanner s = new Scanner(f);
            fillArray(s);
            bubbleSort(a.length);
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        } catch (Exception e) {
        }
    }
    public static void fillArray(Scanner s){
        int i = 0;
        while(s.hasNextLine()){
            a[i] = s.nextLine();
            i++;
        }
            
    }
    public static void bubbleSort(int numItems){
        int bottom = numItems - 1;
        String temp;
        boolean sw = true;
        while(sw){
            sw = false;
            for(int j = 0;j<bottom;j++){
                if (a[j].compareTo(a[j+1])> 0) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    sw = true;
                }
                
            }
            bottom = bottom -1;
        }
    }
    
}
