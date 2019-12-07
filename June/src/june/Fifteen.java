
import java.util.Scanner;
public class Fifteen 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 15 integers"); 
		int num;
		int sum = 0;
		for(int i = 0; i < 15;i++)
		{
			num = input.nextInt();
			sum += num;
		}
		
		System.out.println("The sum of the 15 integers is " + sum);
		
	}
}
