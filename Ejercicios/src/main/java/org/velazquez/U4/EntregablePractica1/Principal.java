package org.velazquez.U4.EntregablePractica1;

import org.velazquez.U4.EntregablePractica1.Pizzeria.Pizza;

public class Principal {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("Mediana");
        Pizza pizza2 = new Pizza();

        Pizza.mostrarSize();
        System.out.println();

        pizza1.algoritmoIngrediente();
        System.out.println();

        Pizza.mostrarSize();
        System.out.println();

        pizza2.algoritmoIngrediente();
        System.out.println();

        System.out.println(pizza1);
        System.out.println(pizza2);
    }
}
