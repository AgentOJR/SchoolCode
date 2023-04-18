/*
 * Owen Rabe
 * 14/2/23
 * Rumbers from data file to array
 */
package rabereviewproblem36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RabeReviewProblem36 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("src/rabereviewproblem36/numbers.txt"));
            int size = Integer.parseInt(sc.nextLine());
            int[] nums = new int[size];
            for (int i = 0; i < size; i++) {
                nums[i] = sc.nextInt();
            }
            sc.close();
            for (int i = 0; i < size - 1; i++) {
                if (nums[i] == 4 && nums[i+1] != 5) {
                    for (int j = i+1; j < size; j++) {
                        if (nums[j] == 5) {
                            int temp = nums[i+1];
                            nums[i+1] = nums[j];
                            nums[j] = temp;
                            break;
                        }
                    }
                }
            }
            for (int i = 0; i < size; i++) {
                System.out.print(nums[i] + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
