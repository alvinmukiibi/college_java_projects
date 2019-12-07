
package windsor;

import java.util.*;

/**
 *
 * @author ALVIN
 */
public class Windsor {
    public static void main(String[] args) {
        System.out.println("My name is mukiibi kelly alvin and am back to program in Java, again, to my eternal shame");
        
        
        
        int a = 4, b = 6, c = 3;
        a = b = c; //assignment is right associative i.e. done right to left
        System.out.println("a = " + a  +", b = " + b + ", c = " + c);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int myNo = input.nextInt();
        
        switch(myNo)
        {
            case 1:
                System.out.println("You entered 1");
                break;
            case 2:
                System.out.println("You entered 2");
                break;
            default:
                System.out.println("I don't know which number you entered");
                break;
        }
      int i ;
    for(i = 3; i < 30; i++)
    {
        i+=i;
    }
    System.out.println("i = " + i);
    
    int myArr[] = {3,2,1,4,5,6};
    int myArrs[];
    int myArrss[] = new int[3];
    
    int pdt = getPdt(3,4);
    System.out.println("The pdt of 3 and 4 is " + pdt);
    }
    public static int getPdt(int a, int b)
    {
        return(a*b);
    }   
}



