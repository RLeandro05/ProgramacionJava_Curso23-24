package org.velazquez.U8.JSON.Tarea5;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Futbolista> listaFutbolistas = new ArrayList<>();

        Futbolista f1 = new Futbolista(1, "Casillas", List.of(new String[]{"Portero"}), "Real Madrid");
        Futbolista f2 = new Futbolista(15, "Ramos", List.of(new String[]{"Lateral derecho", "Medio centro"}), "Real Madrid");
        Futbolista f3 = new Futbolista(3, "Pique", List.of(new String[]{"Central"}), "FC Barcelona");
        Futbolista f4 = new Futbolista(5, "Puyol", List.of(new String[]{"Central"}), "FC Barcelona");
        Futbolista f5 = new Futbolista(11, "Capdevila", List.of(new String[]{"Lateral izquierdo"}), "Villareal");
        Futbolista f6 = new Futbolista(14, "Xabi Alonso", List.of(new String[]{"Defensa mediocampo", "Mediocampo"}), "Real Madrid");
        Futbolista f7 = new Futbolista(16, "Busquets", List.of(new String[]{"Defensa mediocampo"}), "FC Barcelona");
        Futbolista f8 = new Futbolista(8, "Xavi Hernandez", List.of(new String[]{"Mediocampo"}), "FC Barcelona");
        Futbolista f9 = new Futbolista(18, "Pedrito", List.of(new String[]{"Extremo izquierdo", "Falso extremo"}), "FC Barcelona");
        Futbolista f10 = new Futbolista(6, "Iniesta", List.of(new String[]{"Extremo derecho", "Mediocampo"}), "FC Barcelona");
        Futbolista f11 = new Futbolista(7, "Villa", List.of(new String[]{"Delantero centro"}), "FC Barcelona");

        listaFutbolistas.add(f1);
        listaFutbolistas.add(f2);
        listaFutbolistas.add(f3);
        listaFutbolistas.add(f4);
        listaFutbolistas.add(f5);
        listaFutbolistas.add(f6);
        listaFutbolistas.add(f7);
        listaFutbolistas.add(f8);
        listaFutbolistas.add(f9);
        listaFutbolistas.add(f10);
        listaFutbolistas.add(f11);

        Gson gson = new Gson();

        String jsonListaFutbolistas = gson.toJson(listaFutbolistas);

        System.out.println(jsonListaFutbolistas);

        System.out.println("----------------------------------------------");

        List<Futbolista> newListaFutbolistas = gson.fromJson(jsonListaFutbolistas, listaFutbolistas.getClass());

        System.out.println(newListaFutbolistas);

        System.out.println("----------------------------------------------");

        List<String> listaDemarcaciones = new ArrayList<>();

        for (Futbolista futbolista : listaFutbolistas) {
            if (futbolista.getNombreFutbolista().equals("Ramos")) {
                listaDemarcaciones.addAll(futbolista.getListaDermacaciones());
            }
        }

        System.out.println(listaDemarcaciones);
    }
}
