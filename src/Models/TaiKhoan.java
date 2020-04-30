/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 * Model TaiKhoan: chứa cấu trúc về tài khoản bao gồm id, lv (quyền truy cập), tên đăng nhập, mật khẩu
 * Tham khảo cấu trúc trong SQL Diagram
 *
 * @author thanhhff
 */

//TODO: tạo các method TaiKhoan() có chữ ký và không có chữ ký;
//TODO: hoàn thành các phương thức set / get;

public class TaiKhoan {

    private int id, lv;
    private String tdn, mk;

    public TaiKhoan() {
        this.id = 0;
        this.lv = 0;
        this.tdn = "";
        this.mk = "";
    }

    public TaiKhoan(int id, String tdn, String mk, int lv) {
        this.id = id;
        this.lv = lv;
        this.tdn = tdn;
        this.mk = mk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public String getTdn() {
        return tdn;
    }

    public void setTdn(String tdn) {
        this.tdn = tdn;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }
}
