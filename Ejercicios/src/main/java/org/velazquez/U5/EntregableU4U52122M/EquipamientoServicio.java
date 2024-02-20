package org.velazquez.U5.EntregableU4U52122M;

public class EquipamientoServicio extends Propiedad{
    public enum TIPO_SERVICIO {
        EDUCATIVO, SANITARIO, DEPORTIVO, OTROS
    }
    private TIPO_SERVICIO tipo_servicio;

    public TIPO_SERVICIO getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(TIPO_SERVICIO tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public EquipamientoServicio(int anio_construccion, String direccion, float metros_cuadrados, TIPO_SERVICIO tipo_servicio) {
        super(anio_construccion, direccion, metros_cuadrados);
        this.tipo_servicio = tipo_servicio;
    }

    @Override
    public void mostrarPropiedad() {
        System.out.println("Llamado el 18/05/2023 para mostrar el Equipamiento de Servicio" +
                "que ofrecen en la Propiedad");
    }

    @Override
    public String toString() {
        return "EquipamientoServicio{" +
                "tipo_servicio=" + tipo_servicio +
                super.toString() +
                '}';
    }
}
