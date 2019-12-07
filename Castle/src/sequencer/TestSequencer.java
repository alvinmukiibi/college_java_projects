package sequencer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.*;

public class TestSequencer {
    public static byte[] buffer;
    public static String group = "234.27.7.95";
    private static final String ALPHA_NUMERIC_STRING = "0123456789"; 
    /*constant string from which we gonna generate unigue message ids to attach 
    to each outgoing message */
    public static byte[] theMsg;
    
    public static void main(String args[]) throws Exception {
        //continuously allow the user to send messages
        while (true) {
            MsgHandlerImpl hand = new MsgHandlerImpl(); 
            //handler gonna help us handle all message related functions
            Group theGroup = new Group(group, hand, "client"); 
            //create an object of Group to allow us join the group, receive message and send message to sequencer
            sendMsg(hand, theGroup);  
            //call the method that sends the message
        }
    }

    public static void sendMsg(MsgHandlerImpl hand, Group theGroup){
        String message = hand.getMessage(); 
        
        //call function that prompts user to enter message string
        String lastseq = getLastSeq(); 
        //call function that gets last seq no for appending to new message
        message = message + " " + randomString(4) + " " + lastseq;  
        //outgoing message concatenation
        buffer = message.getBytes();
        theGroup.send(buffer); 
        //invoke a method of group via its object to send the message to the sequencer
    }
    
    public static String getSeq(String msg) {
        String msgArr[] = msg.split(" ");
        String lastSeq = msgArr[2];
        return lastSeq;
    }
    
    public static  String getLastSeq(){
        File file = new File("History.txt");
        Scanner input = null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestSequencer.class.getName()).log(Level.SEVERE, null, ex);
        }
        String msg = input.nextLine();
        String allMsgs[] = msg.split(", ");
        String topMsg = allMsgs[0];
        String allComps[] = topMsg.split(" ");
        String seq = allComps[2];
        return seq;
    }
   
    /*
    This function builds random strings to attach to the 
    outgoing message as the unique message id, the randomness 
    ensures the uniqueness
    */
    public static String randomString(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();

    }
}
