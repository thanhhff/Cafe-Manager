/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 * Model Loai: chứa cấu trúc về loại (nhóm các mặt hàng) về mã loại, tên loại, màu sắc
 *
 * @author thanhhff
 */

//TODO: tạo các method Loai() có chữ ký và không có chữ ký;
//TODO: hoàn thành các phương thức set / get;

public class Loai {

    private String MaLoai, TenLoai, MauSac;

    public Loai() {
        this.MaLoai = "";
        this.TenLoai = "";
        this.MauSac = "";
    }

    public Loai(String MaLoai, String TenLoai, String MauSac) {
        this.MaLoai = MaLoai;
        this.TenLoai = TenLoai;
        this.MauSac = MauSac;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String maLoai) {
        MaLoai = maLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String tenLoai) {
        TenLoai = tenLoai;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String mauSac) {
        MauSac = mauSac;
    }
}
