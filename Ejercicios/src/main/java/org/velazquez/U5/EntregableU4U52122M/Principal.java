package org.velazquez.U5.EntregableU4U52122M;

public class Principal {
    public static void main(String[] args) {

        Registro r1 = new Registro();

        Vivienda p1 = new Vivienda(2008, "Calle San Aurelio nº 23", 69, 3, 4, 6, 128000);
        Propiedad p2 = new LocalComercial(1990, "Calle Teresa nº 11", 80, "Un lugar cómodo para la venta rápida");
        Propiedad p3 = new LocalIndustrial(1980, "Calle San Agustín nº 66", 70, "C");
        Propiedad p4 = new EquipamientoServicio(2019, "Calle Apostol nº 1", 120, EquipamientoServicio.TIPO_SERVICIO.EDUCATIVO);

        Persona pe1 = new Persona("11223344A", "Pepito Botella Alonso");
        Persona pe2 = new Persona("55667788B", "María Contreras Jiménez");
        Persona pe3 = new Persona("99123456C", "Anto López Euskera");

        p1.addPersona(pe1);
        p1.addPersona(pe2);
        p1.addPersona(pe3);
        p1.addPersona(pe2); //Al ejecutar, no se mostrará nuevamente
        p1.eliminarPersona(pe2);

        r1.addPropiedad(p1);
        r1.addPropiedad(p2);
        r1.addPropiedad(p3);
        r1.addPropiedad(p4);



        r1.informeAntiguedad();
    }
}
