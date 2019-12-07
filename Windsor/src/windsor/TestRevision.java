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
public abstract class TestRevision {
    
    public TestRevision()
    {
        System.out.println("Constructor");
    }
    public static void main(String args[])
    {
        System.out.println("Mukiibi");
        System.out.print("Kelly");
        System.out.print("Alvin\n");
        
        String a = new String("lop");
        String b = new String("lop");
        System.out.println(a==b);
    }
    
    protected String getName()
    {
        return "John";
    }
}
