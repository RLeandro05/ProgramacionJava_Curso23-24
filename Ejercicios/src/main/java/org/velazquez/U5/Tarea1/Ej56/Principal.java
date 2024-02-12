package org.velazquez.U5.Tarea1.Ej56;

public class Principal {
    public static void main(String[] args) {

        /*Creación de nuevos objetos*/
        Piano piano = new Piano();
        Campana campana = new Campana();

        /*Aplicamos el método add de Instrumento para añadir una nueva nota desde los enumerados*/
        piano.add(Instrumento.NotasMusicales.Do);
        piano.add(Instrumento.NotasMusicales.Mi);
        piano.add(Instrumento.NotasMusicales.Si);

        campana.add(Instrumento.NotasMusicales.Mi);
        campana.add(Instrumento.NotasMusicales.Sol);
        campana.add(Instrumento.NotasMusicales.Fa);

        /*Aplicamos el método interpretar desde las subclases hijas, mostrando en pantalla
        las notas musicales que corresponden a cada objeto*/
        piano.interpretar();
        campana.interpretar();
    }
}
