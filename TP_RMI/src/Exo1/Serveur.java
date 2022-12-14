package Exo1;

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
                Compte cpt= new Compte(15.50);
                System.out.println("Objet Compte enregistré dans RMIregistry");
                Naming.bind("rmi://localhost:3000"
                            + "/geeksforgeeks",
                        cpt);
                //Naming.rebind("rmi://localhost:3000", cpt);
                System.out.println("Attente des invocations des clients ");
        }
        catch (Exception e) {
        System.out.println("Erreur de liaison de l'objet Compte");
        System.out.println(e.toString());
        }
        } // fin du main
} 


// fin de la classe
