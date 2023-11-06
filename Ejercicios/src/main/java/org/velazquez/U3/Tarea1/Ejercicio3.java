package org.velazquez.U3.Tarea1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void Cilindro(int n, double radio, double altura) {
        if (n == 1) {
            double area_total = 2*Math.PI*radio*(altura+radio);
            System.out.println(Math.ceil(area_total*100)/100);
        } else {
            double volumen_total = Math.PI*radio*radio*altura;
            System.out.println(Math.ceil(volumen_total*100)/100);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Valor radio: ");
        double radio = sc.nextDouble();

        System.out.println("Valor altura: ");
        double altura = sc.nextDouble();

        Cilindro(n, radio, altura);
    }
}
