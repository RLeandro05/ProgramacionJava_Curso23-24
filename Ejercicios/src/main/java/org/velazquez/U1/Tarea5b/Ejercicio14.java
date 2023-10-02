package org.velazquez.U1.Tarea5b;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cómo quieres hacer tu pirámide?");
        System.out.println("1. Letra");
        System.out.println("2. Número");
        System.out.println("3. Símbolo");
        int eleccion_1 = teclado.nextInt();

        if (eleccion_1 == 1) {
            System.out.println("¿Cómo quieres que sea la orientación de la pirámide?");
            System.out.println("1. Arriba");
            System.out.println("2. Abajo");
            System.out.println("3. Izquierda");
            System.out.println("4. Derecha");
            int menu = teclado.nextByte();

            switch (menu) {
                case 1:
                    String r;
                    System.out.println("Por favor, introduzca una letra: ");
                    r = teclado.next();

                    System.out.println("              "+r+r);
                    System.out.println("            "+r+r+r+r+r+r);
                    System.out.println("           "+r+r+r+r+r+r+r+r);
                    System.out.println("          "+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("         "+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("        "+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("       "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("      "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("     "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("    "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("   "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("  "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println(" "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);

                case 2:
                    String s;
                    System.out.println("Por favor, introduzca una letra: ");
                    s = teclado.next();

                    System.out.println(" "+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("  "+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("   "+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("    "+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("     "+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("      "+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("       "+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("        "+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("         "+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("          "+s+s+s+s+s+s+s+s);
                    System.out.println("           "+s+s+s+s+s+s);
                    System.out.println("            "+s+s+s+s);
                    System.out.println("             "+s+s);

                case 3:
                    String p;
                    System.out.println("Por favor, introduzca una letra: ");
                    p = teclado.next();

                    System.out.println("         "+p);
                    System.out.println("       "+p+p+p);
                    System.out.println("     "+p+p+p+p+p);
                    System.out.println("       "+p+p+p);
                    System.out.println("         "+p);

                case 4:
                    String t;
                    System.out.println("Por favor, introduzca una letra: ");
                    t = teclado.next();

                    System.out.println(t);
                    System.out.println(t+t);
                    System.out.println(t+t+t);
                    System.out.println(t+t+t+t);
                    System.out.println(t+t+t+t+t);
                    System.out.println(t+t+t+t);
                    System.out.println(t+t+t);
                    System.out.println(t+t);
                    System.out.println(t);





            }





            }
        if (eleccion_1 == 2) {
            System.out.println("¿Cómo quieres que sea la orientación de la pirámide?");
            System.out.println("1. Arriba");
            System.out.println("2. Abajo");
            System.out.println("3. Izquierda");
            System.out.println("4. Derecha");
            int menu = teclado.nextByte();

            switch (menu) {
                case 1:
                    String r;
                    System.out.println("Por favor, introduzca un número: ");
                    r = teclado.next();

                    System.out.println("              "+r+r);
                    System.out.println("            "+r+r+r+r+r+r);
                    System.out.println("           "+r+r+r+r+r+r+r+r);
                    System.out.println("          "+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("         "+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("        "+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("       "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("      "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("     "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("    "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("   "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("  "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println(" "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);

                case 2:
                    String s;
                    System.out.println("Por favor, introduzca un número: ");
                    s = teclado.next();

                    System.out.println(" "+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("  "+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("   "+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("    "+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("     "+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("      "+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("       "+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("        "+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("         "+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("          "+s+s+s+s+s+s+s+s);
                    System.out.println("           "+s+s+s+s+s+s);
                    System.out.println("            "+s+s+s+s);
                    System.out.println("             "+s+s);


                case 3:
                    String p;
                    System.out.println("Por favor, introduzca un número: ");
                    p = teclado.next();

                    System.out.println("         "+p);
                    System.out.println("       "+p+p+p);
                    System.out.println("     "+p+p+p+p+p);
                    System.out.println("       "+p+p+p);
                    System.out.println("         "+p);

                case 4:
                    String t;
                    System.out.println("Por favor, introduzca un número: ");
                    t = teclado.next();

                    System.out.println(t);
                    System.out.println(t+t);
                    System.out.println(t+t+t);
                    System.out.println(t+t+t+t);
                    System.out.println(t+t+t+t+t);
                    System.out.println(t+t+t+t);
                    System.out.println(t+t+t);
                    System.out.println(t+t);
                    System.out.println(t);





            }





        }
        if (eleccion_1 == 3) {
            System.out.println("¿Cómo quieres que sea la orientación de la pirámide?");
            System.out.println("1. Arriba");
            System.out.println("2. Abajo");
            System.out.println("3. Izquierda");
            System.out.println("4. Derecha");
            int menu = teclado.nextByte();

            switch (menu) {
                case 1:
                    String r;
                    System.out.println("Por favor, introduzca un símbolo: ");
                    r = teclado.next();

                    System.out.println("              "+r+r);
                    System.out.println("            "+r+r+r+r+r+r);
                    System.out.println("           "+r+r+r+r+r+r+r+r);
                    System.out.println("          "+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("         "+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("        "+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("       "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("      "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("     "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("    "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("   "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println("  "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);
                    System.out.println(" "+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r+r);

                case 2:
                    String s;
                    System.out.println("Por favor, introduzca un símbolo: ");
                    s = teclado.next();

                    System.out.println(" "+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("  "+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("   "+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("    "+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("     "+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("      "+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("       "+s+s+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("        "+s+s+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("         "+s+s+s+s+s+s+s+s+s+s);
                    System.out.println("          "+s+s+s+s+s+s+s+s);
                    System.out.println("           "+s+s+s+s+s+s);
                    System.out.println("            "+s+s+s+s);
                    System.out.println("             "+s+s);


                case 3:
                    String p;
                    System.out.println("Por favor, introduzca un símbolo: ");
                    p = teclado.next();

                    System.out.println("         "+p);
                    System.out.println("       "+p+p+p);
                    System.out.println("     "+p+p+p+p+p);
                    System.out.println("       "+p+p+p);
                    System.out.println("         "+p);

                case 4:
                    String t;
                    System.out.println("Por favor, introduzca un símbolo: ");
                    t = teclado.next();

                    System.out.println(t);
                    System.out.println(t+t);
                    System.out.println(t+t+t);
                    System.out.println(t+t+t+t);
                    System.out.println(t+t+t+t+t);
                    System.out.println(t+t+t+t);
                    System.out.println(t+t+t);
                    System.out.println(t+t);
                    System.out.println(t);





            }





        }






        }
    }

