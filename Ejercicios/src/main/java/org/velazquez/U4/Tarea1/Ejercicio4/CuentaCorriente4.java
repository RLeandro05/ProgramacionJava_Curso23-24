package org.velazquez.U4.Tarea1.Ejercicio4;

public class CuentaCorriente4 {

    //Creación de la variable única "Banco" para añadir su nombre
    static String banco;
    //Creación de las variables privadas para el archivo de CuentaCorriente
    private long saldo;
    private long limite_descubrimiento;
    private String nombre;
    private String DNI;

    public CuentaCorriente4() {}

    //En esta función se mostrará el contenido actual de los datos de la CuentaCorriente
    //Recibirá los datos de Nombre y DNI a través del archivo Principal.java
    public CuentaCorriente4(String nombre, String DNI) {
        this.saldo = 0;
        this.limite_descubrimiento = -50;
        this.nombre = nombre;
        this.DNI = DNI;
    }

    @Override
    //Esta función mostrará en pantalla la información una vez visualizada la información que posee
    public String toString() {
        return "CuentaCorriente{"
                + "saldo="
                + saldo
                + ", limite_descubrimiento="
                + limite_descubrimiento
                + ", nombre='"
                + nombre
                + '\''
                + ", DNI='"
                + DNI
                + '\''
                + '}';
    }

    //En esta función simplemente actualizaremos el salo de la cuenta
    public void ingresar(int cantidad) {
        saldo = +cantidad;
    }

    //En esta función
    public boolean sacar(int cantidad) {
        boolean resultado;
        if (cantidad < saldo + limite_descubrimiento) {
            saldo = -cantidad;
            System.out.println("La operación ha sido realizada.");
            resultado = true;
        } else {
            System.out.println("La operación no se puede realizar");
            resultado = false;
        }
        return resultado;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public long getLimite_descubrimiento() {
        return limite_descubrimiento;
    }

    public void setLimite_descubrimiento(long limite_descubrimiento) {
        this.limite_descubrimiento = limite_descubrimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
