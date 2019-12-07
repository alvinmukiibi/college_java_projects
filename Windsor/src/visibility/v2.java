/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visibility;

/**
 *
 * @author ALVIN
 */
public class v2 {
    public static void main(String args[])
    {
        v1 obj = new v1();
        obj.sayHi();
        obj.sayHello();
        obj.sayMorning();
        //obj.sayEvening(); //private cant be accessed
        
    }
}
