package org.velazquez.U9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CONEXIONBD {
    private static Connection con = null;

    public CONEXIONBD() {
    }
    public static Connection getConnection(){

        if (con == null) {
            try{
//                String driver="com.mysql:mysql-connector-j:8.3.0";
                String url="jdbc:mysql://localhost:3336/classicmodels?user=root&password=XXXXX";
                String pwd="XXXXX";
                String usr="root";
                con = DriverManager.getConnection(url,usr,pwd); // Lo conectamos al driver
                System.out.println("Conexión establecida.");
            }
            catch(SQLException ex){
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
        return con; // Devolvemos la conexión
    }

    public static void close() {
        try {
            if (con != null) {
                con.close();
                con = null;
                System.out.println("Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }
}
