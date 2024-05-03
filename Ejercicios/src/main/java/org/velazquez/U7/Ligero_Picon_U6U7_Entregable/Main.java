package org.velazquez.U7.Ligero_Picon_U6U7_Entregable;

import java.io.Serializable;
import java.util.Scanner;

public class Main implements Serializable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Maraton m1 = new Maraton(); // Creamos una maratón

        // Atletas precreados para cumplir el requisito
        Atleta at1 = new Atleta("Leo", "Inglaterra", 2938, true, Atleta.categoriasAtleta.SENIOR);
        Atleta at2 = new Atleta("Marina", "Suiza", 120834, true, Atleta.categoriasAtleta.SENIOR);
        Atleta at3 = new Atleta("Gustavo", "Portugal", 8274, true, Atleta.categoriasAtleta.SENIOR);
        Atleta at4 = new Atleta("Rodolfo", "Inglaterra", 98243, true, Atleta.categoriasAtleta.SENIOR);
        Atleta at5 = new Atleta("Dios", "Inglaterra", 29732, true, Atleta.categoriasAtleta.SENIOR);
        Atleta at6 = new Atleta("Jesus", "Suiza", 94334, true, Atleta.categoriasAtleta.JUNIOR);
        Atleta at7 = new Atleta("Maria", "Espania", 2864, true, Atleta.categoriasAtleta.JUNIOR);
        Atleta at8 = new Atleta("Jose", "Alemania", 84554, true, Atleta.categoriasAtleta.JUNIOR);
        Atleta at9 = new Atleta("Miguel", "Mexico", 273644, true, Atleta.categoriasAtleta.JUNIOR);
        Atleta at10 = new Atleta("Judas", "Mexico", 8473, true, Atleta.categoriasAtleta.JUNIOR);
        Atleta at11 = new Atleta("Tadeo", "Colombia", 0, false, Atleta.categoriasAtleta.VETERANO);
        Atleta at12 = new Atleta("Lucia", "Colombia", 0, false, Atleta.categoriasAtleta.VETERANO);
        Atleta at13 = new Atleta("Lorena", "Australia", 0, false, Atleta.categoriasAtleta.VETERANO);
        Atleta at14 = new Atleta("Lucia", "Nigeria", 0, false, Atleta.categoriasAtleta.VETERANO);
        Atleta at15 = new Atleta("Mario", "Nigeria", 0, false, Atleta.categoriasAtleta.VETERANO);

        m1.ingresarPreCreados(at1);
        System.out.println("------------------------------------------------------------------------------------------");
        m1.ingresarPreCreados(at2);
        System.out.println("------------------------------------------------------------------------------------------");
        m1.ingresarPreCreados(at3);
        System.out.println("------------------------------------------------------------------------------------------");
        m1.ingresarPreCreados(at4);
        System.out.println("------------------------------------------------------------------------------------------");
        m1.ingresarPreCreados(at5);
        System.out.println("------------------------------------------------------------------------------------------");
        m1.ingresarPreCreados(at6);
        System.out.println("------------------------------------------------------------------------------------------");
        m1.ingresarPreCreados(at7);
        System.out.println("------------------------------------------------------------------------------------------");
        m1.ingresarPreCreados(at8);
        System.out.println("------------------------------------------------------------------------------------------");
        m1.ingresarPreCreados(at9);
        System.out.println("------------------------------------------------------------------------------------------");
        m1.ingresarPreCreados(at10);
        System.out.println("------------------------------------------------------------------------------------------");
        m1.ingresarPreCreados(at11);
        System.out.println("------------------------------------------------------------------------------------------");
        m1.ingresarPreCreados(at12);
        System.out.println("------------------------------------------------------------------------------------------");
        m1.ingresarPreCreados(at13);
        System.out.println("------------------------------------------------------------------------------------------");
        m1.ingresarPreCreados(at14);
        System.out.println("------------------------------------------------------------------------------------------");
        m1.ingresarPreCreados(at15);
        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("Se ha creado una lista con atletas precreados desde el código principal.");

        System.out.println();

        while (true) {
            System.out.println();

            System.out.println("Seleccione una de las siguientes opciones: ");
            System.out.println("1. Cargar atletas");
            System.out.println("2. Guardar atletas");
            System.out.println("3. Inscribir atleta");
            System.out.println("4. Guardar tiempo");
            System.out.println("5. Borrar atleta");
            System.out.println("6. Mostrar lista de finishers");
            System.out.println("7. Mostrar lista de categorías");
            System.out.println("8. Mostrar participantes por país");
            System.out.println("9. Salir del programa");

            int eleccion = sc.nextInt();

            if (eleccion == 9) {
                System.out.println("¡Saliste!");
                break;
            }

            switch (eleccion) {
                case 1:
                    m1.cargarAtletas();
                    break;
                case 2:
                    m1.guardarAtletas();
                    break;
                case 3:
                    m1.inscribirAtleta();
                    break;
                case 4:
                    m1.guardarTiempo(1, 2000);
                    break;
                case 5:
                    m1.borrarAtleta(1);
                    break;
                case 6:
                    m1.MostrarListaFinishers();
                    break;
                case 7:
                    m1.MostrarListaCategoria(Atleta.categoriasAtleta.SENIOR);
                    break;
                case 8:
                    m1.ParticipantesPorPais("Inglaterra");
                    break;
            }

            System.out.println("------------------------------------------------------------------------------------------");
        }

    }
}
