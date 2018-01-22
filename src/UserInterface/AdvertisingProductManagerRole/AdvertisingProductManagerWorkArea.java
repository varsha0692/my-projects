/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.AdvertisingProductManagerRole;

import Business.Enterprise.AdvertiserEnterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author varsha
 */
public class AdvertisingProductManagerWorkArea extends javax.swing.JPanel {
private JPanel userProcessContainer;
private AdvertiserEnterprise advertiserEnterprise;

    /**
     * Creates new form AdvertisingProductManagerWorkArea
     */
    public AdvertisingProductManagerWorkArea(JPanel upc,AdvertiserEnterprise advertiserEnterprise) {
        initComponents();
        this.userProcessContainer=upc;
        this.advertiserEnterprise=advertiserEnterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addProductJButton = new javax.swing.JButton();
        viewProductsJButton = new javax.swing.JButton();

        addProductJButton.setText("Add Product");
        addProductJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductJButtonActionPerformed(evt);
            }
        });

        viewProductsJButton.setText("View Products");
        viewProductsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProductsJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewProductsJButton)
                    .addComponent(addProductJButton))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(addProductJButton)
                .addGap(30, 30, 30)
                .addComponent(viewProductsJButton)
                .addContainerGap(167, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addProductJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductJButtonActionPerformed
        // TODO add your handling code here:
        AddAdvertiserProductJPanel ap=new AddAdvertiserProductJPanel(userProcessContainer,advertiserEnterprise);
        userProcessContainer.add("AddContentWorkArea", ap);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addProductJButtonActionPerformed

    private void viewProductsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProductsJButtonActionPerformed
        // TODO add your handling code here:
        ViewProductsJPanel vp=new ViewProductsJPanel(userProcessContainer,advertiserEnterprise);
        userProcessContainer.add("ViewProductsJPanel", vp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewProductsJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductJButton;
    private javax.swing.JButton viewProductsJButton;
    // End of variables declaration//GEN-END:variables
}