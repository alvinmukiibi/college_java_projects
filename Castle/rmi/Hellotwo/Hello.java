/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.Hellotwo;
import java.rmi.*;
import java.rmi.server.*;
/**
 *
 * @author ALVIN
 */
public class Hello extends UnicastRemoteObject implements HelloInterface{
    private String message;
    
    public Hello(String msg)throws RemoteException{
        message = msg;
    }
    public String say(String m)throws RemoteException{
        return new StringBuffer(m).reverse().toString() + "\n" + message;
        
    }
    public static void main(String args[])
    {
        try{
            new Registry();
            Hello stub = new Hello("Hello, world");
            Naming.rebind("Hello", stub);
            System.out.println("Server is running....");
        }
        catch(Exception e){System.out.println("Hello Server failed: " + e.getMessage());}
    }
}
