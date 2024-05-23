package org.velazquez.U8.Entregable2122Maniana;

public class Alumno {

    private String dniAlumno;
    private String nombreAlumno;
    private String apellidoAlumno;
    private String direccionAlumno;

    public Alumno(String dniAlumno, String nombreAlumno, String apellidoAlumno, String direccionAlumno) {
        this.dniAlumno = dniAlumno;
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.direccionAlumno = direccionAlumno;
    }

    public String getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(String dniAlumno) {
        this.dniAlumno = dniAlumno;
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

    public String getDireccionAlumno() {
        return direccionAlumno;
    }

    public void setDireccionAlumno(String direccionAlumno) {
        this.direccionAlumno = direccionAlumno;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dniAlumno='" + dniAlumno + '\'' +
                ", nombreAlumno='" + nombreAlumno + '\'' +
                ", apellidoAlumno='" + apellidoAlumno + '\'' +
                ", direccionAlumno='" + direccionAlumno + '\'' +
                '}';
    }
}
