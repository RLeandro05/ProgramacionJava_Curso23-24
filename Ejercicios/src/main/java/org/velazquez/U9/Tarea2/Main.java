package org.velazquez.U9.Tarea2;

public class Main {
    public static void main(String[] args) {

        ADClassicModels bd = new ADClassicModels();

        bd.getEmpleados();

        System.out.println("------------------------------------------------");

        bd.getOffices();

        System.out.println("------------------------------------------------");

        bd.close();
    }
}
