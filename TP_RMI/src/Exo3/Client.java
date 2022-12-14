/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo3;

/**
 *
 * @author ASUS
 */

import Exo2.*;
import java.io.*;
import java.rmi.*;
public class Client
{
    public static void main(String[] arg) throws IOException{
        System.out.println("Client : ");
      try {
        Hello hello = 
        (Hello) Naming.lookup
                ( "rmi://localhost:3000"
                            + "/tpsys3"
);
        System.out.println(hello.sayHello());
      } catch(Exception e) {
          System.out.println("HelloClient exception: "+e);
      }
    }


}