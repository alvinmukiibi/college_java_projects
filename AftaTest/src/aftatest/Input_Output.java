import java.io.*;
public class Input_Output {
	public static void main(String[] args)throws IOException {
		//this line stores a reference to system.in in the variable br
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//this line stores a reference to the System.out method in the bn variable
		PrintWriter bn = new PrintWriter(System.out, true);
		//String c;
		//int c;
		
		char c;
		bn.println("Enter the xters, 'q' to stop");
		do
		{
			c = (char)br.read(); 
			//read works for characters, readLine() works for cstrings
			//the read() method throws an IOException
			bn.println(c);
		}
		while(c != 'q');
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
