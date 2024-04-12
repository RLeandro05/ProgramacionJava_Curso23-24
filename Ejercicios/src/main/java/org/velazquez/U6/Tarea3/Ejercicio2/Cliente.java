package org.velazquez.U6.Tarea3.Ejercicio2;

public class Cliente {

    private static int edad; //Creamos el atributo edad. Lo ponemos en static para poder usar el getEdad en static

    public Cliente(int edad) {
        this.edad = edad;
    }

    public static int getEdad() {
        return edad;
    } //Lo volvemos static para poder usarloe en MIExcepcion

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
