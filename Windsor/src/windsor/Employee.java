
package windsor;

/**
 *
 * @author ALVIN
 */
public class Employee {
    
    static final int rate = 35;
    String EmpNo = "JH45", Department = "Marketing";
    int hours;
 
    public static void main(String args[])
    {
        Employee salesperson = new Employee();
        
        double payment = salesperson.payment(5);
        
        System.out.println("The salesperson has Employee Number as " + salesperson.EmpNo + " and is from the "
                + "department of " + salesperson.Department + " and since he worked for " + salesperson.hours + " then his"
                + "payment is " + payment + " dollars");
        
        
    }
    public double payment(int hours)
    {
        return (rate * hours);
    }
    
    
}
