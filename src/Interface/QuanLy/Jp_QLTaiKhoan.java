/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.QuanLy;

import Interface.Run;
import Models.TaiKhoan;
import Mysql.ConnectSQL;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.table.DefaultTableModel;


public class Jp_QLTaiKhoan extends javax.swing.JPanel {
    ConnectSQL cn = new ConnectSQL();
    /**
     * Creates new form Jp_QLNhanVien
     */
    public static Jp_QLTaiKhoan tk;

    public Jp_QLTaiKhoan() {
        initComponents();
        tk = this;
        FillTable();
    }

    public void FillTable() {
        ArrayList<TaiKhoan> arrTable = cn.GetTaiKhoan();
        DefaultTableModel tbmodel = new DefaultTableModel();

        tbmodel.addColumn("ID");
        tbmodel.addColumn("Tên tài khoản");
        tbmodel.addColumn("Mật khẩu");
        tbmodel.addColumn("Level");

        if (arrTable != null) {
            int soban = 0;
            for (TaiKhoan b : arrTable) {
                soban++;
                tbmodel.addRow(new Object[]{b.GetID(), b.Gettdn(), b.Getmk(), b.GetLv()});
            }
            lblthongtin.setText(String.valueOf(soban) + " tài khoản");
        } else {
            JOptionPane.showMessageDialog(null, "Không có tài khoản !");
        }
        tbBan.setModel(tbmodel);
        for (int i = 0; i < tbBan.getColumnCount(); i++) {
            Class<?> col = tbBan.getColumnClass(i);
            tbBan.setDefaultEditor(col, null);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBan = new javax.swing.JTable();
        bntThem = new javax.swing.JButton();
        bntSua = new javax.swing.JButton();
        bntXoa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblthongtin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 40, 50));

        tbBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbBan);

        bntThem.setBackground(new java.awt.Color(56, 25, 15));
        bntThem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntThem.setForeground(new java.awt.Color(255, 255, 255));
        bntThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/add.png"))); // NOI18N
        bntThem.setText("Thêm");
        bntThem.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bntThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntThemActionPerformed(evt);
            }
        });

        bntSua.setBackground(new java.awt.Color(56, 25, 15));
        bntSua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntSua.setForeground(new java.awt.Color(255, 255, 255));
        bntSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/edit.png"))); // NOI18N
        bntSua.setText("Sửa");
        bntSua.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bntSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSuaActionPerformed(evt);
            }
        });

        bntXoa.setBackground(new java.awt.Color(56, 25, 15));
        bntXoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntXoa.setForeground(new java.awt.Color(255, 255, 255));
        bntXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/delete.png"))); // NOI18N
        bntXoa.setText("Xóa");
        bntXoa.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bntXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntXoaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(114, 79, 43));
        jLabel3.setText("Quản lý tài khoản");

        lblthongtin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblthongtin.setForeground(new java.awt.Color(153, 0, 0));
        lblthongtin.setText("Total");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(114, 79, 43));
        jLabel2.setText("Tổng số tài khoản");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 322, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(lblthongtin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntThem, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntSua, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bntThem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntSua, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(lblthongtin))
                .addGap(272, 272, 272))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbBanMouseClicked

    private void bntThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntThemActionPerformed
        DL_Them_TaiKhoan ban = new DL_Them_TaiKhoan(Run.QlCafe, true);
        ban.setVisible(true);
    }//GEN-LAST:event_bntThemActionPerformed

    private void bntSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSuaActionPerformed
        int select = tbBan.getSelectedRow();
        if (select < 0) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn !");
        } else {
            int MaBan = (int) tbBan.getValueAt(select, 0);
            DL_Sua_TaiKhoan sua = new DL_Sua_TaiKhoan(Run.QlCafe, true, MaBan);
            sua.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_bntSuaActionPerformed

    private void bntXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntXoaActionPerformed
        int[] selectedRows = tbBan.getSelectedRows();

        if (selectedRows.length <= 0) {
            JOptionPane.showMessageDialog(null, "Bạn chưa tài khoản !");
        } else {
            ArrayList<Integer> ListMaBan = new ArrayList<Integer>();
            String sp = "";
            for (int i : selectedRows) {
                int ma = (int) tbBan.getValueAt(i, 0);
                ListMaBan.add(ma);
                String tenban = (String) tbBan.getValueAt(i, 1);

                sp += tenban + "\n";
            }
            int qs;
            qs = JOptionPane.showConfirmDialog(null, "Xóa tài khoản: \n " + sp, "Xóa tài khoản", JOptionPane.YES_NO_OPTION);
            if (qs == JOptionPane.YES_OPTION) {
                boolean xoa = cn.DeleteTaiKhoan(ListMaBan);

                if (xoa == true) {
                    FillTable();

                } else
                    JOptionPane.showMessageDialog(null, "Không xóa được tài khoản !");

            }
        }
    }//GEN-LAST:event_bntXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSua;
    private javax.swing.JButton bntThem;
    private javax.swing.JButton bntXoa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblthongtin;
    private javax.swing.JTable tbBan;
    // End of variables declaration//GEN-END:variables
}
