/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto_inventario;
import java.io.*;
import java.lang.*;
import java.util.*;
/**
 *
 * @author ferzo
 */
public class Proyecto_Inventario {

    /**
     * @param args the command line arguments
     */
   
    SharedData datos = new SharedData();
    public static void main(String[] args) {
        
        try{
            FileInputStream fis = new FileInputStream("listaprod.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            SharedData.datos.setListaprod((ArrayList) ois.readObject());
            ois.close();
            fis.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
            
        }catch(ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
        principal ventanaprincipal = new principal();
        ventanaprincipal.setVisible(true);
    }
    
}
