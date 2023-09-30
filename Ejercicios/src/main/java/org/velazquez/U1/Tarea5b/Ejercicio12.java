package org.velazquez.U1.Tarea5b;

import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un primer número entero: ");
        int n1 = teclado.nextInt();

        System.out.println("Introduce un segundo número entero: ");
        int n2 = teclado.nextInt();

        System.out.println("Introduce un tercer número entero: ");
        int n3 = teclado.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                if (n2 > n3) {
                    System.out.println("Ordenado de mayor a menor: "+n1+","+n2+","+n3);
                }
                else {
                    System.out.println("Ordenado de mayor a menor: "+n1+","+n3+","+n2);
                }
            }
            else {
                System.out.println("Ordenado de mayor a menor: "+n3+","+n1+","+n2);
            }
        }
        else {
            if (n2 > n3) {
                if (n1 > n3) {
                    System.out.println("Ordenado de mayor a menor: "+n2+","+n1+","+n3);
                }
                else {
                    System.out.println("Ordenado de mayor a menor: "+n2+","+n3+","+n1);
                }
            }
            else {
                if (n3 > n1) {
                    if (n2 > n1) {
                        System.out.println("Ordenado de mayor a menor: "+n3+","+n2+","+n1);
                    }
                    else {
                        System.out.println("Ordenado de mayor a menor: "+n3+","+n1+","+n2);
                    }
                }
                else {
                    System.out.println("Ordenado de mayor a menor: "+n1+","+n3+","+n2);
                }
            }
        }
    }
}
