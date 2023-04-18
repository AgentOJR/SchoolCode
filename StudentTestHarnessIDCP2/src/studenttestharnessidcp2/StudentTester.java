/**
 * B. Cutten
 * Sept 2014
 * A test harness for the Student class
 */
package studenttestharnessidcp2;

import java.util.Scanner;

public class StudentTester {

    public static void main(String[] args) {
        Student student1;        
        student1 = new Student();//instantiating the student object for the first student       
        
        Student student2 = new Student();
        Student student3 = new Student();
        
        Scanner reader = new Scanner(System.in);//instantiating the student object for the second student
        
        String name;
        int score;
//prompting the user for the name
        System.out.println("Enter the first student's name: ");
        name = reader.nextLine();
        student1.setName(name);
        //has the user input the student's score on each test for the first student
        Teacher teach = new Teacher("Cutten",student1,student2,student3);
        for (int i = 1; i <= 3; i++) {
            //prompting the user for input
            System.out.println("Enter the student's score on test " + i + " : ");
            score = Integer.parseInt(reader.nextLine());
            student1.setScore(i, score);
        }

        //prompting the user for the name
        System.out.println("Enter the second student's name: ");
        name = reader.nextLine();
        student2.setName(name);
        
        //has the user input the score for each test for the second student
        for (int i = 1; i <= 3; i++) {
            //prompting the user for input
            System.out.println("Enter the student's score on test " + i + " : ");
            score = Integer.parseInt(reader.nextLine());
            student2.setScore(i, score);
        }
        System.out.println("Enter the Third student's name: ");
        name = reader.nextLine();
        student3.setName(name);
        for (int i = 1; i <= 3; i++) {
            //prompting the user for input
            System.out.println("Enter the student's score on test " + i + " : ");
            score = Integer.parseInt(reader.nextLine());
            student3.setScore(i, score);
        }
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
              
       //if the first student's highscore is higher than the second's that means they have the highest score
        if (student1.getHighScore() > student2.getHighScore()) {
            name = student1.getName();
            score = student1.getHighScore();
            //otherwise the second student has the highest score
        } else {
            name = student2.getName();
            score = student2.getHighScore();
        }
        //outputtung the name and highscore of the student with the highest score
        System.out.println(name + " has the highest score: " + score);

     //if student1 has a higher average than student 2
        if (student1.getAverage() > student2.getAverage()) {
            name = student1.getName();
            score = student1.getAverage();
            //otherwise student 2 has the higher average
        } else {
            name = student2.getName();
            score = student2.getAverage();
        }
        //outputting the name and average score of the student with the highest average
        System.out.println(name + " has the highest average score: " + score);
        System.out.println(teach);

    }

}
