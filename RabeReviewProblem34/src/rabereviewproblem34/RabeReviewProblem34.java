/*
 * Owen Rabe
 * Feb 14 23
 * Ten numbers to data file 
 */
package rabereviewproblem34;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class RabeReviewProblem34 {

    
    public static void main(String[] args) {
        //initializing the array (Change 10 to however many numbers you are having in the sample data)
        int[] numbers = new int[10];
        //reading the file and putting it into an array
        try {
            File file = new File("src/rabereviewproblem34/data.txt");
            
            Scanner scanner = new Scanner(file);
            for (int i = 0; i < numbers.length; i++) {
                
               
                numbers[i] = Integer.parseInt(scanner.nextLine());
            }
            
            }
            
         catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        
        System.out.println(checkEvenOdd(numbers));
    }

        
        
        
    //method to check if there are evens or odds in a row
    public static boolean checkEvenOdd(int[] numbers) {
        //loop so we stay in the bounds of the array
        for (int i = 0; i < numbers.length - 2; i++) {
            //if  number has the same remainder as the next two elements we have  three odd or even numbers beside each other
            if(numbers[i] % 2 == numbers[i + 1] % 2 && numbers[i] % 2 == numbers[i + 2] % 2){
                return true;
            }
        }
        
        //entire array has been searched
        return false;
}}

