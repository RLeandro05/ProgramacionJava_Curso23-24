package org.velazquez.U7.Tarea4;

/*Escribir un programa que pida los datos de varios empleados.
Los datos que nos interesan de dichos empleados son el nombre, dni, edad, estatura
(heredados de la clase Persona) y sueldo.

Al comenzar la ejecución, se le preguntará al usuario si desea cargar
los datos de empleados de un fichero binario, o desea insertarlos desde consola
(Se estarán insertando datos de empleados hasta que el usuario indique que no quiere insertar ninguno más).

Sea de una u otra forma, la aplicación insertará estos datos en un Diccionario
de datos (o Mapa), en el que la clave se corresponderá con el dni del empleado, y el valor,
con el objeto empleado completo.

Una vez cargados los datos en ese Mapa (que debe estar disponible para el resto de operaciones
de la aplicación), se le darán varias opciones al usuario:

    VISUALIZAR LISTADO: Visualizar los datos de todos los empleados en el mismo orden que se insertaron.

    BORRAR EMPLEADO/S: Se le pedirá el dni de un empleado con el fin de borrarlo del map.
    Tener en cuenta que puede que no haya ningún empleado con ese dni.
    Esta operación se seguirá realizando hasta que el usuario indique su fin.

    VISUALIZAR EMPLEADO: Se pedirá al usuario un dni con el fin de visualizar los datos de ese empleado.

    MODIFICAR EMPLEADO: Permitirá al usuario modificar los datos de un empleado concreto,
    indicando para ello el dni del empleado que quiere cambiar.
    La modificación consistirá en pedir, de nuevo todos los datos de dicho empleado menos el dni,
    que no es modificable.

    INSERTAR EMPLEADO/S: Por último, el programa dará la opción de insertar nuevos empleados.

Después de cada operación, se visualizará la lista para ver cómo va quedando.

Cuando el usuario indique que no desea hacer más operaciones,
los datos han de ser volcados en el archivo binario que se cargó al principio
(o en uno por defecto si el usuario no hubiera indicado ninguno).*/

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Empleado> mapEmpleados = new LinkedHashMap<>(); // Creación del mapa de Empleados

        // Creación del enlace del archivo binario donde se guardan los objetos de tipo Empleado
        String enlace = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7\\Tarea4\\empleados.bin";



        System.out.println("¿Desea consultar los datos de los empleados en el archivo binario o " + '\n' +
                "los datos de un nuevo empleado por consola? c(cargar)/i(insertar): ");
        String eleccion = sc.next();

        if (eleccion.equals("c") || eleccion.equals("C")) {

            try (ObjectInputStream lector = new ObjectInputStream(new FileInputStream(enlace))) { // Creación de lector binario

                mapEmpleados = (Map<String, Empleado>) lector.readObject(); // Cargamos el mapa de los empleados del archivo binario

                if (mapEmpleados == null) { // En el caso de que no haya nada, se le comenta al usuario
                    System.out.println("No existe ningún empleado en el archivo 'empleados.bin'");
                } else { // Si encuentra algo en el archivo, lo mostrará por pantalla
                    System.out.println(mapEmpleados);
                }

            } catch (IOException | ClassNotFoundException c) {
                System.out.println("Hubo errores en: "+c.getMessage());
            }
        } else { // Si queremos insertar empleados desde la consola, añadimos atributo por atributo

            while (true) {
                System.out.println("Introduzca su sueldo: ");
                int sueldo = sc.nextInt();
                sc.nextLine();

                System.out.println("Introduzca su nombre: ");
                String nombre = sc.nextLine();

                System.out.println("Introduzca su DNI: ");
                String dni = sc.next();

                System.out.println("Introduzca su edad: ");
                int edad = sc.nextInt();
                sc.nextLine();

                System.out.println("Introduzca su estatura: ");
                double estatura = sc.nextDouble();
                sc.nextLine();

                Empleado nuevoEmpleado = new Empleado(nombre, dni, edad, estatura, sueldo); // Creación de un nuevo empleado a partir de datos insertados en la consola

                mapEmpleados.put(nuevoEmpleado.getDniPersona(), nuevoEmpleado); // Adición del DNI y el objeto Empleado en el mapa de Empleados

                System.out.println("¿Desea dejar de insertar datos o seguir? s(salir)/i(insertar)");
                String salirOseguir = sc.next(); // Decidimos si queremos seguir añadiendo o si queremos salir de las inserciones de empleados desde la consola

                if (salirOseguir.equals("s") || salirOseguir.equals("S")) { // Si queremos salir de la inserción, añadimos al archivo binario el nuevo mapa de empleados
                    try (ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(enlace))) {
                        escritor.writeObject(mapEmpleados); // Añadimos el mapa de Empleados en el archivo binario
                    } catch (IOException e) {
                        System.out.println("Hubo errores en: "+e.getMessage());
                    }
                    break;
                }
            }
        }

        while (true) {
            // Indicamos un menú donde el usuario podrá realizar diversas oepraciones con el lustado de empleados guardado
            System.out.println("¿Qué le gustaría realizar?: ");
            System.out.println("1. VISUALIZAR LISTADO");
            System.out.println("2. BORRAR EMPLEADO/S");
            System.out.println("3. VISUALIZAR EMPLEADO");
            System.out.println("4. MODIFICAR EMPLEADO");
            System.out.println("5. INSERTAR EMPLEADO/S");

            int menu = sc.nextInt();

            switch (menu) {
                case 1: // Si desea ver el listado
                    System.out.println("El listado es el siguiente: ");
                    System.out.println(mapEmpleados); // Mostramos por pantalla el listado completo de los empleados
                    break;
                case 2: // Si desea borrar empleados del listado
                    while (true) {
                        System.out.println("Por favor, ingrese el DNI del empleado: ");
                        String dni = sc.next(); // Ingresamos el dni, el cual es la clave en el mapa

                        if (mapEmpleados.containsKey(dni)) { // Si el dni está presente en el mapa, eliminamos el empleado con dicho dni
                            mapEmpleados.remove(dni);
                        } else {
                            System.out.println("No existe ningún empleado con el DNI: "+dni); // Si no lo encuentra, se lo indicamos al usuario
                        }

                        System.out.println("¿Desea seguir borrando empleados del listado? (s/n)");
                        String sino = sc.next(); // Preguntamos si queremos seguir borrando empleados del listado

                        if (sino.equals("n") || sino.equals("N")) {
                            break; // En caso de que no, salimos de la operación
                        }
                    }

                    System.out.println(mapEmpleados); // Mostramos por pantalla el listado completo de los empleados una vez se han borrado los que quiera el usuario
                    break;
                case 3: // Si desea visualizar un empleado a partir de su dni
                    System.out.println("Por favor, ingrese el DNI del empleado: ");
                    String dni = sc.next(); // Ingresamos el dni, el cual es la clave en el mapa

                    if (mapEmpleados.containsKey(dni)) { // Si el dni está presente en el mapa, mostramos los datos del empleado asociado a dicho dni
                        System.out.println(mapEmpleados.get(dni));
                    } else {
                        System.out.println("No existe ningún empleado con el DNI: "+dni); // Si no lo encuentra, se lo indicamos al usuario
                    }

                    System.out.println(mapEmpleados); // Mostramos por pantalla el listado completo de los empleados una vez se ha realizado la operación
                    break;
                case 4: // Si desea modificar un empleado ya existente
                    System.out.println("¿Qué DNI desea modificar?: ");
                    String DNI = sc.next(); // Escribimos el DNI para modificar el empleado

                    if (mapEmpleados.containsKey(DNI)) { // Si el dni está presente, cambiamos los datos
                        System.out.println("Ingrese el nombre: ");
                        String nombre = sc.next();
                        System.out.println("Ingrese la estatura: ");
                        double estatura = sc.nextDouble();
                        System.out.println("Ingrese la edad: ");
                        int edad = sc.nextInt();
                        System.out.println("Ingrese el sueldo: ");
                        int sueldo = sc.nextInt();

                        Empleado empleado = new Empleado(nombre, DNI, sueldo, estatura, edad);

                        mapEmpleados.put(DNI, empleado); // Lo añadimos al mapa, y este automáticamente quitará el elemtno anterior por el nuevo, sin modificar el dni
                    } else {
                        System.out.println("No existe el empleado con DNI: "+DNI);
                    }

                    System.out.println(mapEmpleados); // Mostramos por pantalla el listado de los empleados
                    break;
                case 5: // Si desea inserta run nuevo empleado
                    System.out.println("Inserte el nombre: ");
                    String nombre = sc.next();
                    System.out.println("Inserte el dni: ");
                    String dNi = sc.next();
                    System.out.println("Inserte la edad: ");
                    int edad = sc.nextInt();
                    System.out.println("Inserte la estatura: ");
                    double estatura = sc.nextDouble();
                    System.out.println("Inserte el sueldo: ");
                    int sueldo = sc.nextInt();

                    Empleado empleado = new Empleado(nombre, dNi, edad, estatura, sueldo);

                    mapEmpleados.put(dNi, empleado); // Añadimos el nuevo empleado en el mapa

                    System.out.println(mapEmpleados); // Mostramos por pantalla el listado de los empleados
                    break;
            }

            System.out.println("¿Desea seguir realizando operaciones? (s/n)");
            String decision = sc.next(); // Decidimos si segui realizando operaciones

            if (decision.equals("n") || decision.equals("N")) { // Si queremos salir, el mapaserá insertado en el archivo binario
                try  {
                    ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(enlace));

                    escritor.writeObject(mapEmpleados);

                    escritor.close();
                } catch (IOException e) {
                    System.out.println("Hubo errores en: "+e.getMessage());
                }

                break;
            }
        }

    }
}
