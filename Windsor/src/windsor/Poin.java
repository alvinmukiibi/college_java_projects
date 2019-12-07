/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windsor;

import java.awt.Point;
/**
 *
 * @author ALVIN
 */
public class Poin {
    public static void main(String args[])
    {
    //this class Point in the javax.awt class is mutable i.e it can be changed
    Point myPoint = new Point(0,0);
    System.out.println(myPoint);
    myPoint.setLocation(1.0,2.0);
    System.out.println(myPoint);
    
        
    //this is an example that the String object is immutable, its state cant be changed once created
    String myString = new String("old string");
    //String myString = "old string";
    System.out.println(myString); //out put is oldstring
    myString.replaceAll("old","new"); //this cant change the state of the object at that reference of mystring, but if u assign this to a new string, the new string is different
    System.out.println(myString); //out put is still oldstring
    
  
    //so what you do, you create a new object i.e. a new reference
    
    String anString = new String("old string");
    System.out.println(anString); //out put is oldstring
    anString = new String("new string"); //this creates a new reference and the old reference value is garbage collected i.e rubbed from memory
    System.out.println(anString);
    
    }
}