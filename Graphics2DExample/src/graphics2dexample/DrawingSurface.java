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
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class DrawingSurface extends JPanel {

    /**
     * Does the actual drawing
     *
     * @param g - the Graphics object to draw with
     */
    private void doDrawing(Graphics g) {
        //the Graphics2D class is the class that handles all the drawing
        //must be casted from older Graphics class in order to have access to some newer methods
        Graphics2D g2d = (Graphics2D) g;
        Color skin = new Color(247, 191, 151);
        Color hair = new Color(69, 31, 4);
        Color grey = new Color(74, 72, 70);
        Color black = new Color(0,0,0);
        Color white = new Color(255,255,255);
        g2d.setColor(hair);
        g2d.fillRect(500,90,150,75);
        g2d.setColor(skin);
        g2d.fillOval(500, 100, 150, 175);  //(x,y,width,height)
        
        g2d.setColor(skin);
        g2d.fillOval(350,300,225,25);
        g2d.fillOval(575,300,225,25);
        g2d.setColor(grey);
        g2d.fillOval(535, 275, 75, 400);
        g2d.setColor(black);
        g2d.fillRect(535, 475, 75, 250);
        g2d.setColor(white);
        g2d.drawLine(575,475,575,725);
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
