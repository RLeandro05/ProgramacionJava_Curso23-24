package org.velazquez.U3.Tarea2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();

        //Para eliminar todas las vocales sin importar si es mayúscula, minúscula o con tilde
        //usamos un replaceall dentro de la frase para eliminar duchos caracteres y reemplazarlos por nada en
        //la otra parte del paréntesis
        String frase_final = frase.replaceAll("[AEIOUaeiouÁÉÍÓÚáéíóú]","");

        System.out.println(frase_final);
    }
}
