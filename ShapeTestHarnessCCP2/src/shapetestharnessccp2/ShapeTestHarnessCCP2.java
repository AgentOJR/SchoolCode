

package shapetestharnessccp2;

import TurtleGraphics.*;

public class ShapeTestHarnessCCP2 {

    public static void main(String[] args) {
        Pen p = new StandardPen(500,500);
        Shape s1 = new Circle(20,20,20);
        Shape s2 = new Rect(-50,-50,10,20);
        Shape s3 = new Wheel(-20,-20,20,6);
        Shape s4 = new Rect(23,24,10,20);
        s1.draw(p);
        s2.draw(p);
        s3.draw(p);
        Shape s5 = ((Circle)s1).clone();
        
        System.out.println(s1); 
        System.out.println(s2); 
        System.out.println(s3);
        System.out.println(s5);
        if(((Rect)s2).equals((Rect)s4)){
            System.out.println("W");
        }else{
            System.out.println("L");
        }
    }
    
}
