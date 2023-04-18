/*
 * B Cutten
    Sept 16, 2018
    This program will make a turtle object and then draw a square
 */
package TurtleGraphicsExercise1;

import TurtleGraphics.*; //if this line complains, ensure you added the package folder correctly

public class TurtleGraphicsExercise1 {

    public static void main(String[] args) {
        //declaring and instantiating a StandardPen type object
        StandardPen pen = new StandardPen(500, 500);
        //lift the pen, move it to the squares
        //top left corner, then lower it
        pen.up();
        pen.move(25); //pixels
        pen.turn(90); //counter clock wise
        pen.move(25);
        pen.down();

        for (int i = 0; i < 4; i++) {
            pen.turn(90);
            pen.move(50);
        }

    }

}
