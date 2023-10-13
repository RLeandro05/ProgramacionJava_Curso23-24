package org.velazquez.U1.Tarea8;

public class Ejercicio11 {
    public static void main(String[] args) {

        int n;
        int resultado;
        int multiplicador;

        for (n=1;n<=10;n++) {
            System.out.println("Tabla del "+n+": ");
            for (multiplicador=1;multiplicador<=10;multiplicador++) {
                resultado = n*multiplicador;
                System.out.println(resultado);
            }
            System.out.println(" ");
        }


    }
}
