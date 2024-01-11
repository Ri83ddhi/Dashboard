/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginandsignup;

import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class db {

    ResultSet rs = null;
    PreparedStatement pst = null;

    static Connection conn = null;

    public static Connection java_db() {
        String SUrl, SUser, SPass;
        SUrl = "jdbc:mysql://localhost:3306/java_emp_database";
        SUser = "root";
        SPass = "";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = conn.createStatement();
            return conn;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        

    }
}
