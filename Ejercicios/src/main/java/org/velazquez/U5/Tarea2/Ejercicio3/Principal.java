package org.velazquez.U5.Tarea2.Ejercicio3;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {

        Figura[] figura = new Figura[5];

        figura[0] = new Cuadrado(PoligonoRegular.Color.ROJO, 12);
        figura[1] = new Circulo(PoligonoRegular.Color.ROJO, 12);
        figura[2] = new Circulo();
        figura[3] = new Triangulo(PoligonoRegular.Color.AZUL, 12, 8);
        figura[4] = new Cuadrado(PoligonoRegular.Color.AMARILLO, 5);

        //Mostramos el array por pantalla
        for (int i = 0; i < figura.length; i++) {
            System.out.println(figura[i]);
        }

        System.out.println();
        System.out.println();

        //Creamos un array a parte de triángulos
        Triangulo[] triangulo = new Triangulo[5];

        triangulo[0] = new Triangulo();
        triangulo[1] = new Triangulo(PoligonoRegular.Color.VERDE, 5, 5);
        triangulo[2] = new Triangulo();
        triangulo[3] = new Triangulo(PoligonoRegular.Color.VERDE, 20, 13);
        triangulo[4] = new Triangulo(PoligonoRegular.Color.AMARILLO, 9, 5);

        //Lo mostramos con la ordenación por defecto
        Arrays.sort(triangulo);
        for (int i = 0; i < triangulo.length; i++) {
            System.out.println(triangulo[i]);
        }

        System.out.println();
        System.out.println();

        //Lo mostramos nuevamente pero con la ordenación secundaria
        Arrays.sort(triangulo,
                new Comparator<Triangulo>() {
                    @Override
                    public int compare(Triangulo o1, Triangulo o2) {
                        return o1.color.compareTo(o2.color);
                    }
                });
        for (int i = 0; i < triangulo.length; i++) {
            System.out.println(triangulo[i]);
        }

    }
}
