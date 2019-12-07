/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstractclasses;

/**
 *
 * @author ALVIN
 */
public abstract class Sub extends Sup{
    
    public Sub()  //an abstract class can have a constructor which will be invoked through cnstructor chaining along the inheritance chain
    {
        System.out.println("This is the subclass");
        System.out.println("The mysterious name is: " + super.getName());
       System.out.println("The age in the subclass is: " + getAge());
    }
    
    public abstract int getAge();
    
    @Override
    public String getName()  //overridden
    {
        return "John";
    }
    
}
