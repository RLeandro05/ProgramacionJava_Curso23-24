package org.velazquez.U9.Ligero_Picon_U9_Entregable;

import org.velazquez.U9.CONEXIONBD;

import java.sql.*;
import java.util.Scanner;

public class Transacciones {

    public Transacciones() {
    }

    public void insertarClienteyDosPagos() {
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

            conexion.setAutoCommit(false);

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

            conexion.commit();

            // Para asegurarnos, mostramos por pantalla que se hizo con éxito. Podemos realizar una consulta por si acaso
            System.out.println("Los datos han sido insertados correctamente en la tabla de clientes.");

            System.out.println("--------------------------------------------------------------");


        } catch (SQLException e) {
            System.err.println(e.getMessage());
            try {
                conexion.rollback();
            } catch (SQLException ex) {
                ex.getMessage();
            }
        }

        System.out.println("--------------------------------------------------------------");

        System.out.println("Introduzca el número de cliente asociado al nuevo pago: ");
        int customerNumber = sc.nextInt();

        System.out.println("Introduzca el checkNumber: ");
        String checkNumber =sc.next();

        System.out.println("Introduca la fecha del pago: ");
        String paymentDate = sc.next();

        System.out.println("Introduzca la cantidad del pago: ");
        double amount = sc.nextDouble();

        try {
            conexion = CONEXIONBD.getConnection(); // Cargamos el driver

            conexion.setAutoCommit(false);

            String sqlValidador = "Select * from payments where customerNumber = "+customerNumber;

            PreparedStatement validar1 = conexion.prepareStatement(sqlValidador);

            ResultSet rs1 = validar1.executeQuery();

            if (rs1.next()) {
                System.out.println("El cliente existe.");

                String sqlValidador2 = "Select * from payments where upper(checkNumber) like"+checkNumber;

                PreparedStatement validar2 = conexion.prepareStatement(sqlValidador2);

                ResultSet rs2 = validar2.executeQuery();

                if (rs2.next()) {
                    System.out.println("Ya existe un pago con ese checkNumber.");
                } else {
                    System.out.println("No existe. Procederemos a insertar el pago.");

                    String sqlInsertarPago = "insert into payments (customerNumber, checkNumber, paymentDate, amount) values (?, ?, ?, ?)";

                    PreparedStatement insercion = conexion.prepareStatement(sqlInsertarPago);

                    insercion.setInt(1, customerNumber);
                    insercion.setString(2, checkNumber);
                    insercion.setDate(3, Date.valueOf(paymentDate));
                    insercion.setDouble(4, amount);

                    insercion.executeUpdate();

                    conexion.commit();

                    System.out.println("Pago insertado correctamente.");
                }
            } else {
                System.out.println("El cliente no existe. No podemos insertar el pago.");
            }

            System.out.println("--------------------------------------------------------------");


        } catch (SQLException e) {
            System.err.println(e.getMessage());
            try {
                conexion.rollback();
            } catch (SQLException ex) {
                ex.getMessage();
            }
        }

        System.out.println("--------------------------------------------------------------");

        System.out.println("Introduzca el número de cliente asociado al nuevo pago: ");
        int customerNumber2 = sc.nextInt();

        System.out.println("Introduzca el checkNumber: ");
        String checkNumber2 =sc.next();

        System.out.println("Introduca la fecha del pago: ");
        String paymentDate2 = sc.next();

        System.out.println("Introduzca la cantidad del pago: ");
        double amount2 = sc.nextDouble();

