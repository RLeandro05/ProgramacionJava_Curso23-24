package org.velazquez.U5.Tarea1.Ej56;

import org.velazquez.U5.Tarea1.Ej56.Instrumento;
public class Piano extends Instrumento{

    /*Creación del método interpretar usado desde Instrumento*/
    @Override
    public void interpretar() {
        System.out.print("Piano interpreta: ");
        /*Hacemos un for el cual recorrerá la lista de enumerados de las notas musicales, usando super para llamarlo*/
        for (int i = 0; i < super.notas.length; i++) {
            /*Por cada posición que pase, la variable nota tendrá el valor de la posición en la que esté la lista
            El nombre de la variable da igual, pero debe ser del mismo tipo al estar recibiendo un valor
            de la lista de tipo NotasMusicales*/
            NotasMusicales miNota = super.notas[i];
            /*Al pasarle el valor de la posición, como solo queremos mostrar notas musicales, añadimos
            la condición de que no muestre en pantalla el valor null*/
            if (miNota != null) {
                System.out.print(miNota + " ");
            }
        }
        System.out.println();
    }
}
