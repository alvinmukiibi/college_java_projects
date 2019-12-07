/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorchaining;

/**
 *
 * @author ALVIN
 */
public class Employeee extends Person {
    
    public Employeee()
    {
        //here there is also another first calling of the superclass constructor, so we go to Person class
        
        this("(2), Invoke Employee's overloaded constructor");
        
        System.out.println("(3), Employee's no arg constructor is invoked");
        
    }
    public Employeee(String s)
    {
        System.out.println(s);
    }
}
