/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloneable;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author ALVIN
 */
public class Clone extends Object implements Cloneable {
    
    
    public int age = 3;
    public String name = "Mukiibi";
    
    
    public static void main(String args[])
    {
        
        Calendar calendar = new GregorianCalendar(2013, 2, 1); //original object
        Calendar calendar1 = calendar;      //this one has the same ref in memory as the original
        Calendar calendar2 = (Calendar)calendar.clone(); //this one has a diff ref because it stores a copy in a diff ref 
        
        System.out.println(calendar == calendar1);  //returns true since refs are the same
        System.out.println(calendar.equals(calendar1));//also returns true since contents are the same
        
        System.out.println(calendar == calendar2); //returns false since they are in diff memory locations
        System.out.println(calendar.equals(calendar2)); //returns true since they hold the same copy of the object contents
        
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException  //the defn here does not come from the cloenable interface but rather overridden from the Object Mother Superclass
    {
        
            Object ret =  super.clone(); //from the superclass not the interface
            return ret;
        
        
    }
    public String getName()
    {
        return name;
    }
    
    
    
}
