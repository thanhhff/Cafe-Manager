/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 * Model ThucDon: chứa cấu trúc về thực đơn của nhà hàng
 * Tham khảo cấu trúc trong SQL Diagram
 *
 * @author thanhhff
 */

//TODO: tạo các method ThucDon() có chữ ký và không có chữ ký;
//TODO: hoàn thành các phương thức set / get;

public class ThucDon {

    private String MaMon, TenMon, MaLoai, DVT;
    private int DonGia;

    public ThucDon() {
        this.MaMon = "";
        this.TenMon = "";
        this.MaLoai = "";
        this.DVT = "";
        this.DonGia = 0;
    }

    public ThucDon(String MaMon, String TenMon, String MaLoai, int DonGia, String DVT) {
        this.MaMon = MaMon;
        this.TenMon = TenMon;
        this.MaLoai = MaLoai;
        this.DVT = DVT;
        this.DonGia = DonGia;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String maMon) {
        MaMon = maMon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String tenMon) {
        TenMon = tenMon;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String maLoai) {
        MaLoai = maLoai;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int donGia) {
        DonGia = donGia;
    }
}
