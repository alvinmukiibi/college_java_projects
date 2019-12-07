package windsor;

/**
 *
 * @author ALVIN
 */
public class Revision_two {
    public static void main(String args[])
    {
        /*
        String str = new String("John");
        String nam = str;
        
        System.out.println(str==nam); // returns true since == checks for reference
        System.out.println(str.equals(nam)); //also returns true since value is the same
        
        str = "Ransom " + str;
        
        System.out.println(str==nam); 
        System.out.println(str.equals(nam)); 
        
        */
        
        String fname = "Suzan";
        String lname = new String("Suzan");
        String mname = "Suzan";
        String hname = new String("suzan");
        
        System.out.println(fname == mname && fname.equals(mname)); // note that == checks 4 ref and equals 4 value so answer is true
        System.out.println(fname == lname); //answer is false since refs are different
        System.out.println(fname.equals(lname));//answer is true since values are the same
        System.out.println(lname == hname); //returns false since refs are different, no interning
        
        String s = "Jal";
        s = "pol";
        System.out.println(s);
    
    }
}
