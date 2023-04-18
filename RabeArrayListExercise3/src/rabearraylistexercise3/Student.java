/*
 * Owen Rabe
 * Apr 17 23
 * A Student class for the third ArrayList Exercise
 */
package rabearraylistexercise3;


public class Student {
    private int test1,test2,test3;
    private int average;
    private String name;
    private static int count;
    /**
     * Constructor to make a new Student Object with specified parameters
     * @param name student's name
     * @param test1 test score 1
     * @param test2 '' '' 2
     * @param test3 '' '' 3
     */
    public Student(String name, int test1,int test2,int test3){
        this.name = name;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
        average = (test1 + test2 + test3)/3;
        count++;
    }
    /**
     * method to update the average of a student
     */
    public void updateAvg(){
        average = (test1 + test2 + test3)/3;
    }
    /**
     * method to give the student's score on a certain test
     * @param test the requested test
     * @return the score on requested test
     */
    public int getTest(int test){
        if(test == 1){
            return test1;
        }else if(test == 2){
            return test2;
        }else{
            return test3;
        }
    }
    /**
     * method to change a student's score on a specific test
     * @param test the test to change
     * @param score the new score
     */
    public void setTest(int test,int score){
        if(test == 1){
            test1 = score;
        }else if(test == 2){
            test2 = score;
        }else{
            test3  = score;
        }
        updateAvg();
    }
    /**
     * method to give the students name
     * @return the name
     */
    public String getName(){
        return name;
    }
    /**
     * method to give the students calculated average
     * @return the student's calculated average
     */
    public int getAvg(){
        updateAvg();
        return average;
    }
    /**
     * class method to return the number of student type objects
     * @return the number of student objects created
     */
    public static int getCount(){
        return count;
    }
    /**
     * method to return the high scoring test of s student
     * @return the students best test
     */
    public int getHighScore(){
        int highScore = 0;
        if(test1 > highScore){
            highScore = test1;
        }if(test2 > highScore){
            highScore = test2;
        }if(test3 > highScore){
            highScore = test3;
        }
        return highScore;
    }
    /**
     * method to change the name of a student
     * @param name the new name
     */
    public void setName(String name){
        this.name = name;
    }
    
}
