package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Connection getConnetion() {
        try {
            String myBD = "jdbc:mysql://localhost:3306/sistemaventa?serverTmezone=UTC";
            con = DriverManager.getConnection(myBD, "root", "");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());

        }
        return null;
    }
}
