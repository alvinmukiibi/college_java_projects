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
import java.rmi.*;
public interface TimeatServer extends Remote{
    public String showTime() throws RemoteException;
}