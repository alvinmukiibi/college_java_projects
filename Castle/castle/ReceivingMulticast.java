
package castle;
import java.io.*;
import java.net.*;

public class ReceivingMulticast {
    
    public static int port = 2892;
    public static String group = "234.27.7.95";
    public static MulticastSocket socket;
    public static byte[] buffer;
    public static DatagramPacket inPacket, outPacket;
    public static InetAddress host;
    
    public static void main(String args[])
    {
        try
        {
            //we create a multicast socket and bind to a port 5000
            socket = new MulticastSocket(port);
           
            host = InetAddress.getByName(group);
            socket.joinGroup(host); //then we join the group
            System.out.println("Waiting for message from Multicast group");
            buffer = new byte[1024]; //we create a buffer in which the received message is gonna be stored
            while(true){
            //we create a packet to contain the message
            inPacket = new DatagramPacket(buffer, buffer.length);
            socket.receive(inPacket);
            String rec = new String(inPacket.getData());
            
            //GetLastSeq seq = new GetLastSeq();
            
            
            System.out.println("Message received is " );
            socket.leaveGroup(host);
            }
            
        }
        catch(IOException e){e.getMessage();}
        finally{socket.close();}
    }
    
}
