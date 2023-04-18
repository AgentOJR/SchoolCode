
package smilingfacetestharnessidcp2;

import java.util.Scanner;

public class SmilingFaceTestHarnessIDCP2 {   
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double x,y,radius;
        String quit = "N";
        //prompting the user for their input
        System.out.println("Initial X position: ");
        x = Double.parseDouble(reader.nextLine());
        //prompting the user for their input
        System.out.println("Initial Y position: ");
        y = Double.parseDouble(reader.nextLine());
        
        SmilingFace face = new SmilingFace(x,y);        //instantiating the smilingface object at the imputted coordinates
        face.draw();
        //prompting the user for their input
        System.out.println("Quit? (Y/N)");
        quit = reader.nextLine();
        //looping until the user chooses to quit
        while(!quit.equalsIgnoreCase("Y")){
            //prompting the user for their input
            System.out.println("Next X position: ");
            x = Double.parseDouble(reader.nextLine());
            //prompting the user for their input
            System.out.println("Next Y position: ");
            y = Double.parseDouble(reader.nextLine());
            
            face.erase();//reasing the old face
            face.move(x, y);//moving to new coordinates
            face.draw();//drawing new face
            //prompting the user for their input
            System.out.println("Quit? (Y/N)");
            quit = reader.nextLine();
        }
    }
    
}
