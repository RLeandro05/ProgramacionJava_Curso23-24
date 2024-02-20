package org.velazquez.U5.EntregableU4U52122M;

public class LocalComercial extends Local{
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalComercial(int anio_construccion, String direccion, float metros_cuadrados, String descripcion) {
        super(anio_construccion, direccion, metros_cuadrados);
        this.descripcion = descripcion;
    }

    @Override
    public void mostrarPropiedad() {
        System.out.println("Llamado el 14/02/2024 para presentar el local Comercial" +
                "que se presentará en directo");
    }

    @Override
    public String toString() {
        return "LocalComercial{" +
                "descripcion='" + descripcion + '\'' +
                super.toString() +
                '}';
    }
}
