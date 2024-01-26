package org.velazquez.U4.EntregableU4.Festival;

public class Concierto {
    private String nombre;
    private String fecha;

    private String[] conciertos = new String[3];
    private int indice;

    private Escenario escenario1;
    private Escenario escenario2;
    private Escenario escenario3;

    public Concierto(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.escenario1 = new Escenario("Cupra Arena", "Huelva", 2000);
        this.escenario2 = new Escenario("Cupra Arena 2", "Huelva", 1400);
        this.escenario3 = new Escenario("Cupra Arena 3", "Huelva", 1350);
    }

    public Escenario getEscenario1() {
        return escenario1;
    }

    public void setEscenario1(Escenario escenario) {
        this.escenario1 = escenario;
    }

    public Escenario getEscenario2() {
        return escenario2;
    }

    public void setEscenario2(Escenario escenario2) {
        this.escenario2 = escenario2;
    }

    public Escenario getEscenario3() {
        return escenario3;
    }

    public void setEscenario3(Escenario escenario3) {
        this.escenario3 = escenario3;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void listaConciertos() {
        conciertos[indice] = nombre+" "+fecha;
        indice++;
    }

    @Override
    public String toString() {
        return "Concierto{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", escenario1=" + escenario1 +
                ", escenario2=" + escenario2 +
                ", escenario3=" + escenario3 +
                '}';
    }
}
