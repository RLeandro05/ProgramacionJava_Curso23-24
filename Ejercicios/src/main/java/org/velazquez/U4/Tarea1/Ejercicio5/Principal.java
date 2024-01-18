package org.velazquez.U4.Tarea1.Ejercicio5;

public class Principal {
    public static void main(String[] args) {
        Texto texto = new Texto();

        texto.escribirTexto();

        texto.contarCaracteres(100);

        texto.Nuevo_texto_caracter("a","e", 100);

        texto.Nuevo_texto_cadena("Hola","Adiós", 100);

        texto.leerVocales();
    }
}
