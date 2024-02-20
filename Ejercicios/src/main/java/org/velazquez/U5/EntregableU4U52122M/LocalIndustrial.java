package org.velazquez.U5.EntregableU4U52122M;

public class LocalIndustrial extends Local{
    private String consumo_energetico;

    public String getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(String consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }

    public LocalIndustrial(int anio_construccion, String direccion, float metros_cuadrados, String consumo_energetico) {
        super(anio_construccion, direccion, metros_cuadrados);
        this.consumo_energetico = consumo_energetico;
    }

    @Override
    public void mostrarPropiedad() {
        System.out.println("Llamado el 25/12/2023 para realizar unas inspecciones" +
                "en el Local Industrial");
    }

    @Override
    public String toString() {
        return "LocalIndustrial{" +
                "consumo_energetico='" + consumo_energetico + '\'' +
                super.toString() +
                '}';
    }
}
