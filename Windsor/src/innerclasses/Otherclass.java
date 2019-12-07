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
public class Otherclass {
    
    public static void main(String args[])
    {
        
        Outercl out = new Outercl();
        Outercl.Innercl in = out.new Innercl();
        
        
        in.demo(); //if i call this method of the inner class and it is not found in the inner class, then it checks for such a method in the outerclass
        
    }
    
}
