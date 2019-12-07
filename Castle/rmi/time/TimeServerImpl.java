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
import java.rmi.server.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TimeServerImpl extends UnicastRemoteObject implements TimeatServer{
    public TimeServerImpl() throws Exception {
 
    }
 
    public String showTime() throws RemoteException {
        Calendar calendar = new GregorianCalendar();
    String am_pm;
    int hour = calendar.get(Calendar.HOUR);
    int minute = calendar.get(Calendar.MINUTE);
    int second = calendar.get(Calendar.SECOND);
    if(calendar.get(Calendar.AM_PM) == 0)
      am_pm = "AM";
    else
      am_pm = "PM";
    return "Current Time : " + hour + ":"
+ minute + ":" + second + " " + am_pm;
    }
}