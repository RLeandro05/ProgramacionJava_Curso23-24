package org.velazquez.U4.Tarea1.Ejercicio10;

public class Principal {
    public static void main(String[] args) {

        Hora hora1 = new Hora();
        Hora hora2 = new Hora();

        hora1.setHora(10);
        hora1.setMinuto(12);
        hora1.setSegundo(30);

        System.out.println(hora1);

        System.out.println();

        hora2.setHora(10);
        hora2.setMinuto(12);
        hora2.setSegundo(30);
        hora2.setN(40);
        hora2.nuevaHora();

        System.out.println(hora2);
    }
}
