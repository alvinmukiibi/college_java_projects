public class Mystery 
{
	public static int mystery(int a, int b)
	{
		if(b==0)
			return 0;
		else
			if(b % 2 == 0)
				return mystery(a+a, b/2);
			else
				return mystery(a+a, b/2) + a;
	}
	public static void main(String args[])
	{
		double x = 6.778989;
		int y = (int)x;
		System.out.println(y);
		//narrowing conversion
		
		int leapyr;
		if(leapyr%4==0&&leapyr%100!=0)
	}
}
