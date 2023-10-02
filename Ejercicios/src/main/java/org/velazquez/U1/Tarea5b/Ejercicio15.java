package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("A continuación, veremos si su pareja le es infiel");
        int contador = 0;

        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        String respuesta;
        respuesta = teclado.next();

        if (respuesta.equals("v") || respuesta.equals("V")) {
            contador++;
        }


        System.out.println("2. Ha aumentado sus gastos de vestuario.");
        String respuesta2;
        respuesta2 = teclado.next();

        if (respuesta2.equals("v") || respuesta2.equals("V")) {
            contador++;
        }

        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
        String respuesta3;
        respuesta3 = teclado.next();

        if (respuesta3.equals("v") || respuesta3.equals("V")) {
            contador++;
        }

        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo ");
        System.out.println("y se asea con más frecuencia (si es mujer).");
        String respuesta4;
        respuesta4 = teclado.next();

        if (respuesta4.equals("v") || respuesta4.equals("V")) {

            contador++;
        }

        System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
        String respuesta5;
        respuesta5 = teclado.next();

        if (respuesta5.equals("v") || respuesta5.equals("V")) {
            contador++;
        }

        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
        String respuesta6;
        respuesta6 = teclado.next();

        if (respuesta6.equals("v") || respuesta6.equals("V")) {
            contador++;
        }

        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
        String respuesta7;
        respuesta7 = teclado.next();

        if (respuesta7.equals("v") || respuesta7.equals("V")) {
            contador++;
        }

        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
        String respuesta8;
        respuesta8 = teclado.next();

        if (respuesta8.equals("v") || respuesta8.equals("V")) {
            contador++;
        }

        System.out.println("9. Has notado que últimamente se perfuma más.");
        String respuesta9;
        respuesta9 = teclado.next();

        if (respuesta9.equals("v") || respuesta9.equals("V")) {
            contador++;
        }

        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
        String respuesta10;
        respuesta10 = teclado.next();

        if (respuesta10.equals("v") || respuesta10.equals("V")) {
            contador++;
        }

        int calculo = (contador*3);

       if (calculo <= 10) {
           System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
       }
       if (calculo > 10 && calculo <= 22) {
           System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, ");
           System.out.println("aunque seguramente será algo sin importancia. No bajes la guardia.");
       }
       if (calculo > 22 && calculo <= 30) {
           System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. ");
           System.out.println("Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
       }


    }
}
