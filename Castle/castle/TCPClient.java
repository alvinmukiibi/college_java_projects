package castle;

import java.io.*;
import java.net.*;

public class TCPClient {
    
    public static BufferedReader in;
    public static BufferedWriter out;
    public static DataInputStream is;
    public static DataOutputStream os;
    public static Socket socket;
    
    public static void main(String args[])throws IOException
    {
        socket = new Socket("localhost",2892); //create a socket object to connect to server socket 
        
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        
        is = new DataInputStream(socket.getInputStream());
        os = new DataOutputStream(socket.getOutputStream());
        
        os.writeUTF("Hello Server 2892");
        
        String line = is.readUTF();
        System.out.println("Reply receieved is: " + line);
        
        socket.close();
        
        
        
        
    }
}
