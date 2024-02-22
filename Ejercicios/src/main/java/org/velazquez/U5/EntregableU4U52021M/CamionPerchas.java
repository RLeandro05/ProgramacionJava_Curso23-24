package org.velazquez.U5.EntregableU4U52021M;

public class CamionPerchas extends FlotaVehiculos implements Comparable<CamionPerchas>, Comportamiento{
    PrendaColgada[] prendasColgadas = new PrendaColgada[0];

    public CamionPerchas(String matricula, int cargaMaxima, String conductor) {
        super(matricula, cargaMaxima, conductor);
    }
    @Override
    public void descargar() {
        System.out.println("Descargando "+contarPrendasColgadas()+" prendas.");
    }

    public void addPrendaColgada(PrendaColgada prendaColgada) {
        if (prendasColgadas.length <= 5) {
            PrendaColgada[] nuevaPrendaColgada = new PrendaColgada[prendasColgadas.length+1];

            for (int i = 0; i < prendasColgadas.length; i++) {
                nuevaPrendaColgada[i] = prendasColgadas[i];
            }

            nuevaPrendaColgada[prendasColgadas.length] = prendaColgada;
            prendasColgadas = nuevaPrendaColgada;
        }
    }
    public void eliminarPrendaColgada(PrendaColgada prendaColgada) {
        int index = -1;
        for (int i = 0; i < prendasColgadas.length; i++) {
            if (prendasColgadas[i].equals(prendaColgada)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            PrendaColgada[] nuevaPrendaColgada = new PrendaColgada[prendasColgadas.length - 1];
            for (int i = 0, j = 0; i < prendasColgadas.length; i++) {
                if (i != index) {
                    nuevaPrendaColgada[j++] = prendasColgadas[i];
                }
            }
            prendasColgadas = nuevaPrendaColgada;
        }
    }
    public int contarPrendasColgadas() {
        return prendasColgadas.length;
    }

    @Override
    public int compareTo(CamionPerchas o) {
        if (this.contarPrendasColgadas() < o.contarPrendasColgadas()) {
            return -1;
        } else if (this.contarPrendasColgadas() > o.contarPrendasColgadas()) {
            return 1;
        } else
            return 0;
    }


    @Override
    public void devolver() {
        
    }

    @Override
    public void doblar() {

    }

    @Override
    public void colgar() {

    }
}
