package org.velazquez.U7.Tarea5;

/*Diseñar una suite que ayude a gestionar un procedimiento selectivo de una administración (oposiciones).
La suite estará formada por tres aplicaciones (clases).
Adicionalmente tendrá una clase que se llame Aspirante que tendrá la información del aspirante
(Nombre, DNI y teléfono). Al comienzo, la aplicación principal mostrará un menú con 4 opciones:

1. Introducir datos de aspirantes
2. Calificar prueba
3. Aprobados
4. Salir
IntroducirAspirantes v1.0: que ayuda a introducir los datos de los aspirantes.

Tendrá un método InsertaAspirante, que recoje el nombre, el DNI y el teléfono del aspirante.
La aplicación asigna un número identificativo incremental a cada aspirante.
La aplicación pregunta cada vez que termina de insertarse un aspirante si quiere insertar otro más o no.
En caso de que no, el proceso de inserción termina y se devuelve el control a la aplicación principal.
Cuando se termine de recolectar todos los aspirantes, desde la aplicación principal,
se llamará al método guardarFicheros, que generá dos ficheros:
Uno que relacione el número de aspirante con la información del aspirante (se llamará aspirantes.dat);
y otro, simplemente será una lista con los números identificativos de los aspirantes
(que se llamará ids_aspirantes.dat). Ambos ficheros serán de tipo binario.
CalificacionPruebas v1.0: que ayuda a introducir la calificación obtenida por cada opositor en cada prueba.

Lee el fichero de los números de aspirantes (ids_aspirantes.dat) y la calificación de la última prueba realizada.
Cada número de aspirante, se relaciona por tanto por una LISTA de calificaciones.
Cuando se termine de introducir la información, desde la aplicación principal,
se llamará al método guardarFichero, que generará un fichero (que se llamará calificaciones.dat),
en el que se relacionen todos los aspirantes en el que se relacione su número identificativo
con su lista de calificaciones.
Aprobados v1.0: que genera un listado con los aspirantes que han superado las oposiciones.

Lee el fichero calificaciones.dat y lo carga en una estructura de datos igual a la del anterior programa.
Lee el fichero aspirantes.dat y lo carga en una estructura de datos igual a la del programa IntroducirAspirantes.
Genera una estructura adicional donde se guarda simplemente el Nombre, el DNI y la calificación media calculada.
Será útil tener un método interno calcularMedia, que recibe el número identificativo del aspirante,
y devuelve la media de las calificaciones.
Finalmente, debe haber un método que sea generarInforme, en el que se liste a los aspirantes con su Nombre,
DNI y CalificaciónMedia, ordenados alfabéticamente por nombre, y con un formato similar al siguiente:
Nombre	DNI	Calificación Media
XXXXXXXXXXXXXXXXXX	99999999	99.99
XXXXXXXXXXXXXXXXXX	99999999	99.99*/

import java.io.Serializable;
import java.util.*;

public class Main implements Serializable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Escogemos una de las opciones disponibles del menú
        System.out.println("Escoja una de la siguientes opciones: ");
        System.out.println("1. Introducir datos de aspirantes");
        System.out.println("2. Calificar prueba");
        System.out.println("3. Aprobados");
        System.out.println("4. Salir");

        int menu = sc.nextInt(); // Dependiendo de la elección, hacemos un switch para ejecutar una cosa u otra

        switch (menu) {
            case 1: // Si queremos introducir aspirantes
                IntroducirAspirantes introducir = new IntroducirAspirantes(); // Creamos un objeto de la clase para poder operar
                introducir.InsertaAspirante(); // Llamamos al método para insertar un nuevo aspirante
                introducir.guardarFicheros(introducir.getListaAspirantes()); // Luego, llamamos al método "gaurdarFiheros"
                break;
            case 2: // Si queremos calificar a cada aspirante
                CalificacionPruebas calificar = new CalificacionPruebas(); // Creamos un objeto de la clase para poder operar
                calificar.insertarCalificaciones(1, 7.5);
                calificar.insertarCalificaciones(1, 8);
                calificar.insertarCalificaciones(1, 6);
                calificar.insertarCalificaciones(2, 5);
                calificar.insertarCalificaciones(2, 7.9);
                calificar.insertarCalificaciones(3, 6);
                calificar.insertarCalificaciones(3, 4);

                calificar.guardarFichero(); // Luego, llamamos al método "guardarFichero" para almacenar la anterior lista de calificaciones en un archivo
                break;
            case 3: // Si queremos mostrar la lista de los aspirantes junto a sus medias calculadas
                Aprobados aprobados = new Aprobados(); // Creamos un objeto de tipo Aprobado para realizar las operaciones

                // Cargamos tanto las calificaciones como los aspirantes
                aprobados.cargarCalificaciones();
                aprobados.cargarAspirantes();

                // Calculamos las medias de los aspirantes que queramos
                aprobados.calcularMedia(1);
                aprobados.calcularMedia(2);
                aprobados.calcularMedia(3);

                aprobados.guardarNombresDNIsMedias(); // Llamamos al método donde nos muestre el nombre, dni y media de los aspirantes que hemos pasado
                break;
            case 4: // Si ueremos salir
                System.out.println("Saliste!");
                break;
            default:
                System.out.println("Número incorrecto.");
        }
    }


}
