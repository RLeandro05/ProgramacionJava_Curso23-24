package org.velazquez.U3.Pruebas;

public class Min_Max_En_Tabla {
    public static void main(String[] args) {
        /*Declaración de las variables a usar*/
        int n = 5;
        int m = 9;
        int contador = 0;

        int pos_i_min;
        int pos_j_min;

        int pos_i_max;
        int pos_j_max;

        int min = 100;
        int max = 1000;

        int min_aux = 10000;
        int max_aux = 0;

        /*Declaración de la tabla con dimensiones preestablecidas*/
        int[][] tabla = new int[n][m];

        /*Primero mostramos en pantalla la tabla completa sin ediciones*/
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                tabla[i][j] = (int) (Math.random()*((max+1)-min))+min;
                contador++;
                if (contador == m) {
                    System.out.println(tabla[i][j]);
                    contador = 0;
                } else {
                    System.out.print(tabla[i][j]+", ");
                }
            }
        }

        System.out.println();

        /*Buscamos el número mínimo de la tabla*/
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                if (tabla[i][j] < min_aux) {
                    min_aux = tabla[i][j];
                }
            }
        }

        System.out.println();

        /*Buscamos el número máximo de la tabla*/
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                if (tabla[i][j] > max_aux) {
                    max_aux = tabla[i][j];
                }
            }
        }

        System.out.println();

        contador = 0;

        /*Establecemos un nuevo for donde nos centraremos en buscar nuevamente el mínimo y máximo
        pero mostrando además su posición*/
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                contador++;

                if (contador == m) {
                    if (tabla[i][j] == min_aux) {
                        pos_i_min = i;
                        pos_j_min = j;

                        System.out.println(tabla[i][j]+"("+pos_i_min+","+pos_j_min+")");
                    } else {
                        System.out.println(tabla[i][j]);
                    }

                    if (tabla[i][j] == max_aux) {
                        pos_i_max = i;
                        pos_j_max = j;

                        System.out.println(tabla[i][j]+"("+pos_i_max+","+pos_j_max+")");
                    } else {
                        System.out.println(tabla[i][j]);
                    }
                    contador = 0;
                } else {
                    if (tabla[i][j] == min_aux) {
                        pos_i_min = i;
                        pos_j_min = j;

                        System.out.print(tabla[i][j]+"("+pos_i_min+","+pos_j_min+"), ");
                    } else {
                        System.out.print(tabla[i][j]+", ");
                    }

                    if (tabla[i][j] == max_aux) {
                        pos_i_max = i;
                        pos_j_max = j;

                        System.out.print(tabla[i][j]+"("+pos_i_max+","+pos_j_max+"), ");
                    } else {
                        System.out.print(tabla[i][j]+", ");
                    }
                }
            }
        }
    }
}
