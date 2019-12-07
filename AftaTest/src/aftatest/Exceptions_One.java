
public class Exceptions_One {

	public static void main(String[] args) 
	{
		try{
		int a = 0;
		int b = 5;
		int c = b / a;
		System.out.println("c = " + c);		
		}
		catch(ArithmeticException err)
		{
			System.out.println("Division by zero");
		}
		System.out.println("Executed after the catching");

	}
	
		
	
}
