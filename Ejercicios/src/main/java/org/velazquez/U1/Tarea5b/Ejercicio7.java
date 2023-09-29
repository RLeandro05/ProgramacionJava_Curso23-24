package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("La nota del primer trimestre es: ");
        short n1 = teclado.nextShort();
        System.out.println("La nota del segundo trimestre es de: ");
        short n2 = teclado.nextShort();
        System.out.println("La nota del tercer trimestre es de: ");
        short n3 = teclado.nextShort();

        System.out.println("Sabiendo que el primer trimestre vale 30%, el segundo vale 20%");
        System.out.println("y el tercero vale 50%");

        short primero = (short) (n1*0.3);
        short segundo = (short) (n2*0.2);
        short tercero = (short) (n3*0.5);
        short resultado = (short) (primero+segundo+tercero);

        if (resultado < 5){
            System.out.println("Tu nota media es: "+resultado+ " (Insuficiente)");
        }
        if (resultado >= 5 && resultado < 6) {
            System.out.println("Tu nota media es: "+resultado+ " (Suficiente)");
        }
        if (resultado >= 6 && resultado < 7) {
            System.out.println("Tu nota media es: "+resultado+ " (Bien)");
        }
        if (resultado >= 7 && resultado < 9) {
            System.out.println("Tu nota media es: "+resultado+ " (Notable)");
        }
        if (resultado >= 9) {
            System.out.println("Tu nota media es: "+resultado+ " (Sobresaliente)");
        }
    }
}