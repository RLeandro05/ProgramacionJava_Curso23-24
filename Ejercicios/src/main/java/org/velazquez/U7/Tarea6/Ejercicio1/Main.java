package org.velazquez.U7.Tarea6.Ejercicio1;

/*Un supermercado de productos ecológicos nos ha pedido hacer un programa para vender su mercancía.
En esta primera versión del programa se tendrán en cuenta los productos que se indican en la tabla junto
con su precio. Los productos se venden en bote, brick, etc.

Cuando se realiza la compra, hay que indicar el producto y el número de unidades que se compran,
por ejemplo “guisantes” si se quiere comprar un bote de guisantes y la cantidad, por ejemplo “3”
si se quieren comprar 3 botes. La compra se termina con la palabra “fin. Suponemos que el usuario
no va a intentar comprar un producto que no existe. Utiliza un diccionario para almacenar los nombres
y precios de los productos y una o varias listas para almacenar la compra que realiza el usuario.

A continuación se muestra una tabla con los productos disponibles y sus respectivos precios:

Ejemplo:

Producto: tomate
Cantidad: 1
Producto: quinoa
Cantidad: 2
Producto: avena
Cantidad: 1
Producto: tomate
Cantidad: 2
Producto: fin

| Producto    | Precio      | Cantidad | Subtotal |
| ----------- | ----------- | -------- | -------- |
| tomate      | 1,59        | 1        | 1,59     |
| quinoa      | 4,50        | 2        | 9,00     |
| avena       | 2,21        | 1        | 2,21     |
| tomate      | 1,59        | 2        | 3,18     |
---------------------------------------------------
Total: 15,98*/

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
