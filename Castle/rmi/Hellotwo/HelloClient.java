/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.Hellotwo;
import java.rmi.*;
/**
 *
 * @author ALVIN
 */
public class HelloClient {
    public static void main(String args[])
    {
        try
        {
            if(args.length < 0)
            {
                System.err.println("usage: java HelloClient String");
                System.exit(1);
                
            }
            HelloInterface hello = (HelloInterface)Naming.lookup("//localhost/Hello");
            for(int i = 0; i < args.length; i++)
                System.out.println(hello.say(args[i]));
        }
        catch(Exception e){System.out.println("Helloclient exception: " + e);
        
        
    }
}
}
