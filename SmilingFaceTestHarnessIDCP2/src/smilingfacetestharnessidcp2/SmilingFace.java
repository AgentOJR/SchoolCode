package smilingfacetestharnessidcp2;

import TurtleGraphics.*;
import java.awt.Color;

public class SmilingFace {

    private StandardPen pen;
    private double xPosition, yPosition, radius;
    private Color colour;
    private boolean smiling;

    /**
     * a constructor to create an empty smilingface object with default values
     */
    public SmilingFace() {
        xPosition = 0;
        yPosition = 0;
        pen = new StandardPen(500, 500);
        pen.setColor(Color.red);
        radius = 50;
        smiling = true;
    }

    /**
     * (chained) creates a smiling face object using given values for the x and
     * y locations
     *
     * @param x the user's given x location
     * @param y the user's given y location
     */
    public SmilingFace(double x, double y) {
        this();
        xPosition = x;
        yPosition = y;
    }

    public SmilingFace(double x, double y, double r) {
        this(x, y);

        radius = r;
    }

    public SmilingFace(double x, double y, double r, String colour) {
        this(x, y, r);
        if ("red".equals(colour)) {
            this.colour = (Color.red);
        } else if ("blue".equals(colour)) {
            this.colour = Color.blue;
        }
    }

    public SmilingFace(double x, double y, double r, String colour, boolean smiling) {
        this(x, y, r, colour);
        this.smiling = smiling;
    }

    /**
     * method to draw the smiling face at the location of the object
     */
    public void draw() {
        double radius = 50;

        drawCircle(xPosition, yPosition, radius);

        drawCircle(xPosition - radius / 2.5, yPosition + radius / 3, radius / 4);
        drawCircle(xPosition + radius / 2.5, yPosition + radius / 3, radius / 4);
        if (smiling) {
            drawLine(xPosition - radius / 3, yPosition - radius / 2, xPosition + radius / 3, yPosition - radius / 2);

            drawLine(xPosition - radius / 3, yPosition - radius / 2, xPosition - radius / 3 - 5, yPosition - radius / 2 + 5);

            drawLine(xPosition + radius / 3, yPosition - radius / 2, xPosition + radius / 3 + 5, yPosition - radius / 2 + 5);
        } else {
            drawLine(xPosition - radius / 3, yPosition - radius / 2, xPosition + radius / 3, yPosition - radius / 2);

            drawLine(xPosition - radius / 3, yPosition - radius / 2, xPosition - radius / 3 - 5, yPosition - radius / 2 - 5);

            drawLine(xPosition + radius / 3, yPosition - radius / 2, xPosition + radius / 3 + 5, yPosition - radius / 2 - 5);
        }

    }

    /**
     * erases the circle that was drawn (Must be called before location is
     * changed)
     */
    public void erase() {
        pen.setColor(Color.white);
        draw();
        pen.setColor(Color.red);
    }

    /**
     * setter method to change the x and y locations
     *
     * @param x new x location
     * @param y new y location
     */
    public void move(double x, double y) {
        xPosition = x;
        yPosition = y;
    }

    /**
     * a method for drawinf a circle using given parameters
     *
     * @param x the x coordinate
     * @param y the y coordinate
     * @param r the radius
     */
    private void drawCircle(double x, double y, double r) {
        double side = 2.0 * Math.PI * r / 120.0;
        pen.up();
        pen.move(x + r, y - side / 2.0);
        pen.setDirection(90);
        pen.down();
        //a loop to have the pen actually draw the circle
        for (int i = 0; i < 120; i++) {
            pen.move(side);
            pen.turn(3);
        }
    }

    /**
     * line
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    private void drawLine(double x1, double y1, double x2, double y2) {
        pen.up();
        pen.move(x1, y1);
        pen.down();
        pen.move(x2, y2);
    }

    /**
     * give me colour
     *
     * @return
     */
    private String getColour() {
        if (colour == Color.red) {
            return ("Red");
        } else if (colour == Color.blue) {
            return ("Blue");
        } else {
            return ("Error: Something went wrong");
        }
    }

    /**
     * colour
     *
     * @param colour
     */
    private void setColour(String colour) {
        if ("red".equals(colour)) {
            this.colour = (Color.red);
        } else if ("blue".equals(colour)) {
            this.colour = Color.blue;
        }
        System.out.println("Error: Colour could not be changed. Please try again using either \"red\" or \"blue\"");
    }
}
