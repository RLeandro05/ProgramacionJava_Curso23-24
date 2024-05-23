package org.velazquez.U8.JSON.EntregableJSON;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface CentralAlumnos {
    @GET("json_api_demo/alumnos")
    Call<List<Alumnos>> listaAlumnos();

    // https://my-json-server.typicode.com/chemaduran/json_api_demo/ventas/2
    @GET("json_api_demo/alumnos/{alumnos_id}")
    Call<Alumnos> getAlumnoID(@Path("alumnos_id") Integer alumno_id);

    // https://my-json-server.typicode.com/chemaduran/json_api_demo/ventas/2/detalles
    @GET("json_api_demo/alumnos/asignaturas")
    Call<List<Asignaturas>> listaAsignaturas(@Path("alumno_id") Integer alumno_id);
}
