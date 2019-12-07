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
public class TR extends TestRevision{
    public TR()
    {
        System.out.println("TR");
        
    }
    
    public static void main(String args[])
    {
        Float r = new Float(7);
        Double t = new Double(0);
        Integer x = new Integer(3);
        new TR();
    }
   
    protected String getName()
    {
        return "Jack";
    }
}
