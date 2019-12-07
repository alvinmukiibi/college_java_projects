package sequencer;

import java.net.*;
import java.io.*;
import java.rmi.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Group implements Runnable {

    public static int port = 7777, ttl = 1;
    public static String groupIPAddress = "234.27.7.95";
    public static MulticastSocket socket;
    public static byte[] buffer;
    public static DatagramPacket inPacket;
    public static MsgHandlerImpl handler = null;
    public static byte[] msg = null;

    public Group(String host, MsgHandlerImpl handler, String senderName) {
        try {
            socket = new MulticastSocket(port);
            //socket to receive multicast messages from the sequencer

            Sequencer obj = (Sequencer) Naming.lookup("//localhost/Sequencer"); //instantiate sequencer via rmi using the name on which it bound itself
            SequencerJoinInfo inf = obj.join(host);
            //an rmi invocation to receive group multicast address
            socket.joinGroup(inf.addr); //client socket joining the group on its address
            Group.handler = handler;    //initialise the handler to use in the thread

            (new Thread(this, "Data thread")).start();
            //create a thread to listen on socket, thread code is in method run

        } catch (IOException ex) {
            Logger.getLogger(Group.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(Group.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SequencerException ex) {
            Logger.getLogger(Group.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        try {
            buffer = new byte[256];
            inPacket = new DatagramPacket(buffer, buffer.length);
            socket.receive(inPacket);
            //receive incoming multicast messages from Sequencer
            Group.msg = inPacket.getData();//get byte format of incoming packet
            handler.handle(msg.length, msg);//hand the receieved message to the Message handler
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void send(byte[] msg) {
        try {
            Sequencer obj = (Sequencer) Naming.lookup("//localhost/Sequencer");
            String str = new String(msg);
            String[] strArr = str.split(" ");  //split message received from client into constituents for special treatment
            byte[] msgStr = strArr[0].getBytes();
            String idStr = strArr[1];
            String seq = strArr[2];
            long msgID = Long.valueOf(idStr);
            long msgSeq = Long.valueOf(seq);
            obj.send(groupIPAddress, msgStr, msgID, msgSeq);//an rmi invocation to the sequencer object to send the message multicastingly

        } catch (NotBoundException ex) {
            Logger.getLogger(Group.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Group.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Group.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void leave() {
        try {

            Sequencer obj = (Sequencer) Naming.lookup("//localhost/Sequencer");
            obj.leave(groupIPAddress);

        } catch (NotBoundException ex) {
            Logger.getLogger(Group.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Group.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Group.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public interface MsgHandler {

        public void handle(int count, byte[] msg);
    }

    public class GroupException extends Exception {

        public GroupException(String s) {
            super(s);
        }
    }

    public class HeartBeater extends Thread {
    }
}
/*
...........................................
    DISTRIBUTED SYSTEMS PROJECT
    BACHELOR OF SCIENCE IN SOFTWARE ENGINEERING
    THIRD YEAR SEMESTER TWO
    DR. JONAH KIZITO
    FEBRUARY - MARCH 2018
...........................................
    MUKIIBI KELLY ALVIN
    RWABWERA SAMUEL
    KWETIZA FRANCIS
    TINDYEBWA DUNCAN
    MUYAMBI JULIUS
...........................................

 */
