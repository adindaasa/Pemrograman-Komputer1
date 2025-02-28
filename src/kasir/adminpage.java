/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kasir;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author miqda
 */
public class adminpage extends javax.swing.JFrame {
    Profiluser p;


    /**
     * Creates new form Tampilan_tambah_user
     */
    public adminpage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public adminpage(Profiluser P) {
        initComponents();
        
        this.p = P;
        Labeluser.setText(p.getNama()+ "(" + p.getRole()+ ")");
        viewData("");
        viewDataProduct("");
        
    }
//    private void showProfile() {
//        profil profilFrame = new profil(nama);
//        profilFrame.setName(p.getNama());
//        profilFrame.setAlama(p.getAlamat()); // Pastikan Profiluser memiliki metode getAlamat()
//        profilFrame.setTelepon(p.getTelepon()); // Pastikan Profiluser memiliki metode getTelepon()
//        profilFrame.setTanggalLahir(p.getTanggal_lahir()); // Pastikan Profiluser memiliki metode getTanggalLahir()
//        profilFrame.setVisible(true);
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtWelcome = new javax.swing.JLabel();
        Labeluser = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Tambah = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtkey = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        rfrs = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SearchP = new javax.swing.JTextField();
        jTabel2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Profile = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));

        txtWelcome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtWelcome.setText("WELCOME");

        Logout.setText("Log out");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWelcome)
                    .addComponent(Labeluser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(628, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout)
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Labeluser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(Logout)
                .addGap(14, 14, 14))
        );

        jPanel1.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel6.setPreferredSize(new java.awt.Dimension(818, 80));

        Tambah.setText("Tambah");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });

        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir/img/loupe.png"))); // NOI18N

        txtkey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkeyActionPerformed(evt);
            }
        });
        txtkey.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtkeyKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(txtkey, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(txtkey, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ubah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tambah)
                        .addComponent(ubah)
                        .addComponent(hapus)
                        .addComponent(refresh)))
                .addGap(24, 24, 24))
        );

        jPanel2.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NO", "NAMA", "USERNAME", "PASSWORD", "ROLE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Data User", jPanel2);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));
        jPanel8.setPreferredSize(new java.awt.Dimension(818, 80));

        jButton9.setText("Tambah");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Ubah");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Hapus");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        rfrs.setText("Refresh");
        rfrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfrsActionPerformed(evt);
            }
        });

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir/img/loupe.png"))); // NOI18N
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 37, 40));

        SearchP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchPActionPerformed(evt);
            }
        });
        SearchP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchPKeyReleased(evt);
            }
        });
        jPanel9.add(SearchP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 40));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rfrs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(rfrs))
                .addGap(26, 26, 26))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NO", "ID", "KODE PROMO", "NAMA PROMO", "GAMBAR", "KATEGORI", "SUPPLIER", "HARGA JUAL", "HARGA BELI", "STOK"
            }
        ));
        jTabel2.setViewportView(jTable2);

        jPanel3.add(jTabel2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Data Produk", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 884, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Data Transaksi", jPanel4);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Profile");

        Profile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_TAB, 0));
        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kasir/img/PP.png"))); // NOI18N
        Profile.setText("Profile");
        Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileActionPerformed(evt);
            }
        });
        jMenu1.add(Profile);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        profil profil = new profil(p.getNama(), "dmin");
        profil.setVisible(true);
        this.dispose();
     
    }//GEN-LAST:event_ProfileActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        // TODO add your handling code here:
        tambahdata T = new tambahdata(this, true);
        T.setVisible(true);
    }//GEN-LAST:event_TambahActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void txtkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkeyActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        txtkey.setText(""); 
        viewData("");
    }//GEN-LAST:event_refreshActionPerformed

    private void txtkeyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkeyKeyReleased
        // TODO add your handling code here:
        String key = txtkey.getText();
        String w = "WHERE "
                + "nama LIKE '%"+key+"%' "
                + "OR username LIKE '%"+key+"%' "
                + "OR password LIKE '%"+key+"%' "
                + "OR role LIKE '%"+key+"%'";
        viewData(w);
    }//GEN-LAST:event_txtkeyKeyReleased

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        int n = jTable1.getSelectedRow();
        if(n != -1){
            int id = Integer.parseInt(jTable1.getValueAt(n, 0).toString());
//            JOptionPane.showMessageDialog(this, id); 
            
            int pilihan = JOptionPane.showConfirmDialog(this, 
                    "Apakah Anda yakin untuk menghapus data user ini?",
                    "Hapus Data",JOptionPane.YES_NO_OPTION);
            if(pilihan == 0){
                //yes
                String Q = "DELETE FROM akun WHERE id_akun="+id+" ";
                try {
                    Connection K = koneksi.Go();
                    Statement S = K.createStatement();
                    S.executeUpdate(Q);
                    viewData(""); 
                } catch (Exception e) {
                }
            }else {
                
            }

            
            
        }else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih data"); 
        
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        int n = jTable1.getSelectedRow();
        if (n != -1) {
        int id = Integer.parseInt(jTable1.getValueAt(n, 0).toString());
        String nama = jTable1.getValueAt(n, 2).toString();
        String username = jTable1.getValueAt(n, 3).toString();
        String password = jTable1.getValueAt(n, 4).toString();
        String role = jTable1.getValueAt(n, 5).toString();

        ubahdata U = new ubahdata(this, true);
        U.setId_akun(id);
        U.setName(nama);
        U.setUsername(username);
        U.setPassword(password);
        U.setRole(role);
        U.setVisible(true);
        } else {
        JOptionPane.showMessageDialog(this, "Anda belum memilih data");
        }
    }//GEN-LAST:event_ubahActionPerformed

    private void SearchPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchPActionPerformed

    private void rfrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfrsActionPerformed
        // TODO add your handling code here:
       SearchP.setText("");
       viewDataProduct("");
       
    }//GEN-LAST:event_rfrsActionPerformed

    private void SearchPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchPKeyReleased
        // TODO add your handling code here:
        String key = SearchP.getText();
        String w = "WHERE "
                + "product_name LIKE '%"+key+"%' "
                + "OR product_category LIKE '%"+key+"%' "
                + "OR product_supplier LIKE '%"+key+"%' "
                + "OR product_price_s LIKE '%"+key+"%'";
        
        viewDataProduct(w); 
    }//GEN-LAST:event_SearchPKeyReleased

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        tambahproduk T = new tambahproduk(this, true);
        T.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        int n = jTable2.getSelectedRow();
    if (n != -1) {
        try {
            int id = Integer.parseInt(jTable2.getValueAt(n, 1).toString());
            // Ambil data lainnya...
            ubahproduk E = new ubahproduk(this, true);
            E.setId(id);
            // Set data lainnya...
            E.setVisible(true);
            // Refresh data setelah ubah
            viewDataProduct("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: ID produk tidak valid", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Pilih produk yang akan diubah", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        int n = jTable2.getSelectedRow();
        if (n != -1) {
            String idStr = jTable2.getValueAt(n, 1).toString();

            if (idStr != null && !idStr.isEmpty()) {
                try {
                    int id = Integer.parseInt(idStr);
                    String productName = jTable2.getValueAt(n, 3).toString();

                    int opsi = JOptionPane.showConfirmDialog(this,
                            "Apakah Anda yakin ingin menghapus produk " + productName + "?",
                            "Hapus Produk",
                            JOptionPane.YES_NO_OPTION);
                    if (opsi == JOptionPane.YES_OPTION) {
                        String Q = "DELETE FROM products WHERE id=" + id;

                        try {
                            Connection K = koneksi.Go();
                            Statement S = K.createStatement();
                            S.executeUpdate(Q);
                            viewDataProduct("");
                            JOptionPane.showMessageDialog(this, "Produk " + productName + " telah terhapus");
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(this, "Gagal menghapus data produk");
                        }
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "ID produk tidak valid.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "ID produk kosong atau tidak valid.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih produk.");
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
    this.dispose();
    new login().setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

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
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Labeluser;
    private javax.swing.JButton Logout;
    private javax.swing.JMenuItem Profile;
    private javax.swing.JTextField SearchP;
    private javax.swing.JButton Tambah;
    private javax.swing.JButton hapus;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JScrollPane jTabel2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton refresh;
    private javax.swing.JButton rfrs;
    private javax.swing.JLabel txtWelcome;
    private javax.swing.JTextField txtkey;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables

    void viewData(String where) {
    try {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Mengosongkan table
        
        String sql = "SELECT * FROM akun " + where;
        Connection conn = koneksi.Go();
        Statement stm = conn.createStatement();
        ResultSet res = stm.executeQuery(sql);
        
        int no = 0;
        while(res.next()) {
            no++;
            String[] data = {
                res.getString("id_akun"),
                String.valueOf(no),
                res.getString("nama"),
                res.getString("username"), 
                res.getString("password"),
                res.getString("role")
            };
            model.addRow(data);
        }
        
        jTable1.setModel(model);
        
    } catch (Exception e) {
        System.err.println("Error viewData(): " + e.getMessage());
    }
}
    

    public void viewDataProduct(String where) {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        // Pastikan menggunakan jTable2 sesuai dengan kode sebelumnya
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0); // Cara yang lebih efisien untuk menghapus semua baris

        conn = koneksi.Go();
        stmt = conn.createStatement();
        String sql = "SELECT * FROM products " + where;
        rs = stmt.executeQuery(sql);

        int n = 1;
        while (rs.next()) {
            int id = rs.getInt("id");
            String productCode = rs.getString("product_code");
            String productName = rs.getString("product_name");
            String productImage = rs.getString("product_image");
            int productCategory = rs.getInt("product_category");
            int productSupplier = rs.getInt("product_supplier");
            double productPriceS = rs.getDouble("product_price_s");
            double productPriceB = rs.getDouble("product_price_b");
            int productStock = rs.getInt("product_stock");

            Object[] data = {
                n, id, productCode, productName, productImage,
                productCategory, productSupplier, productPriceS, productPriceB, productStock
            };
            model.addRow(data);
            n++;
        }

        // Sembunyikan kolom ID jika diperlukan
        jTable2.getColumnModel().getColumn(1).setMinWidth(0);
        jTable2.getColumnModel().getColumn(1).setMaxWidth(0);

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, 
            "Error loading product data: " + e.getMessage(), 
            "Database Error", 
            JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    } finally {
        // Tutup resources
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    
    
    }
