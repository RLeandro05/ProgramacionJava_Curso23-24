package org.velazquez.U1.Tarea7;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numMin = 97;
        int numMax = 122;

        int num = (int) (Math.random() * ((numMax+1) - numMin)) + numMin;
        System.out.println("El número es: "+num);

        char letra = (char) num;
        System.out.println("Corresponde con: "+letra);
    }
}
