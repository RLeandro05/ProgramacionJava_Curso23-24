package org.velazquez.U8.JSON.EntregableJSON;

public class Asignaturas {
    private int id;
    private String nombre;
    private int alumnoId;

    public Asignaturas(int id, String nombre, int alumnoId) {
        this.id = id;
        this.nombre = nombre;
        this.alumnoId = alumnoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(int alumnoId) {
        this.alumnoId = alumnoId;
    }

    @Override
    public String toString() {
        return "Asignaturas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", alumnoId=" + alumnoId +
                '}';
    }
}
