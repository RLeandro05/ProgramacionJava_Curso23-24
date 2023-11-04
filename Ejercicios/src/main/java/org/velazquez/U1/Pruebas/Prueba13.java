package org.velazquez.U1.Pruebas;

import java.util.Scanner;

public class Prueba13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int peso;

        double ABS = 0.2;
        double PLA = 0.3;
        double MADERA = 0.5;
        double FLEXIBLE = 0.7;

        int eleccion;

        int posprocesado = 3;
        int pos;

        int premium;

        int envio = 2;

        System.out.println("Bienvenido a **Carbonita Volando**");

        System.out.println("Introduzca el peso de su figura en gramos: ");
        peso = sc.nextInt();

        System.out.println();
        System.out.println("Introduzca el tipo de material: ");
        System.out.println("1. ABS");
        double total_ABS = ABS*peso;

        System.out.println("2. PLA");
        double total_PLA = PLA*peso;

        System.out.println("3. MADERA");
        double total_MADERA = MADERA*peso;

        System.out.println("4. FLEXIBLE");
        double total_FLEXIBLE = FLEXIBLE*peso;

        eleccion = sc.nextInt();

        System.out.println();
        System.out.println("¿Quiere posprocesado?: ");
        System.out.println("1. Si");
        System.out.println("2. No");
        pos = sc.nextInt();

        System.out.println();
        System.out.println("¿Pertenece a Enjuto3D Premium?: ");
        System.out.println("1. Si");
        System.out.println("2. No");
        premium = sc.nextInt();

        System.out.println("Peso de la figura: "+peso+"g");
        System.out.println();

        switch (eleccion) {
            case 1:
                System.out.println("Material: ABS");
                System.out.println("Precio Base ABS: "+total_ABS+"€");
                System.out.println();
                if (pos == 1) {
                    System.out.println("Posprocesado: Si");
                    System.out.println("Precio Posprocesado: "+posprocesado+"€");
                    System.out.println();
                    if (premium == 1) {
                        System.out.println("Enjuto3D Premium: Si");
                        System.out.println();
                        double TOTAL = total_ABS+posprocesado;
                        System.out.println("Total A Pagar: "+Math.ceil(TOTAL*100)/100+"€");
                    }
                    if (premium == 2) {
                        System.out.println("Enjuto3D Premium: No");
                        System.out.println("Precio Envío: "+envio+"€");
                        System.out.println();
                        double TOTAL = total_ABS+posprocesado+envio;
                        System.out.println("Total A Pagar: "+Math.ceil(TOTAL*100)/100+"€");
                    }
                }
                if (pos == 2) {
                    System.out.println("Posprocesado: No");
                    System.out.println();
                    if (premium == 1) {
                        System.out.println("Enjuto3D Premium: Si");
                        System.out.println();
                        System.out.println("Total A Pagar: "+Math.ceil(total_ABS*100)/100+"€");
                    }
                    if (premium == 2) {
                        System.out.println("Enjuto3D Premium: No");
                        System.out.println("Precio Envío: "+envio+"€");
                        System.out.println();
                        double TOTAL = total_ABS+envio;
                        System.out.println("Total A Pagar: "+Math.ceil(TOTAL*100)/100+"€");
                    }
                }
                break;

            case 2:
                System.out.println("Material: PLA");
                System.out.println("Precio Base PLA: "+total_PLA+"€");
                System.out.println();
                if (pos == 1) {
                    System.out.println("Posprocesado: Si");
                    System.out.println("Precio Posprocesado: "+posprocesado+"€");
                    System.out.println();
                    if (premium == 1) {
                        System.out.println("Enjuto3D Premium: Si");
                        System.out.println();
                        double TOTAL = total_PLA+posprocesado;
                        System.out.println("Total A Pagar: "+Math.ceil(TOTAL*100)/100+"€");
                    }
                    if (premium == 2) {
                        System.out.println("Enjuto3D Premium: No");
                        System.out.println("Precio Envío: "+envio+"€");
                        System.out.println();
                        double TOTAL = total_PLA+posprocesado+envio;
                        System.out.println("Total A Pagar: "+Math.ceil(TOTAL*100)/100+"€");
                    }
                }
                if (pos == 2) {
                    System.out.println("Posprocesado: No");
                    System.out.println();
                    if (premium == 1) {
                        System.out.println("Enjuto3D Premium: Si");
                        System.out.println();
                        System.out.println("Total A Pagar: "+Math.ceil(total_PLA*100)/100+"€");
                    }
                    if (premium == 2) {
                        System.out.println("Enjuto3D Premium: No");
                        System.out.println("Precio Envío: "+envio+"€");
                        System.out.println();
                        double TOTAL = total_PLA+envio;
                        System.out.println("Total A Pagar: "+Math.ceil(TOTAL*100)/100+"€");
                    }
                }
                break;

            case 3:
                System.out.println("Material: MADERA");
                System.out.println("Precio Base Madera: "+total_MADERA+"€");
                System.out.println();
                if (pos == 1) {
                    System.out.println("Posprocesado: Si");
                    System.out.println("Precio Posprocesado: "+posprocesado+"€");
                    System.out.println();
                    if (premium == 1) {
                        System.out.println("Enjuto3D Premium: Si");
                        System.out.println();
                        double TOTAL = total_MADERA+posprocesado;
                        System.out.println("Total A Pagar: "+Math.ceil(TOTAL*100)/100+"€");
                    }
                    if (premium == 2) {
                        System.out.println("Enjuto3D Premium: No");
                        System.out.println("Precio Envío: "+envio+"€");
                        System.out.println();
                        double TOTAL = total_MADERA+posprocesado+envio;
                        System.out.println("Total A Pagar: "+Math.ceil(TOTAL*100)/100+"€");
                    }
                }
                if (pos == 2) {
                    System.out.println("Posprocesado: No");
                    System.out.println();
                    if (premium == 1) {
                        System.out.println("Enjuto3D Premium: Si");
                        System.out.println();
                        System.out.println("Total A Pagar: "+Math.ceil(total_MADERA*100)/100+"€");
                    }
                    if (premium == 2) {
                        System.out.println("Enjuto3D Premium: No");
                        System.out.println("Precio Envío: "+envio+"€");
                        System.out.println();
                        double TOTAL = total_MADERA+envio;
                        System.out.println("Total A Pagar: "+Math.ceil(TOTAL*100)/100+"€");
                    }
                }
                break;

            case 4:
                System.out.println("Material: FLEXIBLE");
                System.out.println("Precio Base Flexible: "+total_FLEXIBLE+"€");
                System.out.println();
                if (pos == 1) {
                    System.out.println("Posprocesado: Si");
                    System.out.println("Precio Posprocesado: "+posprocesado+"€");
                    System.out.println();
                    if (premium == 1) {
                        System.out.println("Enjuto3D Premium: Si");
                        System.out.println();
                        double TOTAL = total_FLEXIBLE+posprocesado;
                        System.out.println("Total A Pagar: "+Math.ceil(TOTAL*100)/100+"€");
                    }
                    if (premium == 2) {
                        System.out.println("Enjuto3D Premium: No");
                        System.out.println("Precio Envío: "+envio+"€");
                        System.out.println();
                        double TOTAL = total_FLEXIBLE+posprocesado+envio;
                        System.out.println("Total A Pagar: "+Math.ceil(TOTAL*100)/100+"€");
                    }
                }
                if (pos == 2) {
                    System.out.println("Posprocesado: No");
                    System.out.println();
                    if (premium == 1) {
                        System.out.println("Enjuto3D Premium: Si");
                        System.out.println();
                        System.out.println("Total A Pagar: "+Math.ceil(total_FLEXIBLE*100)/100 +"€");
                    }
                    if (premium == 2) {
                        System.out.println("Enjuto3D Premium: No");
                        System.out.println("Precio Envío: "+envio+"€");
                        System.out.println();
                        double TOTAL = total_FLEXIBLE+envio;
                        System.out.println("Total A Pagar: "+Math.ceil(TOTAL*100)/100+"€");
                    }
                }
                break;
        }
        System.out.println();

        System.out.println("FINALIZADO");



    }
}
