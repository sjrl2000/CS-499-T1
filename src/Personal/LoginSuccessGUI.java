/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Personal;

import Personal.LoginGUI;
import Personal.PersonalGUI;
import Shipping.ShippingGUI;
import Maintenance.MaintenanceGUI;
import Equipment.EquipmentGUI;
import static Personal.LoginGUI.allPeople;
import static Personal.LoginGUI.temp;

/**
 *
 * @author ehear
 */
public class LoginSuccessGUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginSuccess
     */
    public LoginSuccessGUI() {
        initComponents();
        equipmentButton.setVisible(false);
        shippingButton.setVisible(false);
        maintenanceButton.setVisible(false);
        noWorkPositionLabel.setVisible(false);
        userDataButton.setVisible(false);
        customTextLabel.setText("Welcome, " + allPeople.get(temp).getFirstName());
        
        if(allPeople.get(temp).getWorkPosition() == 4 || allPeople.get(temp).getWorkPosition() == 5 || allPeople.get(temp).getWorkPosition() == 6){
            equipmentButton.setVisible(true);
            shippingButton.setVisible(true);
            maintenanceButton.setVisible(true);
            userDataButton.setVisible(true);
        }
        else if(allPeople.get(temp).getWorkPosition() == 3){
            equipmentButton.setVisible(true);
            shippingButton.setVisible(true);
            maintenanceButton.setVisible(true);
        }
        else if(allPeople.get(temp).getWorkPosition() == 2){
            equipmentButton.setVisible(true);
            maintenanceButton.setVisible(true);
        }
        else if(allPeople.get(temp).getWorkPosition() == 1){
            shippingButton.setVisible(true);
        }
        else
        {
            noWorkPositionLabel.setVisible(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        equipmentButton = new javax.swing.JButton();
        shippingButton = new javax.swing.JButton();
        maintenanceButton = new javax.swing.JButton();
        customTextLabel = new javax.swing.JLabel();
        noWorkPositionLabel = new javax.swing.JLabel();
        userDataButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        equipmentButton.setText("Equipment Data");
        equipmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipmentButtonActionPerformed(evt);
            }
        });

        shippingButton.setText("Shipping Data");
        shippingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shippingButtonActionPerformed(evt);
            }
        });

        maintenanceButton.setText("Maintenance Data");
        maintenanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintenanceButtonActionPerformed(evt);
            }
        });

        customTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customTextLabel.setToolTipText("");
        customTextLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        noWorkPositionLabel.setText("You do not have a work position in the system, consult an admin to continue");

        userDataButton.setText("User Data");
        userDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDataButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(noWorkPositionLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(170, 170, 170))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(customTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(userDataButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(shippingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(equipmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(maintenanceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(141, 141, 141))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(customTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipmentButton)
                    .addComponent(userDataButton))
                .addGap(18, 18, 18)
                .addComponent(shippingButton)
                .addGap(18, 18, 18)
                .addComponent(maintenanceButton)
                .addGap(18, 18, 18)
                .addComponent(noWorkPositionLabel)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LoginGUI newMain = new LoginGUI();
        newMain.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void equipmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipmentButtonActionPerformed
        // TODO add your handling code here:
        EquipmentGUI goToEquipmentGUI = new EquipmentGUI();
        goToEquipmentGUI.show();
        dispose();
    }//GEN-LAST:event_equipmentButtonActionPerformed

    private void shippingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shippingButtonActionPerformed
        // TODO add your handling code here:
        ShippingGUI goToShippingGUI = new ShippingGUI();
        goToShippingGUI.show();
        dispose();
    }//GEN-LAST:event_shippingButtonActionPerformed

    private void maintenanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintenanceButtonActionPerformed
        // TODO add your handling code here:
        MaintenanceGUI goToMaintenanceGUI = new MaintenanceGUI();
        goToMaintenanceGUI.show();
        dispose();
    }//GEN-LAST:event_maintenanceButtonActionPerformed

    private void userDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDataButtonActionPerformed
        // TODO add your handling code here:
        PersonalGUI goToUserDataGUI = new PersonalGUI();
        goToUserDataGUI.show();
        dispose();
    }//GEN-LAST:event_userDataButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customTextLabel;
    private javax.swing.JButton equipmentButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton maintenanceButton;
    private javax.swing.JLabel noWorkPositionLabel;
    private javax.swing.JButton shippingButton;
    private javax.swing.JButton userDataButton;
    // End of variables declaration//GEN-END:variables
}