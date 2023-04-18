/*
 * B Cutten
    Nov 2021
    A class which allows drawing, because it extends JPanel, by way of the 
    Graphics2D class
    Because this class is only going to ever be used by the Graphics2DTester, it could be 
    included in the same file (Graphics2DTester.java)
 */

package graphics2dexample;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class DrawingSurface extends JPanel{
    
    
    /**
     * Does the actual drawing
     * @param g - the Graphics object to draw with
     */
     private void doDrawing(Graphics g) {        
        //the Graphics2D class is the class that handles all the drawing
        //must be casted from older Graphics class in order to have access to some newer methods
        Graphics2D g2d = (Graphics2D) g;
        //draw a string on the panel  
        Color startColor = Color.red;
    Color endColor = Color.yellow;

    int startX = 500, startY = 0, endX = 500, endY = 500;
    GradientPaint paint = new GradientPaint(startX,startY,startColor,endX,endY,endColor);

        g2d.setPaint(paint);
        g2d.fillRect(0,0,500,500);
        g2d.setColor(Color.yellow);
        g2d.fillOval(250,200,100,100);
         startColor = Color.blue;
     endColor = Color.black;

    startX = 500;
    startY = 0;
    endX = 500;
    endY = 500;
    paint = new GradientPaint(startX,startY,startColor,endX,endY,endColor);
    g2d.setPaint(paint);
    g2d.fillRect(0,275,500,200);
        
    }
     
    
    @Override
    /**
     * Overrides paintComponent in JPanel class so that we can do our own custom
     * painting
     */
    public void paintComponent(Graphics g) {        
        super.paintComponent(g);//does the necessary work to prepare the panel for drawing
        doDrawing(g); //invoke our custom drawing method
    }
}
