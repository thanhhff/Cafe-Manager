package Interface;

import Models.TaiKhoan;

public class Run {
    public static frmLogIn frmlg;
    public static TaiKhoan tk;

    public static void main(String[] args) {
        login();
    }

    public static void login() {
        frmlg = new frmLogIn();
        frmlg.setVisible(true);
    }
}
