package org.velazquez.U1.Pruebas;

import java.util.Scanner;

public class Valores_A_Cifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int num_min = 1000;
        int num_max = 9999;
        int contador = 1;
        int n0 = 0;
        int suma;
        int n01 = 0;

        System.out.println("Introduzca un número aleatorio: ");
        n = sc.nextInt();

        //While para sacar las cifras del resto al revés
        while (n > 0) {
            int resto = n%10;
            n /= 10;

            n0 = n0*10 + resto;
        }

        //Método para sacar el resto ordenado y darles una clave
        while (n0 > 0) {
            int resto_final = n0%10;
            int clave = (int) (Math.random()*((num_max+1)-num_min))+num_min;
            System.out.println("La clave "+contador+" para el número "+resto_final+" es: "+clave);
            n0 /= 10;
            contador++;

            //While para sacar el resultado con las cifras de la clave y la cifra del inicio
            while (true) {
                int resto_c = clave%10;
                clave /= 10;

                suma = n01 + resto_c;
                n01 = suma;

                //Condición if para poder sumar sólo una vez por la cifra inicial
                //Resetear n01 para hacer las sumas de manera correcta
                if (clave <= 0) {
                    int suma_final = suma + resto_final;
                    System.out.println("El resultado de la cifra "+resto_final+" es: "+suma_final);
                    n01 = 0;
                    System.out.println();
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("FINALIZADO");
    }
}
