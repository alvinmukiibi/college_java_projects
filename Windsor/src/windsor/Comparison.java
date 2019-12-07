/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windsor;

/**
 *
 * @author ALVIN
 */
public class Comparison {
    
    public static void main(String args[])
    {
        
       
        
        
        String one = new String("John");
        String two = one;
         
        System.out.println(one.equals(two)); //coz they have the same contents
        System.out.println(one==two);       //they have the same reference
        
        one = "not" + one;
        
        
        System.out.println(one.equals(two)); //because the values are now different
        System.out.println(one==two);  //one points to a different reference so false still
        
        
        
        
    }
    
    
}
