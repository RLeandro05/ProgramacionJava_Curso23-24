package org.velazquez.U8.JSON.Tarea6;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface CentralFutbolista {
    // https://my-json-server.typicode.com/chemaduran/json_api_demo/jugadores
    @GET("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/jugadores")
    Call<List<Futbolista>> listJugadores();

    @GET("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/jugadores/{id}")
    Call<Futbolista> getVentaId(@Path("id") Integer futbolista_id);

    @GET("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/jugadores/{estadisticas}")
    Call<Estadisticas> estadisticas(@Path("estadisticas") Integer futbolista_id);
}
