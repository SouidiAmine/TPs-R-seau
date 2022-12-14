/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo5;

/**
 *
 * @author ASUS
 */
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
public class Serveur {
    public static void main (String[] argv) {
    try {
        Registry registry
                = LocateRegistry.createRegistry(3000);
        Scanner s = new Scanner(System.in);
        System.out.println("Entrez votre nom et appuyez sur Entrée:");
        String name=s.nextLine().trim();
 
        Chat server = new Chat(name);  
 
        
        Naming.bind("rmi://localhost:3000"
                            + "/chat",
                        server);
 
        System.out.println("[System] Le CHAT est prêt:");
 
        while(true){
          String msg = s.nextLine().trim();
          if (server.getClient() != null){
            ChatInterface client = server.getClient();
            msg = "["+server.getName()+"] "+msg;
            client.send(msg);
          }  
        }
 
      }catch (Exception e) {
        e.printStackTrace();
      }
  }
    
}
