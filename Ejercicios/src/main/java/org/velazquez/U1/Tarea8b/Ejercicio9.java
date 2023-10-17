package org.velazquez.U1.Tarea8b;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Establecimiento de variables
        int n;
        int i;
        int j;

        //Introducir la altura
        System.out.println("Dame un número entero: ");
        n = sc.nextInt();


        /*Se establece un for diciendo que si i <= n, entonces irá imprimiendo
        asteriscos en el palo vertical*/

        for (i = 1;i <= n;i++) {
            System.out.println("*");
        }

        /*Se establece un segundo for para el palo horizontal
        pero quitando el "ln" del print para poder sacarlo en una fila*/
        for (j = 1;j <= ((n/2)+1);j++) {
            System.out.print("*");
        }


    }
}
