/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALVIN
 */
public class B extends A {
    
    public B()
    {
        System.out.println("This is the subclass constructor");
    }
    
    public static void tes() //this method now hides the one that is in the superclass but it is not overridding since static methods cant be overridden
    {
        System.out.println("Method is redefined");
    }
    public static void main(String args[])
    {
        B b = new B();  //call to subclass constructor
        tes();  //static methods can be inherited but not overridden   
    }
}
