
package Exo1;

import java.rmi.*;
import java.rmi.server.*;
public class Compte extends UnicastRemoteObject implements
CompteInterface
{
    private double solde;
public Compte(double s) throws java.rmi.RemoteException
{
super();
solde=s;
}
    @Override
    public void crediter(double montant)
throws java.rmi.RemoteException
{
solde=solde+montant;
}
    @Override
    public void debiter(double montant)
throws java.rmi.RemoteException
{
solde=solde-montant;
}
    @Override
    public double lire_solde()
throws java.rmi.RemoteException
{
return solde;
}
    
}

