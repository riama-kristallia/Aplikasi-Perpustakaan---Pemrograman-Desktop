/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author arija
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Koneksi {
    public static com.mysql.jdbc.Connection conn;
    public static void main(String args[]) {
        try {
            String url = "jdbc:mysql://localhost/perpustakaan";
            String user = "root";
            String pass = "";
            conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(url,user,pass);
            System.out.println("koneksi berhasil");
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    } 
    public static com.mysql.jdbc.Connection connectDB() {
            String url = "jdbc:mysql://localhost/perpustakaan";
            String user = "root";
            String pass = "";
            try {
                conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(url,user,pass);
            } catch (SQLException e) {
                System.err.println("koneksi gagal" +e.getMessage());
            }
            return conn;
    }
    
}