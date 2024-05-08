package org.velazquez.U9.Tarea2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static Connection con=null;
    public static Connection getConnection(){
        try{
            if( con == null ){
                String driver="com.mysql:mysql-connector-j:8.3.0"; //el driver varia segun la DB que usemos
                String url="jdbc:mysql://localhost:3336/nombre_DB?autoReconnect=true";
                String pwd="XXXXX";
                String usr="usuario";
                Class.forName(driver);
                con = DriverManager.getConnection(url,usr,pwd);
                System.out.println("Conection Succesfull");
            }
        }
        catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
        return con;
    }
}
