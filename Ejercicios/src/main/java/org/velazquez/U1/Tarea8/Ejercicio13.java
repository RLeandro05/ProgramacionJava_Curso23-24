package org.velazquez.U1.Tarea8;

public class Ejercicio13 {
    public static void main(String[] args) {
        int numMin = 0;
        int numMax = 10;
        int conteo = 0;
        int alumno_sus = 0;
        int alumno_acond = 0;
        int alumno_apr = 0;
        int alumno = 1;

        while (true) {
            int resultado = (int) (Math.random()*((numMax + 1) - numMin)) + numMin;
            System.out.println("Alumno "+alumno+": "+resultado);
            alumno++;

            if (resultado < 4) {
                alumno_sus++;
                conteo++;
            }
            if (resultado == 4) {
                alumno_acond++;
                conteo++;
            }
            if (resultado >= 5) {
                alumno_apr++;
                conteo++;
            }

            if (conteo == 6) {
                System.out.println("Hay "+alumno_apr+" alumnos aprobados.");
                System.out.println("Hay "+alumno_sus+" alumnos suspensos.");
                System.out.println("Hay "+alumno_acond+" alumnos acondicionados.");
                break;
            }
        }
    }
}
