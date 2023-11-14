package org.velazquez.U1.Pruebas;

import java.util.Scanner;

public class Calculos3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;

        int puntos = 0;

        System.out.println("En este cuestionario descubrirás si tu novia te está siendo infiel");
        System.out.println();

        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        System.out.println("- Verdadero");
        System.out.println("- Falso");
        respuesta = sc.next();

        if (respuesta.equals("Verdadero")) {
            puntos+=3;
        }

        System.out.println("2. Ha aumentado sus gastos de vestuario.");
        System.out.println("- Verdadero");
        System.out.println("- Falso");
        respuesta = sc.next();

        if (respuesta.equals("Verdadero")) {
            puntos+=3;
        }

        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
        System.out.println("- Verdadero");
        System.out.println("- Falso");
        respuesta = sc.next();

        if (respuesta.equals("Verdadero")) {
            puntos+=3;
        }

        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).");
        System.out.println("- Verdadero");
        System.out.println("- Falso");
        respuesta = sc.next();

        if (respuesta.equals("Verdadero")) {
            puntos+=3;
        }

        System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
        System.out.println("- Verdadero");
        System.out.println("- Falso");
        respuesta = sc.next();

        if (respuesta.equals("Verdadero")) {
            puntos+=3;
        }

        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
        System.out.println("- Verdadero");
        System.out.println("- Falso");
        respuesta = sc.next();

        if (respuesta.equals("Verdadero")) {
            puntos+=3;
        }

        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
        System.out.println("- Verdadero");
        System.out.println("- Falso");
        respuesta = sc.next();

        if (respuesta.equals("Verdadero")) {
            puntos+=3;
        }

        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
        System.out.println("- Verdadero");
        System.out.println("- Falso");
        respuesta = sc.next();

        if (respuesta.equals("Verdadero")) {
            puntos+=3;
        }

        System.out.println("9. Has notado que últimamente se perfuma más.");
        System.out.println("- Verdadero");
        System.out.println("- Falso");
        respuesta = sc.next();

        if (respuesta.equals("Verdadero")) {
            puntos+=3;
        }

        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
        System.out.println("- Verdadero");
        System.out.println("- Falso");
        respuesta = sc.next();

        if (respuesta.equals("Verdadero")) {
            puntos+=3;
        }

        System.out.println();
        System.out.println();

        System.out.println("Tus resultados son:");
        System.out.println("Puntos: "+puntos);

        System.out.println();

        if (puntos >= 0 && puntos <= 10) {
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }
        if (puntos > 10 && puntos <= 22) {
            System.out.println("Quizás exista el peligro de otra persona en su\n" +
                    "vida o en su mente, aunque seguramente será algo sin importancia. No\n" +
                    "bajes la guardia.");
        }
        if (puntos > 22) {
            System.out.println("Tu pareja tiene todos los ingredientes para estar\n" +
                    "viviendo un romance con otra persona. Te aconsejamos que indagues un\n" +
                    "poco más y averigües que es lo que está pasando por su cabeza.");
        }
        System.out.println();

        System.out.println("FINALIZADO");
    }
}
