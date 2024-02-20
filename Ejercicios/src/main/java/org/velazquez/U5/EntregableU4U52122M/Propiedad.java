package org.velazquez.U5.EntregableU4U52122M;

public abstract class Propiedad {
    protected int anio_construccion;
    private String direccion;
    protected float metros_cuadrados;

    public int getAnio_construccion() {
        return anio_construccion;
    }

    public void setAnio_construccion(int anio_construccion) {
        this.anio_construccion = anio_construccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getMetros_cuadrados() {
        return metros_cuadrados;
    }

    public void setMetros_cuadrados(float metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }

    public Propiedad(int anio_construccion, String direccion, float metros_cuadrados) {
        this.anio_construccion = anio_construccion;
        this.direccion = direccion;
        this.metros_cuadrados = metros_cuadrados;
    }

    public abstract void mostrarPropiedad();

    @Override
    public String toString() {
        return  ", anio_construccion=" + anio_construccion +
                ", direccion='" + direccion + '\'' +
                ", metros_cuadrados=" + metros_cuadrados;
    }
}
