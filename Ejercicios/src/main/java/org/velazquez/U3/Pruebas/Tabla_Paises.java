package org.velazquez.U3.Pruebas;

public class Tabla_Paises {
    public static void main(String[] args) {

        /*Definimos las variables a usar en el programa*/
        int filas = 4;
        int columnas = 10;

        int min = 1000;
        int max = 0;

        int suma = 0;

        int min_t = 140;
        int max_t = 210;

        int contador_pais = 1;

        /*Creamos la tabla bidimensional con las dimensiones dadas al incio*/
        int[][] tabla = new int[filas][columnas];

        /*Creamos la tabla aleatoria*/
        for (int i = 0; i<filas; i++) {
            for (int j = 0; j<columnas; j++) {
                tabla[i][j] = (int) (Math.random()*((max_t+1)-min_t))+min_t;
            }
        }

        int contador = 0;
        /*Mostramos la tabla en pantalla*/
        for (int i = 0; i<filas; i++) {
            for (int j = 0; j<columnas; j++) {
                contador++;

                if (contador == columnas) {
                    System.out.println(tabla[i][j]);
                    contador = 0;
                } else {
                    System.out.print(tabla[i][j]+", ");
                }
            }
        }

        System.out.println();

        /*Aquí procederemos a hacer las sumas, medias, mínimos y máximos de cada fila*/
        for (int i = 0; i<filas; i++) {
            for (int j = 0; j<columnas; j++) {

                /*Indicamos que si termina la primera fila, sacaremos la info final acerca de los reusltados*/
                if (j == columnas-1) {
                    if (tabla[i][j] < min) {
                        min = tabla[i][j];
                    }
                    if (tabla[i][j] > max) {
                        max = tabla[i][j];
                    }
                    suma += tabla[i][j];

                    switch (contador_pais) {
                        case 1 -> System.out.print("España:    ");
                        case 2 -> System.out.print("Rusia:     ");
                        case 3 -> System.out.print("Japón:     ");
                        case 4 -> System.out.print("Australia: ");
                    }
                    contador_pais++;

                    int media = suma/10;

                    System.out.print("Media->"+media+" ");
                    suma = 0;

                    System.out.print("Mínimo->"+min+" ");
                    min = 1000;

                    System.out.println("Máximo->"+max);
                    max = 0;

                }
                /*En el caso de que no se cumpla, simplemente seguiremos realizando los cálculos
                y poniendo el nuevo mínimo o máximo de la fila hasta que llegue al final*/
                else {
                    suma += tabla[i][j];

                    if (tabla[i][j] < min) {
                        min = tabla[i][j];
                    }
                    if (tabla[i][j] > max) {
                        max = tabla[i][j];
                    }
                }
            }
        }
    }
}
