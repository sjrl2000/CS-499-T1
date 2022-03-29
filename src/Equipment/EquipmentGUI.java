/*
 * Author: Sebastian Rivera
 * Referenced from PersonalData by Nathan Eheart
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Equipment;

import Personal.LoginSuccessGUI;
import Personal.LoginGUI;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;


public class EquipmentGUI extends javax.swing.JFrame 
{

    
    public EquipmentGUI() {
        initComponents();
        
        String sIncoming = System.getProperty("user.dir") + "\\src\\Equipment\\" + "EquipmentCSV.csv";
        File IncomingFile = new File(sIncoming);
        try(Scanner sc = new Scanner(IncomingFile)) // finds the csv file
        {
            sc.nextLine(); // skip first line
            while(sc.hasNext()) // checks if file is empty
            {
                String line = sc.nextLine(); // gets one entire line in .csv
                String[] values = line.split(","); // splits it at the commas
                lines.add(Arrays.asList(values)); // adds it to the list of lists
            }
            for(List<String> line: lines)
            {
                for (String value: line) 
                {
                    // do stuff with line.get(0), line.get(1), line.get(2), ... , line.get(n) for n columns
                    allEquipment.add(new EquipmentData(line.get(0),line.get(1),line.get(2),line.get(3),line.get(4),line.get(5),line.get(6),line.get(7),line.get(8),line.get(9),parseInt(line.get(10)),line.get(11)));
                    break;
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();//equipment table
        Object rowData[] = new Object[allEquipment.size() + 1];
        
        for(int i = 0; i < allEquipment.size(); i++)
        {
            rowData[i] = null;
            model.addRow(rowData);
        }
        
        for(int i = 0; i < allEquipment.size(); i++)
        {
            jTable1.setValueAt(allEquipment.get(i).getMake(), i, 0);
            jTable1.setValueAt(allEquipment.get(i).getModel(), i, 1);
            jTable1.setValueAt(allEquipment.get(i).getVYear(), i, 2);
            jTable1.setValueAt(allEquipment.get(i).getVType(), i, 3);
            jTable1.setValueAt(allEquipment.get(i).getVEngine(), i, 4);
            jTable1.setValueAt(allEquipment.get(i).getVTransm(), i, 5);
            jTable1.setValueAt(allEquipment.get(i).getTotalWeight(), i, 6);
            jTable1.setValueAt(allEquipment.get(i).getFrontWeight(), i, 7);
            jTable1.setValueAt(allEquipment.get(i).getRearWeight(), i, 8);
            jTable1.setValueAt(allEquipment.get(i).getEquipType(), i, 9);
            jTable1.setValueAt(allEquipment.get(i).getVID(), i, 10);
            jTable1.setValueAt(allEquipment.get(i).getOwn(), i, 11);
           
    }
}
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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EquipmentGUI().setVisible(true);
        });
    }    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        goBack = new javax.swing.JButton();
        returnHome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Make", "Model", "Year", "Type", "Engine", "Transmission", "Total Weight(lbs)", "Front Weight(lbs)", "Rear Weight(lbs)", "Equipment Type", "ID", "Date of Ownership"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(returnHome))
                    .addComponent(goBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(goBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(returnHome)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
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
  // all code to read data from .csv and add as new equipment
    List<List<String>> lines = new ArrayList<>();// store the .csv into a lists of lists
    {  
    
    }
    public List returnAllEquipment()
    {
        return allEquipment;
    }      
    
    
     
static List<EquipmentData> allEquipment = new ArrayList <>();
static EquipmentData Sorter = new EquipmentData(null, null, null, null, null, null, null, null, null, null, -1, null);
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton returnHome;
    // End of variables declaration//GEN-END:variables

}