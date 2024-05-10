package org.velazquez.U9.Tarea2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ADClassicModels {
    public ADClassicModels() {
    }

    public List getEmpleados() {
        List<Employee> listaEmpleados = new ArrayList<>();

        Connection connection;

        connection = ConexionBD.getConnection();

        try {
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs1 = statement.executeQuery("SELECT * from employees");
            while (rs1.next()) {

                Employee employee = new Employee(rs1.getInt("employeeNumber"), rs1.getString("lastName"), rs1.getString("firstName"), rs1.getString("extension"), rs1.getString("email"), rs1.getString("officeCode"), rs1.getInt("reportsTo"), rs1.getString("jobTitle"));

                listaEmpleados.add(employee);
            }

            System.out.println("Empleados guardados en la lista correctamente.");

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConexionBD.close();
        }

        return listaEmpleados;
    }

    public List getOffices() {
        List<Office> listaOficinas = new ArrayList<>();

        Connection connection;

        connection = ConexionBD.getConnection();

        try {
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs1 = statement.executeQuery("SELECT * from offices");
            while (rs1.next()) {

                Office office = new Office(rs1.getString("officeCode"), rs1.getString("city"), rs1.getString("phone"), rs1.getString("addressLine1"), rs1.getString("addressLine2"), rs1.getString("state"), rs1.getString("country"), rs1.getString("postalCode"), rs1.getString("territory"));

                listaOficinas.add(office);
            }

            System.out.println("Oficinas guardadas en la lista correctamente.");

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConexionBD.close();
        }

        return listaOficinas;
    }
}
