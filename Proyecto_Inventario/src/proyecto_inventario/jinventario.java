/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_inventario;
import java.io.*;
import java.lang.*;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.*;
/**
 *
 * @author ferzo
 */
public class jinventario extends javax.swing.JFrame {

    /**
     * Creates new form jinventario
     * 
     */
    public jinventario(){
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonagregar = new javax.swing.JButton();
        botonquitar = new javax.swing.JButton();
        botonmodificar = new javax.swing.JButton();
        botonver = new javax.swing.JButton();
        botonreabastecer = new javax.swing.JButton();
        botonserializar = new javax.swing.JButton();
        botonactualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo = new DefaultListModel();
        listaproductos = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Productos recientes:");

        botonagregar.setText("Agregar");
        botonagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonagregarActionPerformed(evt);
            }
        });

        botonquitar.setText("Quitar");
        botonquitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonquitarActionPerformed(evt);
            }
        });

        botonmodificar.setText("Modificar");
        botonmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmodificarActionPerformed(evt);
            }
        });

        botonver.setText("Ver");
        botonver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonverActionPerformed(evt);
            }
        });

        botonreabastecer.setText("Reabastecer");
        botonreabastecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonreabastecerActionPerformed(evt);
            }
        });

        botonserializar.setText("Guardar Cambios");
        botonserializar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonserializarActionPerformed(evt);
            }
        });

        botonactualizar.setText("Actualizar");
        botonactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonactualizarActionPerformed(evt);
            }
        });

        listaproductos.setModel(modelo);
        jScrollPane1.setViewportView(listaproductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonactualizar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonagregar)
                    .addComponent(botonreabastecer)
                    .addComponent(botonmodificar)
                    .addComponent(botonquitar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonver, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonserializar))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(19, 19, 19)
                        .addComponent(botonagregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonquitar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonmodificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonreabastecer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonserializar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmodificarActionPerformed
        if(listaproductos.isSelectionEmpty()){
            jmodificar ventanamod = new jmodificar();
           ventanamod.setVisible(true);
        }
    }//GEN-LAST:event_botonmodificarActionPerformed

    private void botonagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonagregarActionPerformed
       jagregar ventanaagregar = new jagregar();
       ventanaagregar.setVisible(true);
       
    }//GEN-LAST:event_botonagregarActionPerformed

    private void botonactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonactualizarActionPerformed
        modelo.clear();
        for(int x=0; x<SharedData.datos.getListaprod().size();x++){
           modelo.addElement(SharedData.datos.getListaprod().get(x).getNom());
           
        }
    }//GEN-LAST:event_botonactualizarActionPerformed

    private void botonquitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonquitarActionPerformed
        List valores;
        if(listaproductos.isSelectionEmpty()){
            jquitar ventanaquitar = new jquitar();
            ventanaquitar.setVisible(true);        
    }//GEN-LAST:event_botonquitarActionPerformed
        else{
            valores= listaproductos.getSelectedValuesList();
            for(int x=0 ; x<valores.size(); x++){
                for(int y=0; y<SharedData.datos.getListaprod().size();y++){
                    if(valores.get(x).equals(SharedData.datos.getListaprod().get(y).getNom())){
                        SharedData.datos.removeProducto(y);
                }
            }
        } 
    }
    }
    private void botonverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonverActionPerformed
        jverdetalle ventanadetalle = new jverdetalle();
        ventanadetalle.setVisible(true);
    }//GEN-LAST:event_botonverActionPerformed

    private void botonreabastecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonreabastecerActionPerformed
        jreabastecer ventanareabastecer = new jreabastecer();
        ventanareabastecer.setVisible(true);
    }//GEN-LAST:event_botonreabastecerActionPerformed

    private void botonserializarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonserializarActionPerformed
        try{
         
         ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("listaprod.ser"));
         out.writeObject(SharedData.datos.getListaprod());
         out.close();
         
       }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }//GEN-LAST:event_botonserializarActionPerformed
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jinventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jinventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jinventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jinventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jinventario().setVisible(true);
            }
        });
    }
    private ArrayList<Producto> listaprod;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonactualizar;
    private javax.swing.JButton botonagregar;
    private javax.swing.JButton botonmodificar;
    private javax.swing.JButton botonquitar;
    private javax.swing.JButton botonreabastecer;
    private javax.swing.JButton botonserializar;
    private javax.swing.JButton botonver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaproductos;
    private DefaultListModel modelo;
    // End of variables declaration//GEN-END:variables
}
