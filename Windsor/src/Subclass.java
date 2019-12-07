/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALVIN
 */
public class Subclass extends Superclass{
    
    //am trying to test some concept
    //when a method is assigned in superclass with certain access previleges, the subclass is
    //not allowed to lower/weaken these privileges e.g. declaring the method below as private yet it is public in the superclass
    
    public String sayGreet()
    {
        return ("Good morning");
    }
    
}
