package org.velazquez.U5.Tarea2.Ejercicio1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PilaTabla implements Pila{

    @Override
    public void numeros() {
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[10];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = sc.nextInt();
        }

        for (int i = 0; i < numero.length-1; i++) {
            for (int j = 0; j < numero.length-i-1; j++) {
                if (numero[j] < numero[j+1]) {
                    int temp = numero[j];
                    numero[j] = numero[j+1];
                    numero[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numero));
    }

}
