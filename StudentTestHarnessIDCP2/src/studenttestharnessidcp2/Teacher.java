/*
 * Owen Rabe
 * Mar 2 23
 * Teacher class
 */
package studenttestharnessidcp2;

public class Teacher implements Person{

    private String name;
    private Student s1;
    private Student s2;
    private Student s3;

    public Teacher(String name) {
        this.name = name;
        s1 = null;
        s2 = null;
        s3 = null;
    }

    public Teacher(String name, Student s1, Student s2, Student s3) {
        this(name, s1, s2);

        this.s3 = s3;
    }

    public Teacher(String name, Student s1, Student s2) {
        this(name, s1);

        this.s2 = s2;

    }

    public Teacher(String name, Student s1) {
        this(name);
        this.s1 = s1;

    }
    public Student getStudent(int i){
        if (i  == 1) {
            return s1;
        }
        else if(i == 2){
            return s2;
        }else if(i == 3){
            return s3;
        }
        System.out.println("Error: invalid Student. Please try again.");
        return null;
    }
    public void setStudent(int i, Student s){
        if (i  == 1) {
            s1 = s;
        }
        else if(i == 2){
            s2 = s;
        }else if(i == 3){
            s3 = s;
        }
        System.out.println("Error: invalid Student. Please try again.");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return ("Teacher Summary:\nName: " + name + "\nStudent 1: " + s1.getName() + "\nStudent 2: " + s2.getName() + "\nStudent 3: " + s3.getName());
    }
}
