/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 * Model Ban: chứa cấu trúc về bàn trong nhà hàng
 * Tham khảo cấu trúc trong SQL Diagram
 *
 * @author thanhhff
 */

//TODO: tạo các method Ban() có chữ ký và không có chữ ký;
//TODO: hoàn thành các phương thức set / get;

public class Ban {

    private int MaBan;
    private String TenBan, TrangThai;

    public Ban() {
        this.MaBan = 0;
        this.TenBan = "";
        this.TrangThai = "";
    }

    public Ban(int maBan, String tenBan, String trangThai) {
        this.MaBan = maBan;
        this.TenBan = tenBan;
        this.TrangThai = trangThai;
    }


    public int getMaBan() {
        return MaBan;
    }

    public void setMaBan(int maBan) {
        MaBan = maBan;
    }

    public String getTenBan() {
        return TenBan;
    }

    public void setTenBan(String tenBan) {
        TenBan = tenBan;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
    }
}
