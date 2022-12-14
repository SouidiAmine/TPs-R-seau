/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Exo4;

/**
 *
 * @author ASUS
 */
public interface eEventLogger extends java.rmi.Remote {
    void makeNote(String note) throws java.rmi.RemoteException;
    String getList() throws java.rmi.RemoteException ;
    
}
