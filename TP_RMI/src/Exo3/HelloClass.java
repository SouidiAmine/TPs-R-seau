/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo3;

/**
 *
 * @author ASUS
 */
import java.rmi.*;
import java.rmi.server.*;
public class HelloClass extends UnicastRemoteObject 
  implements Hello {
  private String message;
  
  public HelloClass(String msg) throws RemoteException {
    message = msg; }

 
    @Override
    public String sayHello()throws RemoteException {
    
     return message;
    }
    
}
