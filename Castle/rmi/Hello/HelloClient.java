/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.Hello;

/**
 *
 * @author ALVIN
 */
import java.rmi.RMISecurityManager; 
import java.rmi.Naming; 
import java.rmi.RemoteException;
public class HelloClient 
{ 
    public static void main(String arg[]) 
    { 
        // I download server's stubs ==> must set a SecurityManager 
        System.setSecurityManager(new RMISecurityManager());
        
        try 
        { 
           Hello obj = (Hello) Naming.lookup( "//" + "localhost" +  "/HelloServer");//objectname in registry 
           System.out.println(obj.sayHello()); 
        } 
        catch (Exception e) 
        { 
           System.out.println("HelloClient exception: " + e.getMessage()); 
           e.printStackTrace(); 
        } 
    } 
} 
 
