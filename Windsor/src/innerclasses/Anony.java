/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasses;

/**
 *
 * @author ALVIN
 */
public class Anony {
    
    private static final int r = 9;
    
    public static void main(String args[])
    {
        //this is an anonymous class hence has no name
        //it has no constructors
        Interface anon = new Interface()  //this must either be an interface or a superclass so that is the name/type it takes on
        {   //it does not have an explicit 'extends/implements' clause
            //it must implement all the abstract methods in the interface or if extending, the abstract super class
            public void say()
            {
                System.out.println("The name is " + name); //name is got from the interface being implemented
            }
            public int add(int y)
            {
                return (x + y + r );  //can access even the private variables of the outer class
            }
        };
        
        Superclass anony = new Superclass()
        {
            public String str()
            {
                return ("This is a string");
            }
            public double div(double x)
            {
                return (x / 2);
            } 
        };   //an anonymous class defn contains its instantiation and defn at the same time so it must be terminated like a statement
        
        System.out.println(anony.div(4));
        System.out.println(anony.str());
        
        System.out.println(anon.add(5));
        anon.say();
    }
    
    
    
}
