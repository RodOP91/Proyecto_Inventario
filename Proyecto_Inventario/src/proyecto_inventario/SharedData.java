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
public class SharedData {
    public         
            SharedData(){
                listaprod = new ArrayList<Producto>();
            }            
            void setListaprod(ArrayList<Producto> listaprod){
                this.listaprod = listaprod;
            }
            
            void addProducto(Producto p){
                this.listaprod.add(p);
            }
            
            void removeProducto(int index){
                this.listaprod.remove(index);
            }
            ArrayList<Producto> getListaprod(){
                return this.listaprod;
            }
            static SharedData datos = new SharedData();
    private
            
            ArrayList<Producto> listaprod;
}
