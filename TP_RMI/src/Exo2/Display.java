/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Exo2;

/**
 *
 * @author ASUS
 */
public interface Display  extends java.rmi.Remote{
    double somme(double x , double y)throws java.rmi.RemoteException;
    double Differance(double x , double y)throws java.rmi.RemoteException;
    double produit(double x , double y)throws java.rmi.RemoteException;
    double division(double x , double y)throws java.rmi.RemoteException;
    void print()throws java.rmi.RemoteException;
}
