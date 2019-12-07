
package castle;

import java.io.*;
import java.net.*;

public class MulticastPeer {
    
    public static MulticastSocket socket;
    public static InetAddress group;
    public static byte[] buffer;
    public static DatagramPacket inPacket, outPacket;
    public static int port = 5678;
    public static void main(String args[])throws UnknownHostException, IOException
    {
        group = InetAddress.getByName("127.0.0.1");  //get the DNS name of the multicast group and convert it into an IP address
        
        socket = new MulticastSocket(5678); //create a multicast socket on the specified port number
        socket.joinGroup(group);
        String msg = new String("I am a new peer in the multicast");
        
        outPacket = new DatagramPacket(msg.getBytes(), msg.length(), group, port); //create an outgoing packet
        
        socket.send(outPacket); //send the packet
        
        buffer = new byte[256]; //create a buffer to receive incoming multicast datagram packets
        
        for(int i = 0; i < 3; i++) //get messages from others in the multicast group
        {
            inPacket = new DatagramPacket(buffer, buffer.length);
            socket.receive(inPacket);
            System.out.println("Received: " + new String(inPacket.getData()));
        }
        
        socket.leaveGroup(group);
        socket.close();
    }
    
}
