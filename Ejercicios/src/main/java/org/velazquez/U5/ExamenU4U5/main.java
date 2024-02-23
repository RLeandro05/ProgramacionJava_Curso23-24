package org.velazquez.U5.ExamenU4U5;

public class main {
    public static void main(String[] args) {

        //Objeto Libro
        Libro l1 = new Libro("Lost Castle", 1989, "Adrián", "Maxim", 123456789, 325);
        Libro l2 = new Libro("Mario Valenciano", 2020, "Pablo", "Lotus", 623819378, 233);
        Libro l3 = new Libro("Altibajos de una mujer con regla", 2024, "Gustavo", "Luicre", 531872934, 540);

        l1.dar_por_finalizado();
        l2.dar_por_finalizado();
        l3.dar_por_finalizado();

        //Objeto Película
        Pelicula p1 = new Pelicula("Pou Fantasy V", 2004, "Marina Repolho", 122, "Lorena Jiménez", "Alemania");
        Pelicula p2 = new Pelicula("Ciber Forever", 1978, "Adam López", 110, "Cristina Moreno", "España");
        Pelicula p3 = new Pelicula("Mandarina Roja", 2000, "Miriam García", 200, "Julia Picón", "Portugal");

        p1.play();
        p1.pause();
        p1.stop();

        p2.play();
        p2.stop();

        p3.play();

        p1.dar_por_finalizado();
        p2.dar_por_finalizado();

        //Objeto Serie
        Serie s1 = new Serie("Lucres el Muerto Viviente", 2008, "Gustavo Gallardo", 5);
        Serie s2 = new Serie("El Beethoven de los 2000", 2010, "Edward Lucre", 2);
        Serie s3 = new Serie("Sobre Ruedas hasta la Muerte", 2023, "Lucía Pol", 3);

        s1.addCapitulo("S01E03");
        s1.addCapitulo("S02E12");
        s1.addCapitulo("S04E24");

        s2.addCapitulo("S01E08");
        s2.addCapitulo("S01E10");
        s2.addCapitulo("S02E20");

        s3.addCapitulo("S01E25");
        s3.addCapitulo("S02E13");
        s3.addCapitulo("S03E33");

        s1.eliminarCapitulo("S02E12");
        s2.eliminarCapitulo("S02E20");
        s3.eliminarCapitulo("S01E25");

        s1.play();
        s1.pause();
        s1.stop();

        s2.play();
        s2.stop();

        s3.play();

        s1.dar_por_finalizado();
        s2.dar_por_finalizado();

        //Objeto Catálogo
        Catalogo c1 = new Catalogo();

        c1.addMultimedia(l1);
        c1.addMultimedia(p1);
        c1.addMultimedia(s1);

        c1.eliminarMultimedia(s1);

        c1.ordenar_por_id();
        c1.ordenar_por_titulo();
        c1.ordernar_por_anio();
        c1.numero_de_elementos();
    }
}
