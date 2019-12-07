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
public abstract class Subclass extends Superclass //subclass can be abstract even if the superclass is concrete
{

    public Subclass()
    {
        
    }
    public Subclass(int a)
    {
        
    }
    
    @Override
    public abstract void sayHi(); //method can be abstract in subclass even if its concrete in the superclass
    
    //protected void unfinished(); //this is wrong coz in an abstract class, if a method is declared in an abstract format then it must be explicitly declared as abstract
    
    
    
}
