
package castle;
import java.net.*;
import java.io.*;
public class UDPServer {
    
    public static DatagramSocket socket;
    public static byte[] buffer;
    public static DatagramPacket inPacket, outPacket;
    public static InetAddress clientAddress;
    public static int clientPort;
    
    public static void main(String args[])
    {
        try{
        //creating a datagram socket 
        socket = new DatagramSocket(5678);//i intend to leave UDP to get its own free local port
        System.out.println("Server is running at port adress: "+ socket.getLocalPort());
        //creating a buffer for incoming datagrams, remember UDP is connectionless
        buffer = new byte[256];
        while(true) //ther sever must continually receive and make replies to the client
        {
            //create a packet for the incoming datagram, remember it must be empty so that it can accomodate the incoming packet
            inPacket = new DatagramPacket(buffer, buffer.length);
        
            //accept an incoming datagram
            socket.receive(inPacket);
        
            clientAddress = inPacket.getAddress();
            clientPort = inPacket.getPort();
            
            System.out.println("Data received is " + new String(inPacket.getData()));
            //accept the senders address and port from the packet
            
            String message = new String("Hello, Mr. Client");
            outPacket = new DatagramPacket(message.getBytes(),message.length(),clientAddress,clientPort);
            
            //send the response datagram
            socket.send(outPacket);
        
            //close the socket
           // socket.close();
        }
        }catch(SocketException s){System.out.println("Socket: " + s.getMessage());}
        catch(IOException i){System.out.println("IO: " + i.getMessage());}
        finally{if(socket!=null)socket.close();}
    }
    
}
