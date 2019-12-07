package sequencer;

import java.io.*;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class History {

    public static ArrayList history = null;  
    //the arraylist gonna store all recent messages, a stipulated number
    public static File file = new File("History.txt"); 
    //file from which we gonna read the files
    private static final int maxSize = 5; 
    //set maximum number of messages in the arraylist

    public static void main(String args[]) {
        try {
            Scanner input = new Scanner(file); 
            //scanner for reading from the text file
            String msg = input.nextLine();
            History hist = new History();  
            hist.storeInList(msg);  
            //call function to store the read messages into the arraylist
        } catch (FileNotFoundException ex) {
            System.out.printf("error", ex);
        }
    }

    public void storeInList(String msg) {
        history = new ArrayList();  //our arraylist object
        String allMsgs[] = msg.split(", ");  
        //spilt the entire string of messages from the text file into constituent messages
        for (String allMsg : allMsgs) {   
            //for each message
            if (history.size() >= maxSize) {  
                //if size exists our maximum size
                history.add(allMsg);    
                //add message on top
                history.remove(maxSize);    
                //remove the last one, this way we ensure arraylist never exceeds size, it also ensures obsolete messages are replaced with newer messages
            } else {
                history.add(allMsg);
            }
        }
        Iterator<String> itr = history.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("The size of the ArrayList is " + history.size() + " and "
                + "the total number of \nmessages in the History "
                + "File is " + allMsgs.length + " meaning we "
                + "discarded " + (allMsgs.length - history.size()) + " obsolete "
                + "messages");
    }

   
}

