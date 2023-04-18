
package rabeballmove;

import java.awt.Graphics2D;


public class Ball {
    public int radius;
    public int xPos;
    public int yPos;
    private static double PI = 3.14;
    private Graphics2D g2d;
    public Ball(){
        xPos = 0;
        yPos = 0;
        radius = 100;
        this.g2d = g2d;
    }
    public Ball(int radius){
        this();
        this.radius = radius;
    }
    public Ball(int xPos,int yPos,int radius){
        this(radius);
        this.xPos = xPos;
        this.yPos = yPos;
    }
    public void move(){
        xPos++;
        
        
    }
    public void draw(Graphics2D g2d){
        g2d.fillOval(xPos, yPos, radius, radius);
    }
        
}
