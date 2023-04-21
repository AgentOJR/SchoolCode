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
    /**
     * method to draw a square using the turtlegraphics library
     * @param p the pen to use
     * @param x x loc of midpoint
     * @param y y loc of midpoint
     * @param r sidelength of a square
     */
    public static void drawSquare(StandardPen p,int x,int y,int r){
        p.up();
        p.move(x-r,y+r);
        p.down();
        p.move(x+r,y+r);
        p.move(x+r,y-r);
        p.move(x-r,y-r);
        p.move(x-r,y+r);
    }
    /**
     * recursive method to draw the fractals, until the size of the square gets too small
     * @param x x location of the first fractal
     * @param y y location of the first fractal
     * @param r a sidelength of the square
     * @param p the pen to use to draw the fractals
     */
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
