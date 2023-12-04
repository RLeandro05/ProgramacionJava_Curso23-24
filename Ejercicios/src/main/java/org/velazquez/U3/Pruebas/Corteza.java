package org.velazquez.U3.Pruebas;

public class Corteza {
    public static void main(String[] args) {
        // Ejemplo de uso de la función subcorteza
        int[][] arrayBidimensional = {
                {45, 92, 14, 20, 25, 78},
                {35, 72, 24, 45, 42, 60},
                {97, 65, 83, 71, 36, 12},
                {32, 42, 64, 23, 41, 39},
                {98, 45, 94, 11, 18, 48}
        };

        int[] resultado = subcorteza(arrayBidimensional);

        // Imprimir el resultado
        System.out.println("Array unidimensional generado por subcorteza(a):");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }

    public static int[] subcorteza(int[][] n) {
        // Obtener las dimensiones del array bidimensional
        int filas = n.length;
        int columnas = n[0].length;

        // Calcular la longitud del array resultante
        int longitud = 2 * filas + 2 * (columnas - 2);

        // Crear el array resultante
        int[] resultado = new int[longitud];

        // Indice para recorrer el array resultante
        int index = 0;

        // Copiar la capa exterior en sentido de las agujas del reloj
        for (int i = 0; i < columnas; i++) {
            resultado[index++] = n[0][i]; // Primera fila
        }
        for (int i = 1; i < filas; i++) {
            resultado[index++] = n[i][columnas - 1]; // Última columna
        }
        for (int i = columnas - 2; i >= 0; i--) {
            resultado[index++] = n[filas - 1][i]; // Última fila
        }
        for (int i = filas - 2; i > 0; i--) {
            resultado[index++] = n[i][0]; // Primera columna
        }

        return resultado;
    }
}
