package apotiknusantara;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormObat extends javax.swing.JFrame {

    Connection Conz;
    String MainDbs = "nusantara";
    DefaultTableModel Mod;

    ClassObat Ob;
    ClassSupplier Sup;
    ArrayList<ClassObat> Obat;
    ArrayList<ClassSupplier> Supplier;

    public FormObat() {
        initComponents();
        LoadSupplier();
        LoadObat();
        Disabler();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idobat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        namaobat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kategori = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        hargaobat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        suppliers = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        stoks = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelob = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Back to Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("ID Obat");

        jLabel2.setText("Nama Obat");

        jLabel3.setText("Kategori");

        kategori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Kapsul", "Ampul", "Botol", "Sachet", "Tablet", "Strip" }));

        jLabel4.setText("Harga Obat");

        jLabel5.setText("Supplier");

        jLabel6.setText("Stok Obat");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(idobat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(hargaobat, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(suppliers, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                        .addComponent(namaobat, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(kategori, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(stoks, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hargaobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stoks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_add)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_add)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tabelob.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelob);

        jButton3.setText("Search");

        jButton4.setText("Edit");

        btn_cancel.setText("Cancel");

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cancel)
                                .addGap(18, 18, 18)
                                .addComponent(btn_delete)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(btn_cancel)
                    .addComponent(btn_delete))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Disabler(){
        idobat.setEditable(false);
        btn_cancel.setVisible(false);
    }

    private void LoadSupplier(){
        Supplier = new ArrayList<>();
        String SqlSup = "SELECT * FROM supplier";
        try{
            Conz = (Connection) apotiknusantara.Connector.Connect(MainDbs);
            PreparedStatement Ps = Conz.prepareStatement(SqlSup);
            ResultSet Res = Ps.executeQuery();
            while(Res.next()){
                Sup = new ClassSupplier(
                        Integer.parseInt(Res.getString("id_supplier")),
                        Res.getString("nama"),
                        Res.getString("alamat"),
                        Res.getString("telpon")
                );
                Supplier.add(Sup);
            }
            suppliers.removeAllItems();
            suppliers.addItem("");
            for(int sp = 0; sp < Supplier.size(); sp++){
                suppliers.addItem(Supplier.get(sp).getNamaSupp());
            }
        } catch(SQLException Ex) {}
    }

    private void LoadObat(){
        Obat = new ArrayList<>();
        String SqlOb = "SELECT * FROM obat";
        try{
            Conz = (Connection) apotiknusantara.Connector.Connect(MainDbs);
            PreparedStatement Ps = Conz.prepareStatement(SqlOb);
            ResultSet Res = Ps.executeQuery();
            while(Res.next()){
                Ob = new ClassObat(
                        Integer.parseInt(Res.getString("id_obat")),
                        Integer.parseInt(Res.getString("stok")),
                        Integer.parseInt(Res.getString("id_supplier")),
                        Integer.parseInt(Res.getString("harga")),
                        Res.getString("nama"),
                        Res.getString("kategori")
                );
                Obat.add(Ob);
            } ShowTable();
        } catch(SQLException Ex) {}
    }

    private void ShowTable(){
        Mod = new DefaultTableModel();
        Object[] Col = {"Nama Obat", "Kategori", "Supplier", "Harga", "Stok"};
        Mod.setColumnIdentifiers(Col);
        tabelob.setModel(Mod);
        Object[] Rows;
        for(int ob = 0; ob < Obat.size(); ob++){
            Rows = new Object[5];
            Rows[0] = Obat.get(ob).getNamaObat();
            Rows[1] = Obat.get(ob).getKategori();
            int idSup = Obat.get(ob).getIdSupp();
            for(int sp = 0; sp < Supplier.size(); sp++){
                int Supp = Supplier.get(sp).getIdSupp();
                if(Supp == idSup){
                    Rows[2] = Supplier.get(sp).getNamaSupp();
                }
            }
            Rows[3] = Obat.get(ob).getHargaObat();
            Rows[4] = Obat.get(ob).getStok();
            Mod.addRow(Rows);
        }
    }

    private void AddObat(){
        int Supp = suppliers.getSelectedIndex() - 1;
        String SqlAdd = "INSERT INTO obat (nama, kategori, harga, stok, id_supplier) " +
                "VALUES ('" + namaobat.getText() + "', '" + kategori.getSelectedItem() +
                "', " + hargaobat.getText() + ", " + stoks.getText() + ", " +
                Supplier.get(Supp).getIdSupp() + ")";
        try{
            Conz = (Connection) apotiknusantara.Connector.Connect(MainDbs);
            PreparedStatement Pre = Conz.prepareStatement(SqlAdd);
            Pre.execute();
            JOptionPane.showMessageDialog(null,"Data Obat Berhasil Ditambahkan");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }

    private void ClearText(){
        idobat.setText(null);
        namaobat.setText(null);
        hargaobat.setText(null);
        stoks.setText(null);
        kategori.setSelectedIndex(0);
        suppliers.setSelectedIndex(0);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        if(namaobat.getText().equals("") || hargaobat.getText().equals("")
                || stoks.getText().equals("") || kategori.getSelectedIndex() == 0
                || suppliers.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Data Obat Belum Lengkap");
            return;
        }
        AddObat();
        ClearText();
        LoadObat();
    }//GEN-LAST:event_btn_addActionPerformed

    private void DeleteData(int Row){
        int Colz = tabelob.getColumnCount();
        String idDel, namaDel;
        if(Colz == 5){
            idDel = Integer.toString(Obat.get(Row).getIdObat());
            namaDel = Obat.get(Row).getNamaObat();
        } else {
            idDel = tabelob.getModel().getValueAt(Row, 0).toString();
            namaDel = tabelob.getModel().getValueAt(Row, 1).toString();
        }
        String SqlDel = "DELETE FROM obat WHERE id_obat=" + idDel;
        int OptDelete = JOptionPane.showConfirmDialog(null,
                "Yakin Ingin Menghapus " + namaDel + "?", "Hapus Data",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(OptDelete == JOptionPane.YES_OPTION){
            try{
                Conz = (Connection) apotiknusantara.Connector.Connect(MainDbs);
                PreparedStatement Pre = Conz.prepareStatement(SqlDel);
                Pre.execute();
                JOptionPane.showMessageDialog(null, namaDel + " Telah Dihapus");
                LoadObat();
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null,ex.toString());
            }
        } else {
            setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        }
    }

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        int Selected = tabelob.getSelectedRow();
        if(Selected >= 0){
            DeleteData(Selected);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    public static void main(String args[]) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new FormObat().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_delete;
    private javax.swing.JTextField hargaobat;
    private javax.swing.JTextField idobat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JComboBox kategori;
    private javax.swing.JTextField namaobat;
    private javax.swing.JTextField stoks;
    private javax.swing.JComboBox suppliers;
    private javax.swing.JTable tabelob;
    // End of variables declaration//GEN-END:variables
}
