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
public class C extends B{
    
    public int addNumbers(int x)
    {
        return (x + 4);
    }
    public double addNumbers(double x)  //I am overloading the method on line 12
    {
        return (x + 1.4);
    }
}
