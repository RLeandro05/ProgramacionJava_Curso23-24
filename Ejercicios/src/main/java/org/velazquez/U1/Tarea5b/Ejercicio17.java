package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número de hasta 5 cifras: ");
        int n= teclado.nextInt();//n
        int ult_dig=0;
        while(n>0)
        {
            ult_dig = n%10;
            n=n/10;
        }
        System.out.println(ult_dig);


    }
}

