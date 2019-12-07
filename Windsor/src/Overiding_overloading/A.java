/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overiding_overloading;
//overriding a method in the superclass
/**
 *
 * @author ALVIN
 */
public class A extends B{
    public void p(double i) //this method overrides the method in class B
    {
        System.out.println(i * 3);
       // m(6); //this can be allowed because static methods can be inherited
    }
    
    /*
    //this would bring an error because it the method m in the superclass cant be overridden, however if make it static, it would not be an error it would just be a different method
    //just,  If a static method defined in the superclass is redefined in a subclass, the method defined in the superclass is hidden
    public void m(int d)
    {
        System.out.println(d);
    }
*/
}
