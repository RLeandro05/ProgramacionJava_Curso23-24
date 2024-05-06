package org.velazquez.U7.Tarea6.Ejercicio1;



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sacamos las variables necesarias para realizar las operaciones
        int cantidad;
        double subtotal;
        double total = 0;

        double precioTomate = 0.32;
        double precioPollo = 1.59;
        double precioMandarina = 0.45;
        double precioPasta = 0.99;
        double precioGarbanzos = 1.54;

        List<String> listaCompra = new ArrayList<>(); // Guardamos los productos en una lista
        Map<String, Double> mapaProductosyPrecios = new LinkedHashMap<>(); // Guardamos los productos y precios en un mapa
        Map<Integer, Double> mapaCantidadySubtotales = new LinkedHashMap<>(); // Guardamos las cantidades y subtotales de cada producto en un mapa

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
                switch (escoger) {
                    case "Tomate":
                        listaCompra.add("Tomate");
                        mapaProductosyPrecios.put("Tomate", precioTomate);

                        System.out.println("¿Cantidades?");
                        cantidad = sc.nextInt();
                        subtotal = cantidad*precioTomate;

                        mapaCantidadySubtotales.put(cantidad, subtotal);

                        total += subtotal;
                        break;
                    case "Pollo":
                        listaCompra.add("Pollo");
                        mapaProductosyPrecios.put("Pollo", precioPollo);

                        System.out.println("¿Cantidades?");
                        cantidad = sc.nextInt();
                        subtotal = cantidad*precioPollo;

                        mapaCantidadySubtotales.put(cantidad, subtotal);

                        total += subtotal;
                        break;
                    case "Mandarina":
                        listaCompra.add("Mandarina");
                        mapaProductosyPrecios.put("Mandarina", precioMandarina);

                        System.out.println("¿Cantidades?");
                        cantidad = sc.nextInt();
                        subtotal = cantidad*precioMandarina;

                        mapaCantidadySubtotales.put(cantidad, subtotal);

                        total += subtotal;
                        break;
                    case "Pasta":
                        listaCompra.add("Pasta");
                        mapaProductosyPrecios.put("Pasta", precioPasta);

                        System.out.println("¿Cantidades?");
                        cantidad = sc.nextInt();
                        subtotal = cantidad*precioPasta;

                        mapaCantidadySubtotales.put(cantidad, subtotal);

                        total += subtotal;
                        break;
                    case "Garbanzos":
                        listaCompra.add("Garbanzos");
                        mapaProductosyPrecios.put("Garbanzos", precioGarbanzos);

                        System.out.println("¿Cantidades?");
                        cantidad = sc.nextInt();
                        subtotal = cantidad*precioGarbanzos;

                        mapaCantidadySubtotales.put(cantidad, subtotal);

                        total += subtotal;
                        break;
                    default:
                        System.out.println("Producto no disponible.");
                }
            }
        }

        // Mostramos por pantalla todo
        System.out.println("Cesta de la compra: "+listaCompra);
        System.out.println("Productos y precios: "+mapaProductosyPrecios);
        System.out.println("Cantidades y subtotales: "+mapaCantidadySubtotales);
        System.out.println("Total: "+total+"€");


    }
}
