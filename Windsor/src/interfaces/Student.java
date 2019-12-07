/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author ALVIN
 */
public interface Student //cyclic inheritance is not allowed in interfaces
{
    
    //interface contains only public static final constants and public abstract methods
    public static int age = 9;
    public static String name = "Mukiibi";
    
    abstract void sayName();   
    public abstract int add(int a);
    public static void unique()//it is ok to declare a method static
    {
        System.out.println("This is a unique method");
    }
    //or u can just write the method names like
    
    final int ag = 2;  //even if not defined as static, it is assumed to be static
    //void sayHi();
    
}
