package org.velazquez.U7.Tarea7.Ejercicio7;

import java.time.LocalDate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Socio s1 = new Socio("11111111A", "Leonardo", LocalDate.of(2000,5,12), LocalDate.of(2023,12,23), 100, 3);
        Socio s2 = new Socio("11111111C", "Alfonso", LocalDate.of(1989,3,10), LocalDate.of(2011,10,10), 200, 2);
        Socio s3 = new Socio("11111111B", "Gonzalo", LocalDate.of(1998,7,10), LocalDate.of(2010,9,22), 200, 5);
        Socio s4 = new Socio("11111111E", "Manolo", LocalDate.of(1985,7,24), LocalDate.of(2013,4,20), 80, 2);
        Socio s5 = new Socio("11111111D", "Lolita", LocalDate.of(2000,9,12), LocalDate.of(2020,6,13), 99, 2);

        Socio[] tablaSocios = new Socio[5];

        // Añadimos los socios
        tablaSocios[0] = s1;
        tablaSocios[1] = s2;
        tablaSocios[2] = s3;
        tablaSocios[3] = s4;
        tablaSocios[4] = s5;

        Stream<Socio> tablaDNIs = Stream.of(tablaSocios); // Guardamos la tabla en un stream

        Socio[] tablaDNIsOrdenados = tablaDNIs // Creamos una tabla en la que ordenamos por dni los socios guardados en el stream
                .sorted((socio1, socio2) -> socio1.getDniSocio().compareTo(socio2.getDniSocio()))
                .toArray(Socio[]::new);


        System.out.println("Socios ordenados por DNI: ");
        System.out.println();

        for (Socio socio : tablaDNIsOrdenados) {
            System.out.println(socio); // Mostramos por pantalla
        }

        System.out.println("----------------------------------------------------------------------------------------------------");

        Stream<Socio> tablaCuotas = Stream.of(tablaSocios); // Guardamos la tabla en un nuevo stream

        Socio[] tablaCuotasMayoresa100 = tablaCuotas // En una nueva tabla, filtramos el stream anterior para guardarlo en ella
                                        .filter(cuota -> cuota.getCuotaSocio() > 100)
                                        .toArray(Socio[]::new); // Lo convertimos en un Array

        System.out.println("Socios con cuotas mayores a 100: ");
        System.out.println();

        for (Socio socio : tablaCuotasMayoresa100) { // Mostramos por pantalla la nueva tabla
            System.out.println(socio);
        }

        System.out.println("----------------------------------------------------------------------------------------------------");

        Stream<Socio> tablaNombresA = Stream.of(tablaSocios); // Creamos un stream para mostrar de la tabla de socios los que empiecen por "A"

        Socio[] tablaNombreEmpizanporA = tablaNombresA
                                        .filter(socio -> socio.getNombreSocio().startsWith("A")) // Filtramos con .startsWith()
                                                .toArray(Socio[]::new); // Lo pasamos a Array, como la tabla en la que se va a guardar

        System.out.println("Socios cuyo nombre empiece por A: ");
        System.out.println();
        for (Socio socio : tablaNombreEmpizanporA) {
            System.out.println(socio);
        }
    }
}
