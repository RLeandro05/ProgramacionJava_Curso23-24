package org.velazquez.U7.Examen2122Maniana;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main implements Serializable {
    public static void main(String[] args) {

        Trabajadores t1 = new Trabajadores("11111111A", "Leandro", "Ligero Picon", 19, "CFGS DAW");
        Trabajadores t2 = new Trabajadores("11111111B", "Lorena", "Blanca Suarez", 20, "FACULTAD DE INGENIERIA");
        Trabajadores t3 = new Trabajadores("11111111C", "Marina", "Picon Picon", 125, "CFGS ENFERMERIA");
        Trabajadores t4 = new Trabajadores("11111111D", "Leonaida", "Lopez Sanchez", 45, "CFGS DAM");
        Trabajadores t5 = new Trabajadores("11111111E", "Paolo", "Garcia Muñoz", 18, "CFGS ADMINISTRACION");
        Trabajadores t6 = new Trabajadores("11111111F", "Adrian", "Baena Gutierrez", 24, "FACULTAD DE DEPORTE");
        Trabajadores t7 = new Trabajadores("11111111G", "Mateo", "Ligero Recio", 31, "FACULTAD DE FISICA");
        Trabajadores t8 = new Trabajadores("11111111H", "Nicolas", "Acosta Muñoz", 57, "FACULTAD DE ASTROFISICA");
        Trabajadores t9 = new Trabajadores("11111111I", "Nacho", "Repolho Trujillo", 43, "DOCTORADO DE MATEMATICAS");
        Trabajadores t10 = new Trabajadores("11111111J", "Christian", "Lopez Guirnaldo", 28, "CFGS HIGIENE");

        List<Trabajadores> listaTrabajadores1 = new ArrayList<>();
        List<Trabajadores> listaTrabajadores2 = new ArrayList<>();
        List<Trabajadores> listaTrabajadores3 = new ArrayList<>();
        List<Trabajadores> listaTrabajadores4 = new ArrayList<>();
        List<Trabajadores> listaTrabajadores5 = new ArrayList<>();

        listaTrabajadores1.add(t1);
        listaTrabajadores1.add(t4);
        listaTrabajadores1.add(t6);

        listaTrabajadores2.add(t6);
        listaTrabajadores2.add(t2);
        listaTrabajadores2.add(t3);
        listaTrabajadores2.add(t8);

        listaTrabajadores3.add(t8);

        listaTrabajadores4.add(t5);
        listaTrabajadores4.add(t10);

        listaTrabajadores5.add(t1);
        listaTrabajadores5.add(t9);
        listaTrabajadores5.add(t7);


        Oferta o1 = new Oferta("isjfajfhfkidsfsdfapdf pjh sjodosd", listaTrabajadores1, true);
        Oferta o2 = new Oferta("wihsalnfdalnfldsanfsdf", listaTrabajadores2, false);
        Oferta o3 = new Oferta("qwiphlnflnadlnmadf", listaTrabajadores3, true);
        Oferta o4 = new Oferta("alksldoislw esmcksdaspsf", listaTrabajadores4, false);
        Oferta o5 = new Oferta("skosk oipdpsñf ksdñl`sd", listaTrabajadores5, true);

        SAE sae = new SAE();

        sae.addOferta(o1);
        System.out.println("-------------------------------------------------------------------------");
        sae.addOferta(o2);
        System.out.println("-------------------------------------------------------------------------");
        sae.addOferta(o3);
        System.out.println("-------------------------------------------------------------------------");
        sae.addOferta(o4);
        System.out.println("-------------------------------------------------------------------------");
        sae.addOferta(o5);
        System.out.println("-------------------------------------------------------------------------");
        sae.addOferta(o2);
        System.out.println("-------------------------------------------------------------------------");

        sae.addTrabajador(2, t4);
        System.out.println("-------------------------------------------------------------------------");
        sae.addTrabajador(3, t5);
        System.out.println("-------------------------------------------------------------------------");
        sae.addTrabajador(3, t5);
        System.out.println("-------------------------------------------------------------------------");

        sae.removeTrabajador(4, t10);
        System.out.println("-------------------------------------------------------------------------");
        sae.removeTrabajador(2, t8);
        System.out.println("-------------------------------------------------------------------------");

        sae.mostrarTrabajadores(1);
        System.out.println("-------------------------------------------------------------------------");
        sae.mostrarTrabajadores(3);
        System.out.println("-------------------------------------------------------------------------");

        sae.cantidadOfertas("11111111A");
        System.out.println("-------------------------------------------------------------------------");
        sae.cantidadOfertas("11111111H");
        System.out.println("-------------------------------------------------------------------------");

        sae.mostrarOfertas();
        System.out.println("-------------------------------------------------------------------------");

        sae.guardarDatos();
        System.out.println("-------------------------------------------------------------------------");

        sae.cargarDatos();
        System.out.println("-------------------------------------------------------------------------");
    }
}
