/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author ALVIN
 */
public class Lect implements Lecturer, Student{
    
    @Override
    public void sayName(){  //overriden from Student interface
        System.out.println("Hello" + name);
    }
    
   
    @Override
    public int add(int x) //overriden from the Lecturer interface
    {
        //return (x + age); //if not specified, age is got from Lecturer
        //return (x + Lecturer.age);
        return (x + Lecturer.age + Student.age + Student.ag); //the value of age it uses is from the Lecturer interface not from the Student interface which is further
    }
    
    public static void main(String args[])
    {
        Lect lec = new Lect();
        System.out.println(lec.add(4));
    }
}
