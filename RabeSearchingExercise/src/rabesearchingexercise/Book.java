/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rabesearchingexercise;

/**
 *
 * @author owenrabe
 */
public class Book {
    private int rNum;
    private String name;
    public Book(int rNum,String name){
        this.rNum = rNum;
        this.name = name;
    }
    public String getName(){
        return name;
        
    }
    public int getRef(){
        return rNum;
    }
}
