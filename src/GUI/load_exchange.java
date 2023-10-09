/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.DBMS;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Madushanka
 */
public class load_exchange extends javax.swing.JFrame {

    /**
     * Creates new form grn
     */
    public load_exchange() {
        initComponents();
        loadVehi();
        loadTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    String l_id = "0";
    String qty = "0";
    DecimalFormat df = new DecimalFormat("#.00");
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(200, 200, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Exchange Product", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 20), new java.awt.Color(0, 0, 204))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(200, 200, 242));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Vehicle Detailes", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 15), new java.awt.Color(0, 51, 153)))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setText("Vehicle");

        jComboBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox7.setToolTipText("");
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel19.setText("F");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel20.setText("T");

        jComboBox8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox8.setToolTipText("");
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Date");

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(95, 95, 95)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Category", "Name", "Weight", "Box In Qty", "BOX", "Unbox Qty", "Qty", "Exchange Box", "Exchange Unbox"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
        }

        jButton3.setBackground(new java.awt.Color(0, 204, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Exchange");
        jButton3.setContentAreaFilled(false);
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refresh.png"))); // NOI18N
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code her
        
        loadVehi();
        loadTable();
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
        loadTable();
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //loading
        try {
            if(jDateChooser1.getDate()!=null){
                String ex_f = jComboBox7.getSelectedItem().toString();
                String ex_t = jComboBox8.getSelectedItem().toString();
            if(!ex_f.equals(ex_t)){
                int rc = jTable1.getRowCount();
             SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
             String date = sdf.format(jDateChooser1.getDate());
             for(int x = 0;x<rc;x++){
                String b = "Balance stock";
                String e = "Exchange";
                ResultSet rs8 = DBMS.search("SELECT * FROM st_info WHERE `type`='"+b+"' AND `vehicle_f`='"+ex_f+"' AND `date`='"+date+"' ");
            if(rs8.next()==false){
            DBMS.iud("INSERT INTO st_info(`vehicle_f`,`vehicle_t`,`type`,`date`) VALUES ('"+ex_f+"','"+ex_f+"','"+b+"','"+date+"')");
            ResultSet rs9 = DBMS.search("SELECT * FROM st_info WHERE `type`='"+b+"' AND `vehicle_f`='"+ex_f+"' AND `date`='"+date+"' ");
            String b_s_id = "0";
            if(rs9.next()){
                b_s_id = rs9.getString("id");
            }
            ResultSet rs10 = DBMS.search("SELECT * FROM loading WHERE `vehicle_num`='"+ex_f+"' ");
            while(rs10.next()){
            String st_id = rs10.getString("stock_id");
            String q = rs10.getString("qty");
            DBMS.iud("INSERT INTO st_details(`st_info_id`,`stock_id`,`qty`) VALUES ('"+b_s_id+"','"+st_id+"','"+q+"')");
            }
            }
            ResultSet rs12 = DBMS.search("SELECT * FROM st_info WHERE `type`='"+b+"' AND `vehicle_f`='"+ex_t+"' AND `date`='"+date+"' ");
            if(rs12.next()==false){
            DBMS.iud("INSERT INTO st_info(`vehicle_f`,`vehicle_t`,`type`,`date`) VALUES ('"+ex_t+"','"+ex_t+"','"+b+"','"+date+"')");
            ResultSet rs9 = DBMS.search("SELECT * FROM st_info WHERE `type`='"+b+"' AND `vehicle_f`='"+ex_t+"' AND `date`='"+date+"' ");
            String b_s_id = "0";
            if(rs9.next()){
                b_s_id = rs9.getString("id");
            }
            ResultSet rs10 = DBMS.search("SELECT * FROM loading WHERE `vehicle_num`='"+ex_t+"' ");
            while(rs10.next()){
            String st_id = rs10.getString("stock_id");
            String q = rs10.getString("qty");
            DBMS.iud("INSERT INTO st_details(`st_info_id`,`stock_id`,`qty`) VALUES ('"+b_s_id+"','"+st_id+"','"+q+"')");
            }
            }
             String b_q = jTable1.getValueAt(x, 8).toString();
             String ub_q = jTable1.getValueAt(x, 9).toString();
             if(!b_q.equals("0")|!ub_q.equals("0")){
             String p_id = jTable1.getValueAt(x, 0).toString();
             ResultSet rs = DBMS.search("SELECT * FROM loading WHERE `vehicle_num`='"+ex_t+"' AND `stock_id`='"+p_id+"' ");
             if(rs.next()){
             String n_qty = rs.getString("qty");
            String biq = jTable1.getValueAt(x, 4).toString();
            Double d_t_bq = Double.valueOf(b_q);
            Double d_t_ubq = Double.valueOf(ub_q);
            Double d_n_qt = Double.valueOf(n_qty);
            Double d_biq = Double.valueOf(biq);
            Double d_all_q = 0.00;
            d_all_q += d_n_qt+d_t_ubq;
            d_all_q += d_t_bq*d_biq;
            int y = d_all_q.intValue();
            String l_id = jTable1.getValueAt(x, 0).toString();
            DBMS.iud("UPDATE loading SET `qty`='"+String.valueOf(y)+"' WHERE `stock_id`='"+p_id+"' AND `vehicle_num`='"+ex_t+"'");
            ResultSet rs10 = DBMS.search("SELECT * FROM st_info WHERE `type`='"+e+"' AND `vehicle_f`='"+ex_f+"' AND `date`='"+date+"' ");
            if(rs10.next()==false){
            DBMS.iud("INSERT INTO st_info(`vehicle_f`,`vehicle_t`,`type`,`date`) VALUES ('"+ex_f+"','"+ex_t+"','"+e+"','"+date+"')");
            }
            ResultSet rs11 = DBMS.search("SELECT * FROM st_info WHERE `type`='"+e+"' AND `vehicle_f`='"+ex_f+"' AND `date`='"+date+"' ");
            String l_s_id = "";
            if(rs11.next()){
                l_s_id = rs11.getString("id");
            }
            Double qq = d_t_bq*d_biq+d_t_ubq;
            int q = qq.intValue();
            DBMS.iud("INSERT INTO st_details(`st_info_id`,`stock_id`,`qty`) VALUES ('"+l_s_id+"','"+p_id+"','"+String.valueOf(q)+"')");
            ResultSet rs1 = DBMS.search("SELECT * FROM loading WHERE `vehicle_num`='"+ex_f+"' AND `stock_id`='"+p_id+"' ");
            if(rs1.next()){
                String sn_qty = rs1.getString("qty");
                Double d_sn_qt = Double.valueOf(sn_qty);
                Double xx = d_t_bq*d_biq;
                        xx+=d_t_ubq;
                Double aa = d_sn_qt-xx;
                int yy = aa.intValue();
                DBMS.iud("UPDATE loading SET `qty`='"+String.valueOf(yy)+"' WHERE `stock_id`='"+p_id+"' AND `vehicle_num`='"+ex_f+"'");
                
            }
             }
             }
             }
             loadTable();
            }else{
             JOptionPane.showMessageDialog(this, "Please Select Exchange To Vehicle", "Loading", JOptionPane.INFORMATION_MESSAGE);
             }
            }else{
             JOptionPane.showMessageDialog(this, "Please Select Date", "Loading", JOptionPane.INFORMATION_MESSAGE);
             }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox8ActionPerformed

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
            java.util.logging.Logger.getLogger(load_exchange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(load_exchange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(load_exchange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(load_exchange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new load_exchange().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

public void loadVehi(){
    try{
ResultSet rs = DBMS.search("SELECT * FROM vehicle");
jComboBox7.removeAllItems();
jComboBox8.removeAllItems();
          
          while (rs.next()) {              
              String name = rs.getString("number");
              jComboBox7.addItem(name);
              jComboBox8.addItem(name);
          }
      } catch (Exception e) {
          System.out.println(e);
      }
}

public void loadTable(){
   if(jComboBox7.getItemCount()!=0){
    try {
          String v_id = jComboBox7.getSelectedItem().toString();
          ResultSet rs4 = DBMS.search("SELECT * FROM loading WHERE `vehicle_num`='"+v_id+"' ORDER BY CAST(`stock_id` AS unsigned) ASC");
          TableModel tm = jTable1.getModel(); 
          DefaultTableModel dtm = (DefaultTableModel) tm;
          dtm.setRowCount(0);
          
          
          while (rs4.next()) {
              String p_id = rs4.getString("stock_id");
              ResultSet rs = DBMS.search("SELECT * FROM stock WHERE `id`='"+p_id+"'");
              Vector<String> v = new Vector<>();
              
              v.add(p_id);
              
              if(rs.next()){
              ResultSet rs2 = DBMS.search("SELECT `name` FROM category WHERE `id`='"+rs.getString("cate_id")+"'");
              if(rs2.next()){
                  v.add(rs2.getString("name"));
              }
              v.add(rs.getString("name"));
              v.add(rs.getString("weight"));
              v.add(rs.getString("qty_i_b"));
              String qt = rs4.getString("qty");
              String q_i_b = rs.getString("qty_i_b");
              Double x1 = Double.valueOf(qt);
              Double y1 = Double.valueOf(q_i_b);
              Double xy = x1/y1;
              int xy1 = xy.intValue();
              v.add(String.valueOf(xy1));
              Double xy2 = Double.valueOf(xy1);
              Double xy3 = xy2*y1;
              Double xy4 = x1-xy3;
              int xy5 = xy4.intValue();
              v.add(String.valueOf(xy5));
              v.add(qt);

              }
              v.add("0");
              v.add("0");
              dtm.addRow(v);
          }
      } catch (Exception e) {
          System.out.println(e);
      }
   }
}
}
