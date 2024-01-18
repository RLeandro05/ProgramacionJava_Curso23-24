package org.velazquez.U4.Tarea1.Ejercicio9;

import org.velazquez.U4.Tarea1.Ejercicio9.Maquinaria.Locomotoras;
import org.velazquez.U4.Tarea1.Ejercicio9.Maquinaria.Trenes;
import org.velazquez.U4.Tarea1.Ejercicio9.Personal.Jefes_Estacion;
import org.velazquez.U4.Tarea1.Ejercicio9.Personal.Maquinistas;
import org.velazquez.U4.Tarea1.Ejercicio9.Personal.Mecanicos;

public class Principal {
    public static void main(String[] args) {


        //Mostramos los datos del objeto Maquinista
        Maquinistas maquinista = new Maquinistas("Alfonso Martínez Pérez", "78997766P", "Jefe de Maquinistas");
        System.out.println(maquinista);

        //Mostramos los datos del objeto Mecánico
        Mecanicos mecanico = new Mecanicos("Javier López Picón", 678999666, "Frenos");
        System.out.println(mecanico);

        //Mostramos los datos del objeto Jefe
        Jefes_Estacion jefe = new Jefes_Estacion("Chema García Durán", "67895567K");
        System.out.println(jefe);

        System.out.println();
        System.out.println();

        //Mostramos los datos del objeto Locomotora
        Locomotoras locomotora = new Locomotoras("7899 FLP", 400, 1989);
        System.out.println(locomotora);

        Trenes tren = new Trenes();
        System.out.println(tren);
    }
}
