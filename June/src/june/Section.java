
public class Section 
{
	public static void main(String[] args) 
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] arr = new int[15];
		int sum = 0;
		System.out.print("Enter the 15 integers: ");
		for(int i = 0;i<15;i++)
		{
			arr[i] = input.nextInt();
			sum+=arr[i];
		}
		System.out.println("The sum of the integers is " + sum);
	}
}
