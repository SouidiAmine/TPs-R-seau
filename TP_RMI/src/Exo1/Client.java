/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo1;

import java.io.*;
import java.rmi.*;
public class Client
{
public static void main (String [] arg) throws IOException
{
        
        // operation = 1: credit, 2: dedit
        //System.setSecurityManager(new RMISecurityManager());
        double valeur = 2.0;
        int operation = 1;
        try {
        CompteInterface cpt= (CompteInterface) Naming.lookup("rmi://localhost:3000"
                                    + "/geeksforgeeks");
        if (operation==1) cpt.crediter(valeur);
        if (operation ==2) cpt.debiter(valeur);
        System.out.println ("Votre solde courant = " +
        cpt.lire_solde() + " euros");
        }catch (Exception e) {
        System.out.println("Erreur d'acces a un objet distant");
        System.out.println(e.toString());
        }
        }
}