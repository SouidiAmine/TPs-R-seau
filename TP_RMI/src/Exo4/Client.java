/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo4;

/**
 *
 * @author ASUS
 */

import Exo3.*;
import Exo2.*;
import java.io.*;
import java.rmi.*;
public class Client
{
    public static void main(String[] arg) throws IOException{
        System.out.println("Client : ");
      try {
        eEventLogger eventLogger = 
        (eEventLogger) Naming.lookup
                ( "rmi://localhost:3000"
                            + "/Event");
        System.out.println(eventLogger.getList());
      } catch(Exception e) {
          System.out.println("HelloClient exception: "+e);
      }
    }


}