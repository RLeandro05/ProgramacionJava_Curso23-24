package org.velazquez.U4.EntregablePractica1.Pizzeria;

import java.util.Arrays;
import java.util.Scanner;

public class Pizza {
    private String size;
    private String[] ingredientes = new String[3];

    //Mostramos los tamaños disponibles
    public static void mostrarSize () {
        System.out.println("1. Mediana");
        System.out.println("2. Familiar");
    }

    //Si escoje el tamaño, se muestra
    public Pizza (String size) {
        this.size = size;
    }

    //Si no escoje el tamaño, por defecto será Familiar
    public Pizza () {
        this.size = "Familiar";
    }

    //Hacemos un algoritmo para la lista de ingredientes de la pizza
    public void algoritmoIngrediente () {
        Scanner sc = new Scanner(System.in);
        int indice = -1;

        while (true) {
            System.out.println("Hay: "+(indice+1)+" ingredientes en su pizza.");
            System.out.println("Tamaño: "+size+".");
            System.out.print("Ingredientes: ");
            for (int i = 0; i < ingredientes.length; i++) {
                if (i == ingredientes.length-1) {
                    System.out.print(ingredientes[i]);
                } else {
                    System.out.print(ingredientes[i]+" - ");
                }
            }
            System.out.println();
            System.out.println("Pulse -1 para salir finalizar pedido, o siga para añadir más ingredientes.");
            int salir;
            salir = sc.nextInt();
            if (salir == -1) {
                if (indice == -1) {
                    indice++;
                    ingredientes[indice] = "Queso250";
                    break;
                }
                break;
            }

            System.out.println();

            System.out.println("¿Añadir ingrediente?(s/n)");
            String decision;
            decision = sc.next();
            if (decision.equals("s")) {
                boolean ingr = true;

                indice++;
                if (indice < ingredientes.length) {
                    System.out.println(ingr);

                    System.out.print("Escriba el que desea con sus kcal por 100g: ");
                    ingredientes[indice] = sc.next();
                } else {
                    ingr = false;
                    System.out.println(ingr);
                    System.out.println("No hay espacio permitido para más ingredientes.");

                    if (indice >= ingredientes.length) {
                        indice = ingredientes.length-1;
                    }
                }
            }
        }
    }

    //Mostramos en pantalla el resultado final
    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", ingredientes=" + Arrays.toString(ingredientes) +
                '}';
    }
}
