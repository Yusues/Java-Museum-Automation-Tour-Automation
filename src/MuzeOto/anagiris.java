/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MuzeOto;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class anagiris extends javax.swing.JFrame {

    /**
     * Creates new form anagiris
     */   

    public void personel_listesi(){
        
         Toolkit toolkit = getToolkit();
        Dimension dim = toolkit.getScreenSize();
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        String baslik[] = new String[]{"Personel İsim"};  

        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs;

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/otomasyon3?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();
            
            String sorgu21 = "select * from personalgiris";             
            rs = st.executeQuery(sorgu21);
            
            rs.last();
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    
                    rs.getString("username"),  
                    
                };
                i++;
            }
           
           
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
        
    }
    
    public void uyeler_listesi(){
        
        String baslik[] = new String[]{"İsmi"}; 
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/otomasyon3?useUnicode=true&characterEncoding=UTF-8", "root", "");
                st = con.createStatement();
            
            String sorgu21 = "select * from uyegiris ";             
            rs = st.executeQuery(sorgu21);
            
            rs.last();
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    
                    rs.getString("username"),  
                    
                };
                i++;
            }
           
            table_uyeler.setModel(new DefaultTableModel(data, baslik));
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
        
    }
    
    
    public anagiris() {
        initComponents();
        
        uyeler_listesi();
        
        personel_listesi();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_ara = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_uyeler = new javax.swing.JTable();
        btn_ara = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_uyesil = new javax.swing.JButton();
        btn_cikis = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Üye Ara");

        table_uyeler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_uyeler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_uyelerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_uyeler);

        btn_ara.setText("ÜYE ARA");
        btn_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_araActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MuzeOto/resimler/nav-save.png"))); // NOI18N
        jButton3.setText("Yeni Üye Ekle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btn_uyesil.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_uyesil.setForeground(new java.awt.Color(255, 0, 0));
        btn_uyesil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MuzeOto/resimler/Delete.jpg"))); // NOI18N
        btn_uyesil.setText("Üye Sil");
        btn_uyesil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uyesilActionPerformed(evt);
            }
        });

        btn_cikis.setBackground(new java.awt.Color(255, 0, 0));
        btn_cikis.setText("ÇIKIŞ");
        btn_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("TUR SİL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Tur Ekle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_uyesil, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txt_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btn_ara)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cikis)
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btn_cikis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_uyesil, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Üyeler", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Anasayfa");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Turi_ekle te = new Turi_ekle();
        te.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Tur_Sil te = new Tur_Sil();
          te.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisActionPerformed
        anagiris ac = new anagiris();
        ac.setVisible(false);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cikisActionPerformed

    private void btn_uyesilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uyesilActionPerformed

        int row = table_uyeler.getSelectedRow();
        String secim_yap= table_uyeler.getValueAt(row,0).toString();

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/otomasyon3?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            String sorgu21 = "delete from uyegiris where username='"+secim_yap+"'";

            st.executeUpdate(sorgu21);

            JOptionPane.showMessageDialog(null," " + " seçilen üye silinmiştir");

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }

        uyeler_listesi();
    }//GEN-LAST:event_btn_uyesilActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Uye_Kaydi ac = new Uye_Kaydi();
        ac.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_araActionPerformed

        String uye_ara = txt_ara.getText();

        String baslik[] = new String[]{"username"};

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/otomasyon3?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            String sorgu21 = "select * from uyegiris where username like '%"+uye_ara+"%'";

            rs = st.executeQuery(sorgu21);

            rs.last();
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{

                    rs.getString("username"),

                };
                i++;
            }

            table_uyeler.setModel(new DefaultTableModel(data, baslik));

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_araActionPerformed

    private void table_uyelerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_uyelerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_uyelerMouseClicked

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
            java.util.logging.Logger.getLogger(anagiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(anagiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(anagiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(anagiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new anagiris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ara;
    private javax.swing.JButton btn_cikis;
    private javax.swing.JButton btn_uyesil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable table_uyeler;
    private javax.swing.JTextField txt_ara;
    // End of variables declaration//GEN-END:variables
}
