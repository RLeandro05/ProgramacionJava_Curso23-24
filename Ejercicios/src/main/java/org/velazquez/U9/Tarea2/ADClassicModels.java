package org.velazquez.U9.Tarea2;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ADClassicModels {
    Connection connection = null;

    public ADClassicModels() {
    }

    public List getEmpleados() {
        List<String> listaEmpleados = new ArrayList<>();

        try {
            connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs1 = statement.executeQuery("SELECT * from EMPLOYEES");
            while (rs1.next()) {
                listaEmpleados.add(rs1.getString("firstName") + rs1.getString("lastName"));
            }

            System.out.println("Empleados guardados en la lista correctamente.");

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }

        return listaEmpleados;
    }

    public List getOffices() {
        List<String> listaOficinas = new ArrayList<>();

        try {
            connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs1 = statement.executeQuery("SELECT * from OFFICES");
            while (rs1.next()) {
                listaOficinas.add(rs1.getString("addressLine1") + rs1.getString("city"));
            }

            System.out.println("Oficinas guardadas en la lista correctamente.");

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }

        return listaOficinas;
    }

    public void close() {

        try {
            connection.close();

            System.out.println("Conexión cerrada correctamente.");
        } catch (SQLException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }
}
