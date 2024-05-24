package org.velazquez.U8.Ligero_Picon_U8_Entregable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProcessPosts process = new ProcessPosts();

        // COMPLETO
        process.parseDOM("C:\\Users\\DAW_M\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8\\Ligero_Picon_U8_Entregable\\posts.xml");

        System.out.println("----------------------------------------------------------------------------------");

        // COMPLETO
        List<String> listaGuids = new ArrayList<>();
        listaGuids.add("Valor1");
        listaGuids.add("Valor2");
        listaGuids.add("Valor3");
        Post post = new Post("Titulo1", "https://newsroom.pinterest.com/es/post/presentamos-pinflex-un-modelo-de-trabajo-inspirador-para-nuestros-empleados", "Descripcion1", "2024-05-24T01:00:00", listaGuids);
        process.addPost(post);

        System.out.println("----------------------------------------------------------------------------------");

        // COMPLETO
        System.out.println(process.getPosts());

        System.out.println("----------------------------------------------------------------------------------");

        // COMPLETO
        System.out.println(process.convertToJSON());
    }
}
