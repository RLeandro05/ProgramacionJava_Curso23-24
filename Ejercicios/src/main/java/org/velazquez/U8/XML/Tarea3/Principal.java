package org.velazquez.U8.XML.Tarea3;

public class Principal {
    public static void main(String[] args) {
        String nombreFichero = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8\\XML\\Tarea3\\Persona.xml";
        ArbolDOMPersonas arbol = new ArbolDOMPersonas(nombreFichero);


        System.out.println("Documento original:");
        arbol.parse();


        Personas persona = new Personas("Juan", 30);
        arbol.incrementarEdadPersona(persona);


        System.out.println("\nDocumento modificado:");
        arbol.parse();


        arbol.guardarDocumento(nombreFichero);
    }
}

