/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author ALVIN
 */
public class Test {
    public static void main(String args[])
    {
        A a = new A();
        System.out.println(a.p(10)); //this invokes the overloading method in the subclass
        System.out.println(a.p(4.5)); //this invokes the overloaded method in the superclass
    }
}
