/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.time;

/**
 *
 * @author ALVIN
 */
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
    public static void main(String[] args) throws NotBoundException {
        try {
            String url="rmi://127.0.0.1/time";
            TimeatServer ts=(TimeatServer) Naming.lookup(url);
            // System.out.println(""+ts.showTime() + "Successful return");
        } catch (MalformedURLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
}
/*Client(Client.java) has to specify the url where exactly the server is available that is specified as a string using rmi://IP_ADDRESS/SERVICE_NAME. In the above example it was rmi://127.0.0.1/time.

127.0.0.1 specifies the localhost and time is the service with which we have bound the service in the BindServer.java file.

java.rmi.Naming.lookup() actually looks up for the service with the string specified in it, if it finds a service with the specified string then it returns its object. Using the returned object we are calling remote method showTime().
step 5: compile all the files till now we have create using standard javac command.
*/
