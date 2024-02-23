package org.velazquez.U5.ExamenU4U5;

import java.util.Arrays;
import java.util.Comparator;

public class Catalogo {
    Multimedia[] multimedias = new Multimedia[0];

    //Método para añadir a la lista elementos Multimedia
    public void addMultimedia(Multimedia elemento) {

        Multimedia[] nuevoMultimedia = new Multimedia[multimedias.length+1];

        //Recorremos la lista
        for (int i = 0; i < multimedias.length; i++) {
            nuevoMultimedia[i] = multimedias[i];
        }

        //Implementamos en la siguiente posición nula el nuevo elemento
        nuevoMultimedia[multimedias.length] = elemento;
        multimedias = nuevoMultimedia;
    }

    //Método para eliminar de la lista elementos Multimedia
    public boolean eliminarMultimedia(Multimedia elemento) {
        int index = -1;
        //Buscamos si el elemento que queremos eliminar está dentro de la lista
        for (int i = 0; i < multimedias.length; i++) {
            if (multimedias[i].equals(elemento)) {
                index = i;
                break;
            }
        }

        //Si se encuentra, podremos entrar en el siguiente for, el cual removerá de dicha posición el elemento que queremos eliminar de la lista
        if (index != -1) {
            Multimedia[] nuevoMultimedia = new Multimedia[multimedias.length - 1];
            for (int i = 0, j = 0; i < multimedias.length; i++) {
                if (i != index) {
                    nuevoMultimedia[j++] = multimedias[i];
                }
            }
            multimedias = nuevoMultimedia;

            return  true;
        }

        return  false;
    }

    //Método de ordenación por id
    public void ordenar_por_id() {
        //Creamos una clase anónima para implementar Comparator y poder hacer la comparación de id's
        Arrays.sort(multimedias, new Comparator<Multimedia>() {
            @Override
            public int compare(Multimedia o1, Multimedia o2) {
                if (o1.id < o2.id) {
                    return -1;
                } else if (o1.id > o2.id) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        //Luego, mostramos la ordenación por pantalla para demostrar que se ordena por id
        for (int i = 0; i < multimedias.length; i++) {
            System.out.println(multimedias[i]);
        }
    }

    //Método de ordenación por título
    public void ordenar_por_titulo() {
        //Creamos una clase anónima para implementar Comparator y poder comparar las cadenas de los diferentes títulos Multimedia
        Arrays.sort(multimedias, new Comparator<Multimedia>() {
            @Override
            public int compare(Multimedia o1, Multimedia o2) {
                return o1.getTitulo().compareTo(o2.getTitulo());
            }
        });

        //Luego, mostramos la ordenación por pantalla para demostrar que se ordena por título de la obra
        for (int i = 0; i < multimedias.length; i++) {
            System.out.println(multimedias[i]);
        }
    }

    ///Método de ordenación por año de Publicación o de Estreno, según sea
    public void ordernar_por_anio() {
        //Creamos una clase anónima para implementar Comparator y poder comparar según el valor del ano
        Arrays.sort(multimedias, new Comparator<Multimedia>() {
            @Override
            public int compare(Multimedia o1, Multimedia o2) {
                if (o1.getAnioPublicacionEstreno() < o2.getAnioPublicacionEstreno()) {
                    return -1;
                } else if (o1.getAnioPublicacionEstreno() > o2.getAnioPublicacionEstreno()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        //Luego, mostramos la ordenación por pantalla para demostrar que se ordena por el año de publicación o estreno
        for (int i = 0; i < multimedias.length; i++) {
            System.out.println(multimedias[i]);
        }
    }

    //Mñetodo que devuelve el número de elementos Multimedia que se han creado en la lista
    public int numero_de_elementos() {
        return multimedias.length;
    }
}
