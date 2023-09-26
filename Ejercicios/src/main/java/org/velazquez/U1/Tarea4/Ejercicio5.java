package org.velazquez.U1.Tarea4;


import java.time.LocalDateTime;

public class Ejercicio5 {
    public static void main(String[] args) {

        LocalDateTime ahora = LocalDateTime.now();

        int hora = ahora.getHour();
        int minutos = ahora.getMinute();
        int segundos = ahora.getSecond();
        int anyo = ahora.getYear();
        int dia_de_mes = ahora.getDayOfMonth();
        int mes = ahora.getMonthValue();

        System.out.println("La fecha actual es: ");

        System.out.println("Año: "+anyo);
        System.out.println("Mes: "+dia_de_mes+" del "+mes);
        System.out.println("Hora: "+hora+":"+minutos+":"+segundos);
    }
}
