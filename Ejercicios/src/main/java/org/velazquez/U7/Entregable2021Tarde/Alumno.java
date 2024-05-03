package org.velazquez.U7.Entregable2021Tarde;

public class Alumno {
    private String nombreAlumno;
    private String apellidoAlumno;
    private String dniAlumno;
    private Unidad unidadAlumno;
    private int idAlumno;
    private static int idAumenta = 1;

    public Alumno(String nombreAlumno, String apellidoAlumno, String dniAlumno, Unidad unidadAlumno) {
        this.idAlumno = idAumenta++;
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.dniAlumno = dniAlumno;
        this.unidadAlumno = unidadAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public void setApellidoAlumno(String apellidoAlumno) {
        this.apellidoAlumno = apellidoAlumno;
    }

    public String getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(String dniAlumno) {
        this.dniAlumno = dniAlumno;
    }

    public Unidad getUnidadAlumno() {
        return unidadAlumno;
    }

    public void setUnidadAlumno(Unidad unidadAlumno) {
        this.unidadAlumno = unidadAlumno;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombreAlumno='" + nombreAlumno + '\'' +
                ", apellidoAlumno='" + apellidoAlumno + '\'' +
                ", dniAlumno='" + dniAlumno + '\'' +
                ", unidadAlumno='" + unidadAlumno + '\'' +
                ", idAlumno=" + idAlumno +
                '}';
    }
}
