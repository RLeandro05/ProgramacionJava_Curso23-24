package org.velazquez.U4.Tarea1.Ejercicio9.Maquinaria;

import org.velazquez.U4.Tarea1.Ejercicio9.Personal.Mecanicos;

public class Locomotoras {
    private String matricula;
    private int potencia_motor;
    private int ano_fabric;
    public Mecanicos mecanico;

    public Locomotoras(String matricula, int potencia_motor, int ano_fabric) {
        this.matricula = matricula;
        this.potencia_motor = potencia_motor;
        this.ano_fabric = ano_fabric;
        this.mecanico = new Mecanicos("Javier López Picón", 678999666, "Frenos");
    }

    @Override
    public String toString() {
        return "Locomotoras{" +
                "matricula='" + matricula + '\'' +
                ", potencia_motor=" + potencia_motor +
                ", ano_fabric=" + ano_fabric +
                ", mecanico=" + mecanico +
                '}';
    }
}
