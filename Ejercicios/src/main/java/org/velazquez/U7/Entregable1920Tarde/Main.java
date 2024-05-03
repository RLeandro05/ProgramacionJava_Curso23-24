package org.velazquez.U7.Entregable1920Tarde;

import java.io.Serializable;

public class Main implements Serializable {
    public static void main(String[] args) {

        Coronavirus c1 = new Coronavirus();

        Medico m1 = new Medico("Juan", "Gomez Serafin", 1, "Sevilla");
        Medico m2 = new Medico("Gustavo", "Lorenzo Lopez", 2, "Madrid");
        Medico m3 = new Medico("Leandro", "Ligero Picon", 3, "Huelva");

        Paciente p1 = new Paciente("Maria", 23, 65.7, true, m1);
        Paciente p2 = new Paciente("Lorena", 15, 70.2, true, m2);
        p2.setCepaPaciente(p1.getCepaPaciente()+1);
        Paciente p3 = new Paciente("Gonzalo", 18, 70, true, m3);
        p3.setCepaPaciente(p2.getCepaPaciente()+1);
        Paciente p4 = new Paciente("Javier", 45, 85.6, false, m1);
        Paciente p5 = new Paciente("Bartolome", 78, 75.8, false, m2);
        p5.setCepaPaciente(p1.getCepaPaciente()+1);
        Paciente p6 = new Paciente("Felipe", 70, 74.3, false, m3);
        p6.setCepaPaciente(p2.getCepaPaciente()+1);
        Paciente p7 = new Paciente("Enrique", 45, 80.3, true, m1);
        Paciente p8 = new Paciente("Adam", 56, 78.5, true, m2);
        p8.setCepaPaciente(p1.getCepaPaciente()+1);
        Paciente p9 = new Paciente("Adrian", 20, 70.9, true, m3);
        p9.setCepaPaciente(p2.getCepaPaciente()+1);
        Paciente p10 = new Paciente("Christian", 17, 68.9, false, m1);

        c1.addPaciente(p1.getCepaPaciente(), p1);
        System.out.println("-------------------------------------------------------------------------------");
        c1.addPaciente(p2.getCepaPaciente(), p2);
        System.out.println("-------------------------------------------------------------------------------");
        c1.addPaciente(p3.getCepaPaciente(), p3);
        System.out.println("-------------------------------------------------------------------------------");
        c1.addPaciente(p4.getCepaPaciente(), p4);
        System.out.println("-------------------------------------------------------------------------------");
        c1.addPaciente(p5.getCepaPaciente(), p5);
        System.out.println("-------------------------------------------------------------------------------");
        c1.addPaciente(p6.getCepaPaciente(), p6);
        System.out.println("-------------------------------------------------------------------------------");
        c1.addPaciente(p7.getCepaPaciente(), p7);
        System.out.println("-------------------------------------------------------------------------------");
        c1.addPaciente(p8.getCepaPaciente(), p8);
        System.out.println("-------------------------------------------------------------------------------");
        c1.addPaciente(p9.getCepaPaciente(), p9);
        System.out.println("-------------------------------------------------------------------------------");
        c1.addPaciente(p10.getCepaPaciente(), p10);
        System.out.println("-------------------------------------------------------------------------------");
        c1.addPaciente(p10.getCepaPaciente(), p10);
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println();

        c1.darDeAltaPaciente(p3);
        c1.darDeAltaPaciente(p2);
        c1.darDeAltaPaciente(p2);
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println();

        c1.pacientesDeUnDoctor(m2.getColegiadoMedico());
        c1.pacientesDeUnDoctor(m1.getColegiadoMedico());
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println();

        c1.pacientesporPeso(2);
        c1.pacientesporPeso(1);
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println();

        c1.pacientesporEdad(1);
        c1.pacientesporEdad(3);
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println();

        c1.guardarPacientes();
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println();

        c1.cargarPacientes();
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println();

        c1.mostrarMapa();
        System.out.println("-------------------------------------------------------------------------------");
    }
}
