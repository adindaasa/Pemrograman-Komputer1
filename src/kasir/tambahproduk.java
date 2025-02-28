/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package kasir;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author LABKOM
 */
public class tambahproduk extends javax.swing.JDialog {
    private String selectedImagePath = null;
    /**
     * Creates new form TambahProduk
     */
    public tambahproduk(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        viewCategory("product_category", jComboBox1);
        viewCategory("supplier", jComboBox2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        gambar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jual = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        beli = new javax.swing.JTextField();
        stok = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("KODE PRODUK");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 21, 129, 33));

        code.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });
        getContentPane().add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 20, 263, 33));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("NAMA PRODUK");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 61, 129, 33));

        nama.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 60, 263, 33));

        gambar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gambar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gambarActionPerformed(evt);
            }
        });
        getContentPane().add(gambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 100, 176, 33));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("GAMBAR PRODUK");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 101, 129, 33));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("KATEGORI  PRODUK");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 140, 129, 33));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("SUPPLIER");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 179, 129, 33));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("HARGA JUAL");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 219, 129, 33));

        jual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(jual, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 218, 263, 33));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("HARGA BELI");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 259, 129, 33));

        beli.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliActionPerformed(evt);
            }
        });
        getContentPane().add(beli, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 258, 263, 33));

        stok.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 298, 263, 33));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("STOK PRODUK");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 299, 129, 33));

        jButton1.setText("Browse...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 100, 81, 34));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 140, 263, 33));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 179, 263, 33));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 338, 435, 10));

        jButton2.setText("SIMPAN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 366, 86, -1));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void gambarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gambarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gambarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Pilih Gambar");
        int x = jfc.showOpenDialog(this);
        if (x == JFileChooser.APPROVE_OPTION) {
            File f = jfc.getSelectedFile();
            gambar.setText(f.getAbsolutePath());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            Connection K = koneksi.Go();
            String Q = "INSERT INTO products ("
                    + "product_code,"
                    + "product_name,"
                    + "product_image, "
                    + "product_category, "
                    + "product_supplier,"
                    + "product_price_s, "
                    + "product_price_b, "
                    + "product_stock) VALUES (?,?,?,?,?,?,?,?)";
            //System.out.println(Q);
            PreparedStatement ps = K.prepareStatement(Q);
            ps.setString(1, code.getText());
            ps.setString(2, nama.getText());
            ps.setString(3, gambar.getText());
            String[] X = jComboBox1.getSelectedItem().toString().split("-");
            String[] Y = jComboBox2.getSelectedItem().toString().split("-");
            ps.setInt(4, Integer.parseInt(X[0]));
            ps.setInt(5, Integer.parseInt(Y[0]));
            ps.setDouble(6, Double.parseDouble(jual.getText()));
            ps.setDouble(7, Double.parseDouble(beli.getText()));
            ps.setInt(8, Integer.parseInt(stok.getText()));
            ps.executeUpdate();

            ((adminpage)getParent()).viewDataProduct(""); // Refreshing data setelah update
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan");

        } catch (NumberFormatException | SQLException e) {
            //System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeActionPerformed

    private void beliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beliActionPerformed

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
            java.util.logging.Logger.getLogger(tambahproduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tambahproduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tambahproduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tambahproduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                tambahproduk dialog = new tambahproduk(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField beli;
    private javax.swing.JTextField code;
    private javax.swing.JTextField gambar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jual;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField stok;
    // End of variables declaration//GEN-END:variables

private void viewCategory(String tableName, JComboBox cmb){
    try {
        cmb.removeAllItems();
        Connection K = koneksi.Go();
            Statement S = K.createStatement();
            String Q = "SELECT * FROM "+tableName;
            ResultSet R = S.executeQuery(Q);
//            int n = 1;
            while (R.next()) {                 
                int id = R.getInt("id");                 	 	 	 	 	 	 	 	
                String name = R.getString("name");
//                String desc = R.getString("description");
                cmb.addItem(id+"-"+name);                 
            }
    } catch (SQLException e) {
        System.err.println("ErrorCode: 1123"+e.getMessage());
    }
}

//private void saveProduct() {
//    try {
//        String productCode = code.getText();
//        String productName = nama.getText();
//        String imagePath = gambar.getText();
//        String category = jComboBox1.getSelectedItem().toString();
//        String supplier = jComboBox2.getSelectedItem().toString();
//        double sellingPrice = Double.parseDouble(jual.getText());
//        double buyingPrice = Double.parseDouble(beli.getText());
//        int stock = Integer.parseInt(stok.getText());
//
//        Connection conn = koneksi.Go();
//        String sql = "INSERT INTO products (product_code, product_name, image_path, category, supplier, selling_price, buying_price, stock) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
//        PreparedStatement pstmt = conn.prepareStatement(sql);
//        pstmt.setString(1, productCode);
//        pstmt.setString(2, productName);
//        pstmt.setString(3, imagePath);
//        pstmt.setString(4, category);
//        pstmt.setString(5, supplier);
//        pstmt.setDouble(6, sellingPrice);
//        pstmt.setDouble(7, buyingPrice);
//        pstmt.setInt(8, stock);
//
//        int affectedRows = pstmt.executeUpdate();
//        if (affectedRows > 0) {
//            JOptionPane.showMessageDialog(this, "Product added successfully!");
//            this.dispose();
//        } else {
//            JOptionPane.showMessageDialog(this, "Failed to add product.");
//        }
//
//        pstmt.close();
//        conn.close();
//    } catch (SQLException | NumberFormatException e) {
//        JOptionPane.showMessageDialog(this, "Error saving product: " + e.getMessage());
//    }
//}
}
