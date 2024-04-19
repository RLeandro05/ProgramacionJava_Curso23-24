package org.velazquez.U7.Tarea6.Ejercicio2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sacamos las variables necesarias para realizar las operaciones
        int cantidad;

        int cantidadMaxTomate = 0;
        int cantidadMaxPollo = 0;
        int cantidadMaxMandarina = 0;
        int cantidadMaxPasta = 0;
        int cantidadMaxGarbanzos = 0;

        int subtotal;
        int total = 0;

        int precioTomate = 32;
        int precioPollo = 59;
        int precioMandarina = 45;
        int precioPasta = 99;
        int precioGarbanzos = 54;

        List<String> listaCompra = new ArrayList<>(); // Guardamos los productos en una lista
        Map<String, Integer> mapaProductosyPrecios = new LinkedHashMap<>(); // Guardamos los productos y precios en un mapa
        Map<Integer, Integer> mapaCantidadySubtotales = new LinkedHashMap<>(); // Guardamos las cantidades y subtotales de cada producto en un mapa

        while (true) {
            System.out.println("Productos disponibles: ");
            System.out.println("1. Tomate - "+precioTomate+"€");
            System.out.println("2. Pollo - "+precioPollo+"€");
            System.out.println("3. Mandarina - "+precioMandarina+"€");
            System.out.println("4. Pasta - "+precioPasta+"€");
            System.out.println("5. Garbanzos - "+precioGarbanzos+"€");

            String escoger = sc.next(); // Escogemos el producto de los disponibles en la lista anterior

            if (escoger.equals("fin")) {
                break;
            } else {
                switch (escoger) { // Dependiendo del producto, sumamos un precio u otro
                    case "Tomate":

                        if (!listaCompra.isEmpty()) {
                            if (listaCompra.contains("Tomate")) { // Si la lista ya contenía el producto
                                mapaCantidadySubtotales.remove(cantidadMaxTomate); // Quitamos el subtotal que había de dicho producto

                                System.out.println("¿Cantidades?");
                                cantidad = sc.nextInt(); // Escribimos las cantidades
                                cantidadMaxTomate += cantidad;

                                subtotal = cantidad*precioTomate; // Creamos un subtotal
                                total += subtotal; // Hacemos el total

                                subtotal = cantidadMaxTomate*precioTomate;
                                mapaCantidadySubtotales.put(cantidadMaxTomate, subtotal); // Guardamos el nuevo subtotal sumado con el anterior del mismo producto

                            } else { // Si no lo contenía simplemente haremos lo mismo pero añadiendo en el mapa el producto
                                listaCompra.add("Tomate");
                                mapaProductosyPrecios.put("Tomate", precioTomate);

                                System.out.println("¿Cantidades?");
                                cantidad = sc.nextInt();
                                cantidadMaxTomate += cantidad;
                                subtotal = cantidad*precioTomate;

                                mapaCantidadySubtotales.put(cantidadMaxTomate, subtotal);

                                total += subtotal;
                            }
                        } else { // Si estuviese vacía (Sólo la primera vez) lo añadimos al mapa, añadiendo además las cantidades y el subtotal
                            listaCompra.add("Tomate");
                            mapaProductosyPrecios.put("Tomate", precioTomate);

                            System.out.println("¿Cantidades?");
                            cantidad = sc.nextInt();
                            cantidadMaxTomate += cantidad;
                            subtotal = cantidad*precioTomate;

                            mapaCantidadySubtotales.put(cantidadMaxTomate, subtotal);

                            total += subtotal;
                        }

                        break;
                    case "Pollo":

                        if (!listaCompra.isEmpty()) {
                            if (listaCompra.contains("Pollo")) {
                                mapaCantidadySubtotales.remove(cantidadMaxPollo);

                                System.out.println("¿Cantidades?");
                                cantidad = sc.nextInt();
                                cantidadMaxPollo += cantidad;

                                subtotal = cantidad*precioPollo;
                                total += subtotal;

                                subtotal = cantidadMaxPollo*precioPollo;
                                mapaCantidadySubtotales.put(cantidadMaxPollo, subtotal);

                            } else {
                                listaCompra.add("Pollo");
                                mapaProductosyPrecios.put("Pollo", precioPollo);

                                System.out.println("¿Cantidades?");
                                cantidad = sc.nextInt();
                                cantidadMaxPollo += cantidad;
                                subtotal = cantidad*precioPollo;

                                mapaCantidadySubtotales.put(cantidadMaxPollo, subtotal);

                                total += subtotal;
                            }
                        } else {
                            listaCompra.add("Pollo");
                            mapaProductosyPrecios.put("Pollo", precioPollo);

                            System.out.println("¿Cantidades?");
                            cantidad = sc.nextInt();
                            cantidadMaxPollo += cantidad;
                            subtotal = cantidad*precioPollo;

                            mapaCantidadySubtotales.put(cantidadMaxPollo, subtotal);

                            total += subtotal;
                        }

                        break;
                    case "Mandarina":

                        if (!listaCompra.isEmpty()) {
                            if (listaCompra.contains("Mandarina")) {
                                mapaCantidadySubtotales.remove(cantidadMaxMandarina);

                                System.out.println("¿Cantidades?");
                                cantidad = sc.nextInt();
                                cantidadMaxMandarina += cantidad;

                                subtotal = cantidad*precioMandarina;
                                total += subtotal;

                                subtotal = cantidadMaxMandarina*precioMandarina;
                                mapaCantidadySubtotales.put(cantidadMaxMandarina, subtotal);

                            } else {
                                listaCompra.add("Mandarina");
                                mapaProductosyPrecios.put("Mandarina", precioMandarina);

                                System.out.println("¿Cantidades?");
                                cantidad = sc.nextInt();
                                cantidadMaxMandarina += cantidad;
                                subtotal = cantidad*precioMandarina;

                                mapaCantidadySubtotales.put(cantidadMaxMandarina, subtotal);

                                total += subtotal;
                            }
                        } else {
                            listaCompra.add("Mandarina");
                            mapaProductosyPrecios.put("Mandarina", precioMandarina);

                            System.out.println("¿Cantidades?");
                            cantidad = sc.nextInt();
                            cantidadMaxMandarina += cantidad;
                            subtotal = cantidad*precioMandarina;

                            mapaCantidadySubtotales.put(cantidadMaxMandarina, subtotal);

                            total += subtotal;
                        }

                        break;
                    case "Pasta":

                        if (!listaCompra.isEmpty()) {
                            if (listaCompra.contains("Pasta")) {
                                mapaCantidadySubtotales.remove(cantidadMaxPasta);

                                System.out.println("¿Cantidades?");
                                cantidad = sc.nextInt();
                                cantidadMaxPasta += cantidad;

                                subtotal = cantidad*precioPasta;
                                total += subtotal;

                                subtotal = cantidadMaxPasta*precioPasta;
                                mapaCantidadySubtotales.put(cantidadMaxPasta, subtotal);

                            } else {
                                listaCompra.add("Pasta");
                                mapaProductosyPrecios.put("Pasta", precioPasta);

                                System.out.println("¿Cantidades?");
                                cantidad = sc.nextInt();
                                cantidadMaxPasta += cantidad;
                                subtotal = cantidad*precioPasta;

                                mapaCantidadySubtotales.put(cantidadMaxPasta, subtotal);

                                total += subtotal;
                            }
                        } else {
                            listaCompra.add("Pasta");
                            mapaProductosyPrecios.put("Pasta", precioPasta);

                            System.out.println("¿Cantidades?");
                            cantidad = sc.nextInt();
                            cantidadMaxPasta += cantidad;
                            subtotal = cantidad*precioPasta;

                            mapaCantidadySubtotales.put(cantidadMaxPasta, subtotal);

                            total += subtotal;
                        }

                        break;
                    case "Garbanzos":

                        if (!listaCompra.isEmpty()) {
                            if (listaCompra.contains("Garbanzos")) {
                                mapaCantidadySubtotales.remove(cantidadMaxGarbanzos);

                                System.out.println("¿Cantidades?");
                                cantidad = sc.nextInt();
                                cantidadMaxGarbanzos += cantidad;

                                subtotal = cantidad*precioGarbanzos;
                                total += subtotal;

                                subtotal = cantidadMaxGarbanzos*precioGarbanzos;
                                mapaCantidadySubtotales.put(cantidadMaxGarbanzos, subtotal);

                            } else {
                                listaCompra.add("Garbanzos");
                                mapaProductosyPrecios.put("Garbanzos", precioGarbanzos);

                                System.out.println("¿Cantidades?");
                                cantidad = sc.nextInt();
                                cantidadMaxGarbanzos += cantidad;
                                subtotal = cantidad*precioGarbanzos;

                                mapaCantidadySubtotales.put(cantidadMaxGarbanzos, subtotal);

                                total += subtotal;
                            }
                        } else {
                            listaCompra.add("Garbanzos");
                            mapaProductosyPrecios.put("Garbanzos", precioGarbanzos);

                            System.out.println("¿Cantidades?");
                            cantidad = sc.nextInt();
                            cantidadMaxGarbanzos += cantidad;
                            subtotal = cantidad*precioGarbanzos;

                            mapaCantidadySubtotales.put(cantidadMaxGarbanzos, subtotal);

                            total += subtotal;
                        }

                        break;
                    default:
                        System.out.println("Producto no disponible.");
                }
            }
        }

        // Mostramos por pantalla
        System.out.println("Cesta de la compra: "+listaCompra);
        System.out.println("Productos y precios: "+mapaProductosyPrecios);
        System.out.println("Cantidades y subtotales: "+mapaCantidadySubtotales);
        System.out.println("Total: "+total+"€");


    }
}
