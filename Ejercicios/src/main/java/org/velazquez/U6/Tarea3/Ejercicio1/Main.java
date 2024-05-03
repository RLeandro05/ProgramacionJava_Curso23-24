package org.velazquez.U6.Tarea3.Ejercicio1;

/*Investiga cómo crear una excepción propia y piensa para qué puede servir.

Crea una excepción propia, y lánzala cuando, en la clase Cliente,
intente dársele un valor negativo o mayor de 100 al atributo edad.
Además, otra excepción debe lanzarse cuando el cliente intente crearse con una edad menor de 18,
puesto que no podemos dar servicio a clientes menores de edad. Pruébalo en una main,
siendo aquí donde se capturan las excepciones.*/

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente(-1); //Creamos un cliente

        try { //Definimos un try para poder hacer uso de las Excepciones
            if (c1.getEdad() < 0 || c1.getEdad() > 100) {
                throw new MiExcepcion(111); //Si se cumple este caso, lanzamos la excepción correspondiente
            }
            if (c1.getEdad() >= 0 && c1.getEdad() < 18) {
                throw new MiExcepcion(222); //Si se cumple este caso, lanzamos la excepción correspondiente
            }
        } catch (MiExcepcion e) { //Añadimos nuestro mensaje de excepción a través de la adición de nuestra excepción propia
            System.out.println(e.getMessage());
        }
    }
}
