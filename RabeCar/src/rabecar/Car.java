/*
 * Owen Rabe
 * Mar 6 2023
 * The car class
 */
package rabecar;

import TurtleGraphics.*;

public class Car {

    int x;
    int y;
    int size;
    StandardPen car = new StandardPen(x, y);

    public Car() {
        x = 0;
        y = 0;
        size = 2;
    }

    public Car(int x, int y) {
        this();
        this.x = x;
        this.y = y;
    }
//unsupported constructor: size only working as 2 (for now)
//    public Car(int x, int y, int size) {
//        this(x, y);
//        this.size = size;
//    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }
/**
 * traditional tostring method
 * @return a string form of the object
 */
    public String toString() {
        return ("Car Summary:\nX: " + x + "\nY: " + y + "\nSize: " + size);
    }
/**
 * method to draw the car
 */
    public void draw() {

        car.up();
        car.move(size * (x - 75), size * (y + 50));
        car.down();
        car.move(size * (x + 75), size * (y + 50));
        car.move(size * (x + 75), size * (y - 50));
        car.move(size * (x - 75), size * (y - 50));
        car.move(size * (x - 75), size * (y + 50));

        drawCircle(size * (x - 50), size * (y - 63), 25);
        drawCircle(size * (x + 50), size * (y - 63), 25);

    }

    private void drawCircle(double x, double y, double r) {
        double side = 2.0 * Math.PI * r / 120.0;

        car.up();
        car.move(x + r, y - side / 2.0);
        car.setDirection(90);
        car.down();
        //a loop to have the pen actually draw the circle
        for (int i = 0; i < 120; i++) {
            car.move(side);
            car.turn(3);
        }
    }
}
