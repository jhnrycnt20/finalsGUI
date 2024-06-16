/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontdeskdash;

import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wangs
 */
public class editfrontdesk extends javax.swing.JFrame {

    /**
     * Creates new form editfrontdesk
     */
    public editfrontdesk() {
        initComponents();
        table_load2();
    }
 public void table_load2(){
         
         dbConnector dbc = new dbConnector();
    
        try {
            
        
            DefaultTableModel dt = (DefaultTableModel) tabs3.getModel();
            dt.setRowCount(0);
            
            String query = ("SELECT * FROM applicantstab");
            ResultSet rs = dbc.getData(query);
            
            while(rs.next()){
            
                Vector v = new Vector();
                
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));
                v.add(rs.getString(9));            
                v.add(rs.getString(10));
                v.add(rs.getString(11));
                v.add(rs.getString(12)); 
                v.add(rs.getString(13)); 
                
                
                
                dt.addRow(v);
            
            }
       
        
        }catch (SQLException e){
            
            System.out.println(e);
        
        }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabs3 = new javax.swing.JTable();
        apid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        apfirst = new javax.swing.JTextField();
        aplast = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        apmid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        apaddress = new javax.swing.JTextField();
        apemail = new javax.swing.JTextField();
        apcont = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        apyear = new javax.swing.JTextField();
        appads = new javax.swing.JTextField();
        apmads = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        apgend = new javax.swing.JComboBox<>();
        aptype = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        more = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bbl = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        tabs3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Applicants ID", "fname", "lname", "middle_name", "contact_number", "email_address", "address", "mother_name", "father_name", "year_course", "gender", "scholarship_type", "Status"
            }
        ));
        tabs3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabs3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabs3);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 460, 1086, 237);

        apid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apidActionPerformed(evt);
            }
        });
        jPanel1.add(apid);
        apid.setBounds(320, 130, 120, 26);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 130, 17, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("FirstName:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(250, 170, 80, 17);
        jPanel1.add(apfirst);
        apfirst.setBounds(320, 170, 140, 26);
        jPanel1.add(aplast);
        aplast.setBounds(320, 210, 140, 26);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("LastName:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(250, 210, 80, 17);
        jPanel1.add(apmid);
        apmid.setBounds(320, 240, 140, 26);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("MiddleName:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(240, 240, 80, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("ContactNumber:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(210, 280, 110, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Email Address:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(230, 310, 90, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Address:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(260, 340, 60, 17);
        jPanel1.add(apaddress);
        apaddress.setBounds(320, 340, 140, 26);
        jPanel1.add(apemail);
        apemail.setBounds(320, 310, 140, 26);
        jPanel1.add(apcont);
        apcont.setBounds(320, 270, 140, 26);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Mother Name:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(490, 160, 100, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Father Name:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(500, 190, 100, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Year & course:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(490, 220, 100, 17);
        jPanel1.add(apyear);
        apyear.setBounds(580, 220, 140, 26);
        jPanel1.add(appads);
        appads.setBounds(580, 190, 140, 26);
        jPanel1.add(apmads);
        apmads.setBounds(580, 160, 140, 26);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("gender");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(530, 260, 50, 17);

        apgend.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        apgend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apgendActionPerformed(evt);
            }
        });
        jPanel1.add(apgend);
        apgend.setBounds(580, 260, 81, 26);

        aptype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ched", "Unifast", "Smart" }));
        jPanel1.add(aptype);
        aptype.setBounds(580, 300, 80, 26);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Scholarship type");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(470, 300, 110, 17);

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(640, 380, 93, 29);

        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(410, 380, 85, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Registered Applicants");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(400, 20, 259, 29);

        more.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreActionPerformed(evt);
            }
        });
        more.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                moreKeyReleased(evt);
            }
        });
        jPanel1.add(more);
        more.setBounds(750, 30, 150, 26);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Search");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(700, 30, 47, 20);

        bbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/icons8-back-50.png"))); // NOI18N
        bbl.setText("jButton5");
        bbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bblMouseExited(evt);
            }
        });
        bbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bblActionPerformed(evt);
            }
        });
        jPanel1.add(bbl);
        bbl.setBounds(930, 20, 80, 40);

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(520, 380, 93, 29);

        jButton1.setText("Clear");
        jPanel1.add(jButton1);
        jButton1.setBounds(650, 380, 69, 29);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton5.setText("Print");
        jPanel1.add(jButton5);
        jButton5.setBounds(890, 350, 110, 40);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton6.setText("Print All");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(890, 410, 110, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Brown and Beige Blank Notes Landscape A4 Document_1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1090, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabs3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabs3MouseClicked
        int r = tabs3.getSelectedRow();

        String id = tabs3.getValueAt(r, 0).toString();
        String firstname = tabs3.getValueAt(r, 1).toString();
        String lastname = tabs3.getValueAt(r, 2).toString();
        String middlename = tabs3.getValueAt(r, 3).toString();
        String contactnumber = tabs3.getValueAt(r, 4).toString();
        String email = tabs3.getValueAt(r, 5).toString();
        String address = tabs3.getValueAt(r, 6).toString();
        String mothername = tabs3.getValueAt(r, 7).toString();
        String fathername = tabs3.getValueAt(r, 8).toString();
        String year = tabs3.getValueAt(r, 9).toString();
        String gender = tabs3.getValueAt(r, 10).toString();
        String account_type = tabs3.getValueAt(r, 11).toString();
        String stat = tabs3.getValueAt(r, 12).toString();

        apid.setText(id);
        apfirst.setText(firstname);
        aplast.setText(lastname);
        apmid.setText(middlename);
        apcont.setText(contactnumber);
        apemail.setText(email);
        apaddress.setText(address);
        apmads.setText(mothername);
        appads.setText(fathername);
        apyear.setText(year);
        apgend.setSelectedItem(gender);
        aptype.setSelectedItem(account_type);
        

    }//GEN-LAST:event_tabs3MouseClicked

    private void apidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apidActionPerformed

    private void apgendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apgendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apgendActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ids = apid.getText();
        String firstnames = apfirst.getText();
        String lastnames = aplast.getText();
        String middlenames = apmid.getText();
        String contactnum = apcont.getText();
        String emails = apemail.getText();
        String addresss = apaddress.getText();
        String mothername = apmads.getText();
        String fathername = appads.getText();
        String genders = apgend.getSelectedItem().toString();
        String scholarshiptype = aptype.getSelectedItem().toString();
        

        try{
            dbConnector dbc = new dbConnector();

            if(apfirst.getText().isEmpty() || aplast.getText().isEmpty() || apmid.getText().isEmpty()||
                apcont.getText().isEmpty()|| apemail.getText().isEmpty()|| apaddress.getText().isEmpty()||
                apmads.getText().isEmpty()|| appads.getText().isEmpty()|| apyear.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "fields required!");
            }else{
                String query = "UPDATE applicantstab SET fname ='" + firstnames + "', "
                + " lname ='"+lastnames+"', middle_initial ='" + middlenames + "', "
                + " contact_number ='" + contactnum + "',email_address ='" +emails + "', "
                + " adress ='" + addresss + "', mother_name ='" + mothername + "' , "
                + " father_name ='"+ fathername +"', gender='"+ genders +"', "
                + " scholarship_type ='" +scholarshiptype +  "' "
                + " WHERE id ='" + ids + "'";

                dbc.insertData(query);
                JOptionPane.showMessageDialog(null, "Data Updated");

            }

        } catch (Exception e) {
            System.out.println(e);
        }
        table_load2();
     

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    table_load2();         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void moreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moreActionPerformed

    private void moreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_moreKeyReleased
        String name = more.getText();

        dbConnector dbc = new dbConnector();

        try {

            DefaultTableModel dt = (DefaultTableModel) tabs3.getModel();
            dt.setRowCount(0);

            String query = ("SELECT * FROM applicantstab WHERE lname LIKE '%"+name+"%' ");
            ResultSet rs = dbc.getData(query);

            while(rs.next()){

                Vector v = new Vector();

                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));
                v.add(rs.getString(9));
                v.add(rs.getString(10));
                v.add(rs.getString(11));
                v.add(rs.getString(12));
                 v.add(rs.getString(13));

                dt.addRow(v);

            }

        }catch (Exception e){

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_moreKeyReleased

    private void bblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bblMouseEntered
        bbl.setBackground(Color.red);
    }//GEN-LAST:event_bblMouseEntered

    private void bblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bblMouseExited
        bbl.setBackground(Color.white);
    }//GEN-LAST:event_bblMouseExited

    private void bblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bblActionPerformed
        dashfront ads = new dashfront();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bblActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         apid.setText("");
           aplast.setText("");
           apfirst.setText("");
           apmid.setText("");
           apcont.setText("");
           apemail.setText("");
           apaddress.setText("");
           apmads.setText("");
           appads.setText("");
           apyear.setText("");
           apgend.setSelectedItem("");
           aptype.setSelectedItem("");
                
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
        
            tabs3.print(JTable.PrintMode.FIT_WIDTH);
            
        }catch(Exception e){
        
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(editfrontdesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editfrontdesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editfrontdesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editfrontdesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editfrontdesk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apaddress;
    private javax.swing.JTextField apcont;
    private javax.swing.JTextField apemail;
    private javax.swing.JTextField apfirst;
    private javax.swing.JComboBox<String> apgend;
    private javax.swing.JTextField apid;
    private javax.swing.JTextField aplast;
    private javax.swing.JTextField apmads;
    private javax.swing.JTextField apmid;
    private javax.swing.JTextField appads;
    private javax.swing.JComboBox<String> aptype;
    private javax.swing.JTextField apyear;
    private javax.swing.JButton bbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField more;
    private javax.swing.JTable tabs3;
    // End of variables declaration//GEN-END:variables
}
