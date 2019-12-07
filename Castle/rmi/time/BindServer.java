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
//In this step we have to bind the server implementation of the service with the service name
/*In the above file we are binding the AddServerImpl object with the service name of “time”.
java.rmi.Naming.bind() function binds the service name with the service object.
*/
import java.rmi.*;
import java.rmi.server.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BindServer {
    public static void main(String[] args) {
        try {
            TimeServerImpl tsi= new TimeServerImpl();
            Naming.bind("time", tsi);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}