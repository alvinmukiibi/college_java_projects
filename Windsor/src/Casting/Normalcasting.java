/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casting;

/**
 *
 * @author ALVIN
 */
public class Normalcasting {
    
    public static void main(String args[])
    {
        //we can only cast a smaller type to a larger type not viceversa
        
        int x = 7, y = 3;
        double z = x / y; //now this is implicit casting, changing 2 to 2.0
        
        System.out.println(z);
        //The answer is 2.0, coz int/int gives int 2 then to double gives 2.0
        
        //So to avoid the logical error, we typecast
        
        //this explicit casting
        double m = (double) x / y;  //or x /(double)y
        
        System.out.println(m);
        
        
    }
}
