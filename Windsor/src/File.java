/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALVIN
 */
public class File {
    
    
    
    
    public static void main(String args[])
    {
        File k = new File();
       String ourStr[] = {"buck","lion","tiger","elephant"};
 System.out.println(k.return_full_string(ourStr));
String[] reverse_array = k.reverse_order(ourStr);
for(int i = 0; i < reverse_array.length; i++)
      {
       System.out.println(reverse_array[i]);
   }
    k.printCharacter("flock of birds");

 System.out.println(k.printChar("Jack"));
  System.out.println(k.printChar("Jack"));
    }
  /*  
    public String return_full_string(String[] arr)
    {
        
        
        String full = arr[0] +" "+ arr[1] +" "+ arr[2] +" "+ arr[3];
        
        return full;
        
        
    }
*/
    public String[] reverse_order(String[] arr)
    {
        
        String[] reversed_arr = null;
        for(int counter=arr.length - 1; counter >= 0;counter--){
            
           // reversed_arr[counter-3] = arr[counter];
            
        }
        return reversed_arr;
    }
    public void printCharacter(String arr){
       for (int index = 0; index < arr.length(); index++) {
     char aChar = arr.charAt(index);
     
     System.out.println(aChar);
} 
    }
    
    
    
     public char printChar(String str)
    {
       
        return str.charAt(0);
        
    }
}
