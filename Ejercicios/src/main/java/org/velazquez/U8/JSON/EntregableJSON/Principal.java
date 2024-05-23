package org.velazquez.U8.JSON.EntregableJSON;

import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;
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
                        .baseUrl("https://my-json-server.typicode.com/chemaduran/json_entrega1/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(okHttpClient)
                        .build();

        CentralAlumnos service = retrofit.create(CentralAlumnos.class);
        Alumnos alumno = null;
        final Integer alumnoId = 2;

        System.out.println("Obtenemos el listado completo de Alumnos");
        try {
            Response<List<Alumnos>> response = service.listaAlumnos().execute();
            if (response.isSuccessful()) {
                List<Alumnos> alumnosList = response.body();
                System.out.println(alumnosList);
            } else {
                System.out.println("Peticion no valida: " + response.message());
            }
        } catch (IOException ex) {
            System.out.println("Error en la peticion: " + ex.getMessage());
        }

        System.out.println();
        System.out.println("Obtenemos un alumno concreto, identificado por el id " + alumnoId);
        try {
            Response<Alumnos> response = service.getAlumnoID(alumnoId).execute();
            if (response.isSuccessful()) {
                alumno = response.body();
                System.out.println(alumno);
            } else {
                System.out.println("Peticion no valida: " + response.message());
            }
        } catch (IOException ex) {
            System.out.println("Error en la peticion: " + ex.getMessage());
        }

        System.out.println();
        System.out.println(
                "Obtenemos el listado del detalle de un Alumno concreto, identificado por el id " + alumnoId);
        try {
            Response<List<Asignaturas>> response = service.listaAsignaturas(alumnoId).execute();
            if (response.isSuccessful()) {
                List<Asignaturas> asignaturasList = response.body();
                System.out.println(asignaturasList);
                if (alumno != null) {
                    alumno.setListaAsignaturas(new ArrayList<>(asignaturasList));
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
        System.out.println("Imprimimos el objeto venta: ");
        System.out.println(alumno);
    }
}
