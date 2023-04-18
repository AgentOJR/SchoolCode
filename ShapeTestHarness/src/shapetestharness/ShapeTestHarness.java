/**
 * Owen Rabe
 *  Mar 20 23
 * test harness for shape type classes
 */

package shapetestharness;
import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;

public class ShapeTestHarness {

    public static void main(String[] args) {
        Pen p = new StandardPen(500,500);
        Scanner s = new Scanner(System.in);
       
        Shape s1 = new Circle(20,20,20); //circle object being instantiated
        Shape s2 = new Rect(-50,-50,10,20);//rect object being instantiated
        
        s1.draw(p);//draws the circle with the attributes given
        s2.draw(p);//draws the square with the attributes given
        
        System.out.println(s1); //outputs the attributes of circle object s1
        System.out.println(s2);//outputs the attributes of rect object s2
        
        System.out.println("Press enter to change shapes...");//prompts the user to unter somrthing for the code to continue executing
        s.nextLine();
        //next 3 lines erase the previously drawn shapees
        p.setColor(Color.white);
        s1.draw(p);
        s2.draw(p);
        
        p.setColor(Color.red);
        //moves the shapes to new lovations and doubles the size
        s1.move(30,30);
        s2.move(-30, -30);
        s1.stretchBy(2);
        s2.stretchBy(2);
        //draws the shapes with their new sizes and locations
        s1.draw(p);
        s2.draw(p);
        
       
    }
    
}
