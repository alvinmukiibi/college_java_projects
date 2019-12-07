/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windsor;

/**
 *
 * @author ALVIN
 */
public class Apple extends Fruit{
    //there is some problem with extending a class that has no default constructor i.e. the No-args constructor
    public Apple(String s)
    {
        super("John");
        System.out.println("This is apple's no arg constructor " + s);
    }
    public static void main(String args[])
    {
        new Apple("Jack");
    }
}
