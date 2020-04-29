/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author thanhhff
 */
public class ConnectSQL {

    private Connection connect;

    public ConnectSQL() {
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe-manager?useUnicode=true&characterEncoding=utf8", "root", "");
            System.out.println("Kết nối thành công !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Kết nối thất bại !");
        }
    }

}
