/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.BanHang;

import Interface.Run;
import Models.Ban;
import Models.DsOrder;
import Models.HoaDon;
import Models.ThucDon;
import Mysql.ConnectSQL;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public final class JpGoiMon extends javax.swing.JPanel {

    String TenBan;
    int MaBan;
    int MaHD, tienmon = 0, tongtien = 0;
    ConnectSQL cn = new ConnectSQL();
    HoaDon arrhd;
    NumberFormat chuyentien = new DecimalFormat("#,###,###");
    ArrayList<DsOrder> order;
    public static JpGoiMon gm;
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm a");

    /**
     * Creates new form JpGoiMon
     *
     * @param trangthai
     * @param tenban
     * @param maban
     */
    public JpGoiMon(String trangthai, String tenban, int maban) {
        initComponents();
        gm = this;
        MaBan = maban;
        TenBan = tenban;

        jpDsMon.setVisible(false);
        jpThongTinThanhToan.setVisible(false);
        jScrollPane1.setVisible(false);

        arrhd = cn.GetHDbyMaBan(maban);
        if (arrhd != null) {
            order = cn.GetDsOrder(arrhd.GetMaHD());
            fillDsMon(0);
            MaHD = arrhd.GetMaHD();
            lblgioden.setText(df.format(arrhd.GetGioDen()));
        }
        lblTenBan.setText(tenban);
        lbltrangthai.setText(trangthai);

        if (lbltrangthai.getText().equals("Trống")) {
            btndatban.setText("Đặt chỗ");
            return;

        }
        if (lbltrangthai.getText().equals("Đã đặt trước")) {
            btndatban.setText("Hủy đặt");
            return;
        }
        if (lbltrangthai.getText().equals("Đang phục vụ")) {
            btndatban.setVisible(false);
            btnthugon.setVisible(false);
            jpThucDon thucdon = new jpThucDon();
            thucdon.tenban = TenBan;
            thucdon.maban = maban;
            jpthucdon.removeAll();
            jpthucdon.add(thucdon);
            jpthucdon.updateUI();
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

        jLabel5 = new javax.swing.JLabel();
        jpThongTinBan = new javax.swing.JPanel();
        lblTenBan = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblgioden = new javax.swing.JLabel();
        lbltrangthai = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btndatban = new javax.swing.JButton();
        btngoi = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jpThongTinThanhToan = new javax.swing.JPanel();
        lbltongtien = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblgiamgia = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbltienmon = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnthugon = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpDsMon = new javax.swing.JPanel();
        jpthucdon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 0));
        jLabel5.setText("Thời gian phục vụ gần nhất");

        setBackground(new java.awt.Color(255, 255, 255));

        jpThongTinBan.setBackground(new java.awt.Color(255, 255, 255));
        jpThongTinBan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpThongTinBan.setAutoscrolls(true);

        lblTenBan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTenBan.setForeground(new java.awt.Color(56, 25, 15));
        lblTenBan.setText("Bàn 1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(114, 79, 43));
        jLabel2.setText("Giờ đến:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(114, 79, 43));
        jLabel3.setText("Trạng thái:");

        lblgioden.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblgioden.setForeground(new java.awt.Color(114, 79, 43));
        lblgioden.setText(".....");

        lbltrangthai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbltrangthai.setForeground(new java.awt.Color(114, 79, 43));
        lbltrangthai.setText("....");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 2));

        btndatban.setBackground(new java.awt.Color(100, 50, 0));
        btndatban.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btndatban.setForeground(new java.awt.Color(255, 255, 255));
        btndatban.setText("Đặt chỗ");
        btndatban.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btndatban.setPreferredSize(new java.awt.Dimension(110, 40));
        btndatban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndatbanActionPerformed(evt);
            }
        });
        jPanel1.add(btndatban);

        btngoi.setBackground(new java.awt.Color(100, 50, 0));
        btngoi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btngoi.setForeground(new java.awt.Color(255, 255, 255));
        btngoi.setText("Gọi món");
        btngoi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btngoi.setPreferredSize(new java.awt.Dimension(110, 40));
        btngoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngoiActionPerformed(evt);
            }
        });
        jPanel1.add(btngoi);

        jSeparator1.setBackground(Color.decode("#e6e6e6"));
        jSeparator1.setForeground(new java.awt.Color(114, 79, 43));

        jpThongTinThanhToan.setBackground(new java.awt.Color(255, 255, 255));
        jpThongTinThanhToan.setAutoscrolls(true);
        jpThongTinThanhToan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpThongTinThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpThongTinThanhToanMousePressed(evt);
            }
        });

        lbltongtien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltongtien.setForeground(new java.awt.Color(255, 0, 0));
        lbltongtien.setText("0");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(114, 79, 43));
        jLabel8.setText("Giảm giá:");

        lblgiamgia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblgiamgia.setForeground(new java.awt.Color(114, 79, 43));
        lblgiamgia.setText("0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(114, 79, 43));
        jLabel7.setText("Tiền món:");

        lbltienmon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltienmon.setForeground(new java.awt.Color(114, 79, 43));
        lbltienmon.setText("0");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("THÀNH TIỀN:");

        javax.swing.GroupLayout jpThongTinThanhToanLayout = new javax.swing.GroupLayout(jpThongTinThanhToan);
        jpThongTinThanhToan.setLayout(jpThongTinThanhToanLayout);
        jpThongTinThanhToanLayout.setHorizontalGroup(
            jpThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpThongTinThanhToanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpThongTinThanhToanLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jpThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpThongTinThanhToanLayout.createSequentialGroup()
                                .addComponent(lbltienmon, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                .addGap(17, 17, 17))
                            .addGroup(jpThongTinThanhToanLayout.createSequentialGroup()
                                .addComponent(lblgiamgia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(23, 23, 23))))
                    .addGroup(jpThongTinThanhToanLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbltongtien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        jpThongTinThanhToanLayout.setVerticalGroup(
            jpThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpThongTinThanhToanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbltienmon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblgiamgia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lbltongtien))
                .addContainerGap())
        );

        btnthugon.setBackground(new java.awt.Color(100, 50, 0));
        btnthugon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnthugon.setForeground(new java.awt.Color(255, 255, 255));
        btnthugon.setText("<<");
        btnthugon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthugonActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jpDsMon.setBackground(new java.awt.Color(255, 255, 255));
        jpDsMon.setMaximumSize(new java.awt.Dimension(32767, 400));
        jpDsMon.setOpaque(false);

        javax.swing.GroupLayout jpDsMonLayout = new javax.swing.GroupLayout(jpDsMon);
        jpDsMon.setLayout(jpDsMonLayout);
        jpDsMonLayout.setHorizontalGroup(
            jpDsMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );
        jpDsMonLayout.setVerticalGroup(
            jpDsMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jpDsMon);

        javax.swing.GroupLayout jpThongTinBanLayout = new javax.swing.GroupLayout(jpThongTinBan);
        jpThongTinBan.setLayout(jpThongTinBanLayout);
        jpThongTinBanLayout.setHorizontalGroup(
            jpThongTinBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpThongTinBanLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpThongTinBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpThongTinBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpThongTinBanLayout.createSequentialGroup()
                        .addComponent(lbltrangthai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(260, 260, 260))
                    .addGroup(jpThongTinBanLayout.createSequentialGroup()
                        .addComponent(lblgioden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(227, 227, 227))))
            .addGroup(jpThongTinBanLayout.createSequentialGroup()
                .addGroup(jpThongTinBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpThongTinBanLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnthugon, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpThongTinBanLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpThongTinBanLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lblTenBan))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpThongTinBanLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jpThongTinThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpThongTinBanLayout.setVerticalGroup(
            jpThongTinBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpThongTinBanLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTenBan)
                .addGap(18, 18, 18)
                .addGroup(jpThongTinBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblgioden))
                .addGap(18, 18, 18)
                .addGroup(jpThongTinBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbltrangthai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jpThongTinThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnthugon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jpthucdon.setBackground(new java.awt.Color(255, 255, 255));
        jpthucdon.setLayout(new java.awt.BorderLayout());

        jLabel1.setMaximumSize(new java.awt.Dimension(1258, 519));
        jLabel1.setMinimumSize(new java.awt.Dimension(1258, 519));
        jLabel1.setPreferredSize(new java.awt.Dimension(410, 470));
        jpthucdon.add(jLabel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpThongTinBan, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpthucdon, javax.swing.GroupLayout.PREFERRED_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpThongTinBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpthucdon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    public void fillThongTin() {
        arrhd = cn.GetHDbyMaBan(MaBan);
        MaHD = arrhd.GetMaHD();
        int ck = cn.CheckDsMon(MaHD, MaBan);
        btngoi.setVisible(true);
        if (ck == 0) {
            HuyHD();
            btngoi.setVisible(false);
        }

        if (arrhd.GetGiamGia() > 100) {
            lblgiamgia.setText(chuyentien.format(arrhd.GetGiamGia()) + " VNĐ");
            if (tienmon - arrhd.GetGiamGia() <= 0) {
                tongtien = 0;
                lbltongtien.setText("0 VNĐ");
            } else {
                tongtien = tienmon - arrhd.GetGiamGia();
                lbltongtien.setText(String.valueOf(chuyentien.format(tongtien)) + " VNĐ");
            }
        }
        if (arrhd.GetGiamGia() <= 100) {
            tongtien = tienmon - (tienmon * arrhd.GetGiamGia() / 100);
            lbltongtien.setText(String.valueOf(chuyentien.format(tongtien)) + " VNĐ");
            lblgiamgia.setText(String.valueOf(arrhd.GetGiamGia()) + " %");
        }
        lbltienmon.setText(String.valueOf(chuyentien.format(tienmon)) + " VNĐ");
    }

    public void fillDsMon(int mahd) {
        if (mahd != 0) {
            order = cn.GetDsOrder(mahd);
            arrhd = cn.GetHDbyMaBan(MaBan);
            tienmon = 0;
        }
        mahd = MaHD;
        if (order != null) {
            jpDsMon.setVisible(true);
            jpThongTinThanhToan.setVisible(true);
            jScrollPane1.setVisible(true);
            btngoi.setText("Thanh toán");

            JPanel[] pn = new JPanel[order.size()];
            jpDsMon.removeAll();
            jpDsMon.setLayout(new BoxLayout(jpDsMon, BoxLayout.Y_AXIS));
            for (int i = 0; i < order.size(); i++) {
                tienmon += order.get(i).GetGia() * order.get(i).GetSoLuong();
                pn[i] = new JPanel();
                pn[i].setName(order.get(i).GetMaMon());
                pn[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
                pn[i].setBorder(BorderFactory.createLineBorder(Color.darkGray, 1));
                pn[i].setBackground(Color.decode("#b3ff99"));
                pn[i].setLayout(new GridLayout());
                pn[i].setPreferredSize(new Dimension(270, 50));
                pn[i].setMaximumSize(new Dimension(270, 50));
                pn[i].setMinimumSize(new Dimension(270, 50));
                pn[i].add(new JLabel(order.get(i).GetTenMon(), JLabel.CENTER)).setForeground(Color.decode("#001a66"));
                pn[i].add(new JLabel(String.valueOf(chuyentien.format(order.get(i).GetGia())) + " VNĐ", JLabel.CENTER)).setForeground(Color.decode("#ff0000"));
                pn[i].add(new JLabel(String.valueOf(order.get(i).GetSoLuong()) + " " + order.get(i).GetDVT(), JLabel.RIGHT)).setForeground(Color.decode("#008000"));
                Icon ic = new ImageIcon("src/Icons/DeleteRed.png");
                JLabel lbl = new JLabel("", ic, JLabel.CENTER);
                lbl.setForeground(Color.decode("#b3ff99"));
                lbl.setName(order.get(i).GetMaMon());
                pn[i].add(lbl).addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int qs;
                        ArrayList<ThucDon> td = cn.GetThucDonByMa(e.getComponent().getName());

                        qs = JOptionPane.showConfirmDialog(null, "Hủy món: " + td.get(0).GetTenMon() + " ?", "Hủy món", JOptionPane.YES_NO_OPTION);
                        if (qs == JOptionPane.YES_OPTION) {
                            int xoa = cn.DeleteMon(e.getComponent().getName(), MaHD, MaBan);
                            if (xoa == 1) {
                                fillDsMon(MaHD);
                            }
                            if (xoa == 2) {
                                fillDsMon(MaHD);
                                HuyHD();
                            }
                        }
                    }
                });
                pn[i].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        DLSoLuong sl = new DLSoLuong(Run.QlCafe, true, e.getComponent().getName(), TenBan, MaBan);
                        sl.setVisible(true);
                    }
                });
                jpDsMon.add(pn[i]);
                jpDsMon.updateUI();

            }

            fillThongTin();
        }
    }

    private void HuyHD() {

        JButton btnhuy = new JButton("Hủy bàn");
        btnhuy.setPreferredSize(new Dimension(100, 40));
        btnhuy.setBounds(100, 50, 100, 40);
        jpDsMon.setLayout(null);
        btngoi.setVisible(false);
        jpThongTinThanhToan.setVisible(false);
        btnhuy.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Ban b = new Ban();
                b.SetTrangThai("Trống");
                b.SetMaBan(MaBan);
                cn.UpDateTrangThaiBan(b);

                jpBanHang.bh.FillBan();
                JpGoiMon.gm.removeAll();
                jpBanHang.bh.fillLb();

                HoaDon hd = new HoaDon();
                hd.SetMaHD(MaHD);
                cn.HuyHD(hd);
            }
        });
        jpDsMon.add(btnhuy);
        jpDsMon.updateUI();
    }

    private void btngoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngoiActionPerformed
        if (btngoi.getText().equals("Hủy bàn")) {

            jpthucdon.removeAll();
            jpthucdon.add(jLabel1);
            jpthucdon.updateUI();
            jpThongTinThanhToan.setVisible(false);
            btnthugon.setVisible(true);
            lblgioden.setText("......");
            lbltrangthai.setText("Trống");
            String TrangThai = "Trống";
            Ban b = new Ban(MaBan, lblTenBan.getText(), TrangThai);
            int Update = cn.UpdateBan(b);
            jpBanHang.bh.FillBan();
            btngoi.setText("Gọi món");
            btndatban.setVisible(true);
            btndatban.setText("Đặt bàn");
            return;

        }
        if (btngoi.getText().equals("Thanh toán")) {
            DLThanhToan thanhtoan = new DLThanhToan(Run.QlCafe, true, tongtien, TenBan, MaBan, MaHD);//tongtien trang thai ban ten ban
            thanhtoan.setLocationRelativeTo(null);
            thanhtoan.setVisible(true);
            return;
        }
        if (btngoi.getText().equals("Gọi món")) {
            jpthucdon.setVisible(true);
            Date date = new Date();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm a");
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            lblgioden.setText(df.format(date));
            lbltrangthai.setText("Đang phục vụ");
            btndatban.setVisible(false);
            btnthugon.setVisible(false);
            btngoi.setText("Hủy bàn");

            jpThucDon thucdon;
            thucdon = new jpThucDon();
            thucdon.maban = MaBan;
            thucdon.tenban = TenBan;

            thucdon.gioden = sf.format(date);
            jpthucdon.removeAll();
            jpthucdon.add(thucdon);
            jpthucdon.revalidate();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btngoiActionPerformed

    private void btndatbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatbanActionPerformed
        if (lbltrangthai.getText().equals("Đã đặt trước")) {
            lbltrangthai.setText("Trống");
            btndatban.setText("Đặt chỗ");
            String TrangThai = "Trống";
            Ban b = new Ban(MaBan, TenBan, TrangThai);
            int Update = cn.UpdateBan(b);
            jpBanHang.bh.FillBan();
            jpBanHang.bh.updateUI();
        } else {
            lbltrangthai.setText("Đã đặt trước");
            btndatban.setText("Hủy đặt");
            String TrangThai = "Đã đặt trước";
            Ban b = new Ban(MaBan, TenBan, TrangThai);
            int Update = cn.UpdateBan(b);
            jpBanHang.bh.FillBan();
            jpBanHang.bh.updateUI();
//            Run.QlCafe.reloadPanel(1, MaBan);            
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btndatbanActionPerformed

    private void jpThongTinThanhToanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpThongTinThanhToanMousePressed
        DLGiamGia giam = new DLGiamGia(Run.QlCafe, true, MaHD, TenBan, tienmon);
        giam.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jpThongTinThanhToanMousePressed

    private void btnthugonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthugonActionPerformed
        jpBanHang.bh.fillLb();

// TODO add your handling code here:
    }//GEN-LAST:event_btnthugonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndatban;
    private javax.swing.JButton btngoi;
    private javax.swing.JButton btnthugon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpDsMon;
    private javax.swing.JPanel jpThongTinBan;
    private javax.swing.JPanel jpThongTinThanhToan;
    private javax.swing.JPanel jpthucdon;
    private javax.swing.JLabel lblTenBan;
    private javax.swing.JLabel lblgiamgia;
    private javax.swing.JLabel lblgioden;
    private javax.swing.JLabel lbltienmon;
    private javax.swing.JLabel lbltongtien;
    private javax.swing.JLabel lbltrangthai;
    // End of variables declaration//GEN-END:variables
}
