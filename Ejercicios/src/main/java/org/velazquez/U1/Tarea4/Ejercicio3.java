package org.velazquez.U1.Tarea4;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("El alumno Manuel Ortega va a ser evaluado con su media final a partir de tres notas, un 7,5 y un 5,8 y un 9.");
        System.out.println("Sabiendo que la primera nota vale un 40% y la segunda nota vale un 20% y la tercera nota vale un 40%%,");

        double n1 = 7.5;
        double n2 = 5.8;
        double n3 = 9;

        short multiplicacion1 = (short) (n1*0.4);
        short multiplicacion2 = (short) (n2*0.2);
        short multiplicacion3 = (short) (n3*0.4);

        short suma = (short) (multiplicacion2+multiplicacion1+multiplicacion3);

        System.out.println("su media aritmética es: "+suma);


    }
}
