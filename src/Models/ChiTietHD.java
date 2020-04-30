/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 * Model ChiTietHD: chứa cấu trúc về chi tiết hoá đơn trong nhà hàng
 * Tham khảo cấu trúc trong SQL Diagram
 *
 * @author thanhhff
 */

//TODO: tạo các method ChiTietHD() có chữ ký và không có chữ ký;
//TODO: hoàn thành các phương thức set / get;

public class ChiTietHD {

    private int MaChiTietHD, MaHoaDon, SoLuong, Gia, MaMon;

    public ChiTietHD() {
        this.MaChiTietHD = 0;
        this.MaHoaDon = 0;
        this.SoLuong = 0;
        this.Gia = 0;
        this.MaMon = 0;
    }

    public ChiTietHD(int maChiTietHD, int maHoaDon, int maMon, int soLuong, int gia) {
        this.MaHoaDon = maChiTietHD;
        this.MaHoaDon = maHoaDon;
        this.SoLuong = soLuong;
        this.Gia = gia;
        this.MaMon = maMon;
    }

    public int getMaChiTietHD() {
        return MaChiTietHD;
    }

    public void setMaChiTietHD(int maChiTietHD) {
        MaChiTietHD = maChiTietHD;
    }

    public int getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        MaHoaDon = maHoaDon;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }

    public int getMaMon() {
        return MaMon;
    }

    public void setMaMon(int maMon) {
        MaMon = maMon;
    }
}
