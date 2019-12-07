/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author ALVIN
 */
public class Business implements Sales{
    
    String business_name;    
    public Sales total()
    {
        
        Business p = new Business();
        p.business_name = "Phones";
        return p; //p is of type Business but since Business class implements Sales then p can be implicitly cast to the Interface type Sales
        
    }
    
    public static void main(String args[])
    {
        Business bus = new Business();
        Sales n = bus.total();
        System.out.println(n);
    }
    
}
