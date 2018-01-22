/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.AdvertisingAgencyManagerRole;

import Business.BiddingPlatform.AdvertisingStrategyDirectory;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author prat
 */
public class AdvertisingAgencyWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private AdvertisingStrategyDirectory advertisingStrategyDirectory; 
    /**
     * Creates new form AdvertisingAgencyWorkAreaJPanel
     */
    public AdvertisingAgencyWorkAreaJPanel(JPanel upc,Enterprise e) {
        initComponents();
        this.userProcessContainer=upc;
        this.enterprise=e;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addAdStrategyJButton = new javax.swing.JButton();

        addAdStrategyJButton.setText("Add Strategy");
        addAdStrategyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdStrategyJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(addAdStrategyJButton)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(addAdStrategyJButton)
                .addContainerGap(154, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addAdStrategyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdStrategyJButtonActionPerformed
        // TODO add your handling code here:
        AddAdvertisingStrategyJPanel apsj=new AddAdvertisingStrategyJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("manageEmployeeJPanel", apsj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addAdStrategyJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAdStrategyJButton;
    // End of variables declaration//GEN-END:variables
}