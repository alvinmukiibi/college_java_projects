package rmi.Another;

/**
 *
 * @author ALVIN
 */
/*this is the client which gets the reference (a proxy) to the remote object living on the server and invokes its
method to get a message. If the server object implemented java.io.Serializable instead of java.rmi.Remote, it would be serialized and
passed to the client as a value
*/

import java.rmi.Naming;

public class RMIClient {
    public static void main(String args[]) throws Exception {
        RmiServerIntf obj = (RmiServerIntf)Naming.lookup("//localhost/RmiServer");
        System.out.println(obj.getMessage());
    }
}