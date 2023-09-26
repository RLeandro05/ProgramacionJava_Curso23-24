package org.velazquez.U1.Tarea4;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("La variable SHORT tiene como máximo: "+Short.MAX_VALUE);
        short suma = (short) (Short.MAX_VALUE + 1);

        System.out.println("Esto ocurre al sumarle 1 a ese máximo: "+ suma);

        System.out.println("Al sumarle uno a su máximo, este cambia a su mínimo.");

        short resta = (short) (Short.MIN_VALUE-1);

        System.out.println("En el caso de su mínimo, al sumarlo con -1, este se convierte en su máximo: "+resta);
    }
}