        try {
            conexion = CONEXIONBD.getConnection(); // Cargamos el driver

            conexion.setAutoCommit(false);

            String sqlValidador = "Select * from payments where customerNumber = "+customerNumber2;

            PreparedStatement validar1 = conexion.prepareStatement(sqlValidador);

            ResultSet rs1 = validar1.executeQuery();

            if (rs1.next()) {
                System.out.println("El cliente existe.");

                String sqlValidador2 = "Select * from payments where upper(checkNumber) like"+checkNumber2;

                PreparedStatement validar2 = conexion.prepareStatement(sqlValidador2);

                ResultSet rs2 = validar2.executeQuery();

                if (rs2.next()) {
                    System.out.println("Ya existe un pago con ese checkNumber.");
                } else {
                    System.out.println("No existe. Procederemos a insertar el pago.");

                    String sqlInsertarPago = "insert into payments (customerNumber, checkNumber, paymentDate, amount) values (?, ?, ?, ?)";

                    PreparedStatement insercion = conexion.prepareStatement(sqlInsertarPago);

                    insercion.setInt(1, customerNumber2);
                    insercion.setString(2, checkNumber2);
                    insercion.setDate(3, Date.valueOf(paymentDate2));
                    insercion.setDouble(4, amount2);

                    insercion.executeUpdate();

                    conexion.commit();

                    System.out.println("Pago insertado correctamente.");
                }
            } else {
                System.out.println("El cliente no existe. No podemos insertar el pago.");
            }

            System.out.println("--------------------------------------------------------------");


        } catch (SQLException e) {
            System.err.println(e.getMessage());
            try {
                conexion.rollback();
            } catch (SQLException ex) {
                ex.getMessage();
            }
        } finally {
            try {
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public void insertarOficinaTokio() {
        Scanner sc = new Scanner(System.in);

        Connection conexion = null;

        System.out.println("Introduzca el código de oficina: ");
        String officeCode = sc.nextLine();

        String city = "Tokyo";

        System.out.println("Introduzca el teléfono de la oficina");
        String phone = sc.nextLine();

        System.out.println("Introduzca la primera dirección de la oficina: ");
        String addressLine1 = sc.nextLine();

        System.out.println("Introduzca la segunda dirección de la oficina: ");
        String addressLine2 = sc.nextLine();

        System.out.println("Introduzca el estado de la oficina: ");
        String state = sc.nextLine();

        String country = "Japan";

        System.out.println("Introduzca el código postal de la oficina: ");
        String postalCode = sc.nextLine();

        System.out.println("Introduzca el territorio de la oficina: ");
        String territory = sc.nextLine();

        try {
            conexion = ConexionDB.getConnection();

            String validarCodigoOficina = "select * from offices where upper(officeCode) like"+officeCode;

            PreparedStatement validacion = conexion.prepareStatement(validarCodigoOficina);

            ResultSet rs1 = validacion.executeQuery();

            if (rs1.next()) {
                System.out.println("Ya hay una oficina con ese código.");
            } else {
                String sqlInsertarOficina = "insert into offices (officeCode, city, phone, addressLine1, addressLine2, state, country, postalCode, territory) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

                PreparedStatement insercion = conexion.prepareStatement(sqlInsertarOficina);

                insercion.setString(1, officeCode);
                insercion.setString(2, city);
                insercion.setString(3, phone);
                insercion.setString(4, addressLine1);
                insercion.setString(5, addressLine2);
                insercion.setString(6, state);
                insercion.setString(7, country);
                insercion.setString(8, postalCode);
                insercion.setString(9, territory);

                insercion.executeUpdate();

                conexion.commit();

                System.out.println("Oficina insertada correctamente.");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            try {
                conexion.rollback();
            } catch (SQLException ex) {
                ex.getMessage();
            }
        } finally {
            try {
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }

//        System.out.println("--------------------------------------------------------------");
//
//        try {
//            conexion = ConexionDB.getConnection();
//
//            String sacarEmpleadosTokyo = "update employees set officeCode ";
//        } catch (SQLException e) {
//            System.err.println(e.getMessage());
//            try {
//                conexion.rollback();
//            } catch (SQLException ex) {
//                ex.getMessage();
//            }
//        } finally {
//            try {
//                if (conexion != null) conexion.close();
//            } catch (SQLException e) {
//                System.err.println(e.getMessage());
//            }
//        }
    }
}
