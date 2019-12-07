/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.Adder;

/**
 *
 * @author ALVIN
 */
import java.rmi.*;  
public class MyClient{  
    public static void main(String args[]){  
        try{  
                Adder stub=(Adder)Naming.lookup("//localhost/sonoo");  
                System.out.println(stub.add(34,4));  
            }
        catch(Exception e){}  
    }  
}  