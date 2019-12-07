
public class Exception_three 
{
	public static void main(String args[])
	{
		try
		{
			int a = 0;
			int b = 3;
			try{
				int c = b / a;
			}
			catch(ArithmeticException r)
			{
				System.out.println("division by zero");
			}	
		}
		catch(Exception f)
		{
			System.out.println("division");
		}
		
	}
}
