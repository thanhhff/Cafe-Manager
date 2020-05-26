/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.BanHang;

import Models.Ban;
import Models.ChiTietHD;
import Models.HoaDon;
import Models.ThucDon;
import Mysql.ConnectSQL;

import java.util.ArrayList;
import javax.swing.JRootPane;

public class DLSoLuong extends javax.swing.JDialog {
    ConnectSQL cn = new ConnectSQL();
    int sl = 0;
    ArrayList<ThucDon> arrThucDon;
    public String gioden, mamon, TenBan;
    public int maban;
    ChiTietHD mon;
    /**
     * Creates new form NewJDialog
     */

    /**
     * Creates new form NewJDialog
     *
     * @param parent
     * @param modal
     * @param MaMon
     * @param tenban
     * @param MaBan
     */
    public DLSoLuong(java.awt.Frame parent, boolean modal, String MaMon, String tenban, int MaBan) {
        super(parent, modal);
        initComponents();
        JRootPane rp = this.getRootPane();
        rp.setDefaultButton(btnXacNhan);
        mamon = MaMon;
        TenBan = tenban;
        maban = MaBan;
        Fill();
        mon = cn.GetDsChiTiet(MaMon, MaBan);
        if (mon != null) {
            txtgia.setText(String.valueOf(mon.GetGia()));
            txtSl.setText(String.valueOf(mon.GetSoLuong()));

        }


    }

    private void Fill() {
        arrThucDon = cn.GetThucDonByMa(mamon);
        txtSl.setText("1");
        lblban.setText(TenBan + " ");

        lblTenMon.setText(arrThucDon.get(0).GetTenMon());
        lblDVT.setText(arrThucDon.get(0).GetDVT());
        txtgia.setText(String.valueOf(arrThucDon.get(0).GetDonGia()));
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
        lblTenMon = new javax.swing.JLabel();
        lblDVT = new javax.swing.JLabel();
        txtSl = new javax.swing.JTextField();
        btnXacNhan = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblban = new javax.swing.JLabel();
        txtgia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(140, 140, 6));
        setLocation(new java.awt.Point(500, 200));
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 40, 50)));

        lblTenMon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTenMon.setForeground(new java.awt.Color(0, 40, 50));
        lblTenMon.setText("Cà phê sữa");

        lblDVT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDVT.setText("Ly");

        txtSl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSlKeyReleased(evt);
            }
        });

        btnXacNhan.setBackground(new java.awt.Color(0, 40, 50));
        btnXacNhan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnXacNhan.setText("Đồng ý");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(0, 40, 50));
        btnHuy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/tru(-).png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/Cong(+).png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 40, 50));
        jLabel1.setText("Số lượng:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 40, 50));
        jLabel3.setText("Giá:");

        lblban.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblban.setForeground(new java.awt.Color(0, 40, 50));
        lblban.setText("Bàn1");

        txtgia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtgiaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(jLabel3))
                                                                .addGap(17, 17, 17))
                                                        .addComponent(btnXacNhan, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(txtSl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(lblDVT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(38, 38, 38)
                                                                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblban)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblTenMon)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTenMon)
                                        .addComponent(lblban))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtSl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblDVT)
                                                .addComponent(jLabel1)))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnHuy, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                        .addComponent(btnXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        sl = Integer.parseInt(txtSl.getText());
        if (sl < 30) {
            sl++;
            txtSl.setText(String.valueOf(sl));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            sl = Integer.parseInt(txtSl.getText());
            if (sl != 1 && sl != 0) {
                sl--;
                txtSl.setText(String.valueOf(sl));
            }
        } catch (Exception e) {
            txtSl.setText("1");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        if (cn.GetMaHD(maban) == 0) {
            HoaDon hd = new HoaDon();
            hd.SetMaBan(maban);

            hd.SetTrangThai(0);
            //JOptionPane.showMessageDialog(null, gioden);
            int insertHd = cn.InsertHoaDon(hd, gioden);
        }

        if (mon != null) {
            ChiTietHD ct = new ChiTietHD();
            ct.SetGia(Integer.parseInt(txtgia.getText()));
            ct.SetSoLuong(Integer.parseInt(txtSl.getText()));
            ct.SetMaChiTietHD(mon.GetMaChiTietHD());
            int updatect = cn.UpdateChiTiet(ct);
        }
        if (mon == null) {
            ChiTietHD cthd = new ChiTietHD();
            cthd.SetGia(Integer.parseInt(txtgia.getText()));
            cthd.SetMaHD(cn.GetMaHD(maban));
            cthd.SetMaMon(mamon);
            cthd.SetSoLuong(Integer.parseInt(txtSl.getText()));
            int isertCtHD = cn.InsertChiTietHD(cthd);
        }

        Ban b = new Ban();
        b.SetTrangThai("Đang phục vụ");
        b.SetTenBan(TenBan);
        b.SetMaBan(maban);
        int updateban = cn.UpdateBan(b);

        jpBanHang.bh.FillBan();
        jpBanHang.bh.updateUI();
        JpGoiMon.gm.fillDsMon(cn.GetMaHD(maban));
        JpGoiMon.gm.updateUI();

        this.dispose();
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void txtSlKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSlKeyReleased
        try {
            sl = Integer.parseInt(txtSl.getText());
            if (txtSl.getText().equals("0") || sl > 30)
                txtSl.setText("1");
        } catch (Exception e) {
            txtSl.setText("1");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtSlKeyReleased

    private void txtgiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgiaKeyReleased
        try {
            Integer.parseInt(txtgia.getText());

        } catch (Exception e) {
            txtgia.setText(String.valueOf(arrThucDon.get(0).GetDonGia()));
        }
        if (txtgia.getText().equals("0")) {
            txtgia.setText(String.valueOf(arrThucDon.get(0).GetDonGia()));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtgiaKeyReleased

    private boolean flag;
    private int x, y;

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        if (flag) {
            this.setLocation(evt.getXOnScreen() - x, evt.getYOnScreen() - y);
        }
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        flag = true;
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        flag = false;
    }//GEN-LAST:event_formMouseReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDVT;
    private javax.swing.JLabel lblTenMon;
    private javax.swing.JLabel lblban;
    private javax.swing.JTextField txtSl;
    private javax.swing.JTextField txtgia;
    // End of variables declaration//GEN-END:variables
}
