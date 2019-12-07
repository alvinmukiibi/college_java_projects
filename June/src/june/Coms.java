import java.util.Scanner;
public class Coms 
{
	public static void main(String[] args)
	{
		int A[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to search for: ");
		int key = input.nextInt();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(A[i][j]==key){
					System.out.println(key + " is located at " + i +","+ j);
				}
			}
		}
	}
}
