
package castle;
import java.net.*;
import java.io.*;

public class UDPClient {
    
    public static DatagramSocket socket;
    public static byte[] buffer;
    public static DatagramPacket inPacket, outPacket;
    public static InetAddress serverHost; //got by applying getByName on the mnemonic name of the server
    public static int serverPort = 5678;
    
    
    public static void main(String args[])
    {
        try{
        //first create a socket to communicate with the server
        socket = new DatagramSocket(); //this class can accept an arg but u can also leave it without arg so that it chooses its own free local port
        //however, it throws a SocketException in case port chosen is already in use
        serverHost = InetAddress.getByName("127.0.0.1");
        //create the outgoing datagram packet and embed a message in it, we must specify the server address and the port of the process to which the message is to be delievered
        String message = new String("Hello, Mr. Server");
        outPacket = new DatagramPacket(message.getBytes(),message.length(),serverHost,serverPort);
        
        //send the datagram message
        socket.send(outPacket);//the send operation has an arg of an instance of DatagramPacket specifying the message and its destination
        
        
        //now to receive, remember that UDP is connectionless, so we specify a buffer of fixed size in which the incoming message is to be received
        //create a buffer for incoming datagrams
        buffer = new byte[256];
        
        //create a packet object for the incoming datagram
        inPacket = new DatagramPacket(buffer, buffer.length);
        
        //accept incoming datagram
        socket.receive(inPacket); //the receive operation has an arg of an empty packet in which to put the incoming message
        
        //retrieve and print data from packet
        
        System.out.println("Reply is " + new String(inPacket.getData())); //how the getData() returns an array of bytes of the received message so we can convert into a string object
        
        }
        catch(SocketException s){System.out.println("Socket: " + s.getMessage());}
        catch(IOException i){System.out.println("IO: " + i.getMessage());}
        finally{if(socket!=null)socket.close();}
        
        
        
    }
    
    
}
