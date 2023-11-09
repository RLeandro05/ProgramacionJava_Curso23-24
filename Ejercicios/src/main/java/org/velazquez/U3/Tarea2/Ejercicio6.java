package org.velazquez.U3.Tarea2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String contrasena = sc.nextLine();

        //Lo primero es indicar ambas posiciones. Como queremos mostrar al jugador 2 el primer carácter
        //ponemos posición 0, ya que siempre comienza en 0.
        //Luego, simplemente se usa charAt para sacar el caracter y mostrarlo
        int pos_1 = 0;
        char caracter_1 = contrasena.charAt(pos_1);

        //En este caso, hay que saber diferenciar lenght de charAt. Lenght dirá cuántos caracteres hay, pero
        //al empezar desde la posición 0, la posición final siempre será lenght-1 para que pueda mostrar la posición final
        //En caso de que no se haga dicha resta, no compila
        int pos_2 = contrasena.length()-1;
        char caracter_2 = contrasena.charAt(pos_2);

        System.out.println();
        System.out.println("JUGADOR 2, intente adivinar la respuesta.");
        System.out.println("La contraseña contiene "+contrasena.length()+" caracteres.");
        System.out.println("El primer caracter es: "+caracter_1);
        System.out.println("El segundo caracter es: "+caracter_2);

        String respuesta  = sc.nextLine();

        //Por último, un simple if que dirá si acertamos o no la contraseña
        if (respuesta.equals(contrasena)) {
            System.out.println("¡ACERTASTE!");
        } else {
            System.out.println("¡FALLASTE!");
        }
    }
}
