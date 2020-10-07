
/**
 * Write a description of class EjemploMatrices here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EjemploMatrices
{
    /**
     * Sumar los elementos de una matriz, primero por columnas
     * y luego por filas
     */
    public static void ejemplo1() {
        int [][] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 0}
        };
        // Imprimir la matriz
        imprimir(matriz);
        // Sumar por columnas
        for(int col = 0; col < matriz[0].length; col++) {
            int acum = 0;
            System.out.print("Columna: " + col + " ");
            for(int fila = 0; fila < matriz.length; fila++) {
                acum = acum + matriz[fila][col];
            }
            System.out.println(acum);
        }
        // Sumar por filas
        for(int fila = 0; fila < matriz.length; fila++) {
            int acum = 0;
            System.out.print("Fila: " + fila + " ");
            for(int col = 0; col < matriz[0].length; col++) {
                acum = acum + matriz[fila][col];
            }
            System.out.println(acum);
        }
    }
    
    /**
     * Imprimir una matriz que se recibe como parámetro
     */
    public static void imprimir(int [][] mat) {
        for(int fila = 0; fila < mat.length; fila++) {
            for(int col = 0; col < mat[fila].length; col++) {
                System.out.print(mat[fila][col] + " ");
            }
            System.out.println();
        }
    }
}
