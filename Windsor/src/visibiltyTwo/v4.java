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
public class v4 {
    public static void main(String args[])
    {
        visibility.v1 obj = new visibility.v1();
        obj.sayHello();
        //obj.sayHi(); //this method is protected so it cant be accessed from a different package of u are not a subclass
        
    }
    
}
