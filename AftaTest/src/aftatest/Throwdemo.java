
public class Throwdemo {

	public static void demoprac()
	{
		try
		{
			throw new NullPointerException("demo");
		}
		catch(NullPointerException ee)
		{
			System.out.println("Demo is caught here");
			throw ee;
		}
	}
	
	
	
	public static void main(String[] args)
	{
		try{
			demoprac();
		}
		catch(NullPointerException kk)
		{
			System.out.println("Caught again here");
		}

	}

}
