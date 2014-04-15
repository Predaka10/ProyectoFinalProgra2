/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uia.proyectofinal.View;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import uia.proyectofinal.Bussines.IS12Bussines;
import uia.proyectofinal.Conecciones.MySQLDB;
import uia.proyectofinal.Domain.Issue;

/**
 *
 * @author Bryan
 */
public class InternalIssues extends javax.swing.JInternalFrame {

    private MySQLDB mysql;
    
    public InternalIssues() throws SQLException {
        initComponents();
         Login log = new Login();
        lblNombre.setText(log.getUser());
       lblPuesto.setText(log.getPuesto());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescrip = new javax.swing.JTextField();
        btnAsignarIssue = new javax.swing.JButton();
        btnEliminarIssue = new javax.swing.JButton();
        btnModificarIssue = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPuesto = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Descripción :");

        btnAsignarIssue.setText("Asignar Issue");
        btnAsignarIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarIssueActionPerformed(evt);
            }
        });

        btnEliminarIssue.setText("Eliminar Issue");
        btnEliminarIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarIssueActionPerformed(evt);
            }
        });

        btnModificarIssue.setText("Modificar Issue");
        btnModificarIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarIssueActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre:");

        lblNombre.setText("jLabel5");

        jLabel6.setText("Puesto:");

        lblPuesto.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnAsignarIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificarIssue, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(lblNombre)
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(lblPuesto)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblNombre)
                    .addComponent(jLabel6)
                    .addComponent(lblPuesto))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAsignarIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarIssueActionPerformed
     try {
        
        Issue issue = new Issue();
        IS12Bussines is12B = new IS12Bussines();
        issue.setNombre(txtNombre.getText());
        issue.setDescripcion(txtDescrip.getText());
  
         is12B.addIssue(issue);
        } catch (SQLException ex) {
            Logger.getLogger(InternalIssues.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAsignarIssueActionPerformed

    private void btnEliminarIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarIssueActionPerformed
     try {   
        
        Issue issue = new Issue();
        IS12Bussines is12B = new IS12Bussines();
        issue.setNombre(txtNombre.getText());
        issue.setDescripcion(txtDescrip.getText());
      
            is12B.deleteIssue(issue);
        } catch (SQLException ex) {
            Logger.getLogger(InternalIssues.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarIssueActionPerformed

    private void btnModificarIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarIssueActionPerformed
       try {   
        
        Issue issue = new Issue();
        IS12Bussines is12B = new IS12Bussines();
        issue.setNombre(txtNombre.getText());
        issue.setDescripcion(txtDescrip.getText());
      
            is12B.updateIssue(issue);
            
        } catch (SQLException ex) {
            Logger.getLogger(InternalIssues.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModificarIssueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarIssue;
    private javax.swing.JButton btnEliminarIssue;
    private javax.swing.JButton btnModificarIssue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JTextField txtDescrip;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
