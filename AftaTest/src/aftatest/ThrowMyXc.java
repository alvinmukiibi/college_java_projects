
public class ThrowMyXc {

	public static void main(String[] args) 
	{
		try
		{
			throw new MyException("whatever");
		}
		catch(MyException mine)
		{
			System.out.println(mine.getMessage());
		}

	}

}
