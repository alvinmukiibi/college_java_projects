/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorchaining;

/**
 *
 * @author ALVIN
 */
public class Faculty extends Employeee {
    
    public static void main(String args[])  
    {
        Faculty l = new Faculty();
    }
    
    public Faculty()
    {
        //here there is a first implicit calling of superclass constructor, so we go to Employeee class
        //super(); //this is explicit calling of the superclass
        System.out.println("(4), Faculty's no arg constructor is invoked");
    } 
    
}
