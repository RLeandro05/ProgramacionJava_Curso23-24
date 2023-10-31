package org.velazquez.U1.Depuracion;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int i,num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        num = sc.nextInt();

        System.out.println("Mostrando los 10 números posteriores: "+num);
        i = num;

        //El fallo se ubica en el cambio de signo de mayor a menor
        //Luego habría que incorporar el contador de i++ arriba del print
        while (i < num+10) {
            i++;
            System.out.println("Número posterior "+i);
        }
    }
}
