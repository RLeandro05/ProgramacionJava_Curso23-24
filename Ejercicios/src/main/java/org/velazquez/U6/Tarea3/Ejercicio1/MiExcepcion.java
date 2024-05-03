package org.velazquez.U6.Tarea3.Ejercicio1;

public class MiExcepcion extends Exception{ //Definimos la excepción propia

    private int codigoError; //Añadimos un atributo

    //Creamos un constructor en el que heredamos todo de la clase Excepción y añadimos el atributo nuevo
    public MiExcepcion(int codigoError) {
        super();
        this.codigoError = codigoError;
    }

    @Override
    public String getMessage() { //Definimos un método para devolver un mensaje

        String mensaje = "";

        switch (codigoError) {
            case 111:
                mensaje = "La edad no puede ser negativa o mayor a 100."; //En el primer caso, devolverá lo siguiente
                break;
            case 222:
                mensaje = "No puede ingresar a un menor de edad."; //En el segundo caso, devolverá lo siguiente
                break;
        }

        return mensaje; //Devolvemos el mensaje
    }
}
