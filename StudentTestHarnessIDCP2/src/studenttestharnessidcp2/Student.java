/**
 * B Cutten
 * Sept 2014
 * Student class, manages a student's name and three test scores
 */
package studenttestharnessidcp2;

public class Student implements Person{

    private String name;
    private int test1;
    private int test2;
    private int test3;

    /**
     * Constructor 1, creates an empty student with default values for
     * everything
     */
    public Student() {
        name = "";
        test1 = 0;
        test2 = 0;
        test3 = 0;
    }

    /**
     * constructor to create a blank student with a name and no scores
     *
     * @param n the name of the student
     */
    public Student(String n) {
        this();
        name = n;
    }

    /**
     * A constructor to make a new student and give them test scores for each
     * test
     *
     * @param s the student with scores already given
     */
    public Student(Student s) {
        this(s.name);
        test1 = s.test1;
        test2 = s.test2;
        test3 = s.test3;
    }

    /**
     * a setter method to set a name of a student
     *
     * @param nm the name to be set
     */
    public void setName(String nm) {
        name = nm;
    }

    /**
     * a getter method for the name
     *
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * a setter method to set the score of one specific test
     *
     * @param i the test to have it's score set
     * @param score the score to be set
     */
    public void setScore(int i, int score) {
        //determines if the user chose test1 to be set
        if (i == 1) {
            test1 = score;
            //if chosen test2 to be set
        } else if (i == 2) {
            test2 = score;
            //if neither it must be test3
        } else {
            test3 = score;
        }
    }

    /**
     * a getter method to return the score of one test
     *
     * @param i the test whose score you want
     * @return the score of the chosen test
     */
    public int getScore(int i) {
        //determines if the user chose test1 to be set
        if (i == 1) {
            return test1;
            //if chosen test2 to be set

        } else if (i == 2) {
            return test2;
            //if neither it must be test3
        } else {
            return test3;
        }
    }
/**
 * a getter method to determine a students average
 * @return the calculated average
 */
    public int getAverage() {
        int average;
        average = (int) Math.round((test1 + test2 + test3) / 3.0);
        return average;
    }
/**
 * a getter method to determine and return the student's best score
 * @return the highest score
 */
    public int getHighScore() {
        int highscore;
        //sets the highscore as one for a default
        highscore = test1;
        //if 2 beats the highscore it is the new highscore
        if (test2 > highscore) {
            highscore = test2;
        }
        //if 3 beats the highscore it is the new highscore
        if (test3 > highscore) {
            highscore = test3;
        }
        return highscore;
    }
/**
 * basic tostring method
 * @return a string containing the name, test scores and average of the student
 */
    public String toString() {
        String str;
        str = "Name:    " + name + "\n"
                + "Test 1:    " + test1 + "\n"
                + "Test 2:    " + test2 + "\n"
                + "Test 3:    " + test3 + "\n"
                + "Average:   " + getAverage();
        return str;
    }
}
