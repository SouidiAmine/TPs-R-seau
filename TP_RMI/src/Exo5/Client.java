/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo5;

/**
 *
 * @author ASUS
 */
import java.io.*;
import java.rmi.*;
import java.util.Scanner;
public class Client {
    
     public static void main (String[] argv) {
      try {
          
          Scanner s = new Scanner(System.in);
          System.out.println("Entrez votre nom et appuyez sur Entrée:");
          String name = s.nextLine().trim();                  
          ChatInterface client = new Chat(name);
 
          ChatInterface server = (ChatInterface)Naming.lookup("rmi://localhost:3000"
                            + "/chat");
          String msg = "["+client.getName()+"] s'est connecté";
          server.send(msg);
          System.out.println("[System] Le CHAT est prêt:");
          server.setClient(client);  // set l'interface de chat client pour que le serveur get it 
 
          while(true){
            msg = s.nextLine().trim();
            msg = "["+client.getName()+"] "+msg; 
            
            
            server.send(msg);
          }
 
        }catch (Exception e) {
          e.printStackTrace();
        }
    }
    
}
