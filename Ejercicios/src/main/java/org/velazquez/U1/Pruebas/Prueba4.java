package org.velazquez.U1.Pruebas;


import java.util.Scanner;

public class Prueba4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int i = 0;
        int n0 = 0;
        int n1 = 0;
        int pos_inicio;
        int pos_fin ;

        System.out.println("Introduzca un número: ");
        n = sc.nextInt();

        System.out.println("Introduzca una posición inicial: ");
        pos_inicio = sc.nextInt();

        System.out.println("Introduzca una posición final: ");
        pos_fin = sc.nextInt();

        //While para sacar el número invertido
        while (n > 0) {
            int resto = n%10;
            n /= 10;

            n0 = n0*10 + resto;
        }

        //While para poder sacar resto por resto de manera correcta

        //Dentro de dicho while se imprimirán solo los números que no sena cero
        while (n0 > 0) {
            int resto_final = n0 % 10;

            n0 /= 10;

            if (i < pos_inicio || i > pos_fin) {
                n1 = n1*10 + resto_final;
            }

            i++;
        }
        System.out.println(n1);
    }
}
