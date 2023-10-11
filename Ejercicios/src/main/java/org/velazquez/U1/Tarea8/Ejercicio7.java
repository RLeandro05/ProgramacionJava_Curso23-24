package org.velazquez.U1.Tarea8;

public class Ejercicio7 {
    public static void main(String[] args) {
        long productoimpares = 1;

        for (int i=1;i<20;i+=2) {

            productoimpares = productoimpares*i;
        }

        System.out.println("El resultado de multiplicar los primeros 10 números impares es: "+productoimpares);


    }
}
