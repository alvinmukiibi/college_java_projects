/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.Hellotwo;
import java.rmi.*;
/**
 *
 * @author ALVIN
 */
public interface HelloInterface extends Remote{
    public String say(String msg) throws RemoteException;
    
}
