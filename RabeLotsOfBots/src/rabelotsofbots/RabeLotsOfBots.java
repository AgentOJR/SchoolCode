/*
 * Owen Rabe
 * Mar 29 23
 * Lots of bots unit 3 summative assignment test Harness
 */
package rabelotsofbots;

import TurtleGraphics.StandardPen;




public class RabeLotsOfBots {

    
    public static void main(String[] args) {
        StandardPen p = new StandardPen(500,500);
        Robot r1;
        Robot r2;
        Robot r3;
        Robot r4;
        Robot r5;
        Robot r6;
        r1 = new SentryBot();
        r2 = new WorkerBot();
        r2.move(50,50);
        r3 = ((SentryBot)r1).clone();
        //if the cloned bot is a proper clone
        if(((SentryBot)r1).equals((SentryBot)r3)){
            r3.move(200, 200);
        }
        r4 = ((WorkerBot)r2).clone();
        ((WorkerBot)r4).setLiftCapacity(45);
        //if the cloned bot is not a proper clone
        if(!((WorkerBot)r2).equals(r4)){
            r4.move(150, 150);
        }
        r5 = new LawyerBot(100,75);
        r6 = new LawyerBot(175,-20);
        r1.draw(p);
        r2.draw(p);
        r3.draw(p);
        r4.draw(p);
        r5.draw(p);
        r6.draw(p);
        System.out.println(AbstractRobot.getNumRobots());
        System.out.println((LawyerBot)r5);
        System.out.println((LawyerBot)r6);
        System.out.println((SentryBot)r1);
        System.out.println((SentryBot)r3);
        System.out.println((WorkerBot)r2);
        System.out.println((WorkerBot)r4);
    }
    
}
