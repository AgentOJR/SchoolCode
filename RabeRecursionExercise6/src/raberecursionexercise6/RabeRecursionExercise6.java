/*
 * Owen Rabe
 * Apr 20 23
 * Square fractal drawing problem
 */
package raberecursionexercise6;

import TurtleGraphics.*;


public class RabeRecursionExercise6 {

    
    public static void main(String[] args) {
        StandardPen p = new StandardPen(500,500);
        fractal(0,0,100,p);
        
    }
    public static void drawSquare(StandardPen p,int x,int y,int r){
        p.up();
        p.move(x-r,y+r);
        p.down();
        p.move(x+r,y+r);
        p.move(x+r,y-r);
        p.move(x-r,y-r);
        p.move(x-r,y+r);
    }
    public static void fractal(int x,int y,int r,StandardPen p){
        if(r<2){
            
        }else{
            drawSquare(p,x,y,r);
            fractal(x-r,y+r,r/2,p);
            fractal(x-r,y-r,r/2,p);
            fractal(x+r,y+r,r/2,p);
            fractal(x+r,y-r,r/2,p);
        }
    }
        
    
}
