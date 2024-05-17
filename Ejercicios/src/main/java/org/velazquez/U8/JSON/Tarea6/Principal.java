package org.velazquez.U8.JSON.Tarea6;

import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Principal {
    public static void main(String[] args) {
        OkHttpClient okHttpClient =
                new OkHttpClient.Builder()
                        .connectTimeout(1, TimeUnit.MINUTES)
                        .readTimeout(30, TimeUnit.SECONDS)
                        .writeTimeout(15, TimeUnit.SECONDS)
                        .build();

        Retrofit retrofit =
                new Retrofit.Builder()
                        .baseUrl("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(okHttpClient)
                        .build();


        CentralFutbolista service = retrofit.create(CentralFutbolista.class);

        System.out.println("Obtenemos el listado completo de futbolistas");
        try {
            Response<List<Futbolista>> response = service.listJugadores().execute();
            if (response.isSuccessful()) {
                List<Futbolista> futbolistas = response.body();
                System.out.println(futbolistas);
            } else {
                System.out.println("Peticion no valida: " + response.message());
            }
        } catch (IOException ex) {
            System.out.println("Error en la peticion: " + ex.getMessage());
        }

        System.out.println();
        Futbolista futbolista = null;
        Integer futbolistaId = 1;
        System.out.println("Obtenemos un futbolista en concreto, identificada por el id " + futbolistaId);
        try {
            Response<Futbolista> response = service.getVentaId(futbolistaId).execute();
            if (response.isSuccessful()) {
                futbolista = response.body();
                System.out.println(futbolista);
            } else {
                System.out.println("Peticion no valida: " + response.message());
            }
        } catch (IOException ex) {
            System.out.println("Error en la peticion: " + ex.getMessage());
        }

        System.out.println();
        System.out.println(
                "Obtenemos las estadisticas de un futbolista concreto, identificado por el id "
                        + futbolistaId);
        try {
            Response<Estadisticas> response = service.estadisticas(futbolistaId).execute();
            if (response.isSuccessful()) {
                Estadisticas stats = response.body();
                System.out.println(stats);
                if (futbolista != null) {
                    futbolista.setEstadisticas(stats);
                }
            } else {
                System.out.println("Peticion no valida: " + response.message());
            }
        } catch (IOException ex) {
            System.out.println("Error en la peticion: " + ex.getMessage());
        }

        okHttpClient.dispatcher().executorService().shutdown();
        okHttpClient.connectionPool().evictAll();

        System.out.println();
        System.out.println("Imprimimos el objeto futbolista: ");
        System.out.println(futbolista);
    }
}
