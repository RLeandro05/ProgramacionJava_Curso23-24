package org.velazquez.U8.XML.Entregable1920;

public class Main {
    public static void main(String[] args) {

        RecorridoDOM dom = new RecorridoDOM("C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8\\XML\\Entregable1920\\personasXML.xml");

//        dom.numNodosHijos();

        System.out.println("------------------------------------------------");

//        dom.mostrarXMLDom();

        dom.mostrarContenidoEtiqueta("persona");
    }
}
