
package sequencer;
import java.io.*;
import java.net.*;

public class Receive {
    
    public static int port = 7777;
    public static String group = "234.27.7.95";
    public static MulticastSocket socket;
    public static byte[] buffer;
    public static DatagramPacket inPacket, outPacket;
    public static InetAddress host;
    
    public static void main(String args[])
    {
        try
        {
            socket = new MulticastSocket(port);
            host = InetAddress.getByName(group);
            socket.joinGroup(host); 
            System.out.println("Waiting for message from Multicast group");
            buffer = new byte[1024]; 
            while(true){
            inPacket = new DatagramPacket(buffer, buffer.length);
            socket.receive(inPacket);
            String rec = new String(inPacket.getData());
            String mg = new String(rec);
        String mgs[] = mg.split(" ");
        System.out.println("Message received is: " + mgs[0] + ", its unique ID is " + mgs[1] + " its sequence number is " + mgs[2]); 
    
          //  System.out.println("Message received is: " + rec);
            socket.leaveGroup(host);
            }
        }
        catch(IOException e){e.getMessage();
        }
        finally{socket.close();
        }
    }   
}
