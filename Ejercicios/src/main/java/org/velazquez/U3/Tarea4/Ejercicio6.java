package org.velazquez.U3.Tarea4;


public class Ejercicio6 {
    public static void main(String[] args) {

        /*Declaramos las variables a usar*/
        int n = 6;
        int m = 10;
        int contador = 0;
        int min_aux = 1000;
        int max_aux = 0;

        int min = 0;
        int max = 1000;

        int[][] tabla = new int[n][m];
        /*Declaramos las variables de las posiciones para el mínimo y el máximo*/
        int pos_mini;
        int pos_minj;
        int pos_maxi;
        int pos_maxj;

        /*En este for ponemos números aleatorios en el array bidimensional*/
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                tabla[i][j] = (int) (Math.random()*((max+1)-min))+min;
            }
        }

        /*En este for sacamos el mínimo número del array*/
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                if (tabla[i][j]<min_aux) {
                    min_aux=tabla[i][j];
                }
            }
        }
        /*En este for sacamos el máximo número del array*/
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                if (tabla[i][j]>max_aux) {
                    max_aux=tabla[i][j];
                }
            }
        }

        /*En este for mostramos los números del array en pantalla pero destacando el mínimo y máximo
        además de sus posiciones*/
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {

                contador++;
                if (contador == m) {
                    if (tabla[i][j] == min_aux) {
                        System.out.print("**"+tabla[i][j]+"**");
                        pos_mini = i;
                        pos_minj = j;
                        System.out.println("("+pos_mini+","+pos_minj+")");
                    } else if (tabla[i][j] == max_aux){
                        System.out.println("**"+tabla[i][j]+"**");
                        pos_maxi = i;
                        pos_maxj = j;
                        System.out.println("("+pos_maxi+","+pos_maxj+")");
                    } else {
                        System.out.println(tabla[i][j]);
                    }
                    contador = 0;
                } else {
                    if (tabla[i][j] == min_aux) {
                        System.out.print("**"+tabla[i][j]+"**");
                        pos_mini = i;
                        pos_minj = j;
                        System.out.print("("+pos_mini+","+pos_minj+"), ");
                    } else if (tabla[i][j] == max_aux){
                        System.out.print("**"+tabla[i][j]+"**");
                        pos_maxi = i;
                        pos_maxj = j;
                        System.out.print("("+pos_maxi+","+pos_maxj+"), ");
                    } else {
                        System.out.print(tabla[i][j]+", ");
                    }
                }
            }
        }


    }
}
