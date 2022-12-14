/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo4;

/**
 *
 * @author ASUS
 */
import java.rmi.*;
import java.rmi.server.*;
public class EventLoggerImpl extends UnicastRemoteObject implements eEventLogger
{
    
    
    private String name;
    
    public EventLoggerImpl(String s) throws RemoteException {
        super();
        name = s;
    }
    
    public void makeNote(String note) throws RemoteException {
        
        
    }

    @Override
    public String getList() throws RemoteException {
     
        return "String" ; 
    }
    
}