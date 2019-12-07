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
public class Derivedclass extends Outerclass{
    
    public static void main(String args[])
    {
       Derivedclass der = new Derivedclass();
       der.getAge();
        
    }
    public void getAge()
    {
       // System.out.println(Innerclass.d);
        //System.out.println(addNos(2,1));
        //System.out.println(k); //age is from the superclas
        demo(); //has a local class
    }
}
