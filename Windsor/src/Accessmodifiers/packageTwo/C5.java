/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accessmodifiers.packageTwo;

/**
 *
 * @author ALVIN
 */
public class C5 {
    
    Accessmodifiers.packageOne.C1 obj = new Accessmodifiers.packageOne.C1();
    //can access o.x;
    //cannot access o.y;
    //cannot access o.z;
    //cannot access o.u;
    
    //cannot invoke o.m();
    
}
