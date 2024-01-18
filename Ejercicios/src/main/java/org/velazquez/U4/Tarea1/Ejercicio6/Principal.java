package org.velazquez.U4.Tarea1.Ejercicio6;

public class Principal {
    public static void main(String[] args) {

        //Llamada a primer banco usando datos modificables como parámetros
        Banco banco = new Banco(1349, "Calle Pizjuán Nº 23");
        //Llamada a segundo banco usando un sólo dato modificable como parámetro
        Banco banco1 = new Banco("Calle Almonte Nº1");

        System.out.println(banco);
        System.out.println(banco1);

    }
}
