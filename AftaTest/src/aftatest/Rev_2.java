
public class Rev_2 {

	public static void main(String[] args) 
	{
	/*
		try{
		int a = args.length;
		System.out.println("a = " + a);
		int b = 4/a;
		int g[]={3};
		System.out.println(g[5]);
		}
		catch(ArithmeticException e){System.out.println("Division by 0");}
		catch(ArrayIndexOutOfBoundsException p){System.out.println("array index not known");}
		finally{System.out.println("After everything");};
	*/
		
		try
		{
			demo();
		}
		catch(NullPointerException mo)
		{
			System.out.println(mo.getMessage() + " now recaught");
		}
	}
	public static void demo()
	{
		try
		{
			throw new NullPointerException("firstOne");
		}
		catch(NullPointerException my)
		{
			System.out.println(my.getMessage());
			throw my;
		}
	}

}
