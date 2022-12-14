/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ASUS
 */
public class Calcule extends UnicastRemoteObject implements Display{
    
    public Calcule () throws RemoteException{
        super();
    }

    @Override
    public double somme(double x, double y) throws RemoteException
    {
      return x + y ;
    }

    @Override
    public double Differance(double x, double y) throws RemoteException 
    {
        return x - y ; 
    }

    @Override
    public double produit(double x, double y) throws RemoteException
    {
        return x * y ;
    }

    @Override
    public double division(double x, double y) throws RemoteException
    {
        if (y != 0 ){
          return (x / y);  
        }
        System.out.println("Warning denominator == 0  ");
        return 0 ;
        
    }

    @Override
    public void print() throws RemoteException {
        System.out.println("Exo2.Calcule.print()");
    }
    
    
}
