package org.velazquez.U7.Entregable1920Maniana;

import java.io.Serializable;

public class Main implements Serializable {
    public static void main(String[] args) {

        Propietario p1 = new Propietario("Leandro", "Ligero Picon", 1, "España");
        Propietario p2 = new Propietario("Lorena", "Contreras Jimenez", 2, "Mexico");
        Propietario p3 = new Propietario("Manolo", "Garcia Garcia", 3, "Colombia");

        Perro pe1 = new Perro("Gustavo", 3, 5.4, true, p1, "Dalmata");
        Perro pe2 = new Perro("Chichones", 5, 10, true, p2, "Terrier");
        Perro pe3 = new Perro("Tula", 1, 8, false, p3, "Chihuahua");
        Perro pe4 = new Perro("Eustaquio", 1, 5, true, p1, "Dalmata");
        Perro pe5 = new Perro("Fulanita", 7, 4, true, p2, "Terrier");
        Perro pe6 = new Perro("Menganito", 10, 12.4, false, p3, "Chihuahua");
        Perro pe7 = new Perro("Firulais", 8, 5, true, p1, "Dalmata");
        Perro pe8 = new Perro("Rodolfo", 5, 7, true, p2, "Terrier");
        Perro pe9 = new Perro("Coby", 5, 9.6, false, p3, "Chihuahua");
        Perro pe10 = new Perro("Dios", 2, 5.4, false, p1, "Dalmata");

        Concurso c1 = new Concurso("IDC", "Madrid");

        c1.addDog(pe1.getRazaPerro(), pe1);
        c1.addDog(pe1.getRazaPerro(), pe1);
        c1.addDog(pe2.getRazaPerro(), pe2);
        c1.addDog(pe3.getRazaPerro(), pe3);
        c1.addDog(pe4.getRazaPerro(), pe4);

        System.out.println("---------------------------------------------------------------------");

        c1.perrosporPeso("Dalmata");
        c1.perrosporEdad("Dalmata");

        System.out.println("---------------------------------------------------------------------");

        c1.disqualifyDog(pe2);
        c1.disqualifyDog(pe7);

        System.out.println("---------------------------------------------------------------------");

        c1.ownerDogs(1);

        System.out.println("---------------------------------------------------------------------");

        c1.guardarPerros();

        System.out.println("---------------------------------------------------------------------");

        c1.cargarPerros();

        System.out.println("---------------------------------------------------------------------");
    }
}
