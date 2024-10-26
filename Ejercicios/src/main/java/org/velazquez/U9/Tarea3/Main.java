package org.velazquez.U9.Tarea3;

import org.velazquez.U9.CONEXIONBD;
import org.velazquez.U9.Tarea2.ConexionBD;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                asignarEmpleadoaCliente();
                break;
            case 3:
                asignarProductoaPedidos();
                break;
            case 4:
                mostrarDetallesPedido();
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
            conexion = CONEXIONBD.getConnection(); // Cargamos el driver

            // Al añadir los datos, hacemos una consulta con INSERT INTO y ponemos como valores "?" para evitar los ataques de inyección SQL además de ser más legible
            String sql = "INSERT INTO customers (customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, addressLine2, city, state, postalCode, country, salesRepEmployeeNumber, creditLimit) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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

            statement.executeUpdate();

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

    public static void asignarEmpleadoaCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el identificador del empleado: ");
        int idEmpleado = sc.nextInt();

        System.out.println("Introduzca el identificador del cliente: ");
        int idCliente = sc.nextInt();

        Connection connection = null;

        try {

            connection = CONEXIONBD.getConnection();

            String sql1 = "Select employeeNumber from employees where employeeNumber = "+idEmpleado;

            PreparedStatement statement1 = connection.prepareStatement(sql1);

            ResultSet rs1 = statement1.executeQuery();

            if (rs1.next()) {
                System.out.println("El empleado con id '"+idEmpleado+"' existe.");
                String sql2 = "Select customerNumber from customers where customerNumber = "+idCliente;

                PreparedStatement statement2 = connection.prepareStatement(sql2);

                ResultSet rs2 = statement2.executeQuery();

                if (rs2.next()) {
                    System.out.println("El cliente con id '"+idCliente+"' existe.");

                    String sql3 = "Update customers set salesRepEmployeeNumber = "+idEmpleado+" where customerNumber = "+idCliente;

                    PreparedStatement statement3 = connection.prepareStatement(sql3);

                    int numFilas = statement3.executeUpdate();

                    System.out.println(numFilas+" filas actualizadas");
                } else {
                    System.out.println("El cliente con id '"+idCliente+"' no existe.");
                }
            } else {
                System.out.println("El empleado con id '"+idEmpleado+"' no existe.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void asignarProductoaPedidos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el identificador del producto: ");
        String idProducto = sc.next();

        System.out.println("Introduzca el identificador del pedido: ");
        int idPedido = sc.nextInt();

        Connection connection = null;

        try {
            connection = CONEXIONBD.getConnection();

            String sql1 = "Select productCode from products where upper(productCode) like '"+idProducto+"'";

            PreparedStatement statement1 = connection.prepareStatement(sql1);

            ResultSet rs1 = statement1.executeQuery();

            if (rs1.next()) {
                System.out.println("El producto con id '"+idProducto+"' existe.");
                String sql2 = "Select orderNumber from orderdetails where orderNumber = "+idPedido;

                PreparedStatement statement2 = connection.prepareStatement(sql2);

                ResultSet rs2 = statement2.executeQuery();

                if (rs2.next()) {
                    System.out.println("El pedido con id '"+idPedido+"' existe.");

                    System.out.println("Introduzca el número de unidades: ");
                    int quantityOrdered = sc.nextInt();

                    System.out.println("Introduzca el precio por cada unidad: ");
                    double priceEach = sc.nextDouble();

                    System.out.println("Introduzca el número de línea de orden: ");
                    int orderLineNumber = sc.nextInt();

                    String sql3 = "Insert into orderdetails (orderNumber, productCode, quantityOrdered, priceEach, orderLineNumber) values (?, ?, ?, ?, ?)";

                    PreparedStatement statement3 = connection.prepareStatement(sql3);

                    statement3.setInt(1, idPedido);
                    statement3.setString(2, idProducto);
                    statement3.setInt(3, quantityOrdered);
                    statement3.setDouble(4, priceEach);
                    statement3.setInt(5, orderLineNumber);

                    statement3.executeUpdate();

                    System.out.println("Datos del producto con número "+idProducto+" insertados correctamente al pedido con número "+idPedido);
                } else {
                    System.out.println("El pedido con id '"+idPedido+"' no existe.");
                }
            } else {
                System.out.println("El producto con id '"+idProducto+"' no existe.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void mostrarDetallesPedido() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el código del pedido: ");
        int orderNumber = sc.nextInt();

        Connection connection = null;

        try {
            connection = CONEXIONBD.getConnection();

            String verificarProducto = "Select * from orders where orderNumber = "+orderNumber;

            PreparedStatement pst = connection.prepareStatement(verificarProducto);

            ResultSet verificacion = pst.executeQuery();

            if (verificacion.next()) {
                System.out.println("El pedido con código '"+orderNumber+"' existe. A continuación, sus detalles: ");

                String sqlPRODUCTOSDELCODIGO = "Select * from products p join orderdetails od on od.productCode = p.productCode where orderNumber = "+orderNumber;

                PreparedStatement mostrarProductos = connection.prepareStatement(sqlPRODUCTOSDELCODIGO);

                ResultSet RSmostrarProductos = mostrarProductos.executeQuery();

                double total;
                while (RSmostrarProductos.next()) {
                    System.out.println("Nombre del Producto: "+RSmostrarProductos.getString("productName"));
                    System.out.println("Cantidad de unidades: "+RSmostrarProductos.getInt("quantityOrdered"));
                    System.out.println("Precio por unidad: "+RSmostrarProductos.getDouble("priceEach"));
                    total = RSmostrarProductos.getInt("quantityOrdered")*RSmostrarProductos.getDouble("priceEach");
                    System.out.println("Total: "+total+"€");
                    System.out.println("------------------------------------------------------------------------------");
                }

            } else {
                System.out.println("El pedido con código '"+orderNumber+"' no existe.");
            }
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.getMessage();
            }

        }
    }
}