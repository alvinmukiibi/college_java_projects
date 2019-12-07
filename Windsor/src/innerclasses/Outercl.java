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
public class Outercl {
    
    private int a = 89;
    
    public static void main(String args[])
    {
        
        Outercl out = new Outercl();
        Outercl.Innercl in = out.new Innercl(); //instantiating a non-static inner class
        in.demo();
        System.out.println(in.b);
        
        
    }
    
    private void dem()
    {
        System.out.println("Outer class defn");
    }
    
    
    class Innercl{
        
        private int b = 8;
        
        public void demo()
        {
           System.out.println("a = " + a); //can invoke outerclass private variable
           dem();  //can invoke outer class private method
        }
        
        
    }
    
}
