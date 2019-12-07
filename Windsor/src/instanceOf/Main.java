/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanceOf;

/**
 *
 * @author ALVIN
 */
public class Main {
    
    public static void main(String args[])
    {
        Object obj = new Circle();
        double diam = ((Circle)obj).getDiameter();
        if(obj instanceof Circle)
        {
            System.out.println("It is");
        }
        else
        {
            System.out.println("No, it isnt");
        }
     }
}
