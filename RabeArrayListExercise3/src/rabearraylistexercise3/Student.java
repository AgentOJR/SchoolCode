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
    public Student(String name, int test1,int test2,int test3){
        this.name = name;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
        average = (test1 + test2 + test3)/3;
        count++;
    }
    public void updateAvg(){
        average = (test1 + test2 + test3)/3;
    }
    public int getTest(int test){
        if(test == 1){
            return test1;
        }else if(test == 2){
            return test2;
        }else{
            return test3;
        }
    }
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
    public String getName(){
        return name;
    }
    public int getAvg(){
        return average;
    }
    public static int getCount(){
        return count;
    }
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
    public void setName(String name){
        this.name = name;
    }
    
}
