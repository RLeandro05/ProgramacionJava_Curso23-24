package org.velazquez.U4.Tarea2.Ejercicio2;

import java.util.Arrays;

public class PilaTabla {
    private Integer[] pila = {1,2,3};

    public void apilar(Integer plato) {
        Integer[] nuevaPila = new Integer[pila.length + 1];

        int contador = 0;

        for (int i = 0; i < nuevaPila.length; i++) {
            if (contador == nuevaPila.length-1) {
                nuevaPila[i] = plato;
            } else{
                nuevaPila[i] = pila[i];
            }
            contador++;
        }

        System.out.println(Arrays.toString(nuevaPila));
    }

    public void desapilar() {
        Integer[] nuevaPila = new Integer[pila.length - 1];

        for (int i = 0; i < nuevaPila.length; i++) {
            nuevaPila[i] = pila[i];
        }

        System.out.println(Arrays.toString(nuevaPila));
    }

    public void cima() {

        for (int i = 0; i < pila.length; i++) {
            if (i == pila.length-1) {
                System.out.println("Último plato de la pila: "+pila[i]);
            }
        }
    }
}
