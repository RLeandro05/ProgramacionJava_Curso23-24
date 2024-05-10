package org.velazquez.U9.Tarea3;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Connection connection = null;
//
//        try {
//            connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
//            Statement statement = connection.createStatement();
//            statement.setQueryTimeout(30);
//            ResultSet rs1 = statement.executeQuery("SELECT * from CUSTOMERS where state IS NULL");
//            while (rs1.next()) {
//                System.out.println("Nombre de cliente: " + rs1.getString("customerName"));
//                System.out.println("State del cliente: " + rs1.getString("state"));
//                System.out.println("Número de cliente: " + rs1.getInt("customerNumber"));
//            }
//        } catch (SQLException e) {
//            System.err.println(e.getMessage());
//        } finally {
//            try {
//                if (connection != null) connection.close();
//            } catch (SQLException e) {
//                System.err.println(e.getMessage());
//            }
//        }
        Scanner sc = new Scanner(System.in);

        System.out.println("Escoja una de las siguientes opciones: ");
        System.out.println("1. Insertar cliente.");
        System.out.println("2. Asignar empleado a cliente.");
        System.out.println("3. Añadir producto a pedido.");
        System.out.println("4. Mostrar con detalle un pedido.");
        System.out.println("5. Salir de la aplicación.");

        int eleccion = sc.nextInt();

        switch (eleccion) {
            case 1:
                insertarCliente();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("Saliste!");
                break;
        }
    }

    public static void insertarCliente() { // Función para insertar un nuevo cliente a la tabla CUSTOMERS
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el número de cliente: ");
        int numCliente = sc.nextInt();

        System.out.println("Introduzca el nombre de cliente: ");
        String nombreCliente = sc.next();

        System.out.println("Introduzca el apellido del contacto: ");
        String apellidoContacto = sc.next();

        System.out.println("Introduzca el nombre del contacto: ");
        String nombreContacto = sc.next();

        System.out.println("Introduzca el número de teléfono: ");
        int numTelefono = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduzca la primera dirección: ");
        String direccion1 = sc.nextLine();

        System.out.println("Introduzca la segunda dirección: ");
        String direccion2 = sc.nextLine();

        System.out.println("Introduzca la ciudad: ");
        String ciudad = sc.nextLine();

        System.out.println("Introduzca el estado: ");
        String estado = sc.nextLine();

        System.out.println("Introduzca el código postal: ");
        String codPostal = sc.nextLine();

        System.out.println("Introduzca el país: ");
        String pais = sc.nextLine();

        System.out.println("Introduzca el salesRepEmployeeNumber: ");
        int salesRepEmployeeNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduzca el límite de crédito: ");
        double limiteCredito = sc.nextDouble();
        sc.nextLine();

        Connection conexion = null; // Definimos una conexión

        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db"); // Cargamos el driver

            // Al añadir los datos, hacemos una consulta con INSERT INTO y ponemos como valores "?" para evitar los ataques de inyección SQL además de ser más legible
            String sql = "INSERT INTO CUSTOMERS (customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, addressLine2, city, state, postalCode, country, salesRepEmployeeNumber, creditLimit) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(sql);

            // Añadimos todos los datos en cada statement.set
            statement.setInt(1, numCliente);
            statement.setString(2, nombreCliente);
            statement.setString(3, apellidoContacto);
            statement.setString(4, nombreContacto);
            statement.setInt(5, numTelefono);
            statement.setString(6, direccion1);
            statement.setString(7, direccion2);
            statement.setString(8, ciudad);
            statement.setString(9, estado);
            statement.setString(10, codPostal);
            statement.setString(11, pais);
            statement.setInt(12, salesRepEmployeeNumber);
            statement.setDouble(13, limiteCredito);

            // Para asegurarnos, mostramos por pantalla que se hizo con éxito. Podemos realizar una consulta por si acaso
            System.out.println("Los datos han sido insertados correctamente en la tabla de clientes.");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
