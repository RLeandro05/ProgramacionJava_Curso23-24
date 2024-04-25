package org.velazquez.U7.Entregable2021Tarde;

public class Main {
    public static void main(String[] args) {

        Instituto Velazquez = new Instituto("Velazquez");

        Unidad u1 = new Unidad("1º DAW");
        Unidad u2 = new Unidad("2º BACH");
        Unidad u3 = new Unidad("1º DAM");

        Alumno al1 = new Alumno("Leandro", "Ligero", "11111111A", u1);
        Alumno al2 = new Alumno("Mario", "Rodriguez", "22222222B", u2);
        Alumno al3 = new Alumno("Gloria", "Euskera", "33333333C", u3);
        Alumno al4 = new Alumno("Lorena", "Martinez", "44444444D", u1);

        Velazquez.addAlumnoUnidad(al1, al1.getUnidadAlumno().getNombreUnidad());
        System.out.println("-------------------------------------------------");
        Velazquez.addAlumnoUnidad(al2, al2.getUnidadAlumno().getNombreUnidad());
        System.out.println("-------------------------------------------------");
        Velazquez.addAlumnoUnidad(al3, al3.getUnidadAlumno().getNombreUnidad());
        System.out.println("-------------------------------------------------");
        Velazquez.addAlumnoUnidad(al4, al4.getUnidadAlumno().getNombreUnidad());
        System.out.println("-------------------------------------------------");

        Velazquez.mostrarAlumnosUnidad(u1.getNombreUnidad());
    }
}
