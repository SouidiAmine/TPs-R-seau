/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Exo5;

/**
 *
 * @author ASUS
 */
public interface ChatInterface extends java.rmi.Remote{
  public String getName() throws java.rmi.RemoteException;
  public void send(String msg) throws java.rmi.RemoteException;
  public void setClient(ChatInterface c) throws java.rmi.RemoteException;
  public ChatInterface getClient() throws java.rmi.RemoteException;
}
