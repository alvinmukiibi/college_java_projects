/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casting;

/**
 *
 * @author ALVIN
 */
/*
    Casting in objects is only allowed in inheritance hierarchies i.e. coverting an object
    of one type to another i.e. from a smaller type to a bigger type


*/
public class Main {
    
    public static void main(String args[])
    {
        Object man = new Person(); //this is allowed since Person is a subclass of Object
        //known as implicit casting, is legal because an instance of Person is automatically an instance of Object
        
        Person jack = new Employee(); //same case here, implicit casting
        //we are assigning a subtype object to a supertype reference implicitly
        
        //But we can force a supertype object to be assigned to a subtype reference
        //By use of explicit casting (NOT ENCOURAGED) as below
        
        Employee jane = (Employee)new Person();  //without the (Employee)this is an 
        //error coz Person(supertype) cant be converted to Employee(Subtype)
        //by using (Employee) we are explicitly typecasting
        
        
        
        /*
        Implicit casting
        Supertype obj = new Subtype();
        
        Explicitly casting
        Subtype obj = (Subtype)new Supertype();
        */
        
    }
    
}
