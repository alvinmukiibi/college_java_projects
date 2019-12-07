/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericprogramming;

/**
 *
 * @author ALVIN
 */
public class John {
    
    public static void main(String args[])
    {
        method(new Person()); 
        method(new Student());
        method(new Object());
    }
    public static void method(Object x)
    {
        System.out.println(x.toString()); //this methods takes Object as parameter, this
        //means that it can also receive all subclasses of Object as parameter e.g. Student, Person
        //since Object is the superclass of all classes in Java, user-defined or compiler-defined
        /*
        If a method's parameter is of Supertype class, it means it can also receive all subclasses of that Supertype as arguments
        
        
        */
        /*
        Now this is generic programming i.e. Writing methods that are reusable or can
        be used in many different ways, e.g. the method on line 19 can be used
        in different ways since it allows different arguments
        However if the parameter had been only (Student x), it wouldnot be that usable
        
        
        */
    
    }
}
