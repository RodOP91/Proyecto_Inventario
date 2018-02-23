/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_inventario;
import java.io.*;
import java.util.*;
/**
 *
 * @author ferzo
 */
public class Producto implements Serializable{
    public
            Producto(int id, String nom, String desc, String unidad, float pcompra, float cant){
                this.id = id;
                this.nom = nom;
                this.desc = desc;
                this.unidad= unidad;
                this.pcompra= pcompra;
                this.pventa = (float) ((pcompra*2)*1.16);
                this.cant = cant;
            }
            
            //Setters
            
            void setId(int id){
                this.id = id;
            }            
            void setNom(String nom){
                this.nom = nom;
            }
            void setDesc(String desc){
                this.desc = desc;
            }
            void setUnidad(String unidad){
                this.unidad = unidad;
            }           
            void setPcompra(float pcompra){
                this.pcompra = pcompra;
            }            
            void setPventa(float pcompra){
                this.pventa = (float) ((pcompra*2)*1.16);                
            }            
            void setCant(float cant){
                this.cant = cant;
            }
            void anadirCant(float cant){
                this.cant+=cant;
            }
            
            void calcularNvoprecios(float nvopcompra, float nvacant){
                float loteexistente= (this.cant * this.pcompra), lotenuevo = (nvacant * nvopcompra);
                this.pcompra= ((loteexistente + lotenuevo)/(this.cant+nvacant));
                this.setPventa(this.pcompra);
            }
            
            //Getters
            
            int getId(){
                return this.id;
            }          
            String getNom(){
                return this.nom;
            }           
            String getDesc(){
                return this.desc;
            }           
            String getUnidad(){
                return this.unidad;
            }           
            float getPcompra(){
                return this.pcompra;
            }          
            float getPventa(){
                return this.pventa;
            }            
            float getCant(){
                return this.cant;
            }
    private
            int id;
            String nom;
            String desc;
            String unidad;
            float pcompra;
            float pventa;
            float cant;
            
}
