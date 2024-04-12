package org.velazquez.U6.Tarea3.Ejercicio1;

public class Cliente {

    private static int edad; //Creamos el atributo edad

    public Cliente(int edad) {
        this.edad = edad;
    }

    public static int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "edad=" + edad +
                '}';
    }
}
