import java.io.*;
import java.util.Scanner;
public class Read_and_write {
	@SuppressWarnings("resource")
	public static void main(String[] args)throws IOException{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter outp = new PrintWriter(System.out, true);
		
		String filename = inp.readLine();
		FileInputStream infile;
		FileOutputStream outfile;
		int i;
		try{
		try
		{
			infile = new FileInputStream(args[0]);
		}
		catch(FileNotFoundException err)
		{
			outp.println("File not found");
			return;
		}
		try
		{
			outfile = new FileOutputStream(filename);
		}
		catch(FileNotFoundException errr)
		{
			outp.println("Error opening output file");
			return;
		}
		}
		catch(ArrayIndexOutOfBoundsException errrr)
		{
			outp.println("Invalid filename");
			return;
		}
		
			do
			{
				i = infile.read();
				if(i != -1)
				{
					outfile.write(i);
				}
			}
			while(i != -1);
		infile.close();
		outfile.close();
	}
}
