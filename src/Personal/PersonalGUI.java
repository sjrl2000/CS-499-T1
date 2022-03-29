/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Personal;

import static Personal.LoginGUI.allPeople;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ehear
 */
public class PersonalGUI extends javax.swing.JFrame {

    /**
     * Creates new form UserDataGUI
     */
    public PersonalGUI() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        Object rowData[] = new Object[allPeople.size() + 1];
        
        for(int i = 0; i < allPeople.size(); i++){
            rowData[i] = null;
            model.addRow(rowData);
        }
        
        for(int i = 0; i < allPeople.size(); i++){
            userTable.setValueAt(allPeople.get(i).getID(), i, 0);
            userTable.setValueAt(allPeople.get(i).getFirstName(), i, 1);
            userTable.setValueAt(allPeople.get(i).getMiddleName(), i, 2);
            userTable.setValueAt(allPeople.get(i).getLastName(), i, 3);
            userTable.setValueAt(allPeople.get(i).getAddress(), i, 4);
            userTable.setValueAt(allPeople.get(i).getCity(), i, 5);
            userTable.setValueAt(allPeople.get(i).getState(), i, 6);
            userTable.setValueAt(allPeople.get(i).getZipcode(), i, 7);
            userTable.setValueAt(allPeople.get(i).getPhoneNumber(), i, 8);
            userTable.setValueAt(allPeople.get(i).getCellPhoneNumber(), i, 9);
            userTable.setValueAt(allPeople.get(i).getPayRate(), i, 10);
            userTable.setValueAt(allPeople.get(i).getYearsWithCompany(), i, 11);
            userTable.setValueAt(allPeople.get(i).getWorkAssignment(), i, 12);
            userTable.setValueAt(allPeople.get(i).getWorkPosition(), i, 13);
            userTable.setValueAt(allPeople.get(i).getUserName(), i, 14);
            userTable.setValueAt(allPeople.get(i).getUserPassword(), i, 15);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        goBack = new javax.swing.JButton();
        returnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "F Name", "M Name", "L Name", "Address", "City", "State", "ZipCode", "Phone #", "Cell #", "Pay Rate", "Years w/", "Work Assignment", "Work Position", "UserName", "Password"
            }
        ));
        userTable.getTableHeader().setReorderingAllowed(false);
        userTable.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                userTableInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);
        if (userTable.getColumnModel().getColumnCount() > 0) {
            userTable.getColumnModel().getColumn(1).setMaxWidth(100);
            userTable.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        goBack.setText("Go Back");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        returnHome.setText("Home");
        returnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(581, 581, 581)
                        .addComponent(goBack)
                        .addGap(43, 43, 43)
                        .addComponent(returnHome)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBack)
                    .addComponent(returnHome))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        // TODO add your handling code here:
        LoginSuccessGUI goBackToLoginSuccess = new LoginSuccessGUI();
        goBackToLoginSuccess.show();
        dispose();
    }//GEN-LAST:event_goBackActionPerformed

    private void returnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnHomeActionPerformed
        // TODO add your handling code here:
        LoginGUI newMain = new LoginGUI();
        newMain.show();
        dispose();
    }//GEN-LAST:event_returnHomeActionPerformed

    private void userTableInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_userTableInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_userTableInputMethodTextChanged



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton returnHome;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}