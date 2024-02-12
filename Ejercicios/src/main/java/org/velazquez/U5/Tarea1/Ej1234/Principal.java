package org.velazquez.U5.Tarea1.Ej1234;

import org.velazquez.U4.Tarea1.Ejercicio10.Hora;
import org.velazquez.U5.Tarea1.Ej1234.Ejercicio2.Hora12;

public class Principal {
    public static void main(String[] args) {

        /*Creamos el objeto "reloj1" para introducir los parámetros del constructor*/
        Hora reloj1 = new Hora();
        Hora12 reloj2 = new Hora12(13,23);

        System.out.println(reloj2);
    }
}
