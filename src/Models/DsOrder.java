/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 * Model DsOrder: chứa cấu trúc về danh sách Order (đặt hàng) trong nhà hàng
 *
 * @author thanhhff
 */

//TODO: tạo các method DsOrder() có chữ ký và không có chữ ký;
//TODO: hoàn thành các phương thức set / get;

public class DsOrder {

    private String TenMon, MaMon, DVT;
    private int Gia, SoLuong, MaHoaDon;

    public DsOrder() {
        this.TenMon = "";
        this.MaMon = "";
        this.DVT = "";
        this.Gia = 0;
        this.SoLuong = 0;
        this.MaHoaDon = 0;
    }

    public DsOrder(String maMon, String tenMon, String dvt, int soLuong, int gia, int maHoaDon) {
        this.MaMon = maMon;
        this.TenMon = tenMon;
        this.DVT = dvt;
        this.SoLuong = soLuong;
        this.Gia = gia;
        this.MaHoaDon = maHoaDon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String tenMon) {
        TenMon = tenMon;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String maMon) {
        MaMon = maMon;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public int getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        MaHoaDon = maHoaDon;
    }
}
