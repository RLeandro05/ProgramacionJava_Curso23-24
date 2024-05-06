package org.velazquez.U9.Tarea1;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs1 = statement.executeQuery("SELECT * from CUSTOMERS where state IS NULL");
            while (rs1.next()) {
                System.out.println("Nombre de cliente: "+rs1.getString("customerName"));
                System.out.println("State del cliente: "+rs1.getString("state"));
                System.out.println("Número de cliente: "+rs1.getInt("customerNumber"));
            }

            System.out.println("--------------------------------------------------------------");

            ResultSet rs2 = statement.executeQuery("SELECT * from PAYMENTS where amount > 30000");
            while (rs2.next()) {
                System.out.println("Número de cliente: "+rs2.getString("customerNumber"));
                System.out.println("Cantidad: "+rs2.getInt("amount"));
            }

            System.out.println("--------------------------------------------------------------");

            ResultSet rs3 = statement.executeQuery("SELECT * from EMPLOYEES where reportsTO = 1143");
            while (rs3.next()) {
                System.out.println("Número de empleado: "+rs3.getString("employeeNumber"));
                System.out.println("Nombre de empleado: "+rs3.getString("firstName"));
                System.out.println("ReportsTo: "+rs3.getString("reportsTo"));
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
