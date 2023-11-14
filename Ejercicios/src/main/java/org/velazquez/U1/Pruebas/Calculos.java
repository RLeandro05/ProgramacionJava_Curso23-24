package org.velazquez.U1.Pruebas;


public class Calculos {
    public static void main(String[] args) {

        int palo_min = 1;
        int palo_max = 4;

        int palo = (int) (Math.random()*((palo_max+1)-palo_min))+palo_min;
        switch (palo) {
            case 1 -> System.out.println("Palo - Pica");
            case 2 -> System.out.println("Palo - Corazón");
            case 3 -> System.out.println("Palo - Diamante");
            case 4 -> System.out.println("Palo - Trébol");
        }
        System.out.println();

        int n_min = 1;
        int n_max = 13;

        int n = (int) (Math.random()*((n_max+1)-n_min))+n_min;
        if (n > 1 && n < 11) {
            System.out.println("Carta: "+n);
        }else {
            switch (n) {
                case 1 -> System.out.println("Carta: A");
                case 11 -> System.out.println("Carta: J");
                case 12 -> System.out.println("Carta: Q");
                case 13 -> System.out.println("Carta: K");
            }
        }
        System.out.println();

        System.out.println("FINALIZADO");
    }
}
