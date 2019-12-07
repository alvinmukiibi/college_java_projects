/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.Adder;

/**
 *
 * @author ALVIN
 */
import java.rmi.*;  
import java.rmi.server.*;  
public class AdderRemote extends UnicastRemoteObject implements Adder{  
        public AdderRemote()throws RemoteException{  
            super();  
        }  
        public int add(int x,int y){return x+y;}  
}  
