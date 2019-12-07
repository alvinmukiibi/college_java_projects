
package windsor;

/**
 *
 * @author ALVIN
 */
public class Strings {
    public static void main(String args[])
    {      
        //constructing strings
        String s1 = "King Edward VII abdicated in 1937";
        String s2 = new String("King Edward VII abdicated in 1937");
        String s3 = new String("George");
        String s4 = "King Edward VII abdicated in 1937";
        //System.out.println(s1);
        //s1 = "George";
        //System.out.println(s1);
        
        //a new object is created if you use the new operator

        System.out.println(s1==s4);  //returns true
        System.out.println(s2==s4);  //returns false
        
        //s1 and s4 are called interned strings and this means that when you define 
        //s4, NO new reference is created since the interned string s1 is already created
        
        
        System.out.println(s1.startsWith("King"));
        System.out.println(s2.endsWith("7"));
        System.out.println(s4.equals(s2));  //returns true
        System.out.println(s4.equals(s1));  //returns true and this is the diff btn .equals() and ==
        //The expn is that .equals() checks if they have the same contents, whereas == 
        //checks if they have the same memory reference so it returns false for s1 and s2 since
        //s2 is a created object whereas s1 is not
        
        if(s1.compareTo(s3)>0)
        {
            System.out.println(s1.compareTo(s3));
        }
        
        System.out.println(s1.length()); //also counts the spaces btn the character strings
        
        String s5 = "Elizabeth Windsor";
        
        System.out.println(s5.charAt(3)); //counts from 0 i.e. indexes, so this returns z
        
        System.out.println(s3.concat(s5)); //you can also use the + operator
        System.out.println(s3 + s5); //returns the same thing
        
        System.out.println(s5.substring(7)); //starts with xter at index 7 to the end
        
        System.out.println(s5.substring(6, 12)); //the xter at index 12 is not part of the returned substring
        
        String s6 = "duke of windsor";
        String s7 = "WALLIS WARFIELD SIMPSON";
        
        System.out.println(s6.toUpperCase());
        System.out.println(s7.toLowerCase());
        
        System.out.println(s6.trim()); //trims blank spaces at both ends
        
        System.out.println(s6.replace("o", "m")); //replaces every instance of o with m
        
        System.out.println(s6.replaceFirst("ind", "IND")); //replaces first instance of ind with IND and leaves the rest (for substrings)
        
        System.out.println(s6.replaceAll("ind", "IND")); //replaces all instances of ind with IND
        
        String[] splitStrings = s6.split(" ");
        
        for(int i = 0; i < splitStrings.length;i++)
        {
            System.out.println(splitStrings[i]);
        }
        
        System.out.println("Henry".matches("Henry"));
        
        System.out.println("Java".equals("Java"));
       
        System.out.println("Java is fun".matches("Java.*"));
        
        String s8 = new String("A#F@DCLO");
        
        System.out.println(s8.replaceAll("[#CO]", "kk"));
        
        String[] tokens = "Java,C?C#,C++".split("[.,:;?]"); //splitting wherever there is a punctuation mark
        
        for (int i = 0; i < tokens.length; i++){
            System.out.println(tokens[i]);
        }
        
        String s9 = "Charlotte Wales";
        
        System.out.println(s9.indexOf("l")); //returns 4
        System.out.println(s9.indexOf("l", 5)); //returns 12, indexfrom 5 going on
        System.out.println(s9.lastIndexOf("e")); //returns 13 not 8
        
        System.out.println(String.valueOf(3.22).concat("Kol")); //returns a string "3.22Kol"
      
        
        String s10 = new String("kkkllleeemmm");
        int count=0;
        for(int i = 0; i < s10.length();i++)
        {
           if(s10.charAt(i)=='e')
           {
               count++;
           }
        }
        
        System.out.println("e : " + count);
                
        
    }
}
