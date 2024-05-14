package org.velazquez.U9.Ligero_Picon_U9_Entregable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Consultas {

    public Consultas() {
    }

    public void empleadosOficinaMayor() {

        Connection conexion = null;

        try {
            conexion = ConexionDB.getConnection();

            String consulta1 = "select * from employees where officeCode = (select officeCode from employees group by officeCode order by count(*) desc limit 1)";

            PreparedStatement Pstatement1 = conexion.prepareStatement(consulta1);

            ResultSet rs1 = Pstatement1.executeQuery();

            while (rs1.next()) {
                System.out.println("Código de la oficina: "+rs1.getInt("officeCode"));
                System.out.println("Número empleado: "+rs1.getInt("employeeNumber"));
                System.out.println("Apellido empleado: "+rs1.getString("lastName"));
                System.out.println("Nombre empleado: "+rs1.getString("firstName"));
                System.out.println("Extensión empleado: "+rs1.getString("extension"));
                System.out.println("Email empleado: "+rs1.getString("email"));
                System.out.println("Reports to: "+rs1.getInt("reportsTo"));
                System.out.println("Título de trabajo: "+rs1.getString("jobTitle"));
                System.out.println("------------------------------------------------------------");
            }


        } catch (SQLException e) {
            e.getMessage();
        } finally {
            if (conexion != null) conexion = null;
        }
    }

    public void productosNoVendidos() {

        Connection conexion = null;

        try {
            conexion = ConexionDB.getConnection();

            String consulta2 = "SELECT * FROM products WHERE productCode NOT IN (SELECT productCode FROM orderdetails)";

            PreparedStatement Pstatement1 = conexion.prepareStatement(consulta2);

            ResultSet rs1 = Pstatement1.executeQuery();

            while (rs1.next()) {
                System.out.println("Código producto: "+rs1.getString("productCode"));
                System.out.println("Nombre producto: "+rs1.getString("productName"));
                System.out.println("Línea producto: "+rs1.getString("productLine"));
                System.out.println("Escala producto: "+rs1.getString("productScale"));
                System.out.println("ProductVendor: "+rs1.getString("productVendor"));
                System.out.println("Descripción: "+rs1.getString("productDescription"));
                System.out.println("Cantidad en stock: "+rs1.getInt("quantityInStock"));
                System.out.println("Precio: "+rs1.getDouble("buyPrice"));
                System.out.println("MSRP: "+rs1.getDouble("MSRP"));
                System.out.println("------------------------------------------------------------");
            }
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            if (conexion != null) conexion = null;
        }
    }

    public void informeCategoria() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la línea de producto: ");
        String productLine = sc.nextLine();

        Connection conexion = null;

        try {
            conexion = ConexionDB.getConnection();

            String validarProductLine = "select * from products where upper(productLine) like "+productLine;

            PreparedStatement validacion = conexion.prepareStatement(validarProductLine);

            ResultSet rs1 = validacion.executeQuery();

            if (rs1.next()) {
                System.out.println("Existe. Procedemos con la siguiente consulta: ");

                String consulta3 = "select p.productName, o.quantityOrdered, SUM(p.buyPrice) as total from products p join orderdetails o ON p.productCode = o.productCode WHERE upper(p.productLine) LIKE "+productLine+" GROUP BY p.productName";

                PreparedStatement mostrarProductos = conexion.prepareStatement(consulta3);

                ResultSet rs2 = mostrarProductos.executeQuery();

                while (rs2.next()) {
                    System.out.println("Nombre del producto: "+rs2.getString("p.productName"));
                    System.out.println("Cantidad ordenada por producto: "+rs2.getInt("o.quantityOrdered"));
                    System.out.println("Suma total: "+rs2.getDouble("total"));
                    System.out.println("------------------------------------------------------------");
                }
            } else {
                System.out.println("No existe esa línea de producto.");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            if (conexion != null) conexion = null;
        }
    }
}
