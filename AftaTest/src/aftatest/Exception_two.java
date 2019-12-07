
public class Exception_two {

	public static void main(String[] args) {
		try{
				int a = 0;
				System.out.println("a = " + a);
				int b = 42 / a;
				int c[] = {1};
				c[42] = 99;
			} 
			catch(ArithmeticException err) 
			{
				System.out.println("Divide by 0: " + err);
			} 
			catch(ArrayIndexOutOfBoundsException errr) 
			{
				System.out.println("Array index oob: " + errr);
			}

	}

}
