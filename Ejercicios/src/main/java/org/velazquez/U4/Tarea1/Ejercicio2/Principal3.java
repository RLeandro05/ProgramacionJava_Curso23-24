package org.velazquez.U4.Tarea1.Ejercicio2;

public class Principal3 {
    public static void main(String[] args) {
        //    CuentaCorriente2 cuenta = new CuentaCorriente("Natalia", "2345678E");
        CuentaCorriente2 cuenta1 = new CuentaCorriente2();

        cuenta1.setNombre("Gustavo");
        cuenta1.setDNI("4589724F");
        cuenta1.setSaldo(10);
        cuenta1.setLimite_descubrimiento(-30);

        System.out.println(cuenta1.getNombre());
    }
}
