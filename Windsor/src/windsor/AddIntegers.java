/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windsor;

import java.util.Scanner;
public class AddIntegers {
    
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int integerOne, integerTwo, sum;
        
        System.out.print("Enter the first integer: ");
        integerOne = input.nextInt();
        System.out.print("Enter the second integer: ");
        integerTwo = input.nextInt();
        sum = integerOne + integerTwo;
        System.out.println("The sum of " + integerOne + " and " + integerTwo + " is " + sum);
        
    }
    
}
