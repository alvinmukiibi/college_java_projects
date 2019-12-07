

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author ALVIN
 */
public class Registry {
    public Registry()
    {
        System.out.println("RMI server started");
        try { //special exception handler for registry creation
                LocateRegistry.createRegistry(1099);
                System.out.println("java RMI registry created.");
        } catch (RemoteException e) {
            //do nothing, error means registry already exists
            System.out.println("java RMI registry already exists.");
            
            /*The object registry runs on a known port (1099 by default)
A server, upon starting, registers its objects with a textual name with the object
registry.
A client, before performing invoking a remote method, must first contact the
object registry to obtain access to the remote object*/
    }
    }
    
}
