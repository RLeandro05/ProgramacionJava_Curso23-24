package org.velazquez.U1.Tarea4;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("El alumno Manuel Ortega va a ser evaluado con su media final a partir de dos notas, un 7,1 y un 5,8.");
        System.out.println("Sabiendo que la primera nota vale un 40% y la segunda nota vale un 60%,");

        double n1 = 7.1;
        double n2 = 5.8;

        double multiplicacion1 = (double) (n1*0.4);
        double multiplicacion2 = (double) (n2*0.6);

        double suma = (double) (multiplicacion2+multiplicacion1);

        System.out.println("su media aritmética es: "+suma);


    }
}
