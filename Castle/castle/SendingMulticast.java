
package castle;

import java.io.*;
import java.net.*;

public class SendingMulticast {
    
    public static int port = 5000, ttl = 1;
    public static String group = "225.4.5.6";
    public static MulticastSocket socket;
    public static byte[] buffer;
    public static DatagramPacket inPacket, outPacket;
    public static InetAddress host;
    
    public static void main(String args[])
    {
        try{
            // Create the socket but we don't bind it as we are only going to send data
            socket = new MulticastSocket();
            String message = new String("Message to be multicasted");
            buffer = message.getBytes();
            //note that we dont have to join the group if are just gonna send data, its only necessary if you gonna receive messages
            
            host = InetAddress.getByName(group);
            outPacket = new DatagramPacket(buffer, buffer.length, host, port);
            
            
            socket.send(outPacket);
            System.out.println("Message has been sent to Multicast group");
        }
        catch(IOException e){System.out.println("Problem is " + e.getMessage());}
        finally{socket.close();}
        
    }
    
}
