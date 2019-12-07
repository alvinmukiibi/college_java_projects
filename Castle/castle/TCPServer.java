package castle;

import java.io.*;
import java.net.*;



public class TCPServer {
    
    public static BufferedReader in;
    public static BufferedWriter out;
    public static DataInputStream is;
    public static DataOutputStream os;
    public static ServerSocket server;
    public static Socket socket;
    
    
    public static void main(String args[])throws IOException
    {
        server = new ServerSocket(2892); //open the server socket
        System.out.println("Server listening at port: 2892");
        socket = server.accept(); //wait 4 the client request
        System.out.println("Client connected");
        //create I/O streams for communication with the client
        
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        
        is = new DataInputStream(socket.getInputStream());
        os = new DataOutputStream(socket.getOutputStream());
        
        String line = is.readUTF();
        System.out.println("Words received are: " + line);
        os.writeUTF("Message received Mr Client, Thank you");
        
        socket.close();
        
        
        
    }
}
