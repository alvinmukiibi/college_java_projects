import java.util.Scanner;
public class Pythogras 
{
	public static void main(String args[])
	{
		double a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = input.nextDouble();
		System.out.print("Enter b: ");
		b = input.nextDouble();
		c = Math.sqrt((a*a)+(b*b));
		System.out.println("The hypotenuse is " + c);
	}

}
