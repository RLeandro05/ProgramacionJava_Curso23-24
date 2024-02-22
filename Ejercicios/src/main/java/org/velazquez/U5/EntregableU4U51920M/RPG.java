package org.velazquez.U5.EntregableU4U51920M;

import java.util.Arrays;
import java.util.Comparator;

public class RPG {
    Personajes[] personajes = new Personajes[0];

    public void addPersonaje(Personajes personaje) {

        Personajes[] nuevoPersonaje = new Personajes[personajes.length+1];

        if (personajes.length <= 10) {
            for (int i = 0; i < personajes.length; i++) {
                nuevoPersonaje[i] = personajes[i];
            }

            nuevoPersonaje[personajes.length] = personaje;
            personajes = nuevoPersonaje;
        }
    }

    public void borrarMuertos(Personajes muerto) {
        if (muerto.energia <= 0) {
            int index = -1;
            for (int i = 0; i < personajes.length; i++) {
                if (personajes[i].equals(muerto)) {
                    index = i;
                    break;
                }
            }

            if (index != -1) { // Si se encontró el país
                Personajes[] nuevoMuerto = new Personajes[personajes.length - 1];
                for (int i = 0, j = 0; i < personajes.length; i++) {
                    if (i != index) {
                        nuevoMuerto[j++] = personajes[i];
                    }
                }
                personajes = nuevoMuerto;
            }
        }

    }

    public void mostrarEstado() {
        Arrays.sort(personajes, new Comparator<Personajes>() {
            @Override
            public int compare(Personajes o1, Personajes o2) {
                if (o1.energia > o2.energia) {
                    return -1;
                } else if (o1.energia < o2.energia) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        for (int i = 0; i < personajes.length; i++) {
            System.out.println(personajes[i]);
        }
    }
    public void mostrarxAtaque() {
        Arrays.sort(personajes, new Comparator<Personajes>() {
            @Override
            public int compare(Personajes o1, Personajes o2) {
                if (o1.ataque > o2.ataque) {
                    return -1;
                } else if (o1.ataque < o2.ataque) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        for (int i = 0; i < personajes.length; i++) {
            System.out.println(personajes[i]);
        }
    }
    public void mostrarxDefensa() {
        Arrays.sort(personajes, new Comparator<Personajes>() {
            @Override
            public int compare(Personajes o1, Personajes o2) {
                if (o1.defensa > o2.defensa) {
                    return -1;
                } else if (o1.defensa < o2.defensa) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        for (int i = 0; i < personajes.length; i++) {
            System.out.println(personajes[i]);
        }
    }

    public void hayGanador() {
        if (personajes.length == 1) {
            System.out.println("¡GANADOR!: "+personajes[0]);
        }
    }
}
