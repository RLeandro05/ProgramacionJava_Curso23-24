package org.velazquez.U4.EntregableU4.Festival;

public class Escenario {
    private String nombre;
    private String ubicacion;
    private int capacidad;
    private String[] escenarios = new String[3];
    private int indice;
    private  Cantante cantante1;
    private Cantante cantante2;

    public Escenario(String nombre, String ubicacion, int capacidad) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.cantante1 = new Cantante("Benito Antonio", "Bad Bunny", 29, "Almirante Sur, Puerto Rico");
        this.cantante2 = new Cantante("Rihanna", "Rihanna", 35, "Parroquia de Saint Michael, Barbados");
    }

    public Cantante getCantante1() {
        return cantante1;
    }

    public void setCantante1(Cantante cantante1) {
        this.cantante1 = cantante1;
    }

    public Cantante getCantante2() {
        return cantante2;
    }

    public void setCantante2(Cantante cantante2) {
        this.cantante2 = cantante2;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void listaEscenarios() {
        escenarios[indice] = nombre+" "+ubicacion+" "+capacidad;
        indice++;
    }

    public void mostrarCantantes() {
        System.out.println(cantante1);
        System.out.println(cantante2);
    }

    @Override
    public String toString() {
        return "Escenario{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", capacidad=" + capacidad +
                ", cantante1=" + cantante1 +
                ", cantante2=" + cantante2 +
                '}';
    }
}
