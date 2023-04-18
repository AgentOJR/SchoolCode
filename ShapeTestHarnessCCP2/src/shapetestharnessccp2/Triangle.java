package shapetestharnessccp2;

import TurtleGraphics.Pen;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author owenrabe
 */
public class Triangle extends AbstractShape{
    double xPos2, yPos2,xPos3,yPos3;
    public Triangle(){
        super();
        xPos2 = -10;
        yPos2 = -10;
        xPos3 = 10;
        yPos3 = -10;
    }
    public Triangle(double xPos1, double yPos1,double xPos2, double yPos2,double xPos3, double yPos3){
        this();
        this.xPos = xPos1;
        this.yPos = yPos1;
        this.xPos2 = xPos2;
        this.yPos2 = yPos2;
        this.xPos3 = xPos3;
        this.yPos3 = yPos3;
    }
    public double perimiter(){
        return (Math.sqrt(Math.abs((xPos-xPos2) * (xPos-xPos2) + (yPos-yPos2) * (yPos-yPos2)))+Math.sqrt(Math.abs((xPos-xPos3) * (xPos-xPos3) + (yPos-yPos3) * (yPos-yPos3)))+ Math.sqrt(Math.abs((xPos3-xPos2) * (xPos3-xPos2) + (yPos3-yPos2) * (yPos3-yPos2))));
    }
    public void stretchBy(double factor){
        
        xPos2 = (xPos2 -xPos) * factor;
        yPos2 = (yPos2-xPos) * factor;
        xPos3 = (xPos3-xPos) * factor;
        yPos3 = (yPos3 -xPos)* factor;
    }
    public void draw(Pen p){
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.move(xPos2, yPos2);
        p.move(xPos3, yPos3);
        p.move(xPos,yPos);
        p.up();
    }
    public double area(){
        return (xPos * yPos2 - xPos2 * yPos + xPos2 * yPos3- xPos3 * yPos2 + xPos3 * yPos - xPos * yPos3);
    }
    
    public void move(double xLoc,double yLoc){
        xPos = xPos + xLoc;
        yPos = yPos +yLoc;
        xPos2 = xPos2 + xLoc;
        yPos2 = yPos2 + yLoc;
        xPos3 = xPos3 + xLoc;
        yPos3 = yPos3 + yLoc;
    }
    public String toString(){
        String str = "TRIANGLE\n"
                
                + super.toString();
        return str;
    }
    public Triangle clone(){
        Triangle t = new Triangle(xPos,yPos,xPos2,yPos2,xPos3,yPos3);
        return t;
    }
    public boolean equals(Triangle t){
        if((Math.abs(t.xPos - t.xPos2) == Math.abs(xPos - xPos2)) && (Math.abs(t.xPos - t.xPos3) == Math.abs(xPos - xPos3)) &&  (Math.abs(t.xPos2) - t.xPos3 ) == Math.abs(xPos2 - xPos3)){
            return true;
        }
        return false;
    }
}
