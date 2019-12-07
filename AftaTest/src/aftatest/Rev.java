
public class Rev {
	public static void main(String args[])
	{
		int a = 9;
		int b = 0;
		try
		{
			int c = a / b;
			System.out.println("This statement wont be printed since it is unreachable, from line 9, an exception will be thrown");
			System.out.println(c);
		}
		catch(ArithmeticException ar)
		{System.out.println("The error is division by zero");}
		finally
		{
			System.out.println("Whatever");
		}
		
		
	}

}
