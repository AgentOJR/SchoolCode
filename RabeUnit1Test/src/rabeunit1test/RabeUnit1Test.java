/*
 * Owen Rabe
 * 02/21/23
 EV Sales program
 */
package rabeunit1test;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;


public class RabeUnit1Test {

    
    public static void main(String[] args) {
        File f = new File("src/rabeunit1test/vehicles.txt");
        
        try {
            Scanner s = new Scanner(f);
            int numRecords = Integer.parseInt(s.nextLine());
            int[] year = new int[numRecords];
            int[] evs = new int[numRecords];
            int[] ice = new int[numRecords];
            double[] percIce = new double[numRecords];
            double[] percEvs = new double[numRecords];
            fillArrays(year,evs,ice,s);
            calcPercs(year,evs,ice,percIce,percEvs);
            printChart(year,evs,ice,percIce,percEvs);
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
        
    }
    
    public static void fillArrays(int[] year,int[] evs,int[] ice, Scanner s){
        for (int i = 0; i < year.length; i++) {
            year[i] = Integer.parseInt(s.nextLine());
            evs[i] = Integer.parseInt(s.nextLine());
            ice[i] = Integer.parseInt(s.nextLine());
        }
    }
    public static void calcPercs(int[] year,int[] evs,int[] ice, double[] percIce, double[] percEvs){
        int total;
        for (int i = 0; i < year.length; i++) {
            total = evs[i] + ice[i];
            percEvs[i] = (double)evs[i]/(double)total;
            percIce[i] = (double)ice[i]/(double) total;
        }
}
    public static void printChart(int[] year,int[] evs,int[] ice, double[] percIce, double[] percEvs){
        DecimalFormat num = new DecimalFormat("#,###");
        DecimalFormat percent = new DecimalFormat("#,##%0.00");
        System.out.println("\tGlobal Vehicle Sales (in thousands)");
        System.out.println("");
        System.out.println("Year\tEVs\tICE\t\t%EVs\t%ICEs");
        for (int i = 0; i < year.length; i++) {
            System.out.println(year[i] + "\t" + num.format(evs[i]) + "\t" + num.format(ice[i]) + "\t\t" + percent.format(percEvs[i]) + "\t" + percent.format(percIce[i]));
        }
    }
}
