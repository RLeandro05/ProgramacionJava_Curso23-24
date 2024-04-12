package org.velazquez.U7.Tarea4;

public class Empleado extends Persona {

    private int sueldoEmpleado;
    public Empleado(String nombrePersona, String dniPersona, int edadPersona, double estaturaPersona, int sueldoEmpleado) {
        super(nombrePersona, dniPersona, edadPersona, estaturaPersona);
        this.sueldoEmpleado = sueldoEmpleado;
    }

    public double getSueldoEmpleado() {
        return sueldoEmpleado;
    }

    public void setSueldoEmpleado(int sueldoEmpleado) {
        this.sueldoEmpleado = sueldoEmpleado;
    }

    @Override
    public String toString() {
        return "Sueldo: " + sueldoEmpleado + "€" +
                super.toString();
    }
}
