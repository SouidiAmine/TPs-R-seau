/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo3;

import Exo2.*;
import Exo1.Compte;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Serveur {
public static void main(String[] args)
{
    //System.setSecurityManager(new RMISecurityManager());
    //System.setProperty("java.security.policy","C:\\Users\\ASUS\\Documents\\NetBeansProjects\\TP_RMI\\build\\classes\\Exo1\\fichier.policy");
        try {
            Registry registry
                = LocateRegistry.createRegistry(3000);
 
           
            
                System.out.println("Serveur : Construction de l’implémentation");
                
                System.out.println("Objet Compte enregistré dans RMIregistry");
                Naming.bind("rmi://localhost:3000"
                            + "/tpsys3",
                        new HelloClass("Hello, world!"));
                //Naming.rebind("rmi://localhost:3000", cpt);
                System.out.println("Attente des invocations des clients ");
        }
        catch (Exception e) {
        System.out.println("Erreur de liaison de l'objet Distante");
        System.out.println(e.toString());
        }
        } // fin du main
} 


// fin de la classe
