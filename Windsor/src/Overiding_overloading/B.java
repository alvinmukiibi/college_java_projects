/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overiding_overloading;

/**
 *
 * @author ALVIN
 */
public class B {
    public void p(int i)//this is the overridden method
    {
        System.out.println(i + 2);
    }
    //A private method cant be overridden because it is not accessible outside its class
    //if I define a private method here in the superclass, I cant override it in the subclass
    //However, I can define a method in the subclass with the same signature but these two methods would be completely unrelated

    
    //this is a static method in the superclass, it can be inherited but not overridden
    public static void m(int d)
    {
        System.out.println(d);
    }

}
