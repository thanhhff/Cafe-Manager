/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Models.TaiKhoan;
import MySQL.ConnectSQL;

import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.border.Border;

public class frmLogIn extends javax.swing.JFrame {
    ConnectSQL cn = new ConnectSQL();


    /**
     * Creates new form frmLogIn
     */
    public frmLogIn() {
//        initComponents();
//        JRootPane rp = this.getRootPane();
        TaiKhoan tk = new TaiKhoan();
        tk.setTdn("admin");
        tk.setMk("admin");
        boolean check = cn.CheckLogin(tk);

    }


}
