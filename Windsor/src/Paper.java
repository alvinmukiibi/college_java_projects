
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALVIN
 */
public class Paper{
    
    public static void main(String args[])
    {
        Paper p = new Paper();
        //p.doAll();
        
        String s = new String("Jack");
        String t = s;
        s = s + "Jack";
       
        System.out.println(s.equals(t));
        System.out.println(s==t);
        
    }
   
    public long add(long a, long b)
    {
        return (a + b);
    }
    public void doAll()
    {
        Paper p = new Paper();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter both numbers separated by a comma e.g. 4,5: ");
        String str = input.next();
        
        String both[] = str.split(",");
        Long a = Long.valueOf(both[0]);
        Long b = Long.valueOf(both[1]);
        
        System.out.println("Their sum is " + p.add(a, b));
    }
}
