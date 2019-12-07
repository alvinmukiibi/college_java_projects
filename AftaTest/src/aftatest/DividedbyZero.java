import java.util.Scanner;
public class DividedbyZero {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num, den;
		while(true)
		{
			System.out.println("Enter the num: ");
			num = input.nextInt();
			System.out.println("Enter the den: ");
			den = input.nextInt();
			if(den == 0) 
			{
				throw new ArithmeticException("Division by ero");
			}
			System.out.println("Answer "+num / den);
			break;		
		}
		System.out.println("after");
	}
}
