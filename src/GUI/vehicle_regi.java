/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.DBMS;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Madushanka
 */
public class vehicle_regi extends javax.swing.JFrame {

    /**
     * Creates new form cusregistration
     */
    public vehicle_regi() {
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(200, 200, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Vehicle Registration", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 20), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("ID");

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Number");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 102, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Save");
        jButton3.setContentAreaFilled(false);
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 51, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.setContentAreaFilled(false);
        jButton4.setOpaque(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refresh.png"))); // NOI18N
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/search.png"))); // NOI18N
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addGap(253, 253, 253))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addGap(202, 202, 202))
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(73, 73, 73))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3)
                .addGap(60, 60, 60)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addGap(52, 52, 52)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            jTextField3.setEditable(true);
            jTextField3.setText("");
            jTextField3.grabFocus();
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        String text = jTextField3.getText();
        char c = evt.getKeyChar();
        if(text.length()!=12){
                if(!Character.isDigit(c)){
                    evt.consume();
                }

        }else{
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String id = jTextField3.getText();
        String number = jTextField1.getText();
        ResultSet rs1 = DBMS.search("SELECT * FROM vehicle WHERE `id`='"+id+"' AND `number`='"+number+"' ");
        try{
            if(!id.isEmpty()){
                if (rs1.next()==false) {
                    DBMS.iud("INSERT INTO vehicle(`id`,`number`) VALUES('"+id+"','"+number+"')");
                    JOptionPane.showMessageDialog(this, "Vehicle Add", "Success", JOptionPane.INFORMATION_MESSAGE);
                    loadTable();
                    jTextField3.setText("");
                    jTextField3.grabFocus();
                    jTextField1.setText("");
                }else{
                    JOptionPane.showMessageDialog(this, "This Id Allredy Use", "Add Vehicle", JOptionPane.INFORMATION_MESSAGE);
                    jTextField3.setText("");
                    jTextField3.grabFocus();
                }
            }else{
                JOptionPane.showMessageDialog(this, "Please Enter Id", "Add Vehicle", JOptionPane.INFORMATION_MESSAGE);
                jTextField3.setText("");
                jTextField3.grabFocus();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String id = jTextField3.getText();
        String name = jTextField1.getText();
        try{
            DBMS.iud("UPDATE vehicle SET `number`='"+name+"' WHERE `id`='"+id+"'");
            JOptionPane.showMessageDialog(this, "Update Vehicle Details", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadTable();
            jTextField3.setEditable(true);
            jTextField3.setText("");
            jTextField3.grabFocus();
            jTextField1.setText("");
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if(row!=-1){
            String id = jTable1.getValueAt(row, 0).toString();
            DBMS.iud("DELETE FROM vehicle WHERE `id`='"+id+"'");
            JOptionPane.showMessageDialog(this, "Delete Selected Vehicle", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadTable();
        }else{
            JOptionPane.showMessageDialog(this, "Please Select Vehicle", "Delete Vehicle", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            int row = jTable1.getSelectedRow();
            String id = jTable1.getValueAt(row, 0).toString();
            String name = jTable1.getValueAt(row, 1).toString();
            jTextField3.setText(id);
            jTextField3.setEditable(false);
            jTextField1.setText(name);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        loadTable();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        String text = jTextField2.getText();
        char c = evt.getKeyChar();
        if(text.length()!=12){
                if(!Character.isDigit(c)){
                    evt.consume();
                }

        }else{
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String id = jTextField2.getText();
        ResultSet rs1 = DBMS.search("SELECT * FROM vehicle WHERE `id`='"+id+"' ");
        TableModel tm = jTable1.getModel();
        DefaultTableModel dtm = (DefaultTableModel) tm;
        dtm.setRowCount(0);
        try{
            if(!id.isEmpty()){
                if(rs1.next()==true){
                    Vector<String> v = new Vector<>();
                    v.add(rs1.getString("id"));
                    v.add(rs1.getString("number"));
                    dtm.addRow(v);
                }else{
                    JOptionPane.showMessageDialog(this, "Invalid Id", "Search Vehicle", JOptionPane.INFORMATION_MESSAGE);
                    jTextField2.setText("");
                    jTextField2.grabFocus();
                    loadTable();
                }
            }else{
                JOptionPane.showMessageDialog(this, "Please Enter Id", "Search Vehicle", JOptionPane.INFORMATION_MESSAGE);
                jTextField2.setText("");
                jTextField2.grabFocus();
                loadTable();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vehicle_regi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vehicle_regi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vehicle_regi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vehicle_regi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vehicle_regi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
public void loadTable(){
    try{
    ResultSet rs1 = DBMS.search("SELECT * FROM vehicle");
        TableModel tm = jTable1.getModel();
        DefaultTableModel dtm = (DefaultTableModel) tm;
        dtm.setRowCount(0);
         
          while (rs1.next()) {              
              Vector<String> v = new Vector<>();
              v.add(rs1.getString("id"));
              v.add(rs1.getString("number"));
              
          dtm.addRow(v);
          }
    }catch(Exception e){
        System.out.println(e);
    }
}
}
