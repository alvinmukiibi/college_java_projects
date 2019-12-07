/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamicbinding;

/**
 *
 * @author ALVIN
 */
public class Instance {
    public static void main(String args[])
    {
        
        D obj = new D();
        System.out.println(obj.addNumbers(2,4));        //the method in A is called
        System.out.println(obj.addNumbers(3.4,5));      //the method in B is called
        System.out.println(obj.addNumbers(6));          //the method in C is called 
        System.out.println(obj.addNumbers(2.7,5.2));    //the method in D is called
        System.out.println(obj.addNumbers(3.4));        //the method in C that is overloading is called
        
        /*what happens is in this inheritance hierarchy, the JVM during compile time
        It goes up in the hierarchy looking for a method match among all overridden or overloaded methods
        to find one that matches the signature depicted in the method call as arguments, in this
        case, it will go looking for a method that receives two ints as arguments and that is the one
        it will invoke. This brings us to Dynamic binding which happens at runtime, the found method
        is now bound to the method call and whenever the method is called, it is the one that is invoked
        
        
        Compiler finds a match using parameter types, number and order 
        */
    }
    
}
