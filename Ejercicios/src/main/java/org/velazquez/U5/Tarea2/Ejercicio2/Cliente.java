package org.velazquez.U5.Tarea2.Ejercicio2;

import java.util.Objects;

public class Cliente implements Comparable <Cliente> {

    /*Creación de atributos*/
    private String DNI;
    private String Nombre;
    private int Edad;
    private double Saldo;

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    /*Creación del constructor*/
    public Cliente(String DNI, String nombre, int edad, double saldo) {
        this.DNI = DNI;
        Nombre = nombre;
        Edad = edad;
        Saldo = saldo;
    }

    /*Creación del método toString para mostrar el resultado en pantalla de los atributos*/
    @Override
    public String toString() {
        return "Cliente{" +
                "DNI='" + DNI + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Saldo=" + Saldo +
                '}';
    }

    /*Creación del método equals del DNI de los clientes*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(DNI, cliente.DNI);
    }

    /*Creación del método compareTo para hacer ordenaciones por DNI por defecto*/
    @Override
    public int compareTo(Cliente o) {
        return this.DNI.compareTo(o.DNI);
    }
}


