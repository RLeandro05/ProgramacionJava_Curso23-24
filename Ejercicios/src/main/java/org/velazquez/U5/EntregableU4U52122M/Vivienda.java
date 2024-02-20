package org.velazquez.U5.EntregableU4U52122M;

import java.util.Arrays;
import java.util.Comparator;

public class Vivienda extends Propiedad implements MostrarPrecioVenta, Comparator <Vivienda> {
    private int num_banios;
    private int num_habitaciones;
    private int capacidad_max;
    private double precio;
    private Persona[] personas;

    public int getNum_banios() {
        return num_banios;
    }

    public void setNum_banios(int num_banios) {
        this.num_banios = num_banios;
    }

    public int getNum_habitaciones() {
        return num_habitaciones;
    }

    public void setNum_habitaciones(int num_habitaciones) {
        this.num_habitaciones = num_habitaciones;
    }

    public int getCapacidad_max() {
        return capacidad_max;
    }

    public void setCapacidad_max(int capacidad_max) {
        this.capacidad_max = capacidad_max;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public Vivienda(int anio_construccion, String direccion, float metros_cuadrados, int num_banios, int num_habitaciones, int capacidad_max, int precio) {
        super(anio_construccion, direccion, metros_cuadrados);
        personas = new Persona[capacidad_max];
        this.num_banios = num_banios;
        this.num_habitaciones = num_habitaciones;
        this.capacidad_max = capacidad_max;
        this.precio = precio;
    }

    @Override
    public void mostrarPropiedad() {
        System.out.println("Llamado el 20/02/2024 a Vivienda para mostrar las " +
                "diversas Viviendas que se posee");
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy una Vivienda con capacidad máxima " + capacidad_max + " y valgo: " + precio + "€");
    }

    public void addPersona(Persona persona) {

        // Verificar si la persona ya existe en la lista
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null && personas[i].equals(persona)) {
                return;
            }
        }

        // Encontrar la primera posición nula para agregar la nueva persona
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] == null) {
                personas[i] = persona;
                return;
            }
        }
    }

    public void eliminarPersona(Persona persona) {
        int index = -1;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].equals(persona)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            Persona[] nuevaPersona = new Persona[personas.length - 1];
            for (int i = 0, j = 0; i < personas.length; i++) {
                if (i != index) {
                    nuevaPersona[j++] = personas[i];
                }
            }
            personas = nuevaPersona;
        }
    }

    @Override
    public int compare(Vivienda o1, Vivienda o2) {
        if (o1.num_habitaciones < o2.num_habitaciones) {
            return -1;
        } else if (o1.num_habitaciones > o2.num_habitaciones) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "num_banios=" + num_banios +
                ", num_habitaciones=" + num_habitaciones +
                ", capacidad_max=" + capacidad_max +
                ", precio=" + precio +
                ", personas=" + Arrays.toString(personas) +
                super.toString() +
                '}';
    }
}
