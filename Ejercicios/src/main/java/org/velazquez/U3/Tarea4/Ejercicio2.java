package org.velazquez.U3.Tarea4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 8;
        int k = 0;
        int contador = 0;

        /*Establecemos un array con los colores para validarlos en el array que escribimos luego*/
        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "morado"};

        /*Establecemos el array donde colocamos palabras aleatorias junto a algunos colores*/
        String[] palabras = new String[n];

        /*En este for colocaremos las palabras del array*/
        for (int i = 0; i < n; i++) {
            System.out.println("Ponga la siguiente palabra: ");
            palabras[i] = sc.nextLine();
        }

        /*En este for mostramos en pantalla el array que hemos escrito al principio
        para ver la diferencia al final*/
        System.out.println();
        for (int i = 0; i<n; i++) {
            contador++;
            if (contador == 8) {
                System.out.print(palabras[i]);
            } else {
                System.out.print(palabras[i]+", ");
            }
        }

        /*El primer for se encarga de la posición i del array "palabras"*/
        for (int i = 0; i < n; i++) {
            /*El segundo array se encarga de la posición j del array "colores"*/
            for (int j = 0; j < colores.length; j++) {
                /*Establecemos una condición complementada con la segunda la cual establece que mientras
                la palabra sea distinta a los colores, seguirá mirando el resto de colores y si llega
                al final y sigue sin ser un color, entrará a un for donde buscaremos el color
                a reemplazar*/
                if (!palabras[i].equals(colores[j])) {
                    if (j == n - 1) {
                        /*En este for, buscaremos el color que reemplazará a la palabra que no lo era.
                        La posición l pertenece al array "colores" y usamos un contador k haciendo mención
                        a la posición de "palabras"*/
                        for (int l = 0; l<colores.length; l++) {
                            /*En esta condición mencionamos que cuando se encuentre una palabra color que se
                            encuentre en el array "colores", la intercambiemos por la otra que estaba guardada
                            en la posición i de "palabras", para intercambiar lugares y así poder tener los
                            colores por delante*/
                            if (palabras[k].equals(colores[l])) {
                                String aux = palabras[i];
                                palabras[i] = palabras[k];
                                palabras[k] = aux;
                                break;
                            }
                            /*En cambio, decimos que si no se encuentra ninguno en esa vuelta realizada,
                            sumemos +1 a la posición k para seguir buscando algún color correcto y también
                            restablecemos de nuevo la l para volver a buscar en el array "colores" completo de nuevo*/
                            else if (l == n-1){
                                l = -1;
                                k++;
                                /*Cuando se acabe el array "palabras" decimos que si supera la longitud, rompamos
                                el bucle para no dar errores*/
                                if (k >= colores.length) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            /*Fuera del for interior lo indicamos de nuevo para quitar por completo los errores del programa
            y poder mostrarlo en pantalla*/
            if (k == colores.length) {
                break;
            }
        }

        /*Al final, mostramos el resultado, pudiendo ver los colores delante y el resto, detrás*/
        System.out.println();
        System.out.println();
        contador = 0;
        for (int i = 0; i<n; i++) {
            contador++;
            if (contador == 8) {
                System.out.print(palabras[i]);
            } else {
                System.out.print(palabras[i]+", ");
            }
        }
    }
}
