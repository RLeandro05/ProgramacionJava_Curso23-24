package org.velazquez.U4.Tarea1.Ejercicio6;

public class Banco {
    private final String nombre;
    private float capital;
    private String direccion;

    //Mostramos el primer banco
    public Banco(float capital, String direccion) {
        this.nombre = "Santander";
        this.capital = capital;
        this.direccion = direccion;
    }
    //Mostramos un segundo banco sin el dato de capital, teniendo de predefinido 5.2
    public Banco(String direccion) {
        this.nombre = "BBVA";
        this.capital = 5.2f;
        this.direccion = direccion;
    }

    /*REDUNDANTE PERO USABLE
    //Funciones modificables de adquisión de Capital de banco
    public float getCapital() {
        return capital;
    }
    public void setCapital(float capital) {
        this.capital = capital;
    }

    //Funciones modificables de adquisión de Dirección de banco
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    */
    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", capital=" + capital +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
