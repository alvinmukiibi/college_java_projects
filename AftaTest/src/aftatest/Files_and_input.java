import java.io.*;
public class Files_and_input {
	public static void main(String[] args)throws IOException {
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter outp = new PrintWriter(System.out, true);
		
		String filename = inp.readLine();
		FileInputStream infile;
		int i;
		
		try
		{
			infile = new FileInputStream(filename);			
		}
		catch(FileNotFoundException err)
		{
			outp.println("File not found");
			return;
		}
		do
		{
			i = infile.read();
			if(i != -1)
			{
				outp.println((char)i);
			}
		}
		while(i != -1);
		infile.close();

	}

}
