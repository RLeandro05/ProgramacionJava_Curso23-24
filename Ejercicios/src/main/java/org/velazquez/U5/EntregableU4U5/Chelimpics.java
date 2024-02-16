package org.velazquez.U5.EntregableU4U5;

public class Chelimpics {
    public static void main(String[] args) {

        Juegos juego = new Juegos(2020, "Barcelona");

        Paises p1 = new Paises("España", 5);
        Paises p2 = new Paises("Portugal", 3);
        Paises p3 = new Paises("Alemania", 2);

        juego.addPais(p1);
        juego.addPais(p2);
        juego.addPais(p3);

        juego.getPais();

        System.out.println();

        juego.eliminarPais(p1);

        juego.getPais();

        System.out.println();
        System.out.println();



        Deportes d1 = new Baloncesto(Deportes.DEPORTES.BALONCESTO, "Pabellón 1", 3);
        Deportes d2 = new LanzaTroncosPelaos(Deportes.DEPORTES.LANZATRONCOSPELAOS, "Pabellón 2", 5);
        Deportes d3 = new PeladoDeGambas(Deportes.DEPORTES.PELADODEGAMBAS, "Pabellón 3", 10);

        juego.addDeporte(d1);
        juego.addDeporte(d2);
        juego.addDeporte(d3);

        juego.getDeporte();

        System.out.println();

        juego.eliminarDeporte(d2);

        juego.getDeporte();

        System.out.println();
        System.out.println();



        Participante pa1 = new LanzadoresTroncos("Gustavo", 19);
        Participante pa2 = new PeladoresGambas("Chema", 24);
        Participante pa3 = new Baloncestitas("Leandro", 18);


        d1.addParticipante(pa1);
        d2.addParticipante(pa2);
        d3.addParticipante(pa3);

        d1.getParticipante();
        d2.getParticipante();
        d3.getParticipante();

    }
}
