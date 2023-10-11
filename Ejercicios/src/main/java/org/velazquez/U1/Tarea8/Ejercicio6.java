package org.velazquez.U1.Tarea8;

public class Ejercicio6 {
    public static void main(String[] args) {
        int siete = 7;
        int multiplicador = 0;
        int fin;

        while (true) {
            multiplicador++;

            fin = siete * multiplicador;
            System.out.println(fin);

            if (fin >= 100) {
                System.out.println(fin+" es el número que sobrepasa los múltiplos de siete mayores a 100");
                break;
            }

        }
    }
}
