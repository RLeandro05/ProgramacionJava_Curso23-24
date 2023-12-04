package org.velazquez.U3.Tarea4;

public class Ejercicio5 {
    public static void main(String[] args) {
        int n = 10;
        int contador = 0;
        int suma = 0;

        int min_aux = 1000;
        int max_aux = 0;

        int min = 200;
        int max = 300;

        int [][] tabla = new int[n][n];

        /*En este for se muestra en pantalla la tabla completa 10x10*/
        System.out.println("Tabla Original: ");
        for (int i = 0; i<tabla.length; i++) {
            for (int j = 0; j<tabla.length; j++) {
                contador++;
                tabla[i][j] = (int) (Math.random()*((max+1)-min))+min;
                if (contador == n) {
                    System.out.println(tabla[i][j]);
                    contador = 0;
                } else {
                    System.out.print(tabla[i][j]+", ");
                }
            }
        }

        System.out.println();

        /*En este for se muestra en pantalla sólo la parte diagonal de la tabla*/
        System.out.println("Tabla Diagonal: ");
        contador = 0;
        for (int i = 0; i<tabla.length; i++) {
            for (int j = 0; j<tabla.length; j++) {
                contador++;
                /*Indicamos en esta condición que se muestre en pantalla los números si i = j para así
                mostrar sólo la diagonal que queremos*/
                if (i == j) {
                    if (contador == n) {
                        System.out.println(tabla[i][j]);
                        contador = 0;
                    } else {
                        System.out.print(tabla[i][j]+", ");
                    }
                } else {
                    if (contador == n) {
                        System.out.println("---");
                        contador = 0;
                    } else {
                        System.out.print("---, ");
                    }
                }
            }
        }

        /*Para mostrar el mínimo además de la diagonal, añadimos el mínimo aparte*/
        System.out.println();
        for (int i = 0; i<tabla.length; i++) {
            for (int j = 0; j<tabla.length; j++) {
                if (i == j) {
                    if (tabla[i][j]<min_aux) {
                        min_aux=tabla[i][j];
                    }
                }
            }
        }

        /*Realizamos la misma operación pero añadiendo la condición de que si el número es
        el mínimo, lo destacamos*/
        System.out.println("Tabla Diagonal con Mínimo: ");
        for (int i = 0; i<tabla.length; i++) {
            for (int j = 0; j<tabla.length; j++) {
                contador++;
                if (i == j) {
                    if (contador == n) {
                        if (tabla[i][j] == min_aux) {
                            System.out.println("**"+min_aux+"**");
                        } else {
                            System.out.println(tabla[i][j]);
                        }
                        contador = 0;
                    } else if (tabla[i][j] == min_aux){
                        System.out.print("**"+min_aux+"**, ");
                    } else {
                        System.out.print(tabla[i][j]+", ");
                    }
                } else {
                    if (contador == n) {
                        System.out.println("---");
                        contador = 0;
                    } else {
                        System.out.print("---, ");
                    }
                }
            }
        }

        /*Luego, hacemos lo mismo pero con el máximo*/
        System.out.println();
        for (int i = 0; i<tabla.length; i++) {
            for (int j = 0; j<tabla.length; j++) {
                if (i == j) {
                    if (tabla[i][j]>max_aux) {
                        max_aux=tabla[i][j];
                    }
                }
            }
        }

        /*En este for haremos lo mismo que antes, pero mostrando el máximo*/
        System.out.println("Tabla Diagonal con Máximo: ");
        for (int i = 0; i<tabla.length; i++) {
            for (int j = 0; j<tabla.length; j++) {
                contador++;
                if (i == j) {
                    if (contador == n) {
                        if (tabla[i][j] == max_aux) {
                            System.out.println("**"+max_aux+"**");
                        } else {
                            System.out.println(tabla[i][j]);
                        }
                        contador = 0;
                    } else if (tabla[i][j] == max_aux){
                        System.out.print("**"+max_aux+"**, ");
                    } else {
                        System.out.print(tabla[i][j]+", ");
                    }
                } else {
                    if (contador == n) {
                        System.out.println("---");
                        contador = 0;
                    } else {
                        System.out.print("---, ");
                    }
                }
            }
        }

        /*Por último, sumamos los números diagonales usando de nuevo el mismo método de siempre*/
        System.out.println();
        for (int i = 0; i<tabla.length; i++) {
            for (int j = 0; j<tabla.length; j++) {
                if (i == j) {
                    suma+=tabla[i][j];
                }
            }
        }

        /*Finalmente, usamos la suma para dividirla entre 10 y mostramos en pantalla el resultado*/
        float media = suma/n;

        System.out.println("La media de la diagonal de la tabla es: "+media);
    }
}
