/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visibiltyTwo;

/**
 *
 * @author ALVIN
 */
public class v5 extends visibility.v1{
    public static void main(String args[])
    {
        
        v5 obj = new v5();
        obj.meth();
        obj.
    }
    public void meth()
    {
        sayHi(); //in a diff package, a protected method can be accessed if the class is a subclass
        //sayMorning(); //cant be accessed from even a sublass of diff package coz it is default
    }
}
