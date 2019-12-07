/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasses;

/**
 *
 * @author ALVIN
 */
public class Out {
    
    public static int a = 5;
    
    public static void de()
    {
        System.out.println("Outerclass Invocation");
    }
    
    static class In{
        
        public static void de()
        {
            System.out.println("A = " + a);
        }
        
        public static void main()
        {
           // Out.this.de();
            
            
            
        }
    
    }
    
    
}
