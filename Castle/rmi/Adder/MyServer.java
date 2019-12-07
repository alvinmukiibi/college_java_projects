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
import java.rmi.registry.*;  
public class MyServer{  
    public static void main(String args[]){  
    try{  
        
            Adder stub=new AdderRemote();  
            Naming.rebind("//localhost/sonoo",stub);  
        }
    catch(Exception e){System.out.println(e);}  
    }  
}  