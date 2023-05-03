/*
 * Owen Rabe
 * May 1 23
 * Compare strings w/ bubble sort
 */
package rabesortingexercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RabeSortingExercise2 {

    //array used throughout program, makes more sense to declare globally especially in case we were to switch to another sorting algorithm
    static String[] a = new String[1000];

    public static void main(String[] args) {
        long timeStart;
        long timeFin;
        try {
            File f = new File("src/rabesortingexercise2/randomWords.txt");
            Scanner s = new Scanner(f);
            //method to fill the array a with the values from the data file f
            fillArray(s);
            timeStart = System.nanoTime();
            //method to sort the data file aphabetically in ascending order
            bubbleSort(a.length);
            timeFin = System.nanoTime();
            //printing the now sorted array
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
            System.out.println("Time elapsed: " + (timeFin - timeStart) / 1000000000.0 + " seconds.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }

    /**
     * filling the array with the strings in the data file
     *
     * @param s the scanner object hooked up to the data file
     */
    public static void fillArray(Scanner s) {
        int i = 0;
        while (s.hasNextLine()) {
            a[i] = s.nextLine();
            i++;
        }

    }

    /**
     * algorithm to sort the strings using bubble sort
     *
     * @param numItems the number of strings in the array
     */
    public static void bubbleSort(int numItems) {
        int bottom = numItems - 1;
        String temp;
        boolean sw = true;
        //loops until it doesn't swap anything around anymore meaning everything must be in place.
        while (sw) {
            //var that says if a swap has taken place
            sw = false;
            //loop to continuously put the lexographically smaller string to the right until it hits the end
            for (int j = 0; j < bottom; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    sw = true;
                }

            }
            bottom = bottom - 1;
        }
    }

}
