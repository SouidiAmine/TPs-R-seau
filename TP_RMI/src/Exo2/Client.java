/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo2;

/**
 *
 * @author ASUS
 */

import java.io.*;
import java.rmi.*;
public class Client
{
public static void main (String [] arg) throws IOException
{
        
        // operation = 1: credit, 2: dedit
        //System.setSecurityManager(new RMISecurityManager());
       System.out.println("Client : ");
        try {
        Display cpt= (Display) Naming.lookup("rmi://localhost:3000"
                                    + "/tpsys");
        
        System.out.println("la division de 20 / 10 = "+cpt.division(20, 10));
        System.out.println("la somme de 20 + 10 = "+cpt.somme(20, 10));
        System.out.println("le produit de 20 * 10 = "+cpt.produit(20, 10));
        }catch (Exception e) {
        System.out.println("Erreur d'acces a un objet distant");
        System.out.println(e.toString());
        }
        
}

}