package org.velazquez.U5.Tarea1.Ej56;

public abstract class Instrumento {
    /*Creaciónnde una lista de enumerados como notas musicales*/
    public enum NotasMusicales {
        Do, Re, Mi, Fa, Sol, La, Si
    }

    /*Creación de una lista de tipo NotasMusicales, es decir, de enumerados. Tendrá como máximo 100 notas*/
    protected NotasMusicales[] notas = new NotasMusicales[100];

    /*Creación del método add, el cual irá buscando un espacio el cual esté null para añadir la siguiente nota*/
    public void add (NotasMusicales nota) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == null) {
                notas[i] = nota;
                break;
            }
        }
    }

    /*Creación del método abstracto interpretar, el cual se usará en las subclases hijas de la clase Instrumento*/
    public abstract void interpretar();
}
