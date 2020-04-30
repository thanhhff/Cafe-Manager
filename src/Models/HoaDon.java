/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 * Model HoaDon: chứa cấu trúc về danh sách hoá đơn trong nhà hàng
 * Tham khảo cấu trúc trong SQL Diagram
 *
 * @author thanhhff
 */

//TODO: tạo các method HoaDon() có chữ ký và không có chữ ký;
//TODO: hoàn thành các phương thức set / get;

public class HoaDon {

    private int MaHoaDon, GiamGia, TongTien, TrangThai, MaBan;
    private Date GioDen;

    public HoaDon() {
        this.MaHoaDon = 0;
        this.GiamGia = 0;
        this.TongTien = 0;
        this.TrangThai = 0;
        this.MaBan = 0;
        this.GioDen = null;
    }

    public HoaDon(int MaHoaDon, int GiamGia, int MaBan, Date GioDen, int TongTien, int TrangThai) {
        this.MaHoaDon = MaHoaDon;
        this.GiamGia = GiamGia;
        this.TongTien = TongTien;
        this.TrangThai = TrangThai;
        this.MaBan = MaBan;
        this.GioDen = GioDen;
    }

    public int getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        MaHoaDon = maHoaDon;
    }

    public int getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(int giamGia) {
        GiamGia = giamGia;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int tongTien) {
        TongTien = tongTien;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int trangThai) {
        TrangThai = trangThai;
    }

    public int getMaBan() {
        return MaBan;
    }

    public void setMaBan(int maBan) {
        MaBan = maBan;
    }

    public Date getGioDen() {
        return GioDen;
    }

    public void setGioDen(Date gioDen) {
        GioDen = gioDen;
    }
}
