/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstractclasses;

import java.util.Scanner;

/**
 *
 * @author ALVIN
 */
public class Sub2 extends Sub{
    
  
    public int getAge()
    {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
    
    public static void main(String args[])
    {
        new Sub2();
    }
    
}
