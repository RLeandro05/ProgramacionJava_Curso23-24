package org.velazquez.U9.Tarea2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static Connection con = null;

    public ConexionBD() {
    }
    public static Connection getConnection(){

        if (con == null) {
            try{
//                String driver="com.mysql:mysql-connector-j:8.3.0";
                String url="jdbc:mysql://localhost:3336/classicmodels?autoReconnect=true";
                String pwd="XXXXX";
                String usr="root";
                con = DriverManager.getConnection(url,usr,pwd); // Lo conectamos al driver
                System.out.println("Conection Succesfull");
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
